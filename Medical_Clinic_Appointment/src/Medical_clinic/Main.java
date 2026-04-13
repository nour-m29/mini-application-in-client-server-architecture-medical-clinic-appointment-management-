package Medical_clinic;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;


public class Main {
	
	public static void main(String[] args) {
		
		//app framing
		JFrame window = new JFrame();
		window.setTitle("Medical Clinic Appointement");
		window.setSize(700,420);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//window.setResizable(false);
		window.setVisible(true);
		
		//app icon
		ImageIcon icon = new ImageIcon("icon.jpg");
		window.setIconImage(icon.getImage());
        
		//colors
		window.getContentPane().setBackground(new Color(250,255,253));
		
		//labeling
		JLabel label = new JLabel();
		label.setText("Welcome");
		label.setFont(new Font("arial",Font.PLAIN,20));
		label.setVerticalTextPosition(JLabel.TOP);
		ImageIcon image = new ImageIcon("icon.jpg");
		label.setIcon(image);
		window.add(label);
		window.pack();
		image.set
	}

}
