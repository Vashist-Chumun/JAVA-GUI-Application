package Vote;

import javax.imageio.ImageIO;
//Importing library for the structure of the swing interface
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;

//Importing library to write into a file and read from a file
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
//Importing library for database
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewCandidate extends JFrame
{
	// Components of the Candidate Panel 
	private Container cv1;
	
	// Private Title for the Dashboard
	private JButton title;
	private JLabel title2;
	
	private JButton backcand;
	private JButton backcand2;
	
	// JLabel for images
	private JLabel label_img1;
	private JLabel label_img2;
	private JLabel label_img3;
	private JLabel label_img4;
	private JLabel label_img5;
	private JLabel label_img6;
	private JLabel label_img7;
	private JLabel label_img8;
	private JLabel label_img9;
	private JLabel label_img10;
	private JLabel label_img15;
	private JLabel label_img16;
	private JLabel label_img17;
	private JLabel label_img18;
	private JLabel label_img19;
	private JLabel label_img20;
	
	// JLabel for Candidate
	private JLabel cand1;
	private JLabel cand2;
	private JLabel cand3;
	private JLabel cand4;
	private JLabel cand5;
	private JLabel cand6;
	private JLabel cand7;
	private JLabel cand8;
	private JLabel cand9;
	private JLabel cand10;
	private JLabel cand15;
	private JLabel cand16;
	private JLabel cand17;
	private JLabel cand18;
	private JLabel cand19;
	private JLabel cand20;
	
	// JLabel for Party
	private JLabel p1;
	private JLabel p2;
	private JLabel p3;
	private JLabel p4;
	private JLabel p5;
	private JLabel p6;
	private JLabel p7;
	private JLabel p8;
	private JLabel p9;
	private JLabel p10;
	private JLabel p15;
	private JLabel p16;
	private JLabel p17;
	private JLabel p18;
	private JLabel p19;
	private JLabel p20;
	
	// Private JButton to navigate to different page
	private JButton candidate;
	private JButton voter;
	private JButton rule1;
	
	private JButton detail1;
	private JButton detail2;
	private JButton detail3;
	private JButton detail4;
	private JButton detail5;
	
	private JButton detail6;
	private JButton detail7;
	private JButton detail8;
	private JButton detail9;
	private JButton detail10;
	
	private JButton detail11;
	private JButton detail12;
	private JButton detail13;
	private JButton detail14;
	private JButton detail15;
	
	
	// Scroll Bar
	private JScrollBar B;
	
	public void close()
	{
	    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);

	    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
	}
	
	public ViewCandidate()
	{
        setTitle("View Candidate Panel");
        
        // Fixed screen size for all application
        setBounds(290, 90, 900, 640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Allow the screen to be resized 
        setResizable(true);

        cv1 = getContentPane();
        cv1.setLayout(null);
        
        // Having a border for each text field within the registration form
        Border border = BorderFactory.createLineBorder(new Color(181, 176, 33));
        Border border1 = BorderFactory.createLineBorder(new Color(0, 0, 0));
        
		// Implementing a Button for Candidate Panel
		title = new JButton("Aspirant List");
		title.setFont(new Font("Javanese Text", Font.PLAIN, 20));
		title.setBounds(0, 0, 900, 60);
		title.setForeground(new Color(237, 189, 45));
		title.setBackground(new Color(0, 0, 0));
		title.setBorder(border1);
		title.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(title);
        
        
        //--------------------------- Images Candidate -------------------------------------------
        // Register Image
		//JLabel constructor with string, Icon and alignment arguments
        //BufferedImage img1 = ImageIO.read(new URL(
        //       "https://previews.123rf.com/images/stockbroker/stockbroker1710/stockbroker171000644/89639939-portrait-of-young-professional-man-in-suit-arms-crossed.jpg"));
        ImageIcon icon_p1 = new ImageIcon("./src/images/log.png");
		Image pwd1 = icon_p1.getImage();
		Image newimg1 = pwd1.getScaledInstance(50, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_p1 = new ImageIcon(newimg1);  // transform it back
		label_img1 = new JLabel ("",icon_p1,SwingConstants.LEFT);
		label_img1.setBounds(30, 85, 60, 60);
		cv1.add(label_img1);
		
		ImageIcon icon_p2 = new ImageIcon("./src/images/log.png");
		Image pwd2 = icon_p2.getImage();
		Image newimg2 = pwd2.getScaledInstance(50, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_p2 = new ImageIcon(newimg2);  // transform it back
		label_img2 = new JLabel ("",icon_p2,SwingConstants.LEFT);
		label_img2.setBounds(30, 175, 60, 60);
		cv1.add(label_img2);
		
		ImageIcon icon_p3 = new ImageIcon("./src/images/log2.png");
		Image pwd3 = icon_p3.getImage();
		Image newimg3 = pwd3.getScaledInstance(55, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_p3 = new ImageIcon(newimg3);  // transform it back
		label_img3 = new JLabel ("",icon_p3,SwingConstants.LEFT);
		label_img3.setBounds(30, 265, 60, 60);
		cv1.add(label_img3);
		
		ImageIcon icon_p4 = new ImageIcon("./src/images/log2.png");
		Image pwd4 = icon_p4.getImage();
		Image newimg4 = pwd4.getScaledInstance(55, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_p4 = new ImageIcon(newimg4);  // transform it back
		label_img4 = new JLabel ("",icon_p4,SwingConstants.LEFT);
		label_img4.setBounds(30, 355, 60, 60);
		cv1.add(label_img4);
		
		ImageIcon icon_p5 = new ImageIcon("./src/images/log2.png");
		Image pwd5 = icon_p5.getImage();
		Image newimg5 = pwd5.getScaledInstance(55, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_p5 = new ImageIcon(newimg5);  // transform it back
		label_img5 = new JLabel ("",icon_p5,SwingConstants.LEFT);
		label_img5.setBounds(30, 445, 60, 60);
		cv1.add(label_img5);
		
		ImageIcon icon_p6 = new ImageIcon("./src/images/log2.png");
		Image pwd6 = icon_p6.getImage();
		Image newimg6 = pwd6.getScaledInstance(55, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_p6 = new ImageIcon(newimg6);  // transform it back
		label_img6 = new JLabel ("",icon_p6,SwingConstants.LEFT);
		label_img6.setBounds(280, 85, 60, 60);
		cv1.add(label_img6);
		
		ImageIcon icon_p7 = new ImageIcon("./src/images/log.png");
		Image pwd7 = icon_p7.getImage();
		Image newimg7 = pwd7.getScaledInstance(50, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_p7 = new ImageIcon(newimg7);  // transform it back
		label_img7 = new JLabel ("",icon_p7,SwingConstants.LEFT);
		label_img7.setBounds(280, 175, 60, 60);
		cv1.add(label_img7);
		
		ImageIcon icon_p8 = new ImageIcon("./src/images/log.png");
		Image pwd8 = icon_p8.getImage();
		Image newimg8 = pwd8.getScaledInstance(50, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_p8 = new ImageIcon(newimg8);  // transform it back
		label_img8 = new JLabel ("",icon_p8,SwingConstants.LEFT);
		label_img8.setBounds(280, 265, 60, 60);
		cv1.add(label_img8);
		
		ImageIcon icon_p9 = new ImageIcon("./src/images/log.png");
		Image pwd9 = icon_p9.getImage();
		Image newimg9 = pwd9.getScaledInstance(50, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_p9 = new ImageIcon(newimg9);  // transform it back
		label_img9 = new JLabel ("",icon_p9,SwingConstants.LEFT);
		label_img9.setBounds(280, 355, 60, 60);
		cv1.add(label_img9);
		
		ImageIcon icon_p10 = new ImageIcon("./src/images/log.png");
		Image pwd10 = icon_p10.getImage();
		Image newimg10 = pwd10.getScaledInstance(50, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_p10 = new ImageIcon(newimg10);  // transform it back
		label_img10 = new JLabel ("",icon_p10,SwingConstants.LEFT);
		label_img10.setBounds(280, 445, 60, 60);
		cv1.add(label_img10);
		
		ImageIcon icon_p15 = new ImageIcon("./src/images/log2.png");
		Image pwd15 = icon_p15.getImage();
		Image newimg15 = pwd15.getScaledInstance(55, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_p15 = new ImageIcon(newimg15);  // transform it back
		label_img15 = new JLabel ("",icon_p15,SwingConstants.LEFT);
		label_img15.setBounds(530, 445, 60, 60);
		cv1.add(label_img15);
		
		ImageIcon icon_p16 = new ImageIcon("./src/images/log.png");
		Image pwd16 = icon_p16.getImage();
		Image newimg16 = pwd16.getScaledInstance(50, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_p16 = new ImageIcon(newimg16);  // transform it back
		label_img16 = new JLabel ("",icon_p16,SwingConstants.LEFT);
		label_img16.setBounds(530, 85, 60, 60);
		cv1.add(label_img16);
		
		ImageIcon icon_p17 = new ImageIcon("./src/images/log.png");
		Image pwd17 = icon_p17.getImage();
		Image newimg17 = pwd17.getScaledInstance(50, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_p17 = new ImageIcon(newimg17);  // transform it back
		label_img17 = new JLabel ("",icon_p17,SwingConstants.LEFT);
		label_img17.setBounds(530, 175, 60, 60);
		cv1.add(label_img17);
		
		ImageIcon icon_p18 = new ImageIcon("./src/images/log.png");
		Image pwd18 = icon_p18.getImage();
		Image newimg18 = pwd18.getScaledInstance(50, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_p18 = new ImageIcon(newimg18);  // transform it back
		label_img18 = new JLabel ("",icon_p18,SwingConstants.LEFT);
		label_img18.setBounds(530, 265, 60, 60);
		cv1.add(label_img18);
		
		ImageIcon icon_p19 = new ImageIcon("./src/images/log.png");
		Image pwd19 = icon_p19.getImage();
		Image newimg19 = pwd19.getScaledInstance(50, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_p19 = new ImageIcon(newimg19);  // transform it back
		label_img19 = new JLabel ("",icon_p19,SwingConstants.LEFT);
		label_img19.setBounds(530, 355, 60, 60);
		cv1.add(label_img19);
		
		
		// -------------------------- Candidate Detailing -------------------------------------
        cand1 = new JLabel("Name : Mr Maxwell");
        cand1.setFont(new Font("Javanese Text", Font.BOLD, 12));
        cand1.setBounds(90, 100, 150, 20);
        cv1.add(cand1);
        
        cand2 = new JLabel("Name : Mr James");
        cand2.setFont(new Font("Javanese Text", Font.BOLD, 12));
        cand2.setBounds(90, 190, 150, 20);
        cv1.add(cand2);
        
        cand3 = new JLabel("Name : Mrs Theresa");
        cand3.setFont(new Font("Javanese Text", Font.BOLD, 12));
        cand3.setBounds(90, 280, 150, 20);
        cv1.add(cand3);
        
        cand4 = new JLabel("Name : Mrs Grace");
        cand4.setFont(new Font("Javanese Text", Font.BOLD, 12));
        cand4.setBounds(90, 370, 150, 20);
        cv1.add(cand4);
        
        cand5 = new JLabel("Name : Mrs Julia	");
        cand5.setFont(new Font("Javanese Text", Font.BOLD, 12));
        cand5.setBounds(90, 460, 150, 20);
        cv1.add(cand5);
        
        cand6 = new JLabel("Name : Mrs Madison");
        cand6.setFont(new Font("Javanese Text", Font.BOLD, 12));
        cand6.setBounds(340, 100, 150, 20);
        cv1.add(cand6);
        
        cand7 = new JLabel("Name : Mr Kenneth");
        cand7.setFont(new Font("Javanese Text", Font.BOLD, 12));
        cand7.setBounds(340, 190, 150, 20);
        cv1.add(cand7);
        
        cand8 = new JLabel("Name : Mr Edward");
        cand8.setFont(new Font("Javanese Text", Font.BOLD, 12));
        cand8.setBounds(340, 280, 150, 20);
        cv1.add(cand8);
        
        cand9 = new JLabel("Name : Mr Timothy");
        cand9.setFont(new Font("Javanese Text", Font.BOLD, 12));
        cand9.setBounds(340, 370, 150, 20);
        cv1.add(cand9);
        
        cand10 = new JLabel("Name : Mr Jacob");
        cand10.setFont(new Font("Javanese Text", Font.BOLD, 12));
        cand10.setBounds(340, 460, 150, 20);
        cv1.add(cand10);
        
        cand16 = new JLabel("Name : Mr Logan");
        cand16.setFont(new Font("Javanese Text", Font.BOLD, 12));
        cand16.setBounds(590, 100, 150, 20);
        cv1.add(cand16);
        
        cand17 = new JLabel("Name : Mr Ralph");
        cand17.setFont(new Font("Javanese Text", Font.BOLD, 12));
        cand17.setBounds(590, 190, 150, 20);
        cv1.add(cand17);
        
        cand18 = new JLabel("Name : Mr Philip");
        cand18.setFont(new Font("Javanese Text", Font.BOLD, 12));
        cand18.setBounds(590, 280, 150, 20);
        cv1.add(cand18);
        
        cand19 = new JLabel("Name : Mr Johnny");
        cand19.setFont(new Font("Javanese Text", Font.BOLD, 12));
        cand19.setBounds(590, 370, 150, 20);
        cv1.add(cand19);
        
        cand20 = new JLabel("Name : Mrs Christina");
        cand20.setFont(new Font("Javanese Text", Font.BOLD, 12));
        cand20.setBounds(590, 460, 150, 20);
        cv1.add(cand20);
        
        // --------------------------------- Party --------------------------------------------
        p1 = new JLabel("Party : A");
        p1.setFont(new Font("Javanese Text", Font.BOLD, 12));
        p1.setBounds(90, 120, 150, 20);
        cv1.add(p1);
        
        p2 = new JLabel("Party : B");
        p2.setFont(new Font("Javanese Text", Font.BOLD, 12));
        p2.setBounds(90, 210, 150, 20);
        cv1.add(p2);
        
        p3 = new JLabel("Party : C");
        p3.setFont(new Font("Javanese Text", Font.BOLD, 12));
        p3.setBounds(90, 300, 150, 20);
        cv1.add(p3);
        
        p4 = new JLabel("Party : D");
        p4.setFont(new Font("Javanese Text", Font.BOLD, 12));
        p4.setBounds(90, 390, 150, 20);
        cv1.add(p4);
        
        p5 = new JLabel("Party : E");
        p5.setFont(new Font("Javanese Text", Font.BOLD, 12));
        p5.setBounds(90, 480, 150, 20);
        cv1.add(p5);
        
        p6 = new JLabel("Party : A");
        p6.setFont(new Font("Javanese Text", Font.BOLD, 12));
        p6.setBounds(340, 120, 150, 20);
        cv1.add(p6);
        
        p7 = new JLabel("Party : B");
        p7.setFont(new Font("Javanese Text", Font.BOLD, 12));
        p7.setBounds(340, 210, 150, 20);
        cv1.add(p7);
        
        p8 = new JLabel("Party : C");
        p8.setFont(new Font("Javanese Text", Font.BOLD, 12));
        p8.setBounds(340, 300, 150, 20);
        cv1.add(p8);
        
        p9 = new JLabel("Party : D");
        p9.setFont(new Font("Javanese Text", Font.BOLD, 12));
        p9.setBounds(340, 390, 150, 20);
        cv1.add(p9);
        
        p10 = new JLabel("Party : E");
        p10.setFont(new Font("Javanese Text", Font.BOLD, 12));
        p10.setBounds(340, 480, 150, 20);
        cv1.add(p10);
        
        p16 = new JLabel("Party : A");
        p16.setFont(new Font("Javanese Text", Font.BOLD, 12));
        p16.setBounds(590, 120, 150, 20);
        cv1.add(p16);
        
        p17 = new JLabel("Party : B");
        p17.setFont(new Font("Javanese Text", Font.BOLD, 12));
        p17.setBounds(590, 210, 150, 20);
        cv1.add(p17);
        
        p18 = new JLabel("Party : C");
        p18.setFont(new Font("Javanese Text", Font.BOLD, 12));
        p18.setBounds(590, 300, 150, 20);
        cv1.add(p18);
        
        p19 = new JLabel("Party : D");
        p19.setFont(new Font("Javanese Text", Font.BOLD, 12));
        p19.setBounds(590, 390, 150, 20);
        cv1.add(p19);
        
        p20 = new JLabel("Party : E");
        p20.setFont(new Font("Javanese Text", Font.BOLD, 12));
        p20.setBounds(590, 480, 150, 20);
        cv1.add(p20);
        
        // --------------------------------- SCROLL BAR --------------------------------------
        B = new JScrollBar();  
        B.setBounds(750,93, 15,425);  
        cv1.add(B);
        
        // --------------------------------- DETAIL BUTTON ----------------------------------
        // --------------------------------- FIRST COLUMN -----------------------------------
        detail1 = new JButton("Detail");
        detail1.setFont(new Font("Times New Roman", Font.BOLD, 10));
        detail1.setBounds(90, 140, 50, 15);
        detail1.setBackground(new Color(255, 253, 230));
		detail1.setBorder(border);
		detail1.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(detail1);
        
        detail2 = new JButton("Detail");
        detail2.setFont(new Font("Times New Roman", Font.BOLD, 10));
        detail2.setBounds(90, 233, 50, 15);
        detail2.setBackground(new Color(255, 253, 230));
		detail2.setBorder(border);
		detail2.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(detail2);
        
        detail3 = new JButton("Detail");
        detail3.setFont(new Font("Times New Roman", Font.BOLD, 10));
        detail3.setBounds(90, 323, 50, 15);
        detail3.setBackground(new Color(255, 253, 230));
		detail3.setBorder(border);
		detail3.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(detail3);
        
        detail4 = new JButton("Detail");
        detail4.setFont(new Font("Times New Roman", Font.BOLD, 10));
        detail4.setBounds(90, 415, 50, 15);
        detail4.setBackground(new Color(255, 253, 230));
		detail4.setBorder(border);
		detail4.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(detail4);
        
        detail5 = new JButton("Detail");
        detail5.setFont(new Font("Times New Roman", Font.BOLD, 10));
        detail5.setBounds(90, 505, 50, 15);
        detail5.setBackground(new Color(255, 253, 230));
		detail5.setBorder(border);
		detail5.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(detail5);
        
        // --------------------------------- SECOND COLUMN ----------------------------------
        detail6 = new JButton("Detail");
        detail6.setFont(new Font("Times New Roman", Font.BOLD, 10));
        detail6.setBounds(340, 140, 50, 15);
        detail6.setBackground(new Color(255, 253, 230));
		detail6.setBorder(border);
		detail6.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(detail6);
        
        detail7 = new JButton("Detail");
        detail7.setFont(new Font("Times New Roman", Font.BOLD, 10));
        detail7.setBounds(340, 233, 50, 15);
        detail7.setBackground(new Color(255, 253, 230));
		detail7.setBorder(border);
		detail7.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(detail7);
        
        detail8 = new JButton("Detail");
        detail8.setFont(new Font("Times New Roman", Font.BOLD, 10));
        detail8.setBounds(340, 323, 50, 15);
        detail8.setBackground(new Color(255, 253, 230));
		detail8.setBorder(border);
		detail8.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(detail8);
        
        detail9 = new JButton("Detail");
        detail9.setFont(new Font("Times New Roman", Font.BOLD, 10));
        detail9.setBounds(340, 415, 50, 15);
        detail9.setBackground(new Color(255, 253, 230));
		detail9.setBorder(border);
		detail9.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(detail9);
        
        detail10 = new JButton("Detail");
        detail10.setFont(new Font("Times New Roman", Font.BOLD, 10));
        detail10.setBounds(340, 505, 50, 15);
        detail10.setBackground(new Color(255, 253, 230));
		detail10.setBorder(border);
		detail10.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(detail10);
        
        // -------------------------------- THIRD COLUMN -----------------------------------
        detail11 = new JButton("Detail");
        detail11.setFont(new Font("Times New Roman", Font.BOLD, 10));
        detail11.setBounds(590, 140, 50, 15);
        detail11.setBackground(new Color(255, 253, 230));
		detail11.setBorder(border);
		detail11.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(detail11);
        
        detail12 = new JButton("Detail");
        detail12.setFont(new Font("Times New Roman", Font.BOLD, 10));
        detail12.setBounds(590, 233, 50, 15);
        detail12.setBackground(new Color(255, 253, 230));
        detail12.setBorder(border);
        detail12.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(detail12);
        
        detail13 = new JButton("Detail");
        detail13.setFont(new Font("Times New Roman", Font.BOLD, 10));
        detail13.setBounds(590, 323, 50, 15);
        detail13.setBackground(new Color(255, 253, 230));
        detail13.setBorder(border);
		detail13.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(detail13);
        
        detail14 = new JButton("Detail");
        detail14.setFont(new Font("Times New Roman", Font.BOLD, 10));
        detail14.setBounds(590, 415, 50, 15);
        detail14.setBackground(new Color(255, 253, 230));
        detail14.setBorder(border);
        detail14.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(detail14);
        
        detail15 = new JButton("Detail");
        detail15.setFont(new Font("Times New Roman", Font.BOLD, 10));
        detail15.setBounds(590, 505, 50, 15);
        detail15.setBackground(new Color(255, 253, 230));
        detail15.setBorder(border);
        detail15.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(detail15);
        
        
        // ----------------------------------------------------------------------------------
		
        backcand = new JButton("Back To Homepage");
		backcand.setFont(new Font("Times New Roman", Font.BOLD, 12));
		backcand.setBounds(250, 550, 140, 22);
		//backcand.setForeground(new Color(237, 189, 45));
		backcand.setBackground(new Color(255, 253, 230));
		backcand.setBorder(border);
		backcand.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(backcand);
        
		
		backcand2 = new JButton("Back To Voter Page");
		backcand2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		backcand2.setBounds(450, 550, 140, 22);
		//backcand.setForeground(new Color(237, 189, 45));
		backcand2.setBackground(new Color(255, 253, 230));
		backcand2.setBorder(border);
		backcand2.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(backcand2);
        
		
    	backcand.addActionListener((ActionListener) new ActionListener()
    	{
    	    public void actionPerformed(ActionEvent e){
    	    	dispose();
    	        VotingDashBoard dashboard = new VotingDashBoard();
    	        dashboard.setVisible(true);
    	    }
    	});
        
    	backcand2.addActionListener((ActionListener) new ActionListener()
    	{
    	    public void actionPerformed(ActionEvent e){
    	    	dispose();
    			VoterPanel voterpanel = new VoterPanel();
    			voterpanel.setVisible(true);
    	    }
    	});  
    	
    	// ------------------------ ACTION LISTENER DETAIL 1 -------------------------------
        detail1.addActionListener((ActionListener) new ActionListener()
        {
        	public void actionPerformed(ActionEvent f)
        	{
        		JOptionPane.showMessageDialog(cv1, "Name : Mr Maxwell Johnson\nAge : 34\nDistrict : Riviere Du Rempart\nOccupation : Lawyer\nCampaign : A fit country for heroes to live in.\n\nVision : \nMr Maxwell campaigned on an economic platform to shore up the middle class, \nextend healthcare, raise taxes on the wealthy, and invest trillions of dollars in \ngreen energy infrastructure, among other issues. He'll also have to deal with the \nrising costs of battling the coronavirus pandemic and the economic damage it has caused.", "Mr Maxwell From Party A", JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        		
    	// ------------------------ ACTION LISTENER DETAIL 2 -------------------------------
        detail2.addActionListener((ActionListener) new ActionListener()
        {
        	public void actionPerformed(ActionEvent f)
        	{
        		JOptionPane.showMessageDialog(cv1, "Name : Mr James Roy \nAge : 55\nDistrict : Pamplemousse\nOccupation : Lecturer\nCampaign : Liberty, equality, fraternity.\n\nVision : Funding the assault on the virus, strengthening the social safety net for those \npushed to the brink, and helping state and local governments are the main goals of \nthe American Rescue Plan. In the first 100 days of his administration, he \nwants to reopen most schools and have 100 million vaccine doses administered."
        				, "Mr James From Party B", JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        		
    	// ------------------------ ACTION LISTENER DETAIL 3 -------------------------------
        detail3.addActionListener((ActionListener) new ActionListener()
        {
        	public void actionPerformed(ActionEvent f)
        	{
        		JOptionPane.showMessageDialog(cv1, "Name : Mrs Theresa May\nAge : 40\nDistrict : Port-Louis\nOccupation : Teacher\nCampaign : A fit country for heroes to live in.\n\nVision : \nCampaigned on an economic platform to shore up the middle class, \nextend healthcare, raise taxes on the wealthy, and invest trillions of dollars in \ngreen energy infrastructure, among other issues. He'll also have to deal with the \nrising costs of battling the coronavirus pandemic and the economic damage it has caused.", "Mrs Theresa From Party C", JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        		
    	// ------------------------ ACTION LISTENER DETAIL 4 -------------------------------
        detail4.addActionListener((ActionListener) new ActionListener()
        {
        	public void actionPerformed(ActionEvent f)
        	{
        		JOptionPane.showMessageDialog(cv1, "Name : Mrs Grace Moreno\nAge : 39\nDistrict : Riviere Du Rempart\nOccupation : Singer\nCampaign : A fit country for heroes to live in.\n\nVision : \nCampaigned on an economic platform to shore up the middle class, \nextend healthcare, raise taxes on the wealthy, and invest trillions of dollars in \ngreen energy infrastructure, among other issues. He'll also have to deal with the \nrising costs of battling the coronavirus pandemic and the economic damage it has caused.", "Mrs Grace From Party D", JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        		
    	// ------------------------ ACTION LISTENER DETAIL 5 -------------------------------
        detail5.addActionListener((ActionListener) new ActionListener()
        {
        	public void actionPerformed(ActionEvent f)
        	{
        		JOptionPane.showMessageDialog(cv1, "Name : Mrs Julia Deranger\nAge : 54\nDistrict : Black River\nOccupation : Writer\nCampaign : A fit country for heroes to live in.\n\nVision : \nCampaigned on an economic platform to shore up the middle class, \nextend healthcare, raise taxes on the wealthy, and invest trillions of dollars in \ngreen energy infrastructure, among other issues. He'll also have to deal with the \nrising costs of battling the coronavirus pandemic and the economic damage it has caused.", "Mrs Julia From Party E", JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        		
        
        // ------------------------------ SECOND COLUMN ---------------------------------------
        // ------------------------ ACTION LISTENER DETAIL 1-----------------------------------
        detail6.addActionListener((ActionListener) new ActionListener()
        {
        	public void actionPerformed(ActionEvent f)
        	{
        		JOptionPane.showMessageDialog(cv1, "Name : Mrs Madison Jane\nAge : 44\nDistrict : Plaine Wilihem\nOccupation : Singer\nCampaign : A fit country for heroes to live in.\n\nVision : \nCampaigned on an economic platform to shore up the middle class, \nextend healthcare, raise taxes on the wealthy, and invest trillions of dollars in \ngreen energy infrastructure, among other issues. He'll also have to deal with the \nrising costs of battling the coronavirus pandemic and the economic damage it has caused.", "Mrs Madison From Party A", JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        		
    	// ------------------------ ACTION LISTENER DETAIL 2 -------------------------------
        detail7.addActionListener((ActionListener) new ActionListener()
        {
        	public void actionPerformed(ActionEvent f)
        	{
        		JOptionPane.showMessageDialog(cv1, "Name : Mr Kenneth Jones \nAge : 54\nDistrict : Souillac\nOccupation : Plumber\nCampaign : A fit country for heroes to live in.\n\nVision : \nCampaigned on an economic platform to shore up the middle class, \nextend healthcare, raise taxes on the wealthy, and invest trillions of dollars in \ngreen energy infrastructure, among other issues. He'll also have to deal with the \nrising costs of battling the coronavirus pandemic and the economic damage it has caused.", "Mr Kenneth From Party B", JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        		
    	// ------------------------ ACTION LISTENER DETAIL 3 -------------------------------
        detail8.addActionListener((ActionListener) new ActionListener()
        {
        	public void actionPerformed(ActionEvent f)
        	{
        		JOptionPane.showMessageDialog(cv1, "Name : Mr Edward Jeager \nAge : 30\nDistrict : Black River\nOccupation : Lecturer\nCampaign : A fit country for heroes to live in.\n\nVision : \nCampaigned on an economic platform to shore up the middle class, \nextend healthcare, raise taxes on the wealthy, and invest trillions of dollars in \ngreen energy infrastructure, among other issues. He'll also have to deal with the \nrising costs of battling the coronavirus pandemic and the economic damage it has caused.", "Mr Edward From Party C", JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        		
    	// ------------------------ ACTION LISTENER DETAIL 4 -------------------------------
        detail9.addActionListener((ActionListener) new ActionListener()
        {
        	public void actionPerformed(ActionEvent f)
        	{
        		JOptionPane.showMessageDialog(cv1, "Name : Mr Timothy Sins\nAge : 34\nDistrict : Savanne\nOccupation : Driver\nCampaign : A fit country for heroes to live in.\n\nVision : \nCampaigned on an economic platform to shore up the middle class, \nextend healthcare, raise taxes on the wealthy, and invest trillions of dollars in \ngreen energy infrastructure, among other issues. He'll also have to deal with the \nrising costs of battling the coronavirus pandemic and the economic damage it has caused.", "Mr Timothy From Party D", JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        		
    	// ------------------------ ACTION LISTENER DETAIL 5 -------------------------------
        detail10.addActionListener((ActionListener) new ActionListener()
        {
        	public void actionPerformed(ActionEvent f)
        	{
        		JOptionPane.showMessageDialog(cv1, "Name : Mr Jacob Riz\nAge : 34\nDistrict : Port-Louis\nOccupation : Lawyer\nCampaign : A fit country for heroes to live in.\n\nVision : \nCampaigned on an economic platform to shore up the middle class, \nextend healthcare, raise taxes on the wealthy, and invest trillions of dollars in \ngreen energy infrastructure, among other issues. He'll also have to deal with the \nrising costs of battling the coronavirus pandemic and the economic damage it has caused.", "Mr Jacob From Party E", JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        
        // ------------------------------ THIRD COLUMN ---------------------------------------
        // ------------------------ ACTION LISTENER DETAIL 1-----------------------------------
        detail11.addActionListener((ActionListener) new ActionListener()
        {
        	public void actionPerformed(ActionEvent f)
        	{
        		JOptionPane.showMessageDialog(cv1, "Name : Mr Logan Paul\nAge : 34\nDistrict : Port-Louis\nOccupation : Doctor\nCampaign : A fit country for heroes to live in.\n\nVision : \nCampaigned on an economic platform to shore up the middle class, \nextend healthcare, raise taxes on the wealthy, and invest trillions of dollars in \ngreen energy infrastructure, among other issues. He'll also have to deal with the \nrising costs of battling the coronavirus pandemic and the economic damage it has caused.", "Mr Logan From Party A", JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        		
    	// ------------------------ ACTION LISTENER DETAIL 2 -------------------------------
        detail12.addActionListener((ActionListener) new ActionListener()
        {
        	public void actionPerformed(ActionEvent f)
        	{
        		JOptionPane.showMessageDialog(cv1, "Name : Mr Ralph Lauren\nAge : 60\nDistrict : Moka\nOccupation : Dentist\nCampaign : A fit country for heroes to live in.\n\nVision : \nCampaigned on an economic platform to shore up the middle class, \nextend healthcare, raise taxes on the wealthy, and invest trillions of dollars in \ngreen energy infrastructure, among other issues. He'll also have to deal with the \nrising costs of battling the coronavirus pandemic and the economic damage it has caused.", "Mr Ralph From Party B", JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        		
    	// ------------------------ ACTION LISTENER DETAIL 3 -------------------------------
        detail13.addActionListener((ActionListener) new ActionListener()
        {
        	public void actionPerformed(ActionEvent f)
        	{
        		JOptionPane.showMessageDialog(cv1, "Name : Mr Philp Historia\nAge : 54\nDistrict : Riviere Du Rempart\nOccupation : Consultant\nCampaign : A fit country for heroes to live in.\n\nVision : \nCampaigned on an economic platform to shore up the middle class, \nextend healthcare, raise taxes on the wealthy, and invest trillions of dollars in \ngreen energy infrastructure, among other issues. He'll also have to deal with the \nrising costs of battling the coronavirus pandemic and the economic damage it has caused.", "Mr Philp From Party C", JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        		
    	// ------------------------ ACTION LISTENER DETAIL 4 -------------------------------
        detail14.addActionListener((ActionListener) new ActionListener()
        {
        	public void actionPerformed(ActionEvent f)
        	{
        		JOptionPane.showMessageDialog(cv1, "Name : Mr Johnny Move\nAge : 31\nDistrict : Black River\nOccupation : Actor\nCampaign : A fit country for heroes to live in.\n\nVision : \nCampaigned on an economic platform to shore up the middle class, \nextend healthcare, raise taxes on the wealthy, and invest trillions of dollars in \ngreen energy infrastructure, among other issues. He'll also have to deal with the \nrising costs of battling the coronavirus pandemic and the economic damage it has caused.", "Mr Johnny From Party D", JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        		
    	// ------------------------ ACTION LISTENER DETAIL 5 -------------------------------
        detail15.addActionListener((ActionListener) new ActionListener()
        {
        	public void actionPerformed(ActionEvent f)
        	{
        		JOptionPane.showMessageDialog(cv1, "Name : Mrs Christina Historia\nAge : 29\nDistrict : Moka\nOccupation : Student\nCampaign : A fit country for heroes to live in.\n\nVision : \nCampaigned on an economic platform to shore up the middle class, \nextend healthcare, raise taxes on the wealthy, and invest trillions of dollars in \ngreen energy infrastructure, among other issues. He'll also have to deal with the \nrising costs of battling the coronavirus pandemic and the economic damage it has caused.", "Mrs Christina From Party E", JOptionPane.INFORMATION_MESSAGE);
        	}
        });
        
        setVisible(true);
        
	}


	
	public static void main(String[] args)
	{
		// Calling the NimbusFeel to enhance the overall structure and design of the interface
		setNimbusFeel();
		ViewCandidate viewcandidate = new ViewCandidate();
		
	}
	
	// JTattoo UI design used in the overall interface of the voting system
	private static void setNimbusFeel(){
	    try {
	        // Here you can put the selected theme class name in JTattoo
	        UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

	    } catch (ClassNotFoundException ex) {
	        java.util.logging.Logger.getLogger(ViewCandidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
	        java.util.logging.Logger.getLogger(ViewCandidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	        java.util.logging.Logger.getLogger(ViewCandidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        java.util.logging.Logger.getLogger(ViewCandidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
	    
	}

}

