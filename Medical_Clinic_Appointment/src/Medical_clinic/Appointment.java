package Medical_clinic;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Appointment extends JFrame{

	private static final long serialVersionUID = 1L;


	public Appointment() {
		
		//Color btnColor = new Color(222, 252, 142);
	   //Color bleu = new Color(15, 64, 143);
	    Color light_bleu = new Color(201, 232, 255);
	    
        this.setTitle("Appointment");
        this.setSize(700, 400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
         
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.setContentPane(panel);
        panel.setBackground(light_bleu);
        
        this.setLayout(new FlowLayout());
        //add appointment btn
        panel.add(new JButton("+"));
       
        this.setVisible(true);
    }
}
