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

public class VoterPanel extends JFrame
{
	// Components of the Candidate Panel 
	private Container c3;
	
	// JLabel for images of the button
	private JLabel label_img1;
	private JLabel label_img2;
	private JLabel label_img3;
	private JLabel label_img4;
	private JLabel label_img5;
	private JLabel label_img6;
	
	// JLabel for images above of the button
	private JLabel label_img7;
	private JLabel label_img8;
	private JLabel label_img9;
	private JLabel label_img10;
	private JLabel label_img11;
	private JLabel label_img12;
	private JLabel label_img14;
	private JLabel label_img16;
	
	// Private JButton to navigate to different page
	private JButton login;
	private JButton register;
	private JButton rule;
	private JButton caste;
	private JButton view;
	private JButton statistic;
	
	private JButton backcand;
	
	private JLabel label_img13;
	
	// Private Title for the Dashboard
	private JButton title;
	
	public VoterPanel()
	{
        setTitle("Voter Main Panel");
        
        // Fixed screen size for all application
        setBounds(294, 90, 900, 640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Allow the screen to be resized 
        setResizable(true);

        c3 = getContentPane();
        c3.setLayout(null);
        
        // Having a border for each text field within the registration form
        Border border = BorderFactory.createLineBorder(new Color(0, 0, 0));
        
		// Implementing a Button for Candidate Panel
		title = new JButton("Voter Main Panel Of E-Voting System");
		title.setFont(new Font("Javanese Text", Font.PLAIN, 25));
		title.setBounds(0, 0, 900, 70);
		title.setForeground(new Color(237, 189, 45));
		title.setBackground(new Color(0, 0, 0));
		title.setBorder(border);
		title.setHorizontalAlignment(JTextField.CENTER);
        c3.add(title);
        
        
		// --------------------- Back To HomePage ----------------------------
        // Image for the back label and implemented it to the button
		ImageIcon icon_back = new ImageIcon("./src/images/back01.png");
		Image pwd0 = icon_back.getImage();
		Image newimgr = pwd0.getScaledInstance(24, 23,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_back = new ImageIcon(newimgr);  // transform it back
		label_img16 = new JLabel ("",icon_back,SwingConstants.LEFT);
		label_img16.setToolTipText("");
		label_img16.setBounds(390, 553, 25, 25);
		c3.add(label_img16);
		
        // --------------------- People Image ------------------------------------
		// Image below the login component
		ImageIcon icon_people = new ImageIcon("./src/images/people.png");
		Image v11 = icon_people.getImage();
		Image newimg0 = v11.getScaledInstance(300, 130,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_people = new ImageIcon(newimg0);  // transform it back
		label_img14 = new JLabel ("",icon_people,SwingConstants.LEFT);
		label_img14.setToolTipText("User Panel");
		label_img14.setBounds(300, 420, 350, 100);
		c3.add(label_img14);
        
		// -------------------------- Button --------------------------------------------
		// Implementing a Button for Login in the voter panel
		login = new JButton("Login");
		login.setFont(new Font("Times New Roman", Font.BOLD, 15));
		login.setBounds(75, 159, 129, 44);
		login.setForeground(new Color(237, 189, 45));
		login.setBackground(new Color(0, 0, 0));
		login.setBorder(border);
		login.setHorizontalAlignment(JTextField.CENTER);
        c3.add(login);
        
        // Implementing a button for registration in the voter panel
        register = new JButton("Registration");
        register.setFont(new Font("Times New Roman", Font.BOLD, 15));
        register.setBounds(75, 349, 129, 44);
        register.setForeground(new Color(237, 189, 45));
        register.setBackground(new Color(0, 0, 0));
        register.setBorder(border);
        register.setHorizontalAlignment(JTextField.CENTER);
        c3.add(register);
        
        // Implementing a button for viewing candidates in the voter panel
		view = new JButton("View Candidate");
		view.setFont(new Font("Times New Roman", Font.BOLD, 15));
		view.setBounds(375, 159, 129, 44);
		view.setForeground(new Color(237, 189, 45));
		view.setBackground(new Color(0, 0, 0));
		view.setBorder(border);
		view.setHorizontalAlignment(JTextField.CENTER);
        c3.add(view);
        
        // Implementing a button for registration in the voter panel
        caste = new JButton("Caste Vote");
        caste.setFont(new Font("Times New Roman", Font.BOLD, 15));
        caste.setBounds(375, 349, 129, 44);
        caste.setForeground(new Color(237, 189, 45));
        caste.setBackground(new Color(0, 0, 0));
        caste.setBorder(border);
        caste.setHorizontalAlignment(JTextField.CENTER);
        c3.add(caste);
        
        // Implementing a button for viewing candidates in the voter panel
		rule = new JButton("E-Regulation");
		rule.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rule.setBounds(675, 159, 129, 44);
		rule.setForeground(new Color(237, 189, 45));
		rule.setBackground(new Color(0, 0, 0));
		rule.setBorder(border);
		rule.setHorizontalAlignment(JTextField.CENTER);
        c3.add(rule);
        
		statistic = new JButton("View Party");
		statistic.setFont(new Font("Times New Roman", Font.BOLD, 15));
		statistic.setBounds(675, 349, 129, 44);
		statistic.setForeground(new Color(237, 189, 45));
		statistic.setBackground(new Color(0, 0, 0));
		statistic.setBorder(border);
		statistic.setHorizontalAlignment(JTextField.CENTER);
        c3.add(statistic);
        
       //--------------------------- Images ABOVE JBUtton -------------------------------------------
        // Register Image
		//JLabel constructor with string, Icon and alignment arguments
		ImageIcon icon_icon_register = new ImageIcon("./src/images/register.png");
		Image pwdR = icon_icon_register.getImage();
		Image newimg7 = pwdR.getScaledInstance(50, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_icon_register = new ImageIcon(newimg7);  // transform it back
		label_img7 = new JLabel ("",icon_icon_register,SwingConstants.LEFT);
		label_img7.setToolTipText("");
		label_img7.setBounds(120, 280, 60, 60);
		c3.add(label_img7);
		
		// Login Image
		ImageIcon icon_icon_login = new ImageIcon("./src/images/log.png");
		Image pwdL = icon_icon_login.getImage();
		Image newimg8 = pwdL.getScaledInstance(50, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_icon_login = new ImageIcon(newimg8);  // transform it back
		label_img8 = new JLabel ("",icon_icon_login,SwingConstants.LEFT);
		label_img8.setToolTipText("");
		label_img8.setBounds(120, 85, 60, 60);
		c3.add(label_img8);
		
		// E-Regulation
		ImageIcon icon_icon_regulation = new ImageIcon("./src/images/e-regulation.png");
		Image pwdRe = icon_icon_regulation.getImage();
		Image newimg9 = pwdRe.getScaledInstance(50, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_icon_regulation = new ImageIcon(newimg9);  // transform it back
		label_img9 = new JLabel ("",icon_icon_regulation,SwingConstants.LEFT);
		label_img9.setToolTipText("");
		label_img9.setBounds(720, 85, 60, 60);
		c3.add(label_img9);
		
		// Cast vote
		ImageIcon icon_icon_cast = new ImageIcon("./src/images/vote.png");
		Image pwdC = icon_icon_cast.getImage();
		Image newimg10 = pwdC.getScaledInstance(50, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_icon_cast = new ImageIcon(newimg10);  // transform it back
		label_img10 = new JLabel ("",icon_icon_cast,SwingConstants.LEFT);
		label_img10.setToolTipText("");
		label_img10.setBounds(420, 280, 60, 60);
		c3.add(label_img10);
		
		// View Candidate
		ImageIcon icon_icon_view = new ImageIcon("./src/images/view.png");
		Image pwdV = icon_icon_view.getImage();
		Image newimg11 = pwdV.getScaledInstance(50, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_icon_view = new ImageIcon(newimg11);  // transform it back
		label_img11 = new JLabel ("",icon_icon_view,SwingConstants.LEFT);
		label_img11.setToolTipText("");
		label_img11.setBounds(420, 85, 60, 60);
		c3.add(label_img11);
		
		// Statistic
		ImageIcon icon_icon_statistic = new ImageIcon("./src/images/statistic.png");
		Image pwdS = icon_icon_statistic.getImage();
		Image newimg12 = pwdS.getScaledInstance(50, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_icon_statistic = new ImageIcon(newimg12);  // transform it back
		label_img12 = new JLabel ("",icon_icon_statistic,SwingConstants.LEFT);
		label_img12.setToolTipText("");
		label_img12.setBounds(720, 280, 60, 60);
		c3.add(label_img12);
        
        
        //--------------------------- Images IN JBUtton --------------------------------------------
        
		//JLabel constructor with string, Icon and alignment arguments
		ImageIcon icon_login = new ImageIcon("./src/images/bar.png");
		Image pwd = icon_login.getImage();
		Image newimg1 = pwd.getScaledInstance(290, 150,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_login = new ImageIcon(newimg1);  // transform it back
		label_img1 = new JLabel ("",icon_login,SwingConstants.LEFT);
		label_img1.setToolTipText("This is label login");
		label_img1.setBounds(10, 110, 300, 160);
		c3.add(label_img1);
		
		ImageIcon icon_viewcandidate = new ImageIcon("./src/images/bar.png");
		Image pwd3 = icon_viewcandidate.getImage();
		Image newimg3 = pwd.getScaledInstance(290, 150,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_viewcandidate = new ImageIcon(newimg3);  // transform it back
		label_img3 = new JLabel ("",icon_viewcandidate,SwingConstants.LEFT);
		label_img3.setToolTipText("This is label view candidate");
		label_img3.setBounds(10, 300, 300, 160);
		c3.add(label_img3);
		
		ImageIcon icon_registration = new ImageIcon("./src/images/bar.png");
		Image pwd2 = icon_registration.getImage();
		Image newimg2 = pwd2.getScaledInstance(290, 150,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_registration = new ImageIcon(newimg2);  // transform it back
		label_img2 = new JLabel ("",icon_registration,SwingConstants.LEFT);
		label_img2.setToolTipText("This is label registration");
		label_img2.setBounds(310, 110, 300, 160);
		c3.add(label_img2);
		
		ImageIcon icon_castevote = new ImageIcon("./src/images/bar.png");
		Image pwd4 = icon_castevote.getImage();
		Image newimg4 = pwd4.getScaledInstance(290, 150,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_castevote = new ImageIcon(newimg4);  // transform it back
		label_img4 = new JLabel ("",icon_castevote,SwingConstants.LEFT);
		label_img4.setToolTipText("This is label cast vote");
		label_img4.setBounds(310, 300, 300, 160);
		c3.add(label_img4);
        
		ImageIcon icon_regulation = new ImageIcon("./src/images/bar.png");
		Image pwd5 = icon_regulation.getImage();
		Image newimg5 = pwd5.getScaledInstance(290, 150,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_regulation = new ImageIcon(newimg5);  // transform it back
		label_img5 = new JLabel ("",icon_regulation,SwingConstants.LEFT);
		label_img5.setToolTipText("This is label registration");
		label_img5.setBounds(610, 110, 300, 160);
		c3.add(label_img5);
		
		ImageIcon icon_statistic = new ImageIcon("./src/images/bar.png");
		Image pwd6 = icon_statistic.getImage();
		Image newimg6 = pwd6.getScaledInstance(290, 150,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_statistic = new ImageIcon(newimg6);  // transform it back
		label_img6 = new JLabel ("",icon_statistic,SwingConstants.LEFT);
		label_img6.setToolTipText("This is label registration");
		label_img6.setBounds(610, 300, 300, 160);
		c3.add(label_img6);

		
		backcand = new JButton("Back To Homepage");
		backcand.setFont(new Font("Times New Roman", Font.BOLD, 12));
		backcand.setBounds(412, 555, 140, 22);
		backcand.setForeground(new Color(237, 189, 45));
		backcand.setBackground(new Color(23, 23, 22));
		backcand.setBorder(border);
		backcand.setHorizontalAlignment(JTextField.CENTER);
        c3.add(backcand);
        
        // ----------------------- Action Listener Button --------------------------------------------
        // ----------------------- LOGIN BUTTON ------------------------------------------------------
    	login.addActionListener((ActionListener) new ActionListener()
    	{
    	    public void actionPerformed(ActionEvent e){
    	    	dispose();
    	    	LoginVoter loginvoter = new LoginVoter();
    	        loginvoter.setVisible(true);
    	    }
    	});
    	
    	// ---------------------------- REGISTRATION --------------------------------------------
    	register.addActionListener((ActionListener) new ActionListener()
    	{
    	    public void actionPerformed(ActionEvent e){
    	    	dispose();
    	    	RegisterPageVoter regpage = new RegisterPageVoter();
    	    	regpage.setVisible(true);
    	    }
    	});
    	
    	// --------------------------- REGULATION --------------------------------------------
    	rule.addActionListener((ActionListener) new ActionListener()
    	{
    	    public void actionPerformed(ActionEvent e){
    	    	dispose();
    	    	RulesVoter rulevoter = null;
				try {
					rulevoter = new RulesVoter();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    	    	rulevoter.setVisible(true);
    	    }
    	});
    	
    	// ----------------------------- CASTE VOTE -----------------------------------------
    	caste.addActionListener((ActionListener) new ActionListener()
    	{
    	    public void actionPerformed(ActionEvent e){
    	    	dispose();
    	    	CasteVote castevote = new CasteVote();
    	    	castevote.setVisible(true);
    	    }
    	});
    	
    	
    	// ----------------------------- View Candidate -------------------------------------
    	view.addActionListener((ActionListener) new ActionListener()
    	{
    	    public void actionPerformed(ActionEvent e){
    	    	dispose();
    	    	ViewCandidate viewcandidate = null;
				try {
					viewcandidate = new ViewCandidate();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    	    	viewcandidate.setVisible(true);
    	    }
    	});
    	
    	// ----------------------------- View Party -----------------------------------------
    	statistic.addActionListener((ActionListener) new ActionListener()
    	{
    	    public void actionPerformed(ActionEvent e){
    	    	dispose();
    	    	ViewParty viewparty = new ViewParty();
    	    	viewparty.setVisible(true);
    	    }
    	});
    	
    	// ----------------------------- HOMEPAGE --------------------------------------------
    	backcand.addActionListener((ActionListener) new ActionListener()
    	{
    	    public void actionPerformed(ActionEvent e){
    	    	dispose();
    	        VotingDashBoard dashboard = new VotingDashBoard();
    	        dashboard.setVisible(true);
    	    }
    	});
    	
		
        setVisible(true);
	}
	

	public static void main(String[] args)
	{
		// Calling the NimbusFeel to enhance the overall structure and design of the interface
		setNimbusFeel();
		VoterPanel voterpanel = new VoterPanel();
		
	}
	
	// JTattoo UI design used in the overall interface of the voting system
	private static void setNimbusFeel(){
	    try {
	        // Here you can put the selected theme class name in JTattoo
	        UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

	    } catch (ClassNotFoundException ex) {
	        java.util.logging.Logger.getLogger(VoterPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
	        java.util.logging.Logger.getLogger(VoterPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	        java.util.logging.Logger.getLogger(VoterPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        java.util.logging.Logger.getLogger(VoterPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
	    
	}
}
