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

public class CandidatePanel extends JFrame
{
	// Components of the Candidate Panel 
	private Container c2;
	
	// JLabel for images
	private JLabel label_img1;
	private JLabel label_img2;
	private JLabel label_img3;
	private JLabel label_img4;
	private JLabel label_img5;
	private JLabel label_img6;
	
	// Private JButton to navigate to different page
	private JButton login;
	private JButton register;
	private JButton rule;
	private JButton backcand;
	
	
	// Private Title for the Dashboard
	private JButton title;
	
	public void close()
	{
	    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);

	    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
	}
	
	public CandidatePanel()
	{
        setTitle("Candidate Main Panel");
        
        // Fixed screen size for all application
        setBounds(290, 90, 900, 640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Allow the screen to be resized 
        setResizable(true);

        c2 = getContentPane();
        c2.setLayout(null);
        
        /*// Creating the title of the Candidate Login Panel
        title = new JLabel("Candidate Main Panel Of E-Voting System");
        title.setFont(new Font("Javanese Text", Font.BOLD, 24));
        title.setBounds(220, 30, 550, 70);
        c2.add(title);
        */
        // Having a border for each text field within the registration form
        Border border = BorderFactory.createLineBorder(new Color(0, 0, 0));
        
		// Implementing a Button for Candidate Panel
		title = new JButton("Candidate Main Panel Of E-Voting System");
		title.setFont(new Font("Javanese Text", Font.PLAIN, 25));
		title.setBounds(0, 0, 900, 70);
		title.setForeground(new Color(237, 189, 45));
		title.setBackground(new Color(0, 0, 0));
		title.setBorder(border);
		title.setHorizontalAlignment(JTextField.CENTER);
        c2.add(title);

        
		// Implementing a Button for Candidate Panel
		login = new JButton("Login");
		login.setFont(new Font("Times New Roman", Font.BOLD, 15));
		login.setBounds(442, 182, 151, 54);
		login.setForeground(new Color(237, 189, 45));
		login.setBackground(new Color(0, 0, 0));
		login.setBorder(border);
		login.setHorizontalAlignment(JTextField.CENTER);
        c2.add(login);
        
		// Implementing a Button for Voter Panel
		register = new JButton("Registration");
		register.setFont(new Font("Times New Roman", Font.BOLD, 15));
		register.setBounds(508, 306, 151, 54);
		register.setForeground(new Color(237, 189, 45));
		register.setBackground(new Color(0, 0, 0));
		register.setBorder(border);
		register.setHorizontalAlignment(JTextField.CENTER);
        c2.add(register);
        
		// Implementing a Button for rule and regulation
		rule = new JButton("Rules & Regulation");
		rule.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rule.setBounds(451, 422, 165, 54);
		rule.setForeground(new Color(237, 189, 45));
		rule.setBackground(new Color(0, 0, 0));
		rule.setBorder(border);
		rule.setHorizontalAlignment(JTextField.CENTER);
        c2.add(rule);
        
		//JLabel constructor with string, Icon and alignment arguments
		ImageIcon icon_password = new ImageIcon("./src/images/c01.png");
		Image pwd = icon_password.getImage();
		Image newimg1 = pwd.getScaledInstance(550, 330,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_password = new ImageIcon(newimg1);  // transform it back
		label_img1 = new JLabel ("",icon_password,SwingConstants.LEFT);
		label_img1.setToolTipText("This is label password");
		label_img1.setBounds(170, 120, 560, 425);
		c2.add(label_img1);
		
        // Image for the back label and implemented it to the button
		ImageIcon icon_back = new ImageIcon("./src/images/back01.png");
		Image pwd6 = icon_back.getImage();
		Image newimg6 = pwd6.getScaledInstance(24, 23,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_back = new ImageIcon(newimg6);  // transform it back
		label_img6 = new JLabel ("",icon_back,SwingConstants.LEFT);
		label_img6.setToolTipText("");
		label_img6.setBounds(390, 540, 25, 25);
		c2.add(label_img6);
		
		
		backcand = new JButton("Back To Homepage");
		backcand.setFont(new Font("Times New Roman", Font.BOLD, 12));
		backcand.setBounds(412, 541, 140, 22);
		backcand.setForeground(new Color(237, 189, 45));
		backcand.setBackground(new Color(23, 23, 22));
		backcand.setBorder(border);
		backcand.setHorizontalAlignment(JTextField.CENTER);
        c2.add(backcand);
		
    	rule.addActionListener((ActionListener) new ActionListener()
    	{
    	    public void actionPerformed(ActionEvent e){
    	    	dispose();
    	    	RulesCand rulecand = null;
				try {
					rulecand = new RulesCand();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    	    	rulecand.setVisible(true);
    	    }
    	});
        
    	
    	login.addActionListener((ActionListener) new ActionListener()
    	{
    	    public void actionPerformed(ActionEvent e){
    	    	dispose();
    	    	LoginCandidate logincandidate = new LoginCandidate();
    	    	logincandidate.setVisible(true);
    	    }
    	});

    	
    	backcand.addActionListener((ActionListener) new ActionListener()
    	{
    	    public void actionPerformed(ActionEvent e){
    	    	dispose();
    	        VotingDashBoard dashboard = new VotingDashBoard();
    	        dashboard.setVisible(true);
    	    }
    	});

    	
    	register.addActionListener((ActionListener) new ActionListener()
    	{
    	    public void actionPerformed(ActionEvent e){
    	    	dispose();
    	    	RegisterPageCandidate regpagecandidate = new RegisterPageCandidate();
    	    	regpagecandidate.setVisible(true);
    	    }
    	});

		
        
        setVisible(true);
	}
	

	public static void main(String[] args)
	{
		// Calling the NimbusFeel to enhance the overall structure and design of the interface
		setNimbusFeel();
		CandidatePanel candpanel = new CandidatePanel();
		
	}
	
	// JTattoo UI design used in the overall interface of the voting system
	private static void setNimbusFeel(){
	    try {
	        // Here you can put the selected theme class name in JTattoo
	        UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

	    } catch (ClassNotFoundException ex) {
	        java.util.logging.Logger.getLogger(CandidatePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
	        java.util.logging.Logger.getLogger(CandidatePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	        java.util.logging.Logger.getLogger(CandidatePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        java.util.logging.Logger.getLogger(CandidatePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
	    
	}
}
