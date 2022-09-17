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

public class ViewParty extends JFrame
{
	// Components of the Candidate Panel 
	private Container cv1;
	
	// Private Title for the Dashboard
	private JButton title;
	private JLabel title2;
	
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
	private JLabel c1;
	private JLabel c2;
	private JLabel c3;
	private JLabel c4;
	private JLabel c5;
	
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
	
	// Party Button
	private JButton Party1;
	private JButton Party2;
	private JButton Party3;
	private JButton Party4;
	private JButton Party5;
	
	
	
	private JButton backcand;
	private JButton backcand2;

	// Scroll Bar
	private JScrollBar B;
	
	public void close()
	{
	    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);

	    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
	}
	
	
	public ViewParty()
	{
        setTitle("View Party Panel");
        
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
		title = new JButton("Party List");
		title.setFont(new Font("Javanese Text", Font.PLAIN, 20));
		title.setBounds(0, 0, 900, 60);
		title.setForeground(new Color(237, 189, 45));
		title.setBackground(new Color(0, 0, 0));
		title.setBorder(border1);
		title.setHorizontalAlignment(JTextField.CENTER);
        cv1.add(title);
        
        // -------------------------------- IMAGE ------------------------------------------
        // Register Image
     		//JLabel constructor with string, Icon and alignment arguments
             //BufferedImage img1 = ImageIO.read(new URL(
             //       "https://previews.123rf.com/images/stockbroker/stockbroker1710/stockbroker171000644/89639939-portrait-of-young-professional-man-in-suit-arms-crossed.jpg"));
     		ImageIcon icon_p1 = new ImageIcon("./src/images/party1.png");
     		Image pwd1 = icon_p1.getImage();
     		Image newimg1 = pwd1.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
     		icon_p1 = new ImageIcon(newimg1);  // transform it back
     		label_img1 = new JLabel ("",icon_p1,SwingConstants.LEFT);
     		label_img1.setBounds(45, 85, 60, 60);
     		cv1.add(label_img1);
     		
     		ImageIcon icon_p2 = new ImageIcon("./src/images/party2.png");
     		Image pwd2 = icon_p2.getImage();
     		Image newimg2 = pwd2.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
     		icon_p2 = new ImageIcon(newimg2);  // transform it back
     		label_img2 = new JLabel ("",icon_p2,SwingConstants.LEFT);
     		label_img2.setBounds(35, 175, 60, 60);
     		cv1.add(label_img2);
     		
     		ImageIcon icon_p3 = new ImageIcon("./src/images/party3.png");
     		Image pwd3 = icon_p3.getImage();
     		Image newimg3 = pwd3.getScaledInstance(45, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
     		icon_p3 = new ImageIcon(newimg3);  // transform it back
     		label_img3 = new JLabel ("",icon_p3,SwingConstants.LEFT);
     		label_img3.setBounds(35, 265, 60, 60);
     		cv1.add(label_img3);
     		
     		ImageIcon icon_p4 = new ImageIcon("./src/images/party4.png");
     		Image pwd4 = icon_p4.getImage();
     		Image newimg4 = pwd4.getScaledInstance(60, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
     		icon_p4 = new ImageIcon(newimg4);  // transform it back
     		label_img4 = new JLabel ("",icon_p4,SwingConstants.LEFT);
     		label_img4.setBounds(30, 355, 60, 60);
     		cv1.add(label_img4);
     		
     		ImageIcon icon_p5 = new ImageIcon("./src/images/party5.png");
     		Image pwd5 = icon_p5.getImage();
     		Image newimg5 = pwd5.getScaledInstance(35, 35,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
     		icon_p5 = new ImageIcon(newimg5);  // transform it back
     		label_img5 = new JLabel ("",icon_p5,SwingConstants.LEFT);
     		label_img5.setBounds(40, 445, 60, 60);
     		cv1.add(label_img5);
     	// -------------------------- Candidate Detailing -------------------------------------
            cand1 = new JLabel("Party Name : Key");
            cand1.setFont(new Font("Javanese Text", Font.BOLD, 13));
            cand1.setBounds(90, 100, 150, 20);
            cv1.add(cand1);
            
            cand2 = new JLabel("Party Name : Together we bring harmony");
            cand2.setFont(new Font("Javanese Text", Font.BOLD, 13));
            cand2.setBounds(90, 190, 250, 20);
            cv1.add(cand2);
            
            cand3 = new JLabel("Party Name : Sunlight");
            cand3.setFont(new Font("Javanese Text", Font.BOLD, 13));
            cand3.setBounds(90, 280, 150, 20);
            cv1.add(cand3);
            
            cand4 = new JLabel("Party Name : We lighten the country");
            cand4.setFont(new Font("Javanese Text", Font.BOLD, 13));
            cand4.setBounds(90, 370, 250, 20);
            cv1.add(cand4);
            
            cand5 = new JLabel("Party Name : Anchor");
            cand5.setFont(new Font("Javanese Text", Font.BOLD, 13));
            cand5.setBounds(90, 460, 150, 20);
            cv1.add(cand5);
            
         	// -------------------------- Party Detailing -------------------------------------
            c1 = new JLabel("<html>The vote is precious.  It is the most powerful non-violent tool we have<br/>in a democratic society, and we must use it.</html>");
            c1.setFont(new Font("Times New Roman", Font.BOLD, 10));
            c1.setBounds(400, 98, 450, 50);
            cv1.add(c1);
            
            Party1 = new JButton();
            Party1.setBounds(390, 100, 320, 45);
            Party1.setBackground(new Color(255, 253, 230));
            Party1.setBorder(border1);
            cv1.add(Party1);
            
            c2 = new JLabel("<html>All of us may have been created equal. But we'll never actually be equal <br/>until we all vote. So don't wait.</html>");
            c2.setFont(new Font("Times New Roman", Font.BOLD, 10));
            c2.setBounds(400, 188, 450, 50);
            cv1.add(c2);
            
            Party2 = new JButton();
            Party2.setBounds(390, 190, 320, 45);
            Party2.setBackground(new Color(255, 253, 230));
            Party2.setBorder(border1);
            cv1.add(Party2);
            
            c3 = new JLabel("<html>When we vote, our values are put into action and our voices are heard. <br/>Your voice is a reminder that you matter because you do.</html>");
            c3.setFont(new Font("Times New Roman", Font.BOLD, 10));
            c3.setBounds(400, 278, 450, 50);
            cv1.add(c3);
            
            Party3 = new JButton();
            Party3.setBounds(390, 280, 320, 45);
            Party3.setBackground(new Color(255, 253, 230));
            Party3.setBorder(border1);
            cv1.add(Party3);
            
            c4 = new JLabel("<html>Our nation is asking to hear your voice because November is coming <br/>and so is your choice. Do not throw away your shot.</html>");
            c4.setFont(new Font("Times New Roman", Font.BOLD, 10));
            c4.setBounds(400, 373, 450, 50);
            cv1.add(c4);
            
            Party4 = new JButton();
            Party4.setBounds(390, 375, 320, 45);
            Party4.setBackground(new Color(255, 253, 230));
            Party4.setBorder(border1);
            cv1.add(Party4);
            
            c5 = new JLabel("<html>HAPPY DAYS ARE HERE AGAIN!!! By voting, we add our voice to the <br/>chorus that forms opinions and the basis for actions.</html>");
            c5.setFont(new Font("Times New Roman", Font.BOLD, 10));
            c5.setBounds(400, 458, 450, 50);
            cv1.add(c5);
            
            Party5 = new JButton();
            Party5.setBounds(390, 460, 320, 45);
            Party5.setBackground(new Color(255, 253, 230));
            Party5.setBorder(border1);
            cv1.add(Party5);

            // --------------------------------- Party --------------------------------------------
            p1 = new JLabel("Party : A");
            p1.setFont(new Font("Javanese Text", Font.BOLD, 13));
            p1.setBounds(90, 120, 150, 20);
            cv1.add(p1);
            
            p2 = new JLabel("Party : B");
            p2.setFont(new Font("Javanese Text", Font.BOLD, 13));
            p2.setBounds(90, 210, 150, 20);
            cv1.add(p2);
            
            p3 = new JLabel("Party : C");
            p3.setFont(new Font("Javanese Text", Font.BOLD, 13));
            p3.setBounds(90, 300, 150, 20);
            cv1.add(p3);
            
            p4 = new JLabel("Party : D");
            p4.setFont(new Font("Javanese Text", Font.BOLD, 13));
            p4.setBounds(90, 390, 150, 20);
            cv1.add(p4);
            
            p5 = new JLabel("Party : E");
            p5.setFont(new Font("Javanese Text", Font.BOLD, 13));
            p5.setBounds(90, 480, 150, 20);
            cv1.add(p5);
        
        // --------------------------------- SCROLL BAR --------------------------------------
        B = new JScrollBar();  
        B.setBounds(750,93, 15,425);  
        cv1.add(B);
        
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
        
        
        
        setVisible(true);
        
	}
	
	public static void main(String[] args)
	{
		// Calling the NimbusFeel to enhance the overall structure and design of the interface
		setNimbusFeel();
		ViewParty viewparty = new ViewParty();
		
	}
	
	// JTattoo UI design used in the overall interface of the voting system
	private static void setNimbusFeel(){
	    try {
	        // Here you can put the selected theme class name in JTattoo
	        UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

	    } catch (ClassNotFoundException ex) {
	        java.util.logging.Logger.getLogger(ViewParty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
	        java.util.logging.Logger.getLogger(ViewParty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	        java.util.logging.Logger.getLogger(ViewParty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        java.util.logging.Logger.getLogger(ViewParty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
	    
	}

}

