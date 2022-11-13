package sample;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 
 */

/**
 * @author prash
 *
 */
public class Try1 implements ActionListener{

	JButton Start;
	JButton Stop;
	JFrame Mainframe;
	
	public  Try1() {
		
		Start = new JButton();
		Start.setText("START");
		Start.setFont(new Font ("Times New Roman",Font.BOLD,21));
		Start.setBounds(20,80,100,50);
		Start.addActionListener(this);
		Start.setFocusable(false);
		
		Stop = new JButton();
		Stop.setText("STOP");
		Stop.setFont(new Font ("Times New Roman",Font.BOLD,22));
		Stop.setBounds(20,150,100,50);
		Stop.addActionListener(this);
		Stop.setFocusable(false);
		
		JLabel Title = new JLabel();
		Title.setText("This Device measures Heartrate and Saturated Oxgyen level in your body.");
		Title.setHorizontalAlignment(JLabel.CENTER);
		Title.setVerticalAlignment(JLabel.TOP);
		Title.setForeground(Color.WHITE);
		Title.setFont(new Font ("Times New Roman",Font.ITALIC,23));
		Title.setBounds(35,20,700,150);
		
		
		Mainframe = new JFrame(); 
		Mainframe.setTitle("Welcome to PulseOximeter");
		Mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Mainframe.setSize(820,520);
		Mainframe.setVisible(true);
		Mainframe.setLayout(null);
		Mainframe.add(Title);
		Mainframe.add(Start);
		Mainframe.add(Stop);
		
		ImageIcon image = new ImageIcon("Image.jpg"); 
		Mainframe.setIconImage(image.getImage());
		
		Mainframe.getContentPane().setBackground(Color.BLACK);

	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Try1();
		
	}

	 public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Start) {
			System.out.println("Place your finger in probe to start."); 
				}
		else
		System.out.println( "Thankyou for using PulseOximeter.");
				}

	 
		

}


