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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Importing library for database
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;  

public class RulesVoter extends JFrame
{
	// Components of the Candidate Panel 
	private Container r1;
	
	// Text Area
	private JTextArea textArea;
	
	// Back Button
	private JButton back;
	private JButton backcand2;
	
	private JLabel backimg;
	
	// Scroll Pane
	private JScrollPane scrollableTextArea;
	
	// Scroll Pane
	private static final long serialVersionUID = 1L;  
	
	public void close()
	{
	    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);

	    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
	}
	
	public RulesVoter() throws IOException
	{
      setTitle("Rules and Regulation");
      
      // Fixed screen size for all application
      setBounds(290, 90, 900, 640);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      // Allow the screen to be resized 
      setResizable(true);

      r1 = getContentPane();
      r1.setLayout(null);
      
      // Having a border for each text field within the registration form
      Border border = BorderFactory.createLineBorder(new Color(0, 0, 0));

      // set flow layout for the frame  
      r1.setLayout(new FlowLayout());  

      // Fixing the Text Area along with a scroll bar
      textArea = new JTextArea(34,85);  
      // Reading form the rules.txt file and display it in the text area
      FileReader reader = new FileReader("./src/Vote/Rules.txt");
      textArea.setFont(new Font("Times New Roman", Font.BOLD, 13));
      textArea.setEditable(false);
      textArea.read(reader, "Rules.txt"); //Object of JTextArea
      JScrollPane scrollableTextArea = new JScrollPane(textArea);  
      scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
      scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
      r1.add(scrollableTextArea); 
      
	  /*ImageIcon icon_back = new ImageIcon("./src/images/back.png");	
	  Image usr = icon_back.getImage();
	  Image newimg = usr.getScaledInstance(70, 25,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way	
	  icon_back = new ImageIcon(newimg);  		// transform it back
	  back = new JButton(icon_back);
	  back.setBorderPainted(false);
	  back.setToolTipText("This is back button");
	  back.setBounds(325, 225, 70, 25);
	  r1.add(back);*/
	  
      backcand2 = new JButton("Back To Voter Page");
      backcand2.setFont(new Font("Times New Roman", Font.BOLD, 12));
      backcand2.setBounds(325, 225, 150, 25);
	  //backcand.setForeground(new Color(237, 189, 45));
	  backcand2.setBackground(new Color(255, 253, 230));
	  backcand2.setBorder(border);
	  backcand2.setHorizontalAlignment(JTextField.CENTER);
      r1.add(backcand2);
      
	
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

	public static void main(String[] args) throws IOException
	{
		// Calling the NimbusFeel to enhance the overall structure and design of the interface
		setNimbusFeel();
		RulesVoter rulevoter = new RulesVoter();
	}
	
	// JTattoo UI design used in the overall interface of the voting system
	private static void setNimbusFeel(){
	    try {
	        // Here you can put the selected theme class name in JTattoo
	        UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

	    } catch (ClassNotFoundException ex) {
	        java.util.logging.Logger.getLogger(RulesVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
	        java.util.logging.Logger.getLogger(RulesVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	        java.util.logging.Logger.getLogger(RulesVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        java.util.logging.Logger.getLogger(RulesVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }	    
	}
}
