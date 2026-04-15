package Medical_clinic;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Doctor extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public Doctor() {
		
		//Color btnColor = new Color(222, 252, 142);
	   // Color blue = new Color(15, 64, 143);
	    Color light_blue = new Color(201, 232, 255);
		
        this.setTitle("Doctors");
        this.setSize(700, 400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.setContentPane(panel);
        panel.setBackground(light_blue);
        this.setVisible(true);
    }

}
