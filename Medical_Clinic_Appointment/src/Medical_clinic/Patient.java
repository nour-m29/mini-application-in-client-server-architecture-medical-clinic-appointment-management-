package Medical_clinic;
import java.awt.Color;
import java.awt.Dimension;
//import java.awt.FlowLayout;
import java.awt.Font;
//import java.awt.Window;

import javax.swing.*;

public class Patient extends JFrame {

    private static final long serialVersionUID = 1L;
   // Color btnColor = new Color(222, 252, 142);
    //Color bleu = new Color(15, 64, 143);
   // Color light_blue = new Color(201, 232, 255);
    Color btnColor = new Color(0, 150, 136);
    Color blue = new Color(245,248,250);
    Color light_blue = new Color(232,245,242);
    public Patient() {
        this.setTitle("Patients");
        this.setSize(1100, 500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       // this.setResizable(false);
        this.setLocationRelativeTo(null);

        // Main panel 
        JPanel panel = new JPanel();
        panel.setLayout(null); 
        panel.setBackground(light_blue);
        this.setContentPane(panel); 
        JLabel label = new JLabel("──────── Patients management ────────");
        label.setFont(new Font("SansSerif", Font.BOLD, 30));
        label.setForeground(btnColor);
        label.setBounds(280, 10, 600, 40);
        panel.add(label);

        // Info panel
        JPanel info = new JPanel();
        info.setLayout(null);
        info.setBackground(light_blue);
        info.setBounds(10, 55, 510, 500); 
        panel.add(info);
        
        //text fields
        //lastname
        JTextField lastName = new JTextField();
        lastName.setBounds(250, 20, 250, 30);
        lastName.setPreferredSize(new Dimension(500,40));
        info.add(lastName);
         JLabel last_name = new JLabel("Last name :");
         last_name.setBounds(10, 20, 200, 20);
         last_name.setFocusable(false);
         last_name.setBackground(btnColor);
         last_name.setFont(new Font("Arial", Font.BOLD, 25));
         info.add(last_name);
         
         //first name
        JTextField firstName = new JTextField();
        firstName.setBounds(250, 70, 250, 30);
        firstName.setPreferredSize(new Dimension(500,40));
         info.add(firstName);
         JLabel first_name = new JLabel("First name :");
         first_name.setBounds(10, 70, 200, 20);
         first_name.setFocusable(false);
         first_name.setBackground(btnColor);
         first_name.setFont(new Font("Arial", Font.BOLD, 25));
         info.add(first_name);
         
         //date of birth
         JTextField dateBirth = new JTextField();
         dateBirth.setBounds(250, 120, 250, 30);
         dateBirth.setPreferredSize(new Dimension(500,40));
          info.add(dateBirth);
          JLabel birthDate = new JLabel("Date of Birth :");
          birthDate.setBounds(10, 120, 200, 20);
          birthDate.setFocusable(false);
          birthDate.setBackground(btnColor);
          birthDate.setFont(new Font("Arial", Font.BOLD, 25));
          info.add(birthDate);
          
         //phone number
         JTextField phone = new JTextField();
         phone.setBounds(250, 170, 250, 30);
         phone.setPreferredSize(new Dimension(500,40));
         info.add(phone);
         JLabel phonenum = new JLabel("Phone № :");
         phonenum.setBounds(10, 170, 200, 20);
         phonenum.setFocusable(false);
         phonenum.setBackground(btnColor);
         phonenum.setFont(new Font("Arial", Font.BOLD, 25));
         info.add(phonenum);
         
         //adress
         JTextField adr = new JTextField();
         adr.setBounds(250, 220, 250, 30);
         adr.setPreferredSize(new Dimension(500,40));
         info.add(adr);
         JLabel adress = new JLabel("Address :");
         adress.setBounds(10, 220, 200, 20);
         adress.setFocusable(false);
         adress.setBackground(btnColor);
         adress.setFont(new Font("Arial", Font.BOLD, 25));
         info.add(adress);
         
         
        // Buttons
        JButton add_patient = new JButton("Add");
        add_patient.setBounds(30, 300, 90, 30);
        add_patient.setFocusable(false);
        add_patient.setBackground(btnColor);
        add_patient.setFont(new Font("Arial", Font.BOLD, 15));
        add_patient.setForeground(blue);
        info.add(add_patient);

        JButton delete_patient = new JButton("Delete");
        delete_patient.setBounds(150, 300, 90, 30);
        delete_patient.setFocusable(false);
        delete_patient.setBackground(btnColor);
        delete_patient.setFont(new Font("Arial", Font.BOLD, 15));
        delete_patient.setForeground(blue);
        info.add(delete_patient);

        JButton edit_patient = new JButton("Edit");
        edit_patient.setBounds(270, 300, 90, 30);
        edit_patient.setFocusable(false);
        edit_patient.setBackground(btnColor);
        edit_patient.setFont(new Font("Arial", Font.BOLD, 15));
        edit_patient.setForeground(blue);
        info.add(edit_patient);

        JButton search_patient = new JButton("Search");
        search_patient.setBounds(390, 300, 90, 30);
        search_patient.setFocusable(false);
        search_patient.setBackground(btnColor);
        search_patient.setFont(new Font("Arial", Font.BOLD, 15));
        search_patient.setForeground(blue);
        info.add(search_patient);
        
        //tab of all patients added to the data base
        JPanel tab = new JPanel();
        tab.setLayout(null);
        //tab.setBackground(btnColor);
        tab.setBounds(510, 55, 550, 400); 
        panel.add(tab);
        this.setVisible(true);
    }
    
    
}