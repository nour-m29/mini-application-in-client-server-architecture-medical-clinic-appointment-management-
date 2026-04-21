package Medical_clinic;

import java.awt.Color;
import java.awt.Dimension;
//import java.awt.FlowLayout;
import java.awt.Font;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
//import javax.swing.text.TableView;

public class DoctorFrame extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	Color tealGreen = new Color(0, 150, 136);
    Color white = new Color(245,248,250);
    Color mintColor = new Color(232,245,242);
    
    private int answer;
    private JPanel info;
    private JPanel panel;
    //var de butttons
    private JButton add_doctor;
    private JButton delete_doctor;
    private JButton edit_doctor;
    private JButton consult_doctor;
    //private TableView<>Doctor table;
    private String[] specialties = {
		    "General Practitioner",
		    "Cardiologist",
		    "Dermatologist",
		    "Neurologist",
		    "Pediatrician",
		    "Gynecologist",
		    "Ophthalmologist",
		    "Orthopedist",
		    "Psychiatrist",
		    "Radiologist"
		};

	public DoctorFrame() {
		
        this.setTitle("Medecins");
        this.setSize(1100, 500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        //main
        panel = new JPanel();
        panel.setLayout(null); 
        panel.setBackground(mintColor);
        this.setContentPane(panel); 
        JLabel label = new JLabel("──────── Doctors management ────────");
        label.setFont(new Font("SansSerif", Font.BOLD, 30));
        label.setForeground(tealGreen);
        label.setBounds(280, 10, 600, 40);
        panel.add(label);

        //get info panel
        info = new JPanel();
        info.setLayout(null);
        info.setBackground(mintColor);
        info.setBounds(10, 55, 665, 300);
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
         first_name.setBackground(white);
         first_name.setFont(new Font("Arial", Font.BOLD, 25));
         info.add(first_name);
         
         //doctor's speciality 
         JComboBox<String> specialtyCombo = new JComboBox<>(specialties);
         specialtyCombo.setBounds(250, 117, 250, 25);
         info.add(specialtyCombo);
        
         JLabel spec = new JLabel("Speciality :");
          spec.setBounds(10, 120, 200, 20);
          spec.setFocusable(false);
          spec.setBackground(tealGreen);
          spec.setFont(new Font("Arial", Font.BOLD, 25));
          info.add(spec);
          
         //phone number
         JTextField phone = new JTextField();
         phone.setBounds(250, 170, 250, 30);
         phone.setPreferredSize(new Dimension(500,40));
         info.add(phone);
         JLabel phonenum = new JLabel("Phone № :");
         phonenum.setBounds(10, 170, 200, 20);
         phonenum.setFocusable(false);
         phonenum.setBackground(white);
         phonenum.setFont(new Font("Arial", Font.BOLD, 25));
         info.add(phonenum);
         
         // Buttons
         add_doctor = new JButton("Add");
         add_doctor.setBounds(30, 300, 90, 30);
         add_doctor.setFocusable(false);
         add_doctor.setBackground(tealGreen);
         add_doctor.setFont(new Font("Arial", Font.BOLD, 15));
         add_doctor.setForeground(white);
         add_doctor.addActionListener(this);
         info.add(add_doctor);

         delete_doctor = new JButton("Delete");
         delete_doctor.setBounds(150, 300, 90, 30);
         delete_doctor.setFocusable(false);
         delete_doctor.setBackground(tealGreen);
         delete_doctor.setFont(new Font("Arial", Font.BOLD, 15));
         delete_doctor.setForeground(white);
         delete_doctor.addActionListener(this);
         info.add(delete_doctor);

         edit_doctor = new JButton("Edit");
         edit_doctor.setBounds(270, 300, 90, 30);
         edit_doctor.setFocusable(false);
         edit_doctor.setBackground(tealGreen);
         edit_doctor.setFont(new Font("Arial", Font.BOLD, 15));
         edit_doctor.setForeground(white);
         info.add(edit_doctor);
         
         consult_doctor = new JButton("Search");
         consult_doctor.setBounds(390, 300, 90, 30);
         consult_doctor.setFocusable(false);
         consult_doctor.setBackground(tealGreen);
         consult_doctor.setFont(new Font("Arial", Font.BOLD, 15));
         consult_doctor.setForeground(white);
         info.add(consult_doctor);
          
         //Consult the list of doctors: View all doctors of the clinic.
        	 JPanel table = new JPanel();
             table.setLayout(null);
            //tab.setBackground(btnColor);
             table.setBounds(510, 55, 550, 400); 
             panel.add(table);
        
          this.setVisible(true);
        
    }
	 @Override
     public void actionPerformed(ActionEvent e) {
         if (e.getSource() == delete_doctor) {
         	answer = JOptionPane.showConfirmDialog(null,"Are you sure ?","Delete patient",JOptionPane.YES_NO_CANCEL_OPTION);
         }
	 }
}
