package Medical_clinic;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class Patient extends JFrame {

    private static final long serialVersionUID = 1L;
    Color btnColor = new Color(222, 252, 142);
    Color bleu = new Color(15, 64, 143);
    Color light_blue = new Color(201, 232, 255);
    public Patient() {
        this.setTitle("Patients");
        this.setSize(700, 400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.setContentPane(panel);
        panel.setBackground(light_blue);
        
        this.setLayout(new FlowLayout());
        //add patients btn
        JButton add_patient = new JButton("+");
        panel.add(add_patient);
        //delete patient btn
        JButton delete_patient = new JButton("delete");
        panel.add(delete_patient);
        //show patients btn
        JButton show_patient = new JButton("Show");
        panel.add(show_patient);
        this.setVisible(true);
    }
    
    
}