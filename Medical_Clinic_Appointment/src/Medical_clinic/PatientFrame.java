package Medical_clinic;
import java.awt.Color;
import java.awt.Dimension;
//import java.awt.FlowLayout;
import java.awt.Font;
//import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//import javax.swing.text.TableView;

public class PatientFrame extends JFrame implements ActionListener{

    private static final long serialVersionUID = 1L;
    private JButton add_patient;
    private JButton delete_patient;
    private JButton edit_patient;
    private JButton search_patient;
    private int answer;
    Color tealGreen = new Color(0, 150, 136);
    Color white = new Color(245,248,250);
    Color mintColor = new Color(232,245,242);

	
   // private TableView<patient> table;
    
    public PatientFrame() {
        this.setTitle("Patients");
        this.setSize(1100, 500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       // this.setResizable(false);
        this.setLocationRelativeTo(null);

        // Main panel 
        JPanel panel = new JPanel();
        panel.setLayout(null); 
        panel.setBackground(mintColor);
        this.setContentPane(panel); 
        JLabel label = new JLabel("──────── Patients management ────────");
        label.setFont(new Font("SansSerif", Font.BOLD, 30));
        label.setForeground(tealGreen);
        label.setBounds(280, 10, 600, 40);
        panel.add(label);

        // Info panel
        JPanel info = new JPanel();
        info.setLayout(null);
        info.setBackground(mintColor);
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
         last_name.setBackground(tealGreen);
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
         first_name.setBackground(tealGreen);
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
          birthDate.setBackground(tealGreen);
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
         phonenum.setBackground(tealGreen);
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
         adress.setBackground(tealGreen);
         adress.setFont(new Font("Arial", Font.BOLD, 25));
         info.add(adress);
         
         
        // Buttons
        add_patient = new JButton("Add");
        add_patient.setBounds(30, 300, 90, 30);
        add_patient.setFocusable(false);
        add_patient.setBackground(tealGreen);
        add_patient.setFont(new Font("Arial", Font.BOLD, 15));
        add_patient.setForeground(white);
        info.add(add_patient);

        delete_patient = new JButton("Delete");
        delete_patient.setBounds(150, 300, 90, 30);
        delete_patient.setFocusable(false);
        delete_patient.setBackground(tealGreen);
        delete_patient.setFont(new Font("Arial", Font.BOLD, 15));
        delete_patient.setForeground(white);
        delete_patient.addActionListener(this);
        info.add(delete_patient);

        edit_patient = new JButton("Edit");
        edit_patient.setBounds(270, 300, 90, 30);
        edit_patient.setFocusable(false);
        edit_patient.setBackground(tealGreen);
        edit_patient.setFont(new Font("Arial", Font.BOLD, 15));
        edit_patient.setForeground(white);
        info.add(edit_patient);

        search_patient = new JButton("Search");
        search_patient.setBounds(390, 300, 90, 30);
        search_patient.setFocusable(false);
        search_patient.setBackground(tealGreen);
        search_patient.setFont(new Font("Arial", Font.BOLD, 15));
        search_patient.setForeground(white);
        info.add(search_patient);
        
        //tab of all patients added to the data base
        JPanel tab = new JPanel();
        tab.setLayout(null);
        //tab.setBackground(btnColor);
        tab.setBounds(510, 55, 550, 400); 
        panel.add(tab);
        this.setVisible(true);}
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == delete_patient) {
            	answer = JOptionPane.showConfirmDialog(null,"Are you sure ?","Delete patient",JOptionPane.YES_NO_CANCEL_OPTION);
            }

            }
    
}