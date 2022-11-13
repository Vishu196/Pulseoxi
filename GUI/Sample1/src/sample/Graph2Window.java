package sample;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Graph2Window {
	
	JLabel label1;
	JFrame Frame1;
	
	Graph2Window(){
		
		JLabel label1 = new JLabel();
		label1.setText("       Graph for HeartRate:");
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setVerticalAlignment(JLabel.TOP);
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font ("Times New Roman",Font.ITALIC,23));
		label1.setBounds(35,20,500,150);
		
		Frame1 = new JFrame(); 
		Frame1.setTitle("Saturated Oxygen Level Graph");
		Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame1.setSize(720,520);
		Frame1.setVisible(true);
		Frame1.setLayout(null);
		Frame1.add(label1);
		
		Frame1.getContentPane().setBackground(Color.BLACK);
	}

}



