package dao;

import java.sql.*;
import model.Patient;
import util.DBConnection;

public class PatientDAO {

    // Ajouter un patient
    public void addPatient(Patient p) {
    	// Modifie cette ligne dans ton PatientDAO.java
    	String sql = "INSERT INTO PATIENT (PATIENT_ID, NAME, SURNAME, BIRTH_DATE, PHONE, ADDRESS) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, p.getId());
            ps.setString(2, p.getName());
            ps.setString(3, p.getSurname());
            ps.setDate(4, new java.sql.Date(p.getBirthDate().getTime()));
            ps.setLong(5, Long.parseLong(p.getPhone())); // phone est un NUMBER en SQL
            ps.setString(6, p.getAddress());

            ps.executeUpdate();
            System.out.println("Patient added successfully!");
        } catch (Exception e) {
            System.err.println("Error adding patient: " + e.getMessage());
        }
    }

    // Supprimer un patient
    public void deletePatient(int id) {
        String sql = "DELETE FROM Patient WHERE patient_id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Patient deleted!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}