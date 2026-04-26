package dao;

import java.sql.*;
import model.Doctor;
import util.DBConnection;

public class DoctorDAO {

    // Ajouter un docteur
    public void addDoctor(Doctor d) {
        String sql = "INSERT INTO Doctor (doctor_id, name, surname, specialty, phone) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, d.getId());
            ps.setString(2, d.getName());
            ps.setString(3, d.getSurname());
            ps.setString(4, d.getSpecialty());
            ps.setLong(5, Long.parseLong(d.getPhone())); // phone est un NUMBER en SQL

            ps.executeUpdate();
            System.out.println("Doctor added successfully!");
        } catch (Exception e) {
            System.err.println("Error adding doctor: " + e.getMessage());
        }
    }

    // Supprimer un docteur
    public void deleteDoctor(int id) {
        String sql = "DELETE FROM Doctor WHERE doctor_id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Doctor deleted!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}