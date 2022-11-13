package sample;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
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
public class Try3 implements ActionListener{

	JFrame Mainframe;
	JFrame Frame1;
	Graph1Window myWindow1 = null;
	Graph2Window myWindow2 = null;
	Graph3Window myWindow3 = null;
	JButton Start, Stop, Graph1, Graph2, Graph3;
	JLabel startlabel, stoplabel, label1, label2, label3, data1, data2, data3, cmnt, cmnt1;
	
	public  Try3() {
		 
		
		Border border1 = BorderFactory.createLineBorder(Color.WHITE,2);
		
		cmnt = new JLabel();
		cmnt.setOpaque(true);
		cmnt.setForeground(Color.BLACK);
		cmnt.setBackground(Color.DARK_GRAY);
		cmnt.setFont(new Font ("Times New Roman",Font.BOLD,24));
		cmnt.setBounds(20,490,200,50);
		cmnt.setText("Comments: ");
		cmnt.setBorder(border1);
		cmnt.setHorizontalAlignment(JLabel.CENTER);
		
		cmnt1 = new JLabel();
		cmnt1.setForeground(Color.RED);
		cmnt1.setFont(new Font ("Times New Roman",Font.ITALIC,24));
		cmnt1.setBounds(220,490,350,50);
		cmnt1.setText("Heath condition is Good");
		cmnt1.setBorder(border1);
		cmnt1.setHorizontalAlignment(JLabel.CENTER);

		label1 = new JLabel();
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font ("Times New Roman",Font.PLAIN,24));
		label1.setBounds(70,240,150,50);
		label1.setText("SpO2 (%) ");
		label1.setBorder(border1);
		label1.setHorizontalAlignment(JLabel.CENTER);
		
		data1 = new JLabel();
		data1.setForeground(Color.WHITE);
		data1.setFont(new Font ("Times New Roman",Font.PLAIN,24));
		data1.setBounds(220,240,150,50);
		data1.setText("95");
		data1.setBorder(border1);
		data1.setHorizontalAlignment(JLabel.CENTER);
		
		label2 = new JLabel();
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font ("Times New Roman",Font.PLAIN,24));
		label2.setBounds(70,320,150,50);
		label2.setText("bpm PR ");
		label2.setBorder(border1);
		label2.setHorizontalAlignment(JLabel.CENTER);
		
		data2 = new JLabel();
		data2.setForeground(Color.WHITE);
		data2.setFont(new Font ("Times New Roman",Font.PLAIN,24));
		data2.setBounds(220,320,150,50);
		data2.setText("85");
		data2.setBorder(border1);
		data2.setHorizontalAlignment(JLabel.CENTER);

		label3 = new JLabel();
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font ("Times New Roman",Font.PLAIN,24));
		label3.setBounds(70,400,150,50);
		label3.setText("PPM");
		label3.setBorder(border1);
		label3.setHorizontalAlignment(JLabel.CENTER);
		
		data3 = new JLabel();
		data3.setForeground(Color.WHITE);
		data3.setFont(new Font ("Times New Roman",Font.PLAIN,24));
		data3.setBounds(220,400,150,50);
		data3.setText("0.5");
		data3.setBorder(border1);
		data3.setHorizontalAlignment(JLabel.CENTER);

		startlabel = new JLabel();
		startlabel.setForeground(Color.YELLOW);
		startlabel.setFont(new Font ("Times New Roman",Font.PLAIN,22));
		startlabel.setBounds(140,30,600,150);
		
		stoplabel = new JLabel();
		stoplabel.setForeground(Color.YELLOW);
		stoplabel.setFont(new Font ("Times New Roman",Font.PLAIN,22));
		stoplabel.setBounds(140,100,600,150);
		
		Border GP1 = BorderFactory.createLineBorder(Color.YELLOW,2);
		Graph1 = new JButton();
		Graph1.setText("Graph1");
		Graph1.setFont(new Font ("Times New Roman",Font.BOLD,22));
		Graph1.setBounds(370,240,150,50);
		Graph1.addActionListener(this);
		Graph1.setFocusable(false);
		Graph1.setBorder(GP1);

		Graph2 = new JButton();
		Graph2.setText("Graph2");
		Graph2.setFont(new Font ("Times New Roman",Font.BOLD,22));
		Graph2.setBounds(370,320,150,50);
		Graph2.addActionListener(this);
		Graph2.setFocusable(false);
		Graph2.setBorder(GP1);

		Graph3 = new JButton();
		Graph3.setText("Graph3");
		Graph3.setFont(new Font ("Times New Roman",Font.BOLD,22));
		Graph3.setBounds(370,400,150,50);
		Graph3.addActionListener(this);
		Graph3.setFocusable(false);
		Graph3.setBorder(GP1);

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
		Title.setText("This Device measures Heartrate and Saturated Oxgyen level.");
		Title.setHorizontalAlignment(JLabel.CENTER);
		Title.setVerticalAlignment(JLabel.TOP);
		Title.setForeground(Color.WHITE);
		Title.setFont(new Font ("Times New Roman",Font.ITALIC,22));
		Title.setBounds(10,20,600,150);
			
		Mainframe = new JFrame(); 
		Mainframe.setTitle("Welcome to PulseOximeter");
		Mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Mainframe.setSize(620,600);
		Mainframe.setVisible(true);
		Mainframe.setLayout(null);
		Mainframe.add(Title);
		Mainframe.add(Start);
		Mainframe.add(Stop);
		Mainframe.add(startlabel);
		Mainframe.add(stoplabel);
		Mainframe.add(Graph1);
		Mainframe.add(Graph2);
		Mainframe.add(Graph3);
		Mainframe.add(label1);
		Mainframe.add(label2);
		Mainframe.add(label3);
		Mainframe.add(data1);
		Mainframe.add(data2);
		Mainframe.add(data3);
		Mainframe.add(cmnt);
		Mainframe.add(cmnt1);
		
		
		ImageIcon image = new ImageIcon("Image.jpg"); 
		Mainframe.setIconImage(image.getImage());
		
		Mainframe.getContentPane().setBackground(Color.BLACK);

	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Try3();
		
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()== Start)
		{
			startlabel.setText("Place your finger in probe to start.");
 		}
		else if (e.getSource()== Stop)
		{
			stoplabel.setText( "Thankyou for using PulseOximeter.");
		}
		else if (e.getSource()== Graph1)
		{
			if(myWindow1 != null) {
				return;
			}
			else {
				myWindow1 = new Graph1Window ();
			}
			
		}
		else if (e.getSource()== Graph2)
		{
			if(myWindow2 != null) {
				return;
			}
			else {
				myWindow2 = new Graph2Window ();
			}
			
		}
		else if (e.getSource()== Graph3)
		{
			if(myWindow3 != null) {
				return;
			}
			else {
				myWindow3 = new Graph3Window ();
			}
			
		}
	}

	

		
}

