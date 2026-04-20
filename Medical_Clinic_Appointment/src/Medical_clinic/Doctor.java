package Medical_clinic;

import java.awt.Color;
import java.awt.Dimension;
//import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JComboBox;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Doctor extends JFrame{
	
	private static final long serialVersionUID = 1L;
	Color btnColor = new Color(0, 150, 136);
    Color blue = new Color(245,248,250);
    Color light_blue = new Color(232,245,242);

	public Doctor() {
		
        this.setTitle("Medecins");
        this.setSize(1100, 500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        //main
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.setContentPane(panel);
        panel.setBackground(light_blue);
        JLabel label = new JLabel("──────── Doctors manager ────────");
        label.setFont(new Font("SansSerif", Font.BOLD, 30));
        label.setForeground(btnColor);
        label.setBounds(280, 10, 600, 40);
        panel.add(label);
        
        //info panel
        JPanel info = new JPanel();
        info.setLayout(null);
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
         
         //doctor's speciality 
         String[] specialties = {
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
        		JComboBox<String> specialtyCombo = new JComboBox<>(specialties);
        		specialtyCombo.setBounds(250, 117, 250, 25);
        		info.add(specialtyCombo);
        		//String selected = (String) specialtyCombo.getSelectedItem();
         JLabel spec = new JLabel("Speciality :");
          spec.setBounds(10, 120, 200, 20);
          spec.setFocusable(false);
          spec.setBackground(btnColor);
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
         phonenum.setBackground(btnColor);
         phonenum.setFont(new Font("Arial", Font.BOLD, 25));
         info.add(phonenum);
        
        JPanel tab = new JPanel();
        tab.setLayout(null);
        //tab.setBackground(btnColor);
        tab.setBounds(510, 55, 550, 400); 
        panel.add(tab);
        this.setVisible(true);
        this.setVisible(true);
    }

}
