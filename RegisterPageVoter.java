package Vote;

// Importing library for the structure of the swing interface
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;

// Importing library to write into a file and read from a file
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Importing library for database
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class RegisterPageVoter extends JFrame implements ActionListener
{
	// Components of the registration form 
	private Container c;
	
    private JButton title;
    private JLabel title2;
    
    private JLabel nic; 
    private JTextField t_nic;
    
    private JLabel fname;
    private JTextField t_fname;
    private JLabel lname;
    private JTextField t_lname;
    
    private JLabel mno;
    private JTextField tmno;
    
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
   
    private JLabel email;
    private JTextField temail;
    
    private JLabel district;
    private JComboBox tdistrict;
    
    private JLabel add;
    private JTextField tadd;
    
    private JLabel type;
    private JRadioButton voter;
    private JRadioButton candidate;
    private ButtonGroup typegp;
    
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    
	private JButton backcand;
	private JButton backcand2;
    
    
    private String dates[]
        = { "", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    
    private String months[]
        = { "", "January", "February", "March", "April", "May", 
        	"June", "July", "August","September", "October", 
        	"November", "December" };
    
    private String years[]
        = { "", "1987", "1988", "1989", "1990",
        	"1991", "1992", "1993", "1994",
        	"1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003"};
    
    private String districts[]
    	= { "", "Black River", "Grand Port","Flacq", "Moka", 
    		"Pamplemousses", "Plaines-Wilhems", "Port-Louis",  
    		"Rivière du Rempart", "Savanne"};
    
    String data0;
    String data,data1,data2,data3,data4;
    
    public RegisterPageVoter()
    {
        setTitle("Voter Registration Form");
        
        // Fixed screen size for all application
        setBounds(290, 90, 900, 640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Allow the screen to be resized 
        setResizable(true);

        c = getContentPane();
        c.setLayout(null);
        
        // Having a border for each text field within the registration form
        Border border = BorderFactory.createLineBorder(new Color(181, 176, 33));
        Border border1 = BorderFactory.createLineBorder(new Color(0, 0, 0));
        
		// Implementing a Button for Candidate Panel
		title = new JButton("Welcome To Voter Registration Form");
		title.setFont(new Font("Javanese Text", Font.PLAIN, 20));
		title.setBounds(0, 0, 900, 55);
		title.setForeground(new Color(237, 189, 45));
		title.setBackground(new Color(0, 0, 0));
		title.setBorder(border1);
		title.setHorizontalAlignment(JTextField.CENTER);
        c.add(title);
        
        // ------------------------------- Details ----------------------------------
        // set bound (x-coordinates, y-coordinates, height and width of the container)
        // set font of the JLabel and text field content
        // setHorizontal alignment will centered the the alignment in the text-field
        
        //-------------------- NIC -------------------------------
        nic = new JLabel("NIC");
        nic.setFont(new Font("Javanese Text", Font.BOLD, 13));
        nic.setBounds(55, 80, 90, 20);
        c.add(nic);
        
        //Text field for the user 
	    t_nic = new JTextField();
	    t_nic.setFont(new Font("Times New Roman", Font.BOLD, 13)); 
	    t_nic.setBounds(150, 77, 190, 20);
	    t_nic.setBackground(new Color(255, 253, 230));
	    t_nic.setHorizontalAlignment(JTextField.CENTER);
	    t_nic.setBorder(border);
	    c.add(t_nic);
	    
	    // ---------------- FIRST NAME -----------------------------
        fname = new JLabel("First-Name");
        fname.setFont(new Font("Javanese Text", Font.BOLD, 14));
        fname.setBounds(55, 120, 90, 20);
        c.add(fname);
  
        // First Name Text Field
	    t_fname = new JTextField();
	    t_fname.setFont(new Font("Times New Roman", Font.BOLD, 13));
	    t_fname.setBounds(150, 120, 190, 20);
	    t_fname.setBackground(new Color(255, 253, 230));
	    t_fname.setHorizontalAlignment(JTextField.CENTER);
	    t_fname.setBorder(border);
	    c.add(t_fname);
        
	    // --------------- LAST NAME -----------------------------
        lname = new JLabel("Last Name");
        lname.setFont(new Font("Javanese Text", Font.BOLD, 14));
        lname.setBounds(55, 160, 90, 20);
        c.add(lname);
  
        // Last Name Text Field
	    t_lname = new JTextField();
	    t_lname.setFont(new Font("Times New Roman", Font.BOLD, 13));
	    t_lname.setBounds(150, 160, 190, 20);
	    t_lname.setBackground(new Color(255, 253, 230));
	    t_lname.setHorizontalAlignment(JTextField.CENTER);
	    t_lname.setBorder(border);    
	    c.add(t_lname);
        
        // ----------------- GENDER --------------------------------
        gender = new JLabel("Gender");
        gender.setFont(new Font("Javanese Text", Font.BOLD, 14));
        gender.setBounds(55, 200, 90, 20);
        c.add(gender);
 
        // Male Button - Radio Button
	    male = new JRadioButton("Male");
	    male.setFont(new Font("Javanese Text", Font.BOLD, 13));
	    male.setSelected(false);
        male.setSize(70, 20);
        male.setLocation(150, 200);
	    c.add(male);
	    
		// Female Button - Radio Button
	    female = new JRadioButton("Female");
	    female.setFont(new Font("Javanese Text", Font.BOLD, 13));
	    female.setSelected(false);
	    female.setSize(90, 20);
	    female.setLocation(250, 200);
	    female.setBorder(border);  
	    c.add(female);
	    
	    // Visible Radio Button
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
        
        // --------------------- DOB ----------------------
        dob = new JLabel("DOB");
        dob.setFont(new Font("Javanese Text", Font.BOLD, 13));
        dob.setBounds(55, 240, 90, 20);
        c.add(dob);
 
        // Dates Detailing
	    date = new JComboBox(dates);
	    date.setFont(new Font("Times New Roman", Font.BOLD, 12));
	    date.setSize(43, 19);
	    date.setLocation(150, 240);
	    date.setBackground(new Color(255, 253, 230));
	    date.setBorder(border);   
	    c.add(date);
	  
	    // Months Detailing
	    month = new JComboBox(months);
	    month.setFont(new Font("Times New Roman", Font.BOLD, 12));
	    month.setSize(80, 19);
	    month.setLocation(197, 240);
	    month.setBackground(new Color(255, 253, 230));
	    month.setBorder(border);   
	    c.add(month);
  
	    // Year Detailing
	    year = new JComboBox(years);
	    year.setFont(new Font("Times New Roman", Font.BOLD, 12));
	    year.setSize(60, 19);
	    year.setLocation(280, 240);
	    year.setBackground(new Color(255, 253, 230));
	    year.setBorder(border);   
	    c.add(year);
	    
        // ------------------ ADDRESS -------------------------
        add = new JLabel("Address");
        add.setFont(new Font("Javanese Text", Font.BOLD, 14));
        add.setBounds(55, 280, 90, 20);
        c.add(add);
  
	    tadd = new JTextField();
	    tadd.setFont(new Font("Times NEw Roman", Font.BOLD, 13));
	    tadd.setBounds(150, 280, 190, 20);
	    tadd.setBackground(new Color(255, 253, 230));
	    tadd.setHorizontalAlignment(JTextField.CENTER);
	    tadd.setBorder(border);
	    // tadd.setLineWrap(true);
	    c.add(tadd);	
	    
		//------------------ DISTRICT ----------------------------- 
        district = new JLabel("District");
        district.setFont(new Font("Javanese Text", Font.BOLD, 14));
        district.setBounds(55, 320, 90, 20);
        c.add(district);
  
	    tdistrict = new JComboBox(districts);
	    tdistrict.setFont(new Font("Times New Roman", Font.BOLD, 13));
	    tdistrict.setBounds(150, 320, 190, 20);
	    tdistrict.setBackground(new Color(255, 253, 230));
	    tdistrict.setBorder(border);  
	    c.add(tdistrict);
	  
        //---------------- EMAIL ------------------------------
        email = new JLabel("Email");
        email.setFont(new Font("Javanese Text", Font.BOLD, 14));
        email.setBounds(55, 360, 90, 20);
        c.add(email);
  
	    temail = new JTextField();
	    temail.setFont(new Font("Times New Roman", Font.BOLD, 13));
	    temail.setBounds(150, 360, 190, 20);
	    temail.setBackground(new Color(255, 253, 230));
	    temail.setHorizontalAlignment(JTextField.CENTER);
	    temail.setBorder(border);
	    c.add(temail);
	    
        // --------------- MOBILE No. ---------------------------
        mno = new JLabel("Mobile No.");
        mno.setFont(new Font("Javanese Text", Font.BOLD, 14));
        mno.setBounds(55, 400, 90, 20);
        c.add(mno);
  
	    tmno = new JTextField();
	    tmno.setFont(new Font("Times New Roman", Font.BOLD, 13));
	    tmno.setBounds(150, 400, 190, 20);
	    tmno.setText("(+230)  ");
	    tmno.setBackground(new Color(255, 253, 230));
	    tmno.setHorizontalAlignment(JTextField.CENTER);
	    tmno.setBorder(border);
	    c.add(tmno);
	   
	    
	    // ---------- TERM AND CONDITION FIELD --------------- 
        term = new JCheckBox("Please confirm if you agree with our terms and conditions.");
        term.setFont(new Font("Javanese Text", Font.BOLD, 13));
        term.setBounds(270, 460, 410, 20);
        c.add(term);
        
        
        // ---------------SUBMIT BUTTON ------------------------
        sub = new JButton("Submit");
        sub.setFont(new Font("Times New Roman", Font.BOLD, 13));
        sub.setBounds(350, 507, 85, 20);
        sub.setHorizontalAlignment(JTextField.CENTER);
        sub.addActionListener(this);
        c.add(sub);
  
        // ----------------- RESET BUTTON ----------------------------
        reset = new JButton("Reset");
        reset.setFont(new Font("Times New Roman", Font.BOLD, 13));
        reset.setBounds(450, 507, 85, 20);
        reset.setHorizontalAlignment(JTextField.CENTER);
        reset.addActionListener(this);
        c.add(reset);		
  
        // ------------------ INFORMATION DISPLAY ------------------ 
        
        title2 = new JLabel("Voter Information");
        title2.setFont(new Font("Javanese Text", Font.BOLD, 13));
        title2.setBounds(600, 75, 190, 20);
        c.add(title2);
        
        tout = new JTextArea();
        tout.setFont(new Font("Times New Roman", Font.BOLD, 12));
        tout.setBounds(500, 94, 300, 320);
        tout.setLineWrap(true);
        tout.setEditable(false);
	    tout.setBackground(new Color(255, 253, 230));
	    tout.setBorder(border);
        c.add(tout); 
  
        res = new JLabel("");
        res.setFont(new Font("Times New Roman", Font.BOLD, 14));
        res.setBounds(325, 550, 350, 20);
        c.add(res);
        
        resadd = new JTextArea();
        resadd.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        resadd.setBounds(450, 507, 85, 20);
        resadd.setLineWrap(true);
        c.add(resadd);
        
        // -------------------- BACK BUTTON --------------------------------
		backcand = new JButton("Back To Homepage");
		backcand.setFont(new Font("Times New Roman", Font.BOLD, 12));
		backcand.setBounds(700, 500, 140, 22);
		//backcand.setForeground(new Color(237, 189, 45));
		backcand.setBackground(new Color(255, 253, 230));
		backcand.setBorder(border);
		backcand.setHorizontalAlignment(JTextField.CENTER);
        c.add(backcand);
        
		
		backcand2 = new JButton("Back To Voter Page");
		backcand2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		backcand2.setBounds(700, 550, 140, 22);
		//backcand.setForeground(new Color(237, 189, 45));
		backcand2.setBackground(new Color(255, 253, 230));
		backcand2.setBorder(border);
		backcand2.setHorizontalAlignment(JTextField.CENTER);
        c.add(backcand2);
        
		// ------------------------ BACK BUTTON --------------------------------------
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
    
    public void setdb() throws SQLException, ClassNotFoundException {	//INSERTS DATA INTO DATABASE
		String url = "jdbc:mysql://localhost:3306/test";
		String uname ="root";
		String pass= "";
		
		String dbnic = t_nic.getText();
		String dbfname = t_fname.getText();
		String dblname = t_lname.getText();
		String dbmno = tmno.getText();
		
		String dbgender;
		if (male.isSelected())
              dbgender = "Male";
        else
              dbgender = "Female";
        
		 String dbdate = (String)date.getSelectedItem()
         + "/" + (String)month.getSelectedItem()
         + "/" + (String)year.getSelectedItem();
		 
		
		String dbemail = temail.getText();
		
		String dbdistrict = (String)tdistrict.getSelectedItem();
		
		String dbadd = tadd.getText();

		/*
		if (voter.isSelected())
        	dbclass = "\n" + "Registered as : Voter" + "\n";
        else
        	dbclass = "\n" + "Registered as : Candidate" + "\n";
	    */
		
		String query = "INSERT INTO register values ('"+dbnic+"', '"+dbfname+"', '"+dblname+"', '"+dbmno+"', '"
		+dbgender+"', '"+dbdate+"', '"+dbemail+"', '"+dbdistrict+"', '"+dbadd+"');";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);

	
		System.out.println(count + "row/s affected");
		
		st.close();
		con.close();
	}
    
    public void writefile(String data0, String data, String data1, String data2, String data3) throws IOException {
		//String data4
    	File output = new File("C:\\Users\\User\\Desktop\\DataVoter.txt");

		BufferedWriter bw = new BufferedWriter(new FileWriter(output));
		String line = null;

		bw.write("__" + "\n");

		bw.write("NIC: " + data0 + "\n");
		bw.write("Name & Mob No: " + data + "\n");
		bw.write("Gender: " + data1 + "\n");
		bw.write("DOB & Email: " + data2 + "\n");
		bw.write("District & Address: " + data3 + "\n");
		//bw.write("Class: " + data4 + "\n");
		bw.close();
	}
    

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
        	if(t_nic.getText().isEmpty() 
        			|| t_fname.getText().isEmpty()
        			|| t_lname.getText().isEmpty()
        			|| tmno.getText().isEmpty()
        			|| temail.getText().isEmpty()
        			|| tadd.getText().isEmpty()
        			) 
        	{
        		 JFrame f=new JFrame();  
        		   JOptionPane.showMessageDialog(f,"Fill empty fields");
        		   return;
        	}
        	
            if (term.isSelected()) {
            	//String data0;
                //String data1;
                data0 = "NIC Number : " + t_nic.getText() + "\n";
                data  = "Name : "
                      + t_fname.getText() + " " + t_lname.getText() + "\n"
                      + "Mobile : "
                      + tmno.getText() + "\n" ;
                if (male.isSelected())
                    data1 = "Gender : Male"
                            + "\n";
                else
                    data1 = "Gender : Female"
                            + "\n";
                 data2
                    = "DOB : "
                      + (String)date.getSelectedItem()
                      + "/" + (String)month.getSelectedItem()
                      + "/" + (String)year.getSelectedItem()
                      + "\n"
                      + "Email : " + temail.getText() + "\n";
  
                data3 = 
                		"District : " + tdistrict.getSelectedItem() 
                			+"\n"	+ "Address : " + tadd.getText() + "\n";

                /*if (voter.isSelected())
                	data4 = "\n" + "Registered as : Voter" + "\n";
                else
                	data4 = "\n" + "Registered as : Candidate" + "\n";
                			*/
                tout.setText(data0 + data + data1 + data2 + data3); // data4
                tout.setEditable(false);
                res.setText("You have registered Successfully !");
                try {
					writefile(data0,data,data1,data2,data3); //data4
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
            else 
            {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the terms & conditions");
            }
            
            try {
				setdb();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
  
        else if (e.getSource() == reset) {
            String def = "";
            t_nic.setText(def);
            t_fname.setText(def);
            t_lname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);  
            resadd.setText(def);
            tdistrict.setSelectedIndex(0);
        }
    }

	public static void main(String[] args)
	{
		// Calling the NimbusFeel to enhance the overall structure and design of the interface
		setNimbusFeel();
		RegisterPageVoter regpage = new RegisterPageVoter();
		
	}
	
	// JTattoo UI design used in the overall interface of the voting system
	private static void setNimbusFeel(){
	    try {
	        // Here you can put the selected theme class name in JTattoo
	        UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

	    } catch (ClassNotFoundException ex) {
	        java.util.logging.Logger.getLogger(RegisterPageVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
	        java.util.logging.Logger.getLogger(RegisterPageVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
	        java.util.logging.Logger.getLogger(RegisterPageVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        java.util.logging.Logger.getLogger(RegisterPageVoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
	    
	}


}









