package Medical_clinic;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
//import java.awt.event.ActionListener;

public class Main {
	
	public static void main(String[] args) {
		
		//frame
		 JFrame window = new JFrame();
	        window.setTitle("Medical Clinic Appointment");
	        window.setSize(700, 450);
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        window.setResizable(false);

	        //colors
	        Color btnColor = new Color(30, 100, 200);
	        Color beige = new Color(240, 240, 235);
	        
	        // panel
	        JPanel panel = new JPanel();
	        panel.setLayout(null);
	        panel.setBackground(beige);
	        window.setContentPane(panel);

	        //Icon
	        ImageIcon icon = new ImageIcon("icon.jpg");
	        window.setIconImage(icon.getImage());

	        //Title
	        JLabel label = new JLabel("Medical Clinic Appointment Management");
	        label.setFont(new Font("Arial", Font.BOLD, 24));
	        label.setForeground(new Color(30, 100, 200));
	        label.setBounds(100, 30, 600, 40);
	        panel.add(label);

	       
	        
	        

	        //Patients Button 
	        JButton patient_btn = new JButton("Patients");
	        patient_btn.setBounds(200, 100, 300, 55);
	        patient_btn.setFocusable(false);
	        patient_btn.setBackground(btnColor);
	        patient_btn.setFont(new Font("Arial", Font.BOLD, 20));
	        patient_btn.setForeground(beige);
	        patient_btn.setBorderPainted(false);
	        patient_btn.setOpaque(true);
	        panel.add(patient_btn);

	        //Doctor Button
	        JButton doctor_btn = new JButton("Doctor");
	        doctor_btn.setBounds(200, 175, 300, 55);
	        doctor_btn.setFocusable(false);
	        doctor_btn.setBackground(btnColor);
	        doctor_btn.setFont(new Font("Arial", Font.BOLD, 20));
	        doctor_btn.setForeground(beige);
	        doctor_btn.setBorderPainted(false);
	        doctor_btn.setOpaque(true);
	        panel.add(doctor_btn);

	        //Appointments Button
	        JButton appointment_btn = new JButton("Appointments");
	        appointment_btn.setBounds(200, 250, 300, 55);
	        appointment_btn.setFocusable(false);
	        appointment_btn.setBackground(btnColor);
	        appointment_btn.setFont(new Font("Arial", Font.BOLD, 20));
	        appointment_btn.setForeground(beige);
	        appointment_btn.setBorderPainted(false);
	        appointment_btn.setOpaque(true);
	        panel.add(appointment_btn);

	        window.setVisible(true);
	}

}
