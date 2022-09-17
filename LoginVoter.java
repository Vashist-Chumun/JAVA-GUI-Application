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



public class LoginVoter extends JFrame
{
	// Components of the Candidate Panel 
	private Container l2;
	
	// Title to welcome the applicant
	private JButton title;
	
	private JLabel label_username;
	private JLabel label_password;
	private JLabel label_forgotPW;
	private JLabel label_remember;
	private JLabel label_vote1;
	private JLabel label_vote2;
	private JLabel label_vote3;
	private JLabel label_vote4;
	private JLabel label_vote5;
	private JLabel label_registration;
	
	// Textfield for the user name
	private JTextField field_username;
	
	// Password field for the password
	private JPasswordField field_password;
	
	// Login button and forgot button
	private JButton login_But;
	private JButton forgot_password;
	
	private JButton backcand;
	private JButton backcand2;
	
	// Remember me check box
	private JCheckBox Remember;
	
	private JPanel Login_Pan;
	
	public LoginVoter()
	{
        setTitle("Login Voter Page");
        
        // Fixed screen size for all application
        setBounds(290, 90, 900, 640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Allow the screen to be resized 
        setResizable(true);

        l2 = getContentPane();
        l2.setLayout(null);
        
        // Having a border for each text field within the registration form
        Border border = BorderFactory.createLineBorder(new Color(181, 176, 33));        
        Border border1 = BorderFactory.createLineBorder(new Color(0, 0, 0));
        
		// Implementing a Button for Candidate Panel
		title = new JButton("Welcome Dear Voter, Log In To Access E-Voting System");
		title.setFont(new Font("Javanese Text", Font.PLAIN, 20));
		title.setBounds(0, 0, 900, 70);
		title.setForeground(new Color(237, 189, 45));
		title.setBackground(new Color(0, 0, 0));
		title.setBorder(border1);
		title.setHorizontalAlignment(JTextField.CENTER);
        l2.add(title);
        
		// JLabel constructor with string, Icon and alignment arguments
        // Accessing an image icon to the page
        // Setting the image -- Username -- to the screen
		ImageIcon icon_username = new ImageIcon("./src/images/username_icon.png");	
		Image usr = icon_username.getImage();
		Image newimg = usr.getScaledInstance(60, 45,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way	
		icon_username = new ImageIcon(newimg);  		// transform it back
		label_username = new JLabel ("",icon_username,SwingConstants.LEFT);
		label_username.setToolTipText("This is label username");
		label_username.setBounds(325, 200, 80, 25);
		l2.add(label_username);			//add label_username to JFrame
        
		
		//JLabel constructor with string, Icon and alignment arguments
		ImageIcon icon_password = new ImageIcon("./src/images/password_icon.png");
		Image pwd = icon_password.getImage();
		Image newimg1 = pwd.getScaledInstance(24, 23,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_password = new ImageIcon(newimg1);  // transform it back
		label_password = new JLabel ("",icon_password,SwingConstants.LEFT);
		label_password.setToolTipText("This is label password");
		label_password.setBounds(340, 263, 80, 25);
		l2.add(label_password);
		
		// Image above the login component
		ImageIcon icon_login = new ImageIcon("./src/images/candidate_login.png");
		Image v2 = icon_login.getImage();
		Image newimg3 = v2.getScaledInstance(145, 93,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_login = new ImageIcon(newimg3);  // transform it back
		label_vote2 = new JLabel ("",icon_login,SwingConstants.LEFT);
		label_vote2.setToolTipText("Login Panel");
		label_vote2.setBounds(395, 85, 380, 100);
		l2.add(label_vote2);
		
		
		// Image below the login component
		ImageIcon icon_vote = new ImageIcon("./src/images/people.png");
		Image v1 = icon_vote.getImage();
		Image newimg2 = v1.getScaledInstance(300, 130,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		icon_vote = new ImageIcon(newimg2);  // transform it back
		label_registration = new JLabel ("",icon_vote,SwingConstants.LEFT);
		label_registration.setToolTipText("User Panel");
		label_registration.setBounds(300, 425, 350, 100);
		l2.add(label_registration);
		
		

		// Creating and adding User-name Textfield 
		field_username = new JTextField(20);
		field_username.setFont(new Font("Times New Roman", Font.BOLD, 13));
		field_username.setToolTipText("This is field username");
		field_username.setBounds(390, 205,170, 20);
		field_username.setBackground(new Color(255, 253, 230));
		field_username.setHorizontalAlignment(JTextField.CENTER);
		field_username.setBorder(border);
		l2.add(field_username);
				
		// Creating and adding Password Field
		field_password = new JPasswordField(20);
		field_password.setFont(new Font("Times New Roman", Font.BOLD, 13));
		field_password.setToolTipText("This is field password");
		field_password.setBounds(390, 265, 170, 20);
		field_password.setBackground(new Color(255, 253, 230));
		field_password.setHorizontalAlignment(JTextField.CENTER);
		field_password.setBorder(border);
		l2.add(field_password);
		
		
		// Creating and adding Login Button
		login_But = new JButton("Login");
		login_But.setFont(new Font("Times New Roman", Font.BOLD, 12));
		login_But.setBounds(413, 317, 90, 22);
		login_But.setBackground(new Color(255, 253, 230));
		login_But.setHorizontalAlignment(JTextField.CENTER);
		//forgot_password.addActionListener(this);
        l2.add(login_But);
		
		// Creating and adding Remember me checkbox
		Remember = new JCheckBox("");
		Remember.setBounds(330, 368, 20, 20);
		Remember.setBorder(border);
		l2.add(Remember);
		
		// Assigning the text to the Check box Remember me
		label_remember = new JLabel("Remember Me");
		label_remember.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_remember.setBounds(357, 368, 80, 20);
		l2.add(label_remember);
		
		// Implementing a Button for Forgot Password
		forgot_password = new JButton("Forgot Password");
		forgot_password.setFont(new Font("Times New Roman", Font.BOLD, 12));
		forgot_password.setBounds(470, 368, 110, 22);
		forgot_password.setBackground(new Color(255, 253, 230));
		forgot_password.setHorizontalAlignment(JTextField.CENTER);
		//forgot_password.addActionListener(this);
        l2.add(forgot_password);
        
		backcand = new JButton("Back To Homepage");
		backcand.setFont(new Font("Times New Roman", Font.BOLD, 12));
		backcand.setBounds(280, 546, 140, 22);
		//backcand.setForeground(new Color(237, 189, 45));
		backcand.setBackground(new Color(255, 253, 230));
		backcand.setBorder(border);
		backcand.setHorizontalAlignment(JTextField.CENTER);
        l2.add(backcand);
        
		
		backcand2 = new JButton("Back To Voter Page");
		backcand2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		backcand2.setBounds(470, 546, 140, 22);
		//backcand.setForeground(new Color(237, 189, 45));
		backcand2.setBackground(new Color(255, 253, 230));
		backcand2.setBorder(border);
		backcand2.setHorizontalAlignment(JTextField.CENTER);
        l2.add(backcand2);
        
		
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
        
        
        // Action Listener to the forgot password button to enable user to get the new credential
        forgot_password.addActionListener((ActionListener) new ActionListener()
        {
        	public void actionPerformed(ActionEvent f)
        	{
        		JOptionPane.showMessageDialog(l2, "Dear Voter, new credential is sent to your phone number!");
        	}
        });
        		
      
        
        
        
		//Validation
		login_But.addActionListener((ActionListener) new ActionListener() { 
			
			
			public void getdb() throws ClassNotFoundException, SQLException 
			{     
				//GETS DATA FROM DATABASE
		        String url = "jdbc:mysql://localhost:3306/test";
		        String uname ="root";
		        String pass= "";

		        Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection con = DriverManager.getConnection(url,uname,pass);
		        
		        
		        String username = field_username.getText();

		        //Get the password as an array of characters
		        char[] str = field_password.getPassword();
		        
		        //convert the array of password characters to string
		        String password = new String(str);
		        
		        Statement st = con.createStatement();

		        //mysql query to run
		        String query = "select * from register where username ='"+username+"' and password = '"+password+"';" ;
		        	
		        ResultSet rs = st.executeQuery(query);
		        
		        
		        if (rs.next()) {
		        	//if username and password is true then go to Homepage
		        	dispose();
		        	JOptionPane.showMessageDialog(l2,"Enter The Home Page");
		        	//HomePage hpage = new HomePage();
		        	//hpage.show();	
		        }
		        else {
		        	//if username and password is wrong show message
		        	
		        	JOptionPane.showMessageDialog(l2,"username or password is wrong!!!");
		        	field_username.setText("");
		        	field_password.setText("");
		        }
		        
		        st.close();
		        con.close();
		    }
			
			  public void actionPerformed(ActionEvent e) { 
			  

				if(field_username.getText() != null && field_username.getText().equals(""))
					{
						JOptionPane.showMessageDialog(l2, "Please enter a username!");
					}
				else if (field_password.getPassword().length == 0)
					{    
						JOptionPane.showMessageDialog(l2, "Please enter a password!");
					}
				
				else
				{
					try {
						getdb();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			  } 
			} );
        
        setVisible(true);
	}
	
	public static void main(String[] args)
	{
		// Calling the NimbusFeel to enhance the overall structure and design of the interface
		setNimbusFeel();
		LoginVoter loginvoter = new LoginVoter();
		
	}
	
	// JTattoo UI design used in the overall interface of the voting system
	private static void setNimbusFeel(){
	    try {
	        // Here you can put the selected theme class name in JTattoo
	        UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

	    } catch (ClassNotFoundException ex) {
	        java.util.logging.Logger.getLogger(LoginVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
	        java.util.logging.Logger.getLogger(LoginVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	        java.util.logging.Logger.getLogger(LoginVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        java.util.logging.Logger.getLogger(LoginVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
	    
	}
}
