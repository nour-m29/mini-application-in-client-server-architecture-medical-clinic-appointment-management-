package dao;

import java.sql.*;
import model.Appointment;
import util.DBConnection;

public class AppointmentDAO {

    // 1. Méthode pour vérifier si le créneau est libre
    public boolean isAvailable(int doctorId, java.util.Date date, String time) {
        // Utilisation de TO_TIMESTAMP pour correspondre au format Oracle
        String sql = "SELECT COUNT(*) FROM Appointment WHERE doctor_id = ? AND app_date = ? AND app_time = TO_TIMESTAMP(?, 'YYYY-MM-DD HH24:MI:SS')";
        
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, doctorId);
            ps.setDate(2, new java.sql.Date(date.getTime()));
            // On envoie la String "time" qui sera convertie par le TO_TIMESTAMP du SQL
            ps.setString(3, time);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                // Si le compte est 0, c'est que personne n'a réservé : le docteur est libre !
                return rs.getInt(1) == 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; // Par défaut, on considère occupé en cas d'erreur (sécurité)
    }

    // 2. Méthode pour enregistrer le rendez-vous
    public void bookAppointment(Appointment a) {
        // Vérification de la disponibilité avant l'insertion
        if (isAvailable(a.getDoctorId(), a.getDate(), a.getTime())) {
            
            String sql = "INSERT INTO Appointment (appointment_id, app_date, app_time, status, patient_id, doctor_id) VALUES (?, ?, ?, ?, ?, ?)";
            
            try (Connection con = DBConnection.getConnection();
                 PreparedStatement ps = con.prepareStatement(sql)) {
                
                ps.setInt(1, a.getId());
                ps.setDate(2, new java.sql.Date(a.getDate().getTime()));
                // On utilise le format Timestamp pour l'heure précise
                ps.setTimestamp(3, new java.sql.Timestamp(a.getDate().getTime()));
                ps.setString(4, a.getStatus());
                ps.setInt(5, a.getPatientId());
                ps.setInt(6, a.getDoctorId());
                
                ps.executeUpdate();
                System.out.println("Appointment booked successfully!");
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Booking failed: Doctor is already busy at this time.");
        }
    }
}