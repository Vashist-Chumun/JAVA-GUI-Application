package Vote;

//Importing library for the structure of the swing interface
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;

//Importing library to write into a file and read from a file
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Importing library for database
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class VotingDashBoard extends JFrame implements Runnable
{
	// Components of the Candidate Panel 
	private Container c1;
	
	// JLabel for images
	private JLabel label_img1;
	private JLabel label_img2;
	private JLabel label_img3;
	private JLabel label_img4;
	private JLabel label_img5;
	
	// Private JButton to navigate to different page
	private JButton candidate;
	private JButton voter;
	private JButton rule1;
	
	// Private Title for the Dashboard
	private JLabel title;
	
	private Thread t=null;  
	private int hours=0, minutes=0, seconds=0;  
	private String timeString = "";  
	private JButton b;
	private JButton title1;
	
	public void close()
	{
	    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);

	    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
	}
	
	
	public VotingDashBoard()
	{
        setTitle("Dashboard");
        
        // Fixed screen size for all application
        setBounds(290, 90, 900, 640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Allow the screen to be resized 
        setResizable(true);

        c1 = getContentPane();
        c1.setLayout(null);
        
        /*// Creating the title of the Candidate Login Panel
        title = new JLabel("Welcome To E-Voting System");
        title.setFont(new Font("Javanese Text", Font.BOLD, 24));
        title.setBackground(Color.BLACK);
        title.setBounds(280, 30, 550, 70);
        c1.add(title);
        */
        
        
        // Having a border for each text field within the registration form
        Border border = BorderFactory.createLineBorder(new Color(0, 0, 0));
        
        // Digital Clock 
        t = new Thread(this);  
        t.start();  
      
        b = new JButton();  
        b.setBounds(760,20,80,30);
        b.setBorder(border);
        b.setFont(new Font("Times New Roman", Font.BOLD, 13));
        b.setBackground(new Color(255, 253, 230));
        c1.add(b); 
        
		// Implementing a Button for Candidate Panel
		title1 = new JButton("Welcome To E-Voting System");
		title1.setFont(new Font("Javanese Text", Font.PLAIN, 25));
		title1.setBounds(0, 0, 900, 70);
		title1.setForeground(new Color(237, 189, 45));
		title1.setBackground(new Color(0, 0, 0));
		title1.setBorder(border);
		title1.setHorizontalAlignment(JTextField.CENTER);
        c1.add(title1);

        
		// Implementing a Button for Candidate Panel
		candidate = new JButton("Candidate Panel");
		candidate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		candidate.setBounds(447, 175, 151, 54);
		candidate.setForeground(new Color(237, 189, 45));
		candidate.setBackground(new Color(0, 0, 0));
		candidate.setBorder(border);
		candidate.setHorizontalAlignment(JTextField.CENTER);
        c1.add(candidate);
        
		// Implementing a Button for Voter Panel
		voter = new JButton("Voter Panel");
		voter.setFont(new Font("Times New Roman", Font.BOLD, 15));
		voter.setBounds(497, 297, 151, 54);
		voter.setForeground(new Color(237, 189, 45));
		voter.setBackground(new Color(0, 0, 0));
		voter.setBorder(border);
		voter.setHorizontalAlignment(JTextField.CENTER);
        c1.add(voter);
        
		// Implementing a Button for rule and regulation
		rule1 = new JButton("Rules & Regulation");
		rule1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rule1.setBounds(449, 420, 151, 54);
		rule1.setForeground(new Color(237, 189, 45));
		rule1.setBackground(new Color(0, 0, 0));
		rule1.setBorder(border);
		rule1.setHorizontalAlignment(JTextField.CENTER);
        c1.add(rule1);
        
		//JLabel constructor with string, Icon and alignment arguments
		ImageIcon icon_password = new ImageIcon("./src/images/options.png");
		Image pwd = icon_password.getImage();
		Image newimg1 = pwd.getScaledInstance(550, 400,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_password = new ImageIcon(newimg1);  // transform it back
		label_img1 = new JLabel ("",icon_password,SwingConstants.LEFT);
		label_img1.setToolTipText("This is label password");
		label_img1.setBounds(140, 120, 560, 425);
		c1.add(label_img1);
		
		rule1.addActionListener((ActionListener) new ActionListener()
		{
		    public void actionPerformed(ActionEvent e){
		    	dispose();
		    	Rules rule = null;
				try {
					rule = new Rules();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        rule.setVisible(true);
		    }
		});
		
		
		voter.addActionListener((ActionListener) new ActionListener()
		{
		    public void actionPerformed(ActionEvent e){
		    	dispose();
		    	VoterPanel voterpanel = new VoterPanel();
		        voterpanel.setVisible(true);
		    }
		});
		
		
		candidate.addActionListener((ActionListener) new ActionListener()
		{
		    public void actionPerformed(ActionEvent e){
		    	dispose();
		    	CandidatePanel candpanel = new CandidatePanel();
		    	candpanel.setVisible(true);
		    }
		});
		
		
        
        setVisible(true);
	}
	
	 public void run() {  
	      try {  
	         while (true) {  
	  
	            Calendar cal = Calendar.getInstance();  
	            hours = cal.get( Calendar.HOUR_OF_DAY );  
	            if ( hours > 12 ) hours -= 12;  
	            minutes = cal.get( Calendar.MINUTE );  
	            seconds = cal.get( Calendar.SECOND );  
	  
	            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
	            Date date = cal.getTime();  
	            timeString = formatter.format( date );  
	  
	            printTime();  
	  
	            t.sleep( 1000 );  // interval given in milliseconds  
	         }  
	      }  
	      catch (Exception e) { }  
	 }  
	  
	public void printTime(){  
	b.setText(timeString);  
	}  
	

	public static void main(String[] args)
	{
		// Calling the NimbusFeel to enhance the overall structure and design of the interface
		setNimbusFeel();
		VotingDashBoard dashboard = new VotingDashBoard();
		
	}
	
	// JTattoo UI design used in the overall interface of the voting system
	private static void setNimbusFeel(){
	    try {
	        // Here you can put the selected theme class name in JTattoo
	        UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

	    } catch (ClassNotFoundException ex) {
	        java.util.logging.Logger.getLogger(VotingDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
	        java.util.logging.Logger.getLogger(VotingDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	        java.util.logging.Logger.getLogger(VotingDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        java.util.logging.Logger.getLogger(VotingDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
	    
	}
}
