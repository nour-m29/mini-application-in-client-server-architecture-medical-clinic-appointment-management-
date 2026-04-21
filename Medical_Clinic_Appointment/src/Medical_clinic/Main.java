package Medical_clinic;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    
    JButton patient_btn;
    JButton doctor_btn;
    JButton appointment_btn;
    
    // colors
    Color tealGreen = new Color(0, 150, 136);
    Color white = new Color(245,248,250);
    Color mintColor = new Color(232,245,242);
    

    public Main() {
        // frame
        JFrame window = new JFrame();
        window.setTitle("Medical Clinic Appointment");
        window.setSize(700, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        
        // panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(mintColor);
        window.setContentPane(panel);

        // Icon
        ImageIcon icon = new ImageIcon("clinic.png");
        window.setIconImage(icon.getImage());

        // Title
        JLabel label = new JLabel("Medical Clinic Appointment Management");
        label.setFont(new Font("SansSerif", Font.BOLD, 28));
        label.setForeground(new Color(0, 150, 136));
        label.setBounds(70, 30, 600, 40);
        panel.add(label);

        // Patients Button
        patient_btn = new JButton("Patients");
        patient_btn.setBounds(200, 100, 300, 55);
        patient_btn.setFocusable(false);
        patient_btn.setBackground(tealGreen);
        patient_btn.setFont(new Font("Arial", Font.BOLD, 20));
        patient_btn.setForeground(white);
        patient_btn.addActionListener(this);
        panel.add(patient_btn);

        // Doctor Button
        doctor_btn = new JButton("Doctors");
        doctor_btn.setBounds(200, 175, 300, 55);
        doctor_btn.setFocusable(false);
        doctor_btn.setBackground(tealGreen);
        doctor_btn.setFont(new Font("Arial", Font.BOLD, 20));
        doctor_btn.setForeground(white);
        doctor_btn.addActionListener(this);
        panel.add(doctor_btn);

        // Appointments Button
        appointment_btn = new JButton("Appointments");
        appointment_btn.setBounds(200, 250, 300, 55);
        appointment_btn.setFocusable(false);
        appointment_btn.setBackground(tealGreen);
        appointment_btn.setFont(new Font("Arial", Font.BOLD, 20));
        appointment_btn.setForeground(white);
        appointment_btn.addActionListener(this);
        panel.add(appointment_btn);

        // Patient Icon
        ImageIcon patientIcon = new ImageIcon("patient.png");
        Image patientImg = patientIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        JLabel patientLabel = new JLabel(new ImageIcon(patientImg));
        patientLabel.setBounds(140, 100, 50, 55);
        panel.add(patientLabel);

        // Doctor Icon
        ImageIcon doctorIcon = new ImageIcon("doctor.png");
        Image doctorImg = doctorIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        JLabel doctorLabel = new JLabel(new ImageIcon(doctorImg));
        doctorLabel.setBounds(140, 175, 50, 55);
        panel.add(doctorLabel);

        // Appointment Icon
        ImageIcon appointmentIcon = new ImageIcon("appointment.png");
        Image appointmentImg = appointmentIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        JLabel appointmentLabel = new JLabel(new ImageIcon(appointmentImg));
        appointmentLabel.setBounds(140, 250, 50, 55);
        panel.add(appointmentLabel);

        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == patient_btn) {
            new PatientFrame();
        } else if (e.getSource() == doctor_btn) {
            new DoctorFrame();
        } else if (e.getSource() == appointment_btn) {
            new AppointmentFrame();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}