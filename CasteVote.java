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

public class CasteVote extends JFrame
{
	// Components of the Candidate Panel 
	private Container cv1;
	
	// Private Title for the Dashboard
	private JButton title;
	private JButton help;
	private JButton submit;
	private JButton reset;
	private JButton backcand;
	private JButton backcand2;
	
	private JScrollPane sp;
	private JScrollBar B;
	
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
	
	// CheckBox
	private JCheckBox v1;
	private JCheckBox v2;
	private JCheckBox v3;
	private JCheckBox v4;
	private JCheckBox v5;
	private JCheckBox v6;
	private JCheckBox v7;
	private JCheckBox v8;
	private JCheckBox v9;
	private JCheckBox v10;
	private JCheckBox v15;
	private JCheckBox v16;
	private JCheckBox v17;
	private JCheckBox v18;
	private JCheckBox v19;
	private JCheckBox v20;
	
	public void close()
	{
	    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);

	    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
	}
	
	public static JCheckBox[] checkList = new JCheckBox[15];
        
	public CasteVote()
	{
        setTitle("Voting Panel");
        
        // Fixed screen size for all application
        setBounds(290, 90, 900, 640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Allow the screen to be resized 
        setResizable(true);

        cv1 = getContentPane();
        cv1.setLayout(null);
        
        // ------------------------- HEADER ----------------------------------------
        // Having a border for each text field within the registration form
        Border border = BorderFactory.createLineBorder(new Color(181, 176, 33));        
        Border border1 = BorderFactory.createLineBorder(new Color(0, 0, 0));
        
		// Implementing a Button for Candidate Panel
		title = new JButton("Voting Panel");
		title.setFont(new Font("Javanese Text", Font.PLAIN, 25));
		title.setBounds(0, 0, 900, 70);
		title.setForeground(new Color(237, 189, 45));
		title.setBackground(new Color(0, 0, 0));
		title.setBorder(border1);
		title.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(title);
        
        // ------------------ VOTE CHECK BOX -------------------------------------
        Listener listener = new Listener();

        for (int i = 0; i < 15; ++i) 
        {
            checkList[i] = new JCheckBox("Vote Here");
            checkList[i].addItemListener(listener);
        }
        
        // --------------------- FIRST COLUMN ------------------------------------
        checkList[0].addItemListener(listener);
        //checkList[0] = new JCheckBox("Vote Here");
        checkList[0].setFont(new Font("Javanese Text", Font.BOLD, 12));
        checkList[0].setBounds(86, 140, 100, 20);
        cv1.add(checkList[0]);
        
        checkList[1].addItemListener(listener);
        //checkList[1] = new JCheckBox("Vote Here");
        checkList[1].setFont(new Font("Javanese Text", Font.BOLD, 12));
        checkList[1].setBounds(86, 230, 100, 20);
        cv1.add(checkList[1]);
        
        checkList[2].addItemListener(listener);
        //checkList[2] = new JCheckBox("Vote Here");
        checkList[2].setFont(new Font("Javanese Text", Font.BOLD, 12));
        checkList[2].setBounds(86, 320, 100, 20);
        cv1.add(checkList[2]);
        
        checkList[3].addItemListener(listener);
        //checkList[3] = new JCheckBox("Vote Here");
        checkList[3].setFont(new Font("Javanese Text", Font.BOLD, 12));
        checkList[3].setBounds(86, 410, 100, 20);
        cv1.add(checkList[3]);
        
        checkList[4].addItemListener(listener);
        //checkList[3] = new JCheckBox("Vote Here");
        checkList[4].setFont(new Font("Javanese Text", Font.BOLD, 12));
        checkList[4].setBounds(86, 500, 100, 20);
        cv1.add(checkList[4]);
        
        // ---------------------- SECOND COLUMn -----------------------------------
        checkList[5].addItemListener(listener);
        //checkList[0] = new JCheckBox("Vote Here");
        checkList[5].setFont(new Font("Javanese Text", Font.BOLD, 12));
        checkList[5].setBounds(337, 140, 100, 20);
        cv1.add(checkList[5]);
        
        checkList[6].addItemListener(listener);
        //checkList[1] = new JCheckBox("Vote Here");
        checkList[6].setFont(new Font("Javanese Text", Font.BOLD, 12));
        checkList[6].setBounds(337, 230, 100, 20);
        cv1.add(checkList[6]);
        
        checkList[7].addItemListener(listener);
        //checkList[2] = new JCheckBox("Vote Here");
        checkList[7].setFont(new Font("Javanese Text", Font.BOLD, 12));
        checkList[7].setBounds(337, 320, 100, 20);
        cv1.add(checkList[7]);
        
        checkList[8].addItemListener(listener);
        //checkList[3] = new JCheckBox("Vote Here");
        checkList[8].setFont(new Font("Javanese Text", Font.BOLD, 12));
        checkList[8].setBounds(337, 410, 100, 20);
        cv1.add(checkList[8]);
        
        checkList[9].addItemListener(listener);
        //checkList[3] = new JCheckBox("Vote Here");
        checkList[9].setFont(new Font("Javanese Text", Font.BOLD, 12));
        checkList[9].setBounds(337, 500, 100, 20);
        cv1.add(checkList[9]);
        
        // ----------------------- THIRD COLUMN ----------------------------------
        checkList[10].addItemListener(listener);
        //checkList[0] = new JCheckBox("Vote Here");
        checkList[10].setFont(new Font("Javanese Text", Font.BOLD, 12));
        checkList[10].setBounds(588, 140, 100, 20);
        cv1.add(checkList[10]);
        
        checkList[11].addItemListener(listener);
        //checkList[1] = new JCheckBox("Vote Here");
        checkList[11].setFont(new Font("Javanese Text", Font.BOLD, 12));
        checkList[11].setBounds(588, 230, 100, 20);
        cv1.add(checkList[11]);
        
        checkList[12].addItemListener(listener);
        //checkList[2] = new JCheckBox("Vote Here");
        checkList[12].setFont(new Font("Javanese Text", Font.BOLD, 12));
        checkList[12].setBounds(588, 320, 100, 20);
        cv1.add(checkList[12]);
        
        checkList[13].addItemListener(listener);
        //checkList[3] = new JCheckBox("Vote Here");
        checkList[13].setFont(new Font("Javanese Text", Font.BOLD, 12));
        checkList[13].setBounds(588, 410, 100, 20);
        cv1.add(checkList[13]);
        
        checkList[14].addItemListener(listener);
        //checkList[3] = new JCheckBox("Vote Here");
        checkList[14].setFont(new Font("Javanese Text", Font.BOLD, 12));
        checkList[14].setBounds(588, 500, 100, 20);
        cv1.add(checkList[14]);
        
        // ---------------------- HOW TO VOTE -------------------------------------
		help = new JButton("Instruction To Vote");
		help.setFont(new Font("Times New Roman", Font.BOLD, 12));
		help.setBounds(20, 546, 130, 22);
		help.setBorder(border);
		help.setBackground(new Color(255, 253, 230));
		help.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(help);
        
        // ---------------------- SUBMIT VOTE -------------------------------------
		submit = new JButton("Submit Vote");
		submit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		submit.setBounds(190, 546, 130, 22);
		submit.setBorder(border);
		submit.setForeground(new Color(237, 189, 45));
		submit.setBackground(new Color(0, 0, 0));
		submit.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(submit);
        
        // ---------------------- RSET VOTE -------------------------------------
		reset = new JButton("Reset Vote");
		reset.setFont(new Font("Times New Roman", Font.BOLD, 12));
		reset.setBounds(360, 546, 130, 22);
		reset.setBorder(border);
		reset.setBackground(new Color(255, 253, 230));
		reset.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(reset);
        
        // ------------------- BACK BUTTON ----------------------------------------
		backcand = new JButton("Back To Homepage");
		backcand.setFont(new Font("Times New Roman", Font.BOLD, 12));
		backcand.setBounds(530, 546, 140, 22);
		backcand.setBackground(new Color(255, 253, 230));
		backcand.setBorder(border);
		backcand.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(backcand);
        
		
		backcand2 = new JButton("Back To Voter Page");
		backcand2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		backcand2.setBounds(710, 546, 140, 22);
		backcand2.setBackground(new Color(255, 253, 230));
		backcand2.setBorder(border);
		backcand2.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(backcand2);
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
               

        
        // ------------------ ACTION LISTENER FOR INSTRCUTION -------------------------
        // Action Listener to the forgot password button to enable user to get the new credential
        help.addActionListener((ActionListener) new ActionListener()
        {
        	public void actionPerformed(ActionEvent f)
        	{
        		JOptionPane.showMessageDialog(cv1, "Dear Voter\nChoose only three candidates by clicking on the check box. \nTo successfully vote, click on submit button.");
        	}
        });
        
		// ------------------ ACTION LISTENER TO BACK BUTTON ---------------------------
    	submit.addActionListener((ActionListener) new ActionListener()
    	{
    	    public void actionPerformed(ActionEvent e){
    	    	
        		int a = JOptionPane.showConfirmDialog(cv1, "Dear Voter, \nClick Ok to confirm your vote.\n Thank You", "Voting Panel", JOptionPane.INFORMATION_MESSAGE);
        		//JOptionPane.showMessageDialog(null, a);
        		if(a==1)
        		{
        			JOptionPane.showMessageDialog(cv1, "Press Ok to choose your desired candidate.", "Voting Panel",JOptionPane.INFORMATION_MESSAGE);
        	    	dispose();
        	    	CasteVote castevote = new CasteVote();
        	    	castevote.setVisible(true);
        		}
        		else
        		{
        			JOptionPane.showMessageDialog(cv1, "Thank You\nSuccessfully Voted!", "Voting Panel",JOptionPane.INFORMATION_MESSAGE);
        	    	dispose();
        	    	VoterPanel voterpanel = new VoterPanel();
        	    	voterpanel.setVisible(true);

        		}
    	    }
    	});
        
		// ------------------ ACTION LISTENER TO BACK BUTTON ---------------------------
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
    	
    	reset.addActionListener((ActionListener) new ActionListener()
    	{
    	    public void actionPerformed(ActionEvent e)
    	    {
    	    	if (e.getSource() == reset) {
    	            String def = "";
    	            checkList[0].setSelected(false);
    	            checkList[1].setSelected(false);
    	            checkList[2].setSelected(false);
    	            checkList[3].setSelected(false);
    	            checkList[4].setSelected(false);
    	            checkList[5].setSelected(false);
    	            checkList[6].setSelected(false);
    	            checkList[7].setSelected(false);
    	            checkList[8].setSelected(false);
    	            checkList[9].setSelected(false);
    	            checkList[10].setSelected(false);
    	            checkList[11].setSelected(false);
    	            checkList[12].setSelected(false);
    	            checkList[13].setSelected(false);
    	            checkList[14].setSelected(false);
    	        }
    	    }
    	    
    	});
    	
    
        
        
        setVisible(true);
        
	}
	

	
    static class Listener implements ItemListener {

    	// Max selection is 3 for the number of candidate
        private final int MAX_SELECTIONS = 5;

        private int selectionCounter = 0;

        @Override
        public void itemStateChanged(ItemEvent e) {
            JCheckBox source = (JCheckBox) e.getSource();

            if (source.isSelected()) {
                selectionCounter++;
                // check for max selections:
                if (selectionCounter == MAX_SELECTIONS)
                    for (JCheckBox box: checkList)
                        if (!box.isSelected())
                            box.setEnabled(false);
            }
            else {
                selectionCounter--;
                // check for less than max selections:
                if (selectionCounter < MAX_SELECTIONS)
                    for (JCheckBox box: checkList)
                        box.setEnabled(true);
            }
        }
    }
	
	public static void main(String[] args)
	{
		// Calling the NimbusFeel to enhance the overall structure and design of the interface
		setNimbusFeel();
		CasteVote castevote = new CasteVote();
		
	}
	
	// JTattoo UI design used in the overall interface of the voting system
	private static void setNimbusFeel(){
	    try {
	        // Here you can put the selected theme class name in JTattoo
	        UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

	    } catch (ClassNotFoundException ex) {
	        java.util.logging.Logger.getLogger(CasteVote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
	        java.util.logging.Logger.getLogger(CasteVote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	        java.util.logging.Logger.getLogger(CasteVote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        java.util.logging.Logger.getLogger(CasteVote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
	    
	}

}

