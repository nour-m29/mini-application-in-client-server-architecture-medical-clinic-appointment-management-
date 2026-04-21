package Medical_clinic;

import java.awt.Color;
import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.text.TableView;

public class AppointmentFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	Color btnColor = new Color(0, 150, 136);
    Color blue = new Color(245,248,250);
    Color light_blue = new Color(232,245,242);

   // private TableView<Appointment> table;
	public AppointmentFrame() {
		
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
        
        // info panel
        JPanel info = new JPanel();
        info.setLayout(null);
        info.setBounds(10, 55, 665, 300);
        panel.add(info);
       
        this.setVisible(true);
    }
}
