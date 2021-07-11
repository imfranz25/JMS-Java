import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.imageio.ImageIO;
import java.io.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.Font;
import java.awt.Color;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.sql.*;
import javax.swing.border.*;
public class JMS {
	public static JLabel logo2=new JLabel();
	public static String no="";
	public static ImageIcon photo1=new ImageIcon();
	public static ImageIcon fp5=new ImageIcon();
	public static int ttt=0;
	public static String cellnumber="";
	public static int a55=0;
    public static int b55=0;
    public static int c55=0;
    public static int photoint=0;
    public static int ha1=0;
    public static File file=new File(no);
    public static String icon0="";
    public static String glevel="";
	public static final String jdriver="com.mysql.jdbc.Driver";
	public static final String dburl="jdbc:mysql://localhost/jms?useUnicode=true&useJDBCCompliantTimeZoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static final String userdb="root";
	public static final String passdb="";
    public static void main(String[]args){

    	//frame logos
        ImageIcon icon1=new ImageIcon("LOGO2.png");
    	JLabel logo=new JLabel(icon1);
        ImageIcon icon2=new ImageIcon("logo3.png");
        JLabel logo1=new JLabel(icon2);
        ImageIcon icon4=new ImageIcon("logo3.png");
        JLabel logo3=new JLabel(icon4);
        ImageIcon icon5=new ImageIcon();
        JLabel logo5=new JLabel(icon5);
        ImageIcon icon6=new ImageIcon("logo3.png");
        JLabel logo7=new JLabel(icon6);
        ImageIcon icon7=new ImageIcon("logo3.png");
        JLabel logo8=new JLabel(icon7);
        ImageIcon icon8=new ImageIcon("logo3.png");
        JLabel logo9=new JLabel(icon8);

	   //frames
       JFrame f1=new JFrame("Log-In");
       JFrame f2=new JFrame("Prisoner Manager Form");
       JFrame f3=new JFrame("Sign-Up");
       JFrame f4=new JFrame("Release");
       JFrame f5=new JFrame("Jail Management Record");
       JFrame f6=new JFrame("History");
       JFrame fcell=new JFrame("Prison Cell");
       JFrame f8=new JFrame("Terms and Conditions");
       //frame 1 bg
       try{
          f1.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("frame1.png")))));
      }catch(Exception e){
          e.printStackTrace();
      }
       //frame 2 bg
       try{
          f2.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("frame2.png")))));
      }catch(Exception e){
          e.printStackTrace();
      }
       //frame3 bg
       try{
          f3.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("frame3.png")))));
      }catch(Exception e){
          e.printStackTrace();
      }
       //frame 4 bg
       try{
          f4.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("frame4.png")))));
      }catch(Exception e){
          e.printStackTrace();
      }
       //frame 5 bg
       try{
          f5.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("frame5.png")))));
      }catch(Exception e){
          e.printStackTrace();
      }
       //frame 6 bg
       try{
          f6.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("frame6.png")))));
      }catch(Exception e){
          e.printStackTrace();
      }
       //frame 8 bg
       try{
          f8.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("frame7.png")))));
      }catch(Exception e){
          e.printStackTrace();
      }


       //frame 8
       JLabel label1=new JLabel("Terms and Conditions");
       JLabel label2=new JLabel("Please read the following important information before continuing.");
       JLabel label3=new JLabel("Please  read  the  following Terms  and  Conditions. You  must  accept");
       JLabel label4=new JLabel("the terms and conditions before continuing the sign-up process.");
       JTextArea ta1=new JTextArea("     \n" +
"      Jail Management System (CJMS) strictly probihited for assisting  with\n" +
" jail warden,  prison administration and governance. Where  the   system\n" +
" can  provide  adequate  resources,  security  and  personnel  in  order to\n" +
" manage   and  supervise  system normalizes social conditions  within a\n" +
" prison  as  user  you  must   follow  the  terms  and  conditions   and  the \n" +
" following policies :\n" +
"\n" +
" > System  is  only  authorizes by the   admin   or   the   Jail  Warden  and\n" +
"    Goverment involved for the Jail Management System (CJMS).\n" +
" > The System have strictly classfied information for inmates or  prisoner\n" +
"     prohibited linked concluded to others is classfied as a crime.\n" +
" > Acess for this system only for the accredited employee for (CJMS) and\n" +
"    permitted by the authorities.\n" +
" > System only introduced a program of identification , classification, and \n" +
"    cell segregation  to  deal more   effectively with   the threats none other\n" +
"    things is not involved is considered invalid.\n" +
"\n" +
"      In the terms of conditions   of prison  authorities  and   creating power\n" +
"    dynamics that contradicted  the  goals of reformation,  if you  violate the\n" +
"    terms and policies of actions, included  suspended  access also to be\n" +
"    considered or classfied as a crime if it is verified." );
       JLabel label5=new JLabel("Prisonner History Data(s)");


     	//frame 1
       JLabel lb1=new JLabel("Jail Management System");
       JLabel lb2=new JLabel("Username :");
       JLabel lb3=new JLabel("Password :");
       JButton b1=new JButton("Log-in");
       JButton b2=new JButton("Clear");
       JTextField tf1=new JTextField();
       JPasswordField tf2=new JPasswordField();
       JLabel l1=new JLabel("JMS");
       JLabel l2=new JLabel("Jail Management System");
       JLabel l3=new JLabel("Prisoner ID :");
       JLabel l4=new JLabel("Prisoner Name :");
       JLabel l5=new JLabel("Date of Birth :");
       JLabel l6=new JLabel("Age :");
       JLabel l7=new JLabel("Sex :");
       JLabel l8=new JLabel("Entrance Date :");
       JLabel l9=new JLabel("Release Date :");
       JLabel l10=new JLabel("Security Level :");
       JLabel l11=new JLabel("Criminal Case :");
       JLabel l12=new JLabel("Nationality :");
       JLabel l13=new JLabel("Status :");
       JLabel l14=new JLabel("Type of Attorney :");
       JLabel l15=new JLabel("Name of Attorney :");
       JLabel ll3=new JLabel("Inmate Record(s)");
       JLabel ll4=new JLabel("Inmate");
       JLabel ll5=new JLabel("JMS");
       JLabel ll6=new JLabel("Jail Management System");
       JLabel ll55=new JLabel("JMS");
       JLabel ll66=new JLabel("Jail Management System");
       JLabel ll7=new JLabel("Sign-Up");
       JLabel ll8=new JLabel("Name :");
       JLabel ll9=new JLabel("User ID :");
       JLabel ll10=new JLabel("User Type :");
       JLabel ll11=new JLabel("Date of Birth :");
       JLabel ll12=new JLabel("Username :");
       JLabel ll13=new JLabel("Password :");


        //Date & Time
        Font fontdate = new Font("Arial",Font.BOLD,10);
    	JLabel lb1D = new JLabel();
    	JLabel lb2T = new JLabel();
        JLabel lb3D = new JLabel();
    	JLabel lb4T = new JLabel();
    	JLabel lb5D = new JLabel();
    	JLabel lb6T = new JLabel();
    	JLabel lb7D = new JLabel();
    	JLabel lb8T = new JLabel();
    	JLabel lb9D = new JLabel();
    	JLabel lb10T = new JLabel();
    	Timer timer;
    	ActionListener action = new ActionListener(){
    	@Override
    	public void actionPerformed(ActionEvent e){
    	Date date = new Date();
    	DateFormat timeformat = new SimpleDateFormat("hh:mm:ss");
    	String time = timeformat.format(date);
    	lb1D.setText(time);
    	lb3D.setText(time);
    	lb5D.setText(time);
    	lb7D.setText(time);
    	lb9D.setText(time);

    	Date date1 = new Date();
    	DateFormat timeformat1 = new SimpleDateFormat("MM/dd/yyyy");
    	String time1 = timeformat1.format(date1);
    	lb2T.setText(time1);
    	lb4T.setText(time1);
    	lb6T.setText(time1);
    	lb8T.setText(time1);
    	lb10T.setText(time1);

    	Date dates = new Date();
    	DateFormat timeformat12 = new SimpleDateFormat("MM");
    	Date dates11 = new Date();
    	DateFormat timeformat121 = new SimpleDateFormat("dd");
    	Date dates2 = new Date();
    	DateFormat timeformat122 = new SimpleDateFormat("yyyy");
    	String months1=timeformat12.format(dates);
    	String dates1=timeformat121.format(dates11);
    	String years1=timeformat122.format(dates2);
  		a55=Integer.parseInt(months1);
        b55=Integer.parseInt(dates1);
        c55=Integer.parseInt(years1);
    	}};
    	timer = new Timer(1000,action);
    	timer.setInitialDelay(0);
    	timer.start();

		//design date and time
    	lb1D.setFont(fontdate);
    	lb2T.setFont(fontdate);
        lb3D.setFont(fontdate);
    	lb4T.setFont(fontdate);
    	lb5D.setFont(fontdate);
    	lb6T.setFont(fontdate);
    	lb7D.setFont(fontdate);
    	lb8T.setFont(fontdate);
        lb9D.setFont(fontdate);
    	lb10T.setFont(fontdate);
    	lb1D.setForeground(new java.awt.Color(240,225,240));
    	lb2T.setForeground(new java.awt.Color(240,225,240));
    	lb3D.setForeground(new java.awt.Color(240,225,240));
    	lb4T.setForeground(new java.awt.Color(240,225,240));
    	lb5D.setForeground(new java.awt.Color(240,225,240));
    	lb6T.setForeground(new java.awt.Color(240,225,240));
    	lb7D.setForeground(new java.awt.Color(240,225,240));
    	lb8T.setForeground(new java.awt.Color(240,225,240));
    	lb9D.setForeground(new java.awt.Color(240,225,240));
    	lb10T.setForeground(new java.awt.Color(240,225,240));

       //Prisonner form textfields
       JTextField t1=new JTextField();
       JTextField t2=new JTextField();
       JTextField t3=new JTextField();
       JTextField t4=new JTextField();
       JTextField t5=new JTextField();
       JTextField t6=new JTextField();
       JTextField t7=new JTextField();
       JTextField t8=new JTextField();
       JTextField t9=new JTextField();
       JPasswordField t10=new JPasswordField();
       JRadioButton r1=new JRadioButton("Male");
       JRadioButton r2=new JRadioButton("Female");
       JRadioButton r3=new JRadioButton("High");
       JRadioButton r4=new JRadioButton("Low");
       JRadioButton r5=new JRadioButton("Private");
       JRadioButton r6=new JRadioButton("Public");
       JRadioButton r7=new JRadioButton("Admin");
       JRadioButton r8=new JRadioButton("Supervisor");
       JRadioButton r9=new JRadioButton("Security Personnel");
       JRadioButton r10=new JRadioButton("I aceept this terms and conditions");
       JRadioButton r11=new JRadioButton("I do not aceept this terms and conditions");
       JButton b4=new JButton("Sign-Up");
       JButton b5=new JButton("Log-Out");
       JButton b6=new JButton("Search");
       JButton b7=new JButton("Release");
       JButton b8=new JButton("Submit");
       JButton b9=new JButton("Show Record");
       JButton b10=new JButton("Clear");
       JButton b11=new JButton("Add Photo");
       t1.setEditable(false);
       t3.setEditable(false);

       //frame 5
       JTextArea ta0=new JTextArea();
       ta0.setBackground(Color.BLUE);
       ta0.setForeground(new java.awt.Color(204, 204, 204));
       JScrollPane sc1=new JScrollPane(ta0);
       ta0.setFont(new java.awt.Font("Times New Roman", 1, 14));
       JButton b12=new JButton("Log-Out");
       JButton b13=new JButton("Add");
       JButton b15=new JButton("Cells");
       JButton b16=new JButton("Update");
       JButton b17=new JButton("Retrive");
       JCheckBox cb1=new JCheckBox(" Agree Terms and Conditions");
       JButton b18=new JButton("Submit");
       JButton b19=new JButton("Reset");
       JButton b199=new JButton("Cancel");

       //frame 3
       JButton b20=new JButton("Search");
       JButton b21=new JButton("<  Back");
       JButton b22=new JButton("Release");
       JLabel l01=new JLabel("JMS");
       JLabel l02=new JLabel("Jail Management");
       JLabel l03=new JLabel("Date Today :");
       JButton b23=new JButton("<  Back");
       JButton b24=new JButton("Next  >");
       JButton b25=new JButton("<  Back");
       JButton b26=new JButton("Retrive");
       JButton b28=new JButton("Edit");
       JButton b29=new JButton("Cancel");

       //cell frame
     JLabel label6=new JLabel("Cell Monitoring Sheet");
     JLabel label7=new JLabel("Cell 1");
     JLabel label9=new JLabel("Cell 2");
     JLabel label10=new JLabel("Cell 3");
     JLabel label11=new JLabel("Cell 4");
     JLabel label12=new JLabel("Cell 5");
     JLabel label13=new JLabel("Total Prisoner(s) :");
     JLabel label14=new JLabel("CONTROL");
     JLabel label15=new JLabel("OFFICE");
     JLabel label16=new JLabel("BOOKING OF NEWLY INMATES");
     JLabel label17=new JLabel("WAITING");
     JLabel label18=new JLabel("VISITING AREA");
     JLabel label20=new JLabel("ENTRANCE");
     JLabel label21=new JLabel("EXIT");
     JLabel label22=new JLabel("============");
     JLabel label23=new JLabel("============");
     JLabel label24=new JLabel("TOILET");
     JLabel label25=new JLabel("ENTRY POINT");
     JLabel label26=new JLabel("CAPITERIA");
     JLabel label27=new JLabel("- - - - - - - - - - - - - -");
     JLabel label28=new JLabel("- - - - - - - - - - - - - -");
     JLabel label29=new JLabel("- - - - - - - - - - - - - -");
     JLabel label30=new JLabel("- - - - - - - - - - - - - -");
     JLabel label31=new JLabel("- - - - - - - - -");
     JLabel label32=new JLabel("- - - - - - - - - - - - - -  ");
     JLabel label33=new JLabel("- - - - - - - - - - -");
     JLabel label34=new JLabel("- - - - - - - - - - - - -");
     JLabel label35=new JLabel("- - - - - - - - - - - - - - - -");
     JLabel label36=new JLabel("- - - - - - - - - - - - - -");
     JLabel label37=new JLabel("- - - - - - - - - - - - - - - -");
     JLabel label38=new JLabel("ENTRY AREA");
     JLabel label39=new JLabel("- - - - - - - - -");
     JLabel label40=new JLabel("INMATES CELL/VISITING AREA");
     JLabel label41=new JLabel("OFFICER FACILITIES");
     JLabel label42=new JLabel("CONTROL FACILITIES");
     JLabel label43=new JLabel("CAPITERIA");
     JLabel label44=new JLabel("PATHWAY");
     JButton bb27=new JButton("Close");
     JButton cell1=new JButton("Cell 1");
     JButton cell2=new JButton("Cell 2");
     JButton cell3=new JButton("Cell 3");
     JButton cell4=new JButton("Cell 4");
     JButton cell5=new JButton("Cell 5");
     JPanel jp1=new JPanel();
     JPanel jp2=new JPanel();
     JPanel jp3=new JPanel();
     JPanel jp4=new JPanel();
     JPanel jp5=new JPanel();
     JPanel jp6=new JPanel();
     JPanel jp7=new JPanel();
     JPanel jp8=new JPanel();
     JPanel jp9=new JPanel();
     JPanel jp10=new JPanel();
     JPanel jp11=new JPanel();
     JPanel jp12=new JPanel();
     JPanel jp13=new JPanel();
     JPanel jp14=new JPanel();
     JPanel jp15=new JPanel();
     JPanel jp16=new JPanel();
     JPanel jp17=new JPanel();
     JPanel jp18=new JPanel();
     JPanel jp19=new JPanel();
     JPanel jp20=new JPanel();
     JPanel jp21=new JPanel();
     JPanel jpA=new JPanel();
     JPanel jpB=new JPanel();
     JPanel jpC=new JPanel();
     JPanel jpD=new JPanel();

	//design frame cell
     jp1.setBackground(Color.GREEN);
     jp2.setBackground(Color.GREEN);
     jp3.setBackground(Color.GREEN);
     jp4.setBackground(Color.GREEN);
     jp5.setBackground(Color.GREEN);
     jp6.setBackground(Color.ORANGE);
     jp7.setBackground(Color.YELLOW);
     jp8.setBackground(Color.ORANGE);
     jp9.setBackground(Color.GREEN);
     jp10.setBackground(Color.ORANGE);
     jp11.setBackground(Color.PINK);
     jp12.setBackground(Color.GRAY);
     jp13.setBackground(Color.GRAY);
     jp14.setBackground(Color.ORANGE);
     jp15.setBackground(Color.YELLOW);
     jp16.setBackground(Color.ORANGE);
     jp17.setBackground(Color.GREEN);
     jp18.setBackground(Color.ORANGE);
     jp19.setBackground(Color.YELLOW);
     jp20.setBackground(Color.PINK);
     jp21.setBackground(new java.awt.Color(240,225,240));
     jpA.setBackground(Color.DARK_GRAY);
     jpB.setBackground(Color.DARK_GRAY);
     jpC.setBackground(Color.DARK_GRAY);
     jpD.setBackground(Color.DARK_GRAY);
     cell1.setBackground(Color.GREEN);
     cell2.setBackground(Color.GREEN);
     cell3.setBackground(Color.GREEN);
     cell4.setBackground(Color.GREEN);
     cell5.setBackground(Color.GREEN);
     label20.setForeground(new java.awt.Color(240,225,240));
     label21.setForeground(new java.awt.Color(240,225,240));
     label25.setForeground(new java.awt.Color(240,225,240));
     label38.setForeground(new java.awt.Color(240,225,240));
     label27.setForeground(new java.awt.Color(240,225,240));
     label28.setForeground(new java.awt.Color(240,225,240));
     label29.setForeground(new java.awt.Color(240,225,240));
     label30.setForeground(new java.awt.Color(240,225,240));
     label31.setForeground(new java.awt.Color(240,225,240));
     label32.setForeground(new java.awt.Color(240,225,240));
     label33.setForeground(new java.awt.Color(240,225,240));
     label34.setForeground(new java.awt.Color(240,225,240));
     label35.setForeground(new java.awt.Color(240,225,240));
     label36.setForeground(new java.awt.Color(240,225,240));
     label37.setForeground(new java.awt.Color(240,225,240));
     label39.setForeground(new java.awt.Color(240,225,240));
     jp1.setBorder(BorderFactory.createEtchedBorder());
     jp2.setBorder(BorderFactory.createEtchedBorder());
     jp3.setBorder(BorderFactory.createEtchedBorder());
     jp4.setBorder(BorderFactory.createEtchedBorder());
     jp5.setBorder(BorderFactory.createEtchedBorder());
     jp6.setBorder(BorderFactory.createEtchedBorder());
     jp7.setBorder(BorderFactory.createEtchedBorder());
     jp8.setBorder(BorderFactory.createEtchedBorder());
     jp9.setBorder(BorderFactory.createEtchedBorder());
     jp10.setBorder(BorderFactory.createEtchedBorder());
     jp11.setBorder(BorderFactory.createEtchedBorder());
     jp12.setBorder(BorderFactory.createEtchedBorder());
     jp13.setBorder(BorderFactory.createEtchedBorder());
     jp14.setBorder(BorderFactory.createEtchedBorder());
     jp15.setBorder(BorderFactory.createEtchedBorder());
     jp16.setBorder(BorderFactory.createEtchedBorder());
     jp17.setBorder(BorderFactory.createEtchedBorder());
     jp18.setBorder(BorderFactory.createEtchedBorder());
     jp19.setBorder(BorderFactory.createEtchedBorder());
     jp20.setBorder(BorderFactory.createEtchedBorder());
     jp21.setBorder(BorderFactory.createEtchedBorder());
     jpA.setBorder(BorderFactory.createEtchedBorder());
     jpB.setBorder(BorderFactory.createEtchedBorder());
     jpC.setBorder(BorderFactory.createEtchedBorder());
     jpD.setBorder(BorderFactory.createEtchedBorder());
     logo5.setBorder(BorderFactory.createEtchedBorder());

     //save button for update
     JButton save=new JButton("Save");


	   //frame resize false
       f1.setResizable(false);
       f2.setResizable(false);
       f3.setResizable(false);
       f4.setResizable(false);
       f5.setResizable(false);
       f6.setResizable(false);
       f8.setResizable(false);
       fcell.setResizable(false);

	   //main table
       String col[]={"Prisoner ID NO.","Name","Case","Cell No."};
       String row[][]={};
       DefaultTableModel tmodel=new DefaultTableModel(row,col){
       public boolean isCellEditable(int row, int column){
       return false;
       }
       };
       JTable table=new JTable(tmodel);
       table.setFocusable(true);
	   table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	   table.getTableHeader().setReorderingAllowed(false);
       JScrollPane sc=new JScrollPane(table);
       TableRowSorter rowSorter=new TableRowSorter<>(table.getModel());
       JTextField searcht1=new JTextField();
	   SortFilter(table,searcht1,rowSorter);

	   //table design
       table.setRowHeight(30);
       table.setFont(new java.awt.Font("Tahoma", 1, 12));
       table.setBackground(new java.awt.Color(255, 255, 153));
       table.setSelectionBackground(new java.awt.Color(204, 255, 204));


       //update table in first run
       int countt=tmodel.getRowCount();
       while(countt>0){
       tmodel.removeRow(0);
       countt--;
       }
	   for(int y2=1;y2<=5;y2++){
       try{
       Connection con21b=DriverManager.getConnection(dburl,userdb,passdb);
   	   String squery111b="select id,name,cases,cell from cell"+y2+" ";
	   Statement st111b=con21b.createStatement();
	   ResultSet rs111b=st111b.executeQuery(squery111b);

	   while(rs111b.next()){
		int id1s=rs111b.getInt("id");
		String name1s=rs111b.getString("name");
		String cases11s=rs111b.getString("cases");
		String cel1s=rs111b.getString("cell");
		//add in main table
		String okiey1[]={String.valueOf(id1s),name1s,cases11s,cel1s};
		tmodel.addRow(okiey1);
		}
    	con21b.close();
    	st111b.close();
    	rs111b.close();
       }catch(Exception aeee){
       	JOptionPane.showMessageDialog(null,aeee);
       }//end of while loop
       }//end of for loop

	   //combobox constructors
       String mon[]={"N/A","January","February","March","April","May","June","July","August","September","October","November","December"};
       String status[]={"Parol","No Parol"};
       JComboBox c=new JComboBox(status);
       JComboBox c1=new JComboBox(mon);
       JComboBox c2=new JComboBox();
       JComboBox c3=new JComboBox();
       JComboBox c4=new JComboBox(mon);
       JComboBox c5=new JComboBox();
       JComboBox c6=new JComboBox();
       JComboBox c7=new JComboBox(mon);
       JComboBox c8=new JComboBox();
       JComboBox c9=new JComboBox();
       JComboBox c10=new JComboBox(mon);
       JComboBox c11=new JComboBox();
       JComboBox c12=new JComboBox();
       JComboBox c13=new JComboBox(mon);
       JComboBox c14=new JComboBox();
       JComboBox c15=new JComboBox();
       c1.removeItem("N/A");
       c4.removeItem("N/A");
       c8.addItem("N/A");
       c9.addItem("N/A");
       c10.removeItem("N/A");
       c13.removeItem("N/A");

       for(int i=1;i<=31;i++){
       c2.addItem(i);
       c5.addItem(i);
       c8.addItem(i);
       c11.addItem(i);
       c14.addItem(i);
       }//end of for loop

       for(int i=1960;i<=2030;i++){
       c6.addItem(i);
       c9.addItem(i);
       c12.addItem(i);
       c15.addItem(i);
       }//end of for loop

	   //byear
       for(int i=1960;i<=c55-2;i++){
       c3.addItem(i);
       }//end of for loop



	   //table for release
	   String coll[]={"Prisoner ID.","Name","Case","Cell No."};
       DefaultTableModel model=new DefaultTableModel(row,col){
       public boolean isCellEditable(int row, int column){
       return false;
       }};
       JTable list1=new JTable(model);
       list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	   list1.getTableHeader().setReorderingAllowed(false);
       JScrollPane sc2=new JScrollPane(list1);

       //table for retrieve
       String col22[]={"Prisoner ID.","Name","Case"};
       DefaultTableModel model1=new DefaultTableModel(row,col22){
       public boolean isCellEditable(int row, int column){
       return false;
       }};
       JTable list2=new JTable(model1);
       list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	   list2.getTableHeader().setReorderingAllowed(false);
       JScrollPane sc3=new JScrollPane(list2);

       //table designs
       list1.setRowHeight(30);
       list1.setFont(new java.awt.Font("Tahoma", 1, 12));
       list1.setBackground(new java.awt.Color(255, 255, 153));
       list1.setSelectionBackground(new java.awt.Color(204, 255, 204));
       list2.setRowHeight(30);
       list2.setFont(new java.awt.Font("Tahoma", 1, 12));
       list2.setBackground(new java.awt.Color(255, 255, 153));
       list2.setSelectionBackground(new java.awt.Color(204, 255, 204));

	   //logo location and size
       logo1.setBounds(10,20,100,100);
       logo3.setBounds(10,20,100,100);
       logo5.setBounds(720,188,160,160);
       logo7.setBounds(10,20,100,100);
       logo8.setBounds(10,20,100,100);
       logo9.setBounds(10,20,100,100);

	  //label && button design
	  lb1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 153, 153)));
      b1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b199.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b25.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      bb27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      b29.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      save.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      ll7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      lb1.setFont(new java.awt.Font("Times New Roman", 1, 25));
      lb1.setForeground(new java.awt.Color(240,225,240));
      lb1.setHorizontalAlignment(JLabel.CENTER);
      lb2.setForeground(new java.awt.Color(240,225,240));
      lb3.setForeground(new java.awt.Color(240,225,240));
      l1.setFont(new java.awt.Font("Times New Roman", 1, 25));
      l1.setForeground(new java.awt.Color(240, 225, 240));
      l2.setFont(new java.awt.Font("Times New Roman", 1, 20));
      l2.setForeground(new java.awt.Color(240, 225, 240));
      ll7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30));
      ll7.setForeground(new java.awt.Color(51, 0, 0));
      ll7.setHorizontalAlignment(JLabel.CENTER);
      ll3.setForeground(new java.awt.Color(240,225,240));
      ll4.setForeground(new java.awt.Color(240,225,240));
      l3.setForeground(new java.awt.Color(240,225,240));
      l4.setForeground(new java.awt.Color(240,225,240));
      l5.setForeground(new java.awt.Color(240,225,240));
      l6.setForeground(new java.awt.Color(240,225,240));
      l7.setForeground(new java.awt.Color(240,225,240));
      l8.setForeground(new java.awt.Color(240,225,240));
      l9.setForeground(new java.awt.Color(240,225,240));
      l10.setForeground(new java.awt.Color(240,225,240));
      l11.setForeground(new java.awt.Color(240,225,240));
      l12.setForeground(new java.awt.Color(240,225,240));
      l13.setForeground(new java.awt.Color(240,225,240));
      l14.setForeground(new java.awt.Color(240,225,240));
      l15.setForeground(new java.awt.Color(240,225,240));
      l01.setForeground(new java.awt.Color(240,225,240));
      l02.setForeground(new java.awt.Color(240,225,240));
      l03.setForeground(new java.awt.Color(240,225,240));
      l01.setFont(new java.awt.Font("Times New Roman", 1, 25));
      l02.setFont(new java.awt.Font("Times New Roman", 1, 20));
      l03.setFont(new java.awt.Font("Times New Roman", 1, 18));
      ll7.setForeground(new java.awt.Color(240,225,240));
      ll8.setForeground(new java.awt.Color(240,225,240));
      ll9.setForeground(new java.awt.Color(240,225,240));
      ll10.setForeground(new java.awt.Color(240,225,240));
      ll11.setForeground(new java.awt.Color(240,225,240));
      ll12.setForeground(new java.awt.Color(240,225,240));
      ll12.setFont(new java.awt.Font("Times New Roman", 1, 15));
      ll13.setForeground(new java.awt.Color(240,225,240));
      ll12.setFont(new java.awt.Font("Times New Roman", 1, 15));
      label1.setFont(new java.awt.Font("Times New Roman", 1, 15));
      label1.setForeground(new java.awt.Color(240,225,240));
      label2.setForeground(new java.awt.Color(240,225,240));
      label3.setForeground(new java.awt.Color(240,225,240));
      label4.setForeground(new java.awt.Color(240,225,240));
      label5.setForeground(new java.awt.Color(240,225,240));
      label5.setFont(new java.awt.Font("Times New Roman", 1, 14));
      ll66.setForeground(new java.awt.Color(240,225,240));
      ll66.setFont(new java.awt.Font("Times New Roman", 1, 15));
      ll5.setForeground(new java.awt.Color(240,225,240));
      ll5.setFont(new java.awt.Font("Times New Roman", 1, 30));
      ll6.setForeground(new java.awt.Color(240,225,240));
      ll6.setFont(new java.awt.Font("Times New Roman", 1, 20));
      ll3.setFont(new java.awt.Font("Times New Roman", 1, 20));
      ll4.setFont(new java.awt.Font("Times New Roman", 1, 20));
      r1.setForeground(new java.awt.Color(240,225,240));
      r2.setForeground(new java.awt.Color(240,225,240));
      r3.setForeground(new java.awt.Color(240,225,240));
      r4.setForeground(new java.awt.Color(240,225,240));
      r5.setForeground(new java.awt.Color(240,225,240));
      r6.setForeground(new java.awt.Color(240,225,240));
      r7.setForeground(new java.awt.Color(240,225,240));
      r8.setForeground(new java.awt.Color(240,225,240));
      r9.setForeground(new java.awt.Color(240,225,240));
      r10.setForeground(new java.awt.Color(240,225,240));
      r11.setForeground(new java.awt.Color(240,225,240));
      cb1.setForeground(new java.awt.Color(240,225,240));
      l3.setForeground(new java.awt.Color(240,225,240));
      l4.setForeground(new java.awt.Color(240,225,240));
      l5.setForeground(new java.awt.Color(240,225,240));
      l6.setForeground(new java.awt.Color(240,225,240));
      l7.setForeground(new java.awt.Color(240,225,240));
      l8.setForeground(new java.awt.Color(240,225,240));
      l9.setForeground(new java.awt.Color(240,225,240));
      l10.setForeground(new java.awt.Color(240,225,240));
      l11.setForeground(new java.awt.Color(240,225,240));
      l12.setForeground(new java.awt.Color(240,225,240));
      l13.setForeground(new java.awt.Color(240,225,240));
      l14.setForeground(new java.awt.Color(240,225,240));
      l15.setForeground(new java.awt.Color(240,225,240));
      l01.setForeground(new java.awt.Color(240,225,240));
      l02.setForeground(new java.awt.Color(240,225,240));
      l03.setForeground(new java.awt.Color(240,225,240));
      r1.setOpaque(false);
      r2.setOpaque(false);
      r3.setOpaque(false);
      r4.setOpaque(false);
      r5.setOpaque(false);
      r6.setOpaque(false);
      r7.setOpaque(false);
      r8.setOpaque(false);
      r9.setOpaque(false);
      r10.setOpaque(false);
      r11.setOpaque(false);
      cb1.setOpaque(false);

	  //text field artificial placeholder
      tf2.setForeground(new java.awt.Color(204, 204, 204));
      tf2.setText("************");
      tf1.setForeground(new java.awt.Color(204, 204, 204));
      tf1.setText("Username ");





	   //frame 1
       lb1.setBounds(-5,187,405,40);
       lb2.setBounds(30,250,200,40);
       lb3.setBounds(30,320,200,40);
       tf1.setBounds(120,255,210,30);
       tf2.setBounds(120,325,210,30);
       b1.setBounds(30,400,100,40);
       b2.setBounds(250,400,100,40);
       logo.setBounds(90,15,220,160);
       f1.add(logo);
       f1.add(lb1);
       f1.add(lb2);
       f1.add(lb3);
       f1.add(tf1);
       f1.add(tf2);
       f1.add(b1);
       f1.add(b2);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setBounds(450,150,400,520);
       f1.setLayout(null);
       f1.setVisible(true);

           //frame 2
       	   l1.setBounds(130,25,60,50);
           l2.setBounds(130,55,300,50);
           l3.setBounds(50,130,250,50);
           l4.setBounds(25,170,300,50);
           l5.setBounds(40,210,300,50);
           l6.setBounds(85,250,300,50);
           l7.setBounds(85,290,300,50);
           l8.setBounds(25,330,300,50);
           l9.setBounds(32,370,300,50);
           l10.setBounds(21,410,300,50);
           l11.setBounds(22,450,300,50);
           l12.setBounds(38,490,300,50);
           l13.setBounds(60,530,300,50);
           l14.setBounds(10,570,300,50);
           l15.setBounds(10,610,300,50);
           t1.setBounds(160,140,200,30);
           t2.setBounds(160,180,200,30);
           b4.setBounds(550,36,70,30);
           b5.setBounds(628,36,80,30);
           b7.setBounds(385,180,80,30);
           c1.setBounds(160,220,120,30);
           c2.setBounds(295,220,60,30);
           c3.setBounds(370,220,95,30);
           t3.setBounds(160,260,120,30);
           r1.setBounds(160,300,65,30);
           r2.setBounds(223,300,80,30);
           c4.setBounds(160,340,120,30);
           c5.setBounds(295,340,60,30);
           c6.setBounds(370,340,95,30);
           c7.setBounds(160,380,120,30);
           c8.setBounds(295,380,60,30);
           c9.setBounds(370,380,95,30);
           r3.setBounds(160,420,65,30);
           r4.setBounds(223,420,80,30);
           t4.setBounds(160,460,200,30);
           t5.setBounds(160,500,200,30);
           c.setBounds(160,540,200,30);
           r5.setBounds(160,580,65,30);
           r6.setBounds(223,580,80,30);
           t6.setBounds(160,620,200,30);
           b8.setBounds(30,680,80,30);
           b9.setBounds(271,680,140,30);
           b10.setBounds(591,680,80,30);
           b11.setBounds(565,330,130,30);
		   save.setBounds(30,680,80,30);
           lb1D.setBounds(350,0,80,80);
           lb2T.setBounds(410,0,80,80);
           f2.add(lb1D);
           f2.add(lb2T);
           f2.add(b11);
           f2.add(b8);
           f2.add(b9);
           f2.add(b10);
           f2.add(c);
           f2.add(t6);
           f2.add(t5);
           f2.add(t4);
           f2.add(r6);
           f2.add(r5);
           f2.add(r2);
           f2.add(r1);
           f2.add(r3);
           f2.add(r4);
           f2.add(t3);
           f2.add(b7);
           f2.add(c1);
           f2.add(c2);
           f2.add(c3);
           f2.add(c4);
           f2.add(c5);
           f2.add(c6);
           f2.add(c7);
           f2.add(c8);
           f2.add(c9);
           f2.add(b5);
           f2.add(b4);
           f2.add(logo1);
           f2.add(l1);
           f2.add(l2);
           f2.add(l3);
           f2.add(l4);
           f2.add(l5);
           f2.add(l6);
           f2.add(l7);
           f2.add(l8);
           f2.add(l9);
           f2.add(l10);
           f2.add(l11);
           f2.add(l12);
           f2.add(l13);
           f2.add(l14);
           f2.add(l15);
           f2.add(t1);
           f2.add(t2);
           f2.add(save);
           save.setVisible(false);
           f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           f2.setBounds(250,0,760,770);
           f2.setLayout(null);
           b28.setVisible(false);


       //Log-in Button
       b1.addActionListener ((ActionEvent ee)->{{

       	   ll5.setBounds(130,25,60,50);
           ll6.setBounds(130,55,300,50);
           ll3.setBounds(270,130,300,50);
           ll4.setBounds(780,130,300,50);
           b12.setBounds(760,36,80,30);
           b13.setBounds(60,650,80,30);
           b7.setBounds(160,650,80,30);
           b15.setBounds(260,650,80,30);
           b16.setBounds(360,650,80,30);
           b17.setBounds(460,650,80,30);
           sc.setBounds(10,195,600,400);
           sc1.setBounds(650,358,300,360);
           lb3D.setBounds(470,0,80,80);
           lb4T.setBounds(530,0,80,80);
		   searcht1.setBounds(675,80,70,30);
		   b6.setBounds(760,80,80,30);
		   f5.add(searcht1);
		   f5.add(b6);
           f5.add(lb3D);
           f5.add(lb4T);
           f5.add(ll5);
           f5.add(ll6);
           f5.add(ll3);
           f5.add(ll4);
           f5.add(logo3);
           f5.add(b12);
           f5.add(b13);
           f5.add(b7);
           f5.add(b15);
           f5.add(b16);
           f5.add(logo5);
           f5.add(sc1);
           f5.add(b17);
           f5.add(sc);
           ta0.setText("     \n" +
"	Personal Information\n" +
"\n" +
" Prisonner \n" +
"\n" +
" Name :\n" +
"\n" +
" Date of Birth :\n" +
"\n" +
" Age :\n" +
"\n" +
" Sex : \n" +
"\n" +
" Entrance Date :\n" +
"\n" +
" Release Date :\n" +
"\n" +
" Security Level :\n" +
"\n" +
" Criminal Case :\n" +
"\n" +
" Nationality :\n" +
"\n" +
" Status :\n" +
"\n" +
" Attorney : \n" +
" \n" +
" \n" +
" \n" +
" \n" +
" ");
           ta0.setEditable(false);
           String a=tf1.getText();
           String b=tf2.getText();
           if(a.equals("Username     ")){
               a="";
           }
           if(b.equals("************")){
               b="";
           }

    try{
	Connection con=DriverManager.getConnection(dburl,userdb,passdb);

	//warden database
	String squery="select username,password from warden where username='"+a+"' and password='"+b+"'";
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(squery);

	//admin database
	String squery1="select username,password from admin where username='"+a+"' and password='"+b+"'";
	Statement st1=con.createStatement();
	ResultSet rs1=st1.executeQuery(squery1);

	//warden
	if(rs.next()){
           f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           f1.setVisible(false);
           f5.setBounds(150,0,980,800);
           f5.setLayout(null);
           f5.setVisible(true);
           b4.setVisible(true);
           JOptionPane.showMessageDialog(null,"Log-In Success");

	}

	//admin
	else if(rs1.next()){
		 f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           f1.setVisible(false);
           f5.setBounds(150,0,980,800);
           f5.setLayout(null);
           f5.setVisible(true);
           b4.setVisible(false);
           JOptionPane.showMessageDialog(null,"Log-In Success");
	}
		else if(a.equals("") || b.equals("")){
			JOptionPane.showMessageDialog(null,"Input Username or Password","Error",JOptionPane.ERROR_MESSAGE);
		}

	else{
		   b1.setEnabled(false);
           b2.setEnabled(false);
           tf1.setEnabled(false);
           tf2.setEnabled(false);
           JOptionPane.showMessageDialog(f1,"Invalid Username and Password !!!","Invalid",JOptionPane.ERROR_MESSAGE);
           b1.setEnabled(true);
           b2.setEnabled(true);
           tf1.setEnabled(true);
           tf2.setEnabled(true);
	}
	rs.close();
	st.close();
	rs1.close();
	st1.close();
	con.close();
}catch(Exception e){
	JOptionPane.showMessageDialog(null,e);
}
       }});


       //clear Button
       b2.addActionListener ((ActionEvent e)->{{
       	 int ooo=JOptionPane.showConfirmDialog(null,"Clear All?","Clear",JOptionPane.YES_NO_OPTION);
       	 if(ooo==0){
           tf2.setForeground(new java.awt.Color(204, 204, 204));
      tf2.setText("************");
      tf1.setForeground(new java.awt.Color(204, 204, 204));
      tf1.setText("Username ");
       	 }
       }});

          //combo boc month 1
          c1.addActionListener ((ActionEvent e)->{
          String a=c1.getSelectedItem().toString();
          int w=c2.getSelectedIndex();
          String b=c3.getSelectedItem().toString();
          int year=Integer.parseInt(b);
          c2.removeAllItems();
          if(a.equals("January")||a.equals("March")||a.equals("May")||a.equals("July")||a.equals("August")||a.equals("December")||a.equals("October")){
          for(int i=1;i<=31;i++){
          c2.addItem(i);
          }//end of for loop
          }//end of if
          else if(a.equals("February")){

          	boolean leap;
        //divisible by 4
        leap = (year % 4 == 0);
        //divisible by 4 and not 100
        leap = leap && (year % 100 != 0);
        //divisible by 4 and not 100 unless divisible by 400
        leap = leap || (year % 400 ==0);
          	if(leap==true){

             for(int i=1;i<=29;i++){
              c2.addItem(i);
               if(w>28){
          	w=0;
          	 c2.setSelectedIndex(w);
          	}//end of if
          	}//end of for loop
          	}//end of if
          	else{
          		 for(int i=1;i<=28;i++){
              c2.addItem(i);
              if(w>27){
          	w=0;
          	 c2.setSelectedIndex(w);
          	}//end of if
             }//end of for loop
          	}//end of else
          }//end of if else
          else {
             for(int i=1;i<=30;i++){
              c2.addItem(i);
              if(w==30){
          	w=0;
          	 c2.setSelectedIndex(w);
          }//end of if
          }//end of for loop
          }//end of else
          c2.setSelectedIndex(w);
          String months55[]={"January","February","March","April","May","June","July","August","September","October","November","December"};

		  int indexmon55=0;
		  for(int v55=0;v55<months55.length;v55++){
		  	if(a.equals(months55[v55])){
		  		indexmon55=v55+1;
		  		break;
		  	}//end if if
		  }//end of for loop

		//age auto compute
		int agee=0;
		boolean rr=true;
		while(rr==true){
	if(year<=c55){
		if(year<c55){
		agee++;
		year++;
		}
		if(year==c55){
		if(indexmon55<=a55&&w+1<=b55){
			agee++;
			year++;

		}
		else{
			break;
		}
	}

	}

	else{
		rr=false;
		break;
	}

}
agee=agee-1;
t3.setText(String.valueOf(agee));


       });
       c4.addActionListener ((ActionEvent e)->{
       	//combo boc month 1
          String a=c4.getSelectedItem().toString();
           int w=c5.getSelectedIndex();
          String b=c6.getSelectedItem().toString();
          int year=Integer.parseInt(b);

          c5.removeAllItems();

          if(a.equals("January")||a.equals("March")||a.equals("May")||a.equals("July")||a.equals("August")||a.equals("December")||a.equals("October")){
              for(int i=1;i<=31;i++){
              c5.addItem(i);
          }
          }
          else if(a.equals("February")){
          	boolean leap;
        //divisible by 4
        leap = (year % 4 == 0);
        //divisible by 4 and not 100
        leap = leap && (year % 100 != 0);
        //divisible by 4 and not 100 unless divisible by 400
        leap = leap || (year % 400 ==0);
          	if(leap==true){

             for(int i=1;i<=29;i++){
              c5.addItem(i);
              if(w>28){
          	w=0;
          	 c5.setSelectedIndex(w);
          	}
             }
          }
          	else{
          		 for(int i=1;i<=28;i++){
              c5.addItem(i);
              if(w>27){
          	w=0;
          	 c5.setSelectedIndex(w);
          	}

             }
          	}
          }
          else {
             for(int i=1;i<=30;i++){
              c5.addItem(i);
              if(w==30){
          	w=0;
          	 c5.setSelectedIndex(w);
          	}
          }
          }
          c5.setSelectedIndex(w);
       });
       c7.addActionListener ((ActionEvent e)->{
       	//combo boc month 2
          String a=c7.getSelectedItem().toString();
           int w=c8.getSelectedIndex();
          String b=c9.getSelectedItem().toString();


          if(b.equals("N/A")){
              b="1";
          }
          int year=Integer.parseInt(b);

          c8.removeAllItems();
           c8.addItem("N/A");
           if(a.equals("N/A")){
           	for(int i=1;i<=31;i++){
              c8.addItem(i);
          }
          c8.setSelectedIndex(0);
          c9.setSelectedIndex(0);
           }

          else if(a.equals("January")||a.equals("March")||a.equals("May")||a.equals("July")||a.equals("August")||a.equals("December")||a.equals("October")){
              for(int i=1;i<=31;i++){
              c8.addItem(i);
              c8.setSelectedItem(w);
          }
          }
          else if(a.equals("February")){
          	boolean leap;
        //divisible by 4
        leap = (year % 4 == 0);
        //divisible by 4 and not 100
        leap = leap && (year % 100 != 0);
        //divisible by 4 and not 100 unless divisible by 400
        leap = leap || (year % 400 ==0);
          	if(leap==true){

             for(int i=1;i<=29;i++){
              c8.addItem(i);
              if(w>29){
          	w=0;
          	 c8.setSelectedIndex(w);
          	}
             }
          }
          	else{
          		 for(int i=1;i<=28;i++){
              c8.addItem(i);
              if(w>28){
          	w=0;
          	 c8.setSelectedIndex(w);
          	}
             }
          	}
          }

          else {
             for(int i=1;i<=30;i++){
              c8.addItem(i);
              if(w==31){
          	w=0;
          	 c8.setSelectedIndex(w);
          	}
          }
          }



       });
       c10.addActionListener ((ActionEvent e)->{{
       	//combo boc month
          String a=c10.getSelectedItem().toString();
           int w=c11.getSelectedIndex();
          String b=c12.getSelectedItem().toString();
          int year=Integer.parseInt(b);

          c11.removeAllItems();

          if(a.equals("January")||a.equals("March")||a.equals("May")||a.equals("July")||a.equals("August")||a.equals("December")||a.equals("October")){
              for(int i=1;i<=31;i++){
              c11.addItem(i);
          }
          }
          else if(a.equals("February")){
          	boolean leap;
        //divisible by 4
        leap = (year % 4 == 0);
        //divisible by 4 and not 100
        leap = leap && (year % 100 != 0);
        //divisible by 4 and not 100 unless divisible by 400
        leap = leap || (year % 400 ==0);
          	if(leap==true){

             for(int i=1;i<=29;i++){
              c11.addItem(i);
              if(w>28){
          	w=0;
          	 c11.setSelectedIndex(w);
          	}
             }
          }
          	else{
          		 for(int i=1;i<=28;i++){
              c11.addItem(i);
              if(w>27){
          	w=0;
          	 c11.setSelectedIndex(w);
          	}
             }
          	}
          }

          else {
             for(int i=1;i<=30;i++){
              c11.addItem(i);
              if(w==30){
          	w=0;
          	 c2.setSelectedIndex(w);
          	}
          }
          }
          c11.setSelectedIndex(w);
       }});
       c13.addActionListener ((ActionEvent e)->{{
       	//combo boc month 1
          String a=c13.getSelectedItem().toString();
           int w=c14.getSelectedIndex();
          String b=c15.getSelectedItem().toString();
          int year=Integer.parseInt(b);



          c14.removeAllItems();

          if(a.equals("January")||a.equals("March")||a.equals("May")||a.equals("July")||a.equals("August")||a.equals("December")||a.equals("October")){
              for(int i=1;i<=31;i++){
              c14.addItem(i);
          }
          }
          else if(a.equals("February")){
          	boolean leap;
        //divisible by 4
        leap = (year % 4 == 0);
        //divisible by 4 and not 100
        leap = leap && (year % 100 != 0);
        //divisible by 4 and not 100 unless divisible by 400
        leap = leap || (year % 400 ==0);
          	if(leap==true){

             for(int i=1;i<=29;i++){
              c14.addItem(i);
              if(w>28){
          	w=0;
          	 c14.setSelectedIndex(w);
          	}
             }
          }
          	else{
          		 for(int i=1;i<=28;i++){
              c14.addItem(i);
              if(w>27){
          	w=0;
          	 c14.setSelectedIndex(w);
          	}
             }
          	}
          }


          else {
             for(int i=1;i<=30;i++){
              c14.addItem(i);
              if(w==30){
          	w=0;
          	 c14.setSelectedIndex(w);
          	}
          }
          }
c14.setSelectedIndex(w);
       }});
        c2.addActionListener ((ActionEvent e)->{{
       	String a=c1.getSelectedItem().toString();
         int w=c2.getSelectedIndex();
          String b=c3.getSelectedItem().toString();
          int year=Integer.parseInt(b);

          String months55[]={"January","February","March","April","May","June","July","August","September","October","November","December"};

		  int indexmon55=0;

		  for(int v55=0;v55<months55.length;v55++){
		  	if(a.equals(months55[v55])){
		  		indexmon55=v55+1;
		  		break;
		  	}
		  }
int agee=0;
boolean rr=true;
while(rr==true){
	if(year<=c55){
		if(year<c55){
		agee++;
		year++;
		}
		if(year==c55){
		if(indexmon55<=a55&&w+1<=b55){
			agee++;
			year++;

		}
		else{
			break;
		}
	}

	}

	else{
		rr=false;
		break;
	}

}
agee=agee-1;
t3.setText(String.valueOf(agee));
       }});
       c3.addActionListener ((ActionEvent e)->{{
       	String a=c1.getSelectedItem().toString();
         int w=c2.getSelectedIndex();
          String b=c3.getSelectedItem().toString();
          int year=Integer.parseInt(b);

           if(w==28){
          	w=0;
          	 c2.setSelectedIndex(w);
          	}

         if(a.equals("February")){
         	c2.removeAllItems();
          	boolean leap;
        //divisible by 4
        leap = (year % 4 == 0);
        //divisible by 4 and not 100
        leap = leap && (year % 100 != 0);
        //divisible by 4 and not 100 unless divisible by 400
        leap = leap || (year % 400 ==0);
          	if(leap==true){

             for(int i=1;i<=29;i++){
              c2.addItem(i);
             }
          }
          	else{
          		 for(int i=1;i<=28;i++){
              c2.addItem(i);
             }
          	}
          }
         c2.setSelectedIndex(w);

          String months55[]={"January","February","March","April","May","June","July","August","September","October","November","December"};

		  int indexmon55=0;

		  for(int v55=0;v55<months55.length;v55++){
		  	if(a.equals(months55[v55])){
		  		indexmon55=v55+1;
		  		break;
		  	}
		  }
int agee=0;
boolean rr=true;
while(rr==true){
	if(year<=c55){
		if(year<c55){
		agee++;
		year++;
		}
		if(year==c55){
		if(indexmon55<=a55&&w+1<=b55){
			agee++;
			year++;

		}
		else{
			break;
		}
	}

	}

	else{
		rr=false;
		break;
	}

}
agee=agee-1;
t3.setText(String.valueOf(agee));
       }});
       c6.addActionListener ((ActionEvent e)->{{
       	String a=c4.getSelectedItem().toString();
         int w=c5.getSelectedIndex();
          String b=c6.getSelectedItem().toString();
                int year=Integer.parseInt(b);

           if(w==28){
          	w=0;
          	 c5.setSelectedIndex(w);
          	}

         if(a.equals("February")){
         	c5.removeAllItems();

          	boolean leap;
        //divisible by 4
        leap = (year % 4 == 0);
        //divisible by 4 and not 100
        leap = leap && (year % 100 != 0);
        //divisible by 4 and not 100 unless divisible by 400
        leap = leap || (year % 400 ==0);
          	if(leap==true){

             for(int i=1;i<=29;i++){
              c5.addItem(i);
             }
          }
          	else{
          		 for(int i=1;i<=28;i++){
              c5.addItem(i);
             }
          	}
          }
         c5.setSelectedIndex(w);
       }});


       c9.addActionListener ((ActionEvent e)->{{
       	String a=c7.getSelectedItem().toString();
         int w=c8.getSelectedIndex();
          String b=c9.getSelectedItem().toString();
          if(w==29){
          	w=0;
          	 c8.setSelectedIndex(w);
          	}

          if(b.equals("N/A")){
                    b="1";
                    c8.removeAllItems();
                    c8.addItem("N/A");
                    if(a.equals("January")||a.equals("March")||a.equals("May")||a.equals("July")||a.equals("August")||a.equals("December")||a.equals("October")){
              for(int i=1;i<=31;i++){
              c8.addItem(i);
          }
                }
                 else {
             for(int i=1;i<=30;i++){
              c8.addItem(i);
          }}
			w=0;
			c7.setSelectedIndex(0);
          	 c8.setSelectedIndex(w);
          }



          int year=Integer.parseInt(b);

         if(a.equals("February")){
c8.removeAllItems();
                c8.addItem("N/A");
          	boolean leap;
        //divisible by 4
        leap = (year % 4 == 0);
        //divisible by 4 and not 100
        leap = leap && (year % 100 != 0);
        //divisible by 4 and not 100 unless divisible by 400
        leap = leap || (year % 400 ==0);
          	if(leap==true){

             for(int i=1;i<=29;i++){
              c8.addItem(i);
             }
          }
          	else{
          		 for(int i=1;i<=28;i++){
              c8.addItem(i);
             }
          	}
          }

	c8.setSelectedIndex(w);


       }});
       c12.addActionListener ((ActionEvent e)->{{
       	String a=c10.getSelectedItem().toString();
         int w=c11.getSelectedIndex();
          String b=c12.getSelectedItem().toString();
          int year=Integer.parseInt(b);
          if(w==28){
          	w=0;
          	 c11.setSelectedIndex(w);
          	}

         if(a.equals("February")){
         	c11.removeAllItems();
          	boolean leap;
        //divisible by 4
        leap = (year % 4 == 0);
        //divisible by 4 and not 100
        leap = leap && (year % 100 != 0);
        //divisible by 4 and not 100 unless divisible by 400
        leap = leap || (year % 400 ==0);
          	if(leap==true){

             for(int i=1;i<=29;i++){
              c11.addItem(i);
             }
          }
          	else{
          		 for(int i=1;i<=28;i++){
              c11.addItem(i);
             }
          	}
          }
         c11.setSelectedIndex(w);
       }});

       c15.addActionListener ((ActionEvent e)->{{
       	String a=c13.getSelectedItem().toString();
         int w=c14.getSelectedIndex();
          String b=c15.getSelectedItem().toString();
          int year=Integer.parseInt(b);

          if(w==28){
          	w=0;
          	 c14.setSelectedIndex(w);
          	}

         if(a.equals("February")){
         	c14.removeAllItems();
          	boolean leap;
        //divisible by 4
        leap = (year % 4 == 0);
        //divisible by 4 and not 100
        leap = leap && (year % 100 != 0);
        //divisible by 4 and not 100 unless divisible by 400
        leap = leap || (year % 400 ==0);
          	if(leap==true){

             for(int i=1;i<=29;i++){
              c14.addItem(i);
             }
          }
          	else{
          		 for(int i=1;i<=28;i++){
              c14.addItem(i);
             }
          	}
          }

         c14.setSelectedIndex(w);
       }});

        b4.addActionListener ((ActionEvent e)->{{
          //sign up button frame 2

          b9.setBounds(271,680,140,30);
           b28.setVisible(false);
           b29.setVisible(false);

           t2.setEditable(true);
           c1.setEnabled(true);
           c2.setEnabled(true);
           c3.setEnabled(true);
           t3.setEditable(false);
           r1.setEnabled(true);
           r2.setEnabled(true);
           c4.setEnabled(true);
           c5.setEnabled(true);
           c6.setEnabled(true);
           c7.setEnabled(true);
           c8.setEnabled(true);
           c9.setEnabled(true);
           r3.setEnabled(true);
           r4.setEnabled(true);
           t4.setEditable(true);
           t5.setEditable(true);
           c.setEnabled(true);
           r5.setEnabled(true);
           r6.setEnabled(true);
           t6.setEditable(true);
           b8.setEnabled(true);
           b10.setEnabled(true);
           b11.setEnabled(true);

          t1.setText("");
           t2.setText("");
           c1.setSelectedIndex(0);
           c2.setSelectedIndex(0);
           c3.setSelectedIndex(0);;
           t3.setText("");
           r1.setSelected(false);
           r2.setSelected(false);
           c4.setSelectedIndex(0);
           c5.setSelectedIndex(0);
           c6.setSelectedIndex(0);
           c7.setSelectedIndex(0);
           c8.setSelectedIndex(0);
           c9.setSelectedIndex(0);
           r3.setSelected(false);
           r4.setSelected(false);
           t4.setText("");
           t5.setText("");
           c.setSelectedIndex(0);
           r5.setSelected(false);
           r6.setSelected(false);
           t6.setText("");
           t6.setEditable(false);

          ll55.setBounds(130,25,300,50);
          ll66.setBounds(130,60,300,50);
          ll7.setBounds(-5,135,480,50);
          ll8.setBounds(62,200,300,50);
          ll9.setBounds(55,240,300,50);
          ll10.setBounds(37,280,300,50);
          ll11.setBounds(20,400,300,50);
          ll12.setBounds(30,440,300,50);
          ll13.setBounds(30,480,300,50);
          t7.setBounds(135,211,304,30);
          t8.setBounds(135,251,304,30);
          r7.setBounds(135,291,200,30);
          r8.setBounds(135,331,200,30);
          r9.setBounds(135,371,200,30);
          t9.setBounds(135,451,304,30);
          t10.setBounds(135,491,304,30);
          cb1.setBounds(150,540,250,30);
          b18.setBounds(40,590,80,30);
          b19.setBounds(197,590,80,30);
          b199.setBounds(352,590,80,30);
          c10.setBounds(135,407,120,30);
          c11.setBounds(270,407,60,30);
          c12.setBounds(345,407,95,30);

          lb5D.setBounds(320,0,80,80);
          lb6T.setBounds(380,0,80,80);



          f3.add(lb5D);
          f3.add(lb6T);


          f3.add(logo7);
          f3.add(ll55);
          f3.add(ll66);
          f3.add(ll7);
          f3.add(ll8);
          f3.add(ll9);
          f3.add(ll10);
          f3.add(ll11);
          f3.add(ll12);
          f3.add(ll13);
          f3.add(t7);
          f3.add(t8);
          f3.add(t9);
          f3.add(t10);
          f3.add(r7);
          f3.add(r8);
          f3.add(r9);
          f3.add(cb1);
          f3.add(b18);
          f3.add(b19);
          f3.add(b199);
          f3.add(c10);
          f3.add(c11);
          f3.add(c12);


          f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          f3.setBounds(425,50,475,687);
          f3.setLayout(null);
          f3.setVisible(true);
          f2.setVisible(false);

          save.setVisible(false);

	       b8.setVisible(true);


       }});
        b5.addActionListener ((ActionEvent e)->{{
        	//log out frame 2 log out
                int a=JOptionPane.showConfirmDialog(f3,"Are you sure to log out ?","Log-out",JOptionPane.YES_NO_OPTION);
                if(a==0){
                	logo2.setIcon(null);

                b29.setVisible(false);
                b9.setBounds(271,680,140,30);
           b28.setVisible(false);

                 t2.setEditable(true);
           c1.setEnabled(true);
           c2.setEnabled(true);
           c3.setEnabled(true);
           t3.setEditable(false);
           r1.setEnabled(true);
           r2.setEnabled(true);
           c4.setEnabled(true);
           c5.setEnabled(true);
           c6.setEnabled(true);
           c7.setEnabled(true);
           c8.setEnabled(true);
           c9.setEnabled(true);
           r3.setEnabled(true);
           r4.setEnabled(true);
           t4.setEditable(true);
           t5.setEditable(true);
           c.setEnabled(true);
           r5.setEnabled(true);
           r6.setEnabled(true);
           t6.setEditable(true);
           b8.setEnabled(true);
           b10.setEnabled(true);
           b11.setEnabled(true);

           t1.setText("");
           t2.setText("");
           c1.setSelectedIndex(0);
           c2.setSelectedIndex(0);
           c3.setSelectedIndex(0);;
           t3.setText("");
           r1.setSelected(false);
           r2.setSelected(false);
           c4.setSelectedIndex(0);
           c5.setSelectedIndex(0);
           c6.setSelectedIndex(0);
           c7.setSelectedIndex(0);
           c8.setSelectedIndex(0);
           c9.setSelectedIndex(0);
           r3.setSelected(false);
           r4.setSelected(false);
           t4.setText("");
           t5.setText("");
           c.setSelectedIndex(0);
           r5.setSelected(false);
           r6.setSelected(false);
           t6.setText("");
           t6.setEditable(false);


      tf1.setForeground(new java.awt.Color(204, 204, 204));
      tf2.setForeground(new java.awt.Color(204, 204, 204));
      tf1.setText("Username ");
      tf2.setText("************");


           f2.setVisible(false);
           f1.setVisible(true);

           save.setVisible(false);

	       b8.setVisible(true);
                }
       }});
        b6.addActionListener ((ActionEvent e)->{{
         //search prisoner form
cellnumber="";
         String a=searcht1.getText();
         searcht1.setText("");
         boolean found=false;
         String name1="";
         for(int tyu=1;tyu<=5;tyu++){

         Statement st=null;
          name1="";
try{

	Connection con=DriverManager.getConnection(dburl,userdb,passdb);
	String squery="select id,name,bmon,bdate,byear,age,sex,emon,edate,eyear,rmon,rdate,ryear,level,cases,dura,stat,type,atty,photo,cell from cell"+tyu+" where id='"+a+"'";

	Statement st1111=con.createStatement();
	ResultSet rs111=st1111.executeQuery(squery);


	while(rs111.next()){



		int id1=rs111.getInt("id");
		 name1=rs111.getString("name");
		String bmon1=rs111.getString("bmon");
		String bdate1=rs111.getString("bdate");
		String byear1=rs111.getString("byear");
		String age1=rs111.getString("age");
		String sex1=rs111.getString("sex");
		String emon1=rs111.getString("emon");
		String edate1=rs111.getString("edate");
		String eyear1=rs111.getString("eyear");
		String rmon1=rs111.getString("rmon");
		String rdate1=rs111.getString("rdate");
		String ryear1=rs111.getString("ryear");
		String level1=rs111.getString("level");
		String cases1=rs111.getString("cases");
		String dura1=rs111.getString("dura");
		String stat1=rs111.getString("stat");
		String type1=rs111.getString("type");
		String atty1=rs111.getString("atty");
		String cellss=rs111.getString("cell");

		cellnumber=cellss;

	File file12=new File("pic"+id1+photoint+".jpg");
			photoint++;
FileOutputStream output2=new FileOutputStream(file12);
icon0=file12.getAbsolutePath();
InputStream input1 =rs111.getBinaryStream("photo");
byte[] buffer1=new byte[1024];
while(input1.read(buffer1)>0){
	output2.write(buffer1);


}
file=file12;
 no=icon0;
photo1=new ImageIcon(no);
 logo2.setIcon(photo1);

 output2.close();
 input1.close();
icon0="";

		t1.setText(String.valueOf(id1));
		t2.setText(name1);
		t3.setText(age1);
		t4.setText(cases1);
		t5.setText(dura1);
		t6.setText(atty1);


		c1.setSelectedItem(bmon1);
		c2.setSelectedItem(Integer.parseInt(bdate1));
		c3.setSelectedItem(Integer.parseInt(byear1));


		String r111=r1.getText();
		String r222=r2.getText();

		String r333=r3.getText();
		String r444=r4.getText();
		String r555=r5.getText();
		String r666=r6.getText();


		if(r111.equals(sex1)){
			r1.setSelected(true);
			r2.setSelected(false);
		}
		if(r222.equals(sex1)){
			r2.setSelected(true);
			r1.setSelected(false);
		}
		if(r333.equals(level1)){
			r3.setSelected(true);
			r4.setSelected(false);
		}
		if(r444.equals(level1)){
			r4.setSelected(true);
			r3.setSelected(false);
		}
		if(r555.equals(type1)){
			r5.setSelected(true);
			r6.setSelected(false);
		}
		if(r666.equals(type1)){
			r6.setSelected(true);
			r5.setSelected(false);
		}




		c4.setSelectedItem(emon1);
		c5.setSelectedItem(Integer.parseInt(edate1));
		c6.setSelectedItem(Integer.parseInt(eyear1));




		c7.setSelectedItem(rmon1);

if(rdate1.equals("N/A")){
	c8.setSelectedItem(rdate1);
}
else{
	c8.setSelectedItem(Integer.parseInt(rdate1));
}

if(ryear1.equals("N/A")){
	c9.setSelectedItem(ryear1);
}
else{
	c9.setSelectedItem(Integer.parseInt(ryear1));
}




		c.setSelectedItem(stat1);


if(!(name1.equals(""))){
	found=true;
}


	}


con.close();
	st1111.close();
	rs111.close();
}catch(Exception eeee){
	JOptionPane.showMessageDialog(null,eeee);
}

      	if(found==true){



      				   t1.setEditable(false);
           t2.setEditable(false);
           c1.setEnabled(false);
           c2.setEnabled(false);
           c3.setEnabled(false);
           t3.setEditable(false);
           r1.setEnabled(false);
           r2.setEnabled(false);
           c4.setEnabled(false);
           c5.setEnabled(false);
           c6.setEnabled(false);
           c7.setEnabled(false);
           c8.setEnabled(false);
           c9.setEnabled(false);
           r3.setEnabled(false);
           r4.setEnabled(false);
           t4.setEditable(false);
           t5.setEditable(false);
           c.setEnabled(false);
           r5.setEnabled(false);
           r6.setEnabled(false);
           t6.setEditable(false);
           b8.setEnabled(false);
           b10.setEnabled(false);
           b11.setEnabled(false);

           save.setVisible(true);


           b9.setBounds(190,680,140,30);
           b28.setBounds(370,680,140,30);
           f2.add(b28);
           b28.setVisible(true);



           f2.setVisible(true);
           f5.setVisible(false);

           b8.setVisible(false);
           save.setEnabled(false);
           save.setVisible(true);
 	break;
 }
         }//loop





if(!(name1.equals(""))){

	      		logo5.setIcon(null);

	      		 ta0.setText("     \n" +
"	Personal Information\n" +
"\n" +
" Prisonner \n" +
"\n" +
" Name :\n" +
"\n" +
" Date of Birth :\n" +
"\n" +
" Age :\n" +
"\n" +
" Sex : \n" +
"\n" +
" Entrance Date :\n" +
"\n" +
" Release Date :\n" +
"\n" +
" Security Level :\n" +
"\n" +
" Criminal Case :\n" +
"\n" +
" Nationality :\n" +
"\n" +
" Status :\n" +
"\n" +
" Attorney : \n" +
" \n" +
" \n" +
" \n" +
" \n" +
" ");

f2.setVisible(true);
f5.setVisible(false);

	 }
	 else{
         	JOptionPane.showMessageDialog(null,"No Prisoner Found");


	 }






       }});






        b7.addActionListener ((ActionEvent e)->{{
           //release button frame 5

searcht1.setText("");

  logo5.setIcon(null);
   ta0.setText("     \n" +
"	Personal Information\n" +
"\n" +
" Prisonner \n" +
"\n" +
" Name :\n" +
"\n" +
" Date of Birth :\n" +
"\n" +
" Age :\n" +
"\n" +
" Sex : \n" +
"\n" +
" Entrance Date :\n" +
"\n" +
" Release Date :\n" +
"\n" +
" Security Level :\n" +
"\n" +
" Criminal Case :\n" +
"\n" +
" Nationality :\n" +
"\n" +
" Status :\n" +
"\n" +
" Attorney : \n" +
" \n" +
" \n" +
" \n" +
" \n" +
" ");

           l01.setBounds(130,25,300,50);
           l02.setBounds(130,55,300,50);
           l03.setBounds(40,140,300,50);
           c13.setBounds(160,150,120,30);
           c14.setBounds(295,150,60,30);
           c15.setBounds(370,150,95,30);
           b20.setBounds(370,215,95,30);
           sc2.setBounds(32,270,437,200);
           b21.setBounds(30,500,95,30);
           b22.setBounds(373,500,95,30);




           f4.add(logo9);
           f4.add(sc2);
           f4.add(c13);
           f4.add(c14);
           f4.add(c15);
           f4.add(b20);
           f4.add(b21);
           f4.add(b22);
           f4.add(l01);
           f4.add(l02);
           f4.add(l03);



           f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           f4.setBounds(390,100,530,600);
           f4.setLayout(null);
           f4.setVisible(true);
           f5.setVisible(false);



       }});
       b8.addActionListener ((ActionEvent ee)->{{
           //submit prisonner form
           int a=JOptionPane.showConfirmDialog(f3,"Are you sure to submit ?","Submit",JOptionPane.YES_NO_OPTION);
           if(a==0){


          String idd=t1.getText();
          String name=t2.getText();
          String bmon= c1.getSelectedItem().toString();
          String bdate =c2.getSelectedItem().toString();
          String byear =c3.getSelectedItem().toString();
          String age =t3.getText();
          String emon =c4.getSelectedItem().toString();
          String edate =c5.getSelectedItem().toString();
          String eyear =c6.getSelectedItem().toString();
          String rmon =c7.getSelectedItem().toString();
          String rdate =c8.getSelectedItem().toString();
          String ryear =c9.getSelectedItem().toString();
          String cases =t4.getText();
          String dura =t5.getText();
          String stats=c.getSelectedItem().toString();
          String atty =t6.getText();

		  String sex="";
		  String level="";
		  String type="";

          if(r1.isSelected()){
          sex =r1.getText();
          }
          if(r2.isSelected()){

          sex =r2.getText();
          }
          if(r3.isSelected()){

          level =r3.getText();

          }
          if(r4.isSelected()){

          level =r4.getText();

          }
          if(r5.isSelected()){

          type =r5.getText();

          }
          if(r6.isSelected()){

          type=r6.getText();


          }
          //verification
          boolean under=false;
          int vage=Integer.parseInt(age);
          if(vage<18){
          	under=true;
          }

          boolean ready=true;

          int invalid1=c7.getSelectedIndex();
          int invalid2=c8.getSelectedIndex();
          int invalid3=c9.getSelectedIndex();

          boolean invalid11=false;
          boolean invalid22=false;
          boolean invalid33=false;

          boolean invalid111=false;
          boolean invalid222=false;
          boolean invalid333=false;

          invalid11=invalid1!=0 && invalid2==0 && invalid3==0;
          invalid22=invalid1==0 && invalid2!=0 && invalid3==0;
          invalid33=invalid1==0 && invalid2==0 && invalid3!=0;

          invalid111=(invalid1!=0 && invalid2!=0 && invalid3==0);
          invalid222=invalid1==0 && invalid2!=0 && invalid3!=0;
          invalid333=invalid1!=0 && invalid2==0 && invalid3!=0;

          boolean notcapable=true;
           String months1[]={"January","February","March","April","May","June","July","August","September","October","November","December"};

		  int indexmon0=-2;
		  int indexmon02=-1;

		  for(int v7=0;v7<months1.length;v7++){
		  	if(emon.equals(months1[v7])){
		  		indexmon0=v7;
		  		break;
		  	}
		  }

		  for(int v71=0;v71<months1.length;v71++){
		  	if(rmon.equals(months1[v71])){
		  		indexmon02=v71;
		  		break;
		  	}
		  	if(rmon.equals("N/A")){
		  		indexmon02=110;
		  		break;
		  	}
		  }

		  String rrdate="";
		  String rryear="";

		  if(rdate.equals("N/A")){
		  	 rrdate="110";
		  }
		  else{
		  	rrdate=rdate;
		  }
		  if(ryear.equals("N/A")){
		  	 rryear="1101111";
		  }
		  else{

		  	rryear=ryear;
		  }


		  int eyear1=Integer.parseInt(eyear);
		  int ryear1=Integer.parseInt(rryear);
		  int edate1=Integer.parseInt(edate);
		  int rdate1=Integer.parseInt(rrdate);


          while(notcapable==true){

if(eyear1<ryear1){
	break;
}

else if(ryear1==eyear1){
if(indexmon0<indexmon02){
	break;
}
else if(indexmon0==indexmon02){
	if(edate1<rdate1){
		break;
	}
	else{
		notcapable=false;
		break;
	}
}
else{
	notcapable=false;
	break;
}

}

else{
	notcapable=false;
	break;
}

}





          if(name.equals("")){
          	JOptionPane.showMessageDialog(null,"Input Name","Input Data",JOptionPane.ERROR_MESSAGE);
          	ready=false;
          }
          else if(under==true){
          	JOptionPane.showMessageDialog(null,"Prisoner must be 18 above to detained  !!!","Invalid Age",JOptionPane.ERROR_MESSAGE);
          	ready=false;
          }
          else if(no.equals("")){
          	JOptionPane.showMessageDialog(null,"Select Prisoner Picture","Select",JOptionPane.ERROR_MESSAGE);
          	ready=false;
          }
          else if(invalid11==true||invalid22==true||invalid33==true||invalid333==true||invalid222==true||invalid111==true||notcapable==false){
          	JOptionPane.showMessageDialog(null,"Invalid Release Date","Invalid",JOptionPane.ERROR_MESSAGE);
          	ready=false;
          }


          else if(sex.equals("")){
          	JOptionPane.showMessageDialog(null,"Select Gender","Select Data",JOptionPane.ERROR_MESSAGE);
        ready=false;
          }
          else if(cases.equals("")){
          	JOptionPane.showMessageDialog(null,"Input Case","Input Data",JOptionPane.ERROR_MESSAGE);
         ready=false;
          }
          else if(dura.equals("")){
          	JOptionPane.showMessageDialog(null,"Input Nationality","Input Data",JOptionPane.ERROR_MESSAGE);
         ready=false;
          }
          else if(level.equals("")){
          	JOptionPane.showMessageDialog(null,"Select Security Level","Select Data",JOptionPane.ERROR_MESSAGE);
         ready=false;
          }
          else if(stats.equals("")){
          	JOptionPane.showMessageDialog(null,"Input Status","Input Data",JOptionPane.ERROR_MESSAGE);
         ready=false;
          }

          else if(type.equals("")){
          	JOptionPane.showMessageDialog(null,"Select Type of Atty.","Select Data",JOptionPane.ERROR_MESSAGE);
ready=false;
          }
          else if(atty.equals("")){
          	JOptionPane.showMessageDialog(null,"Input Atty's Name","Input Data",JOptionPane.ERROR_MESSAGE);
         ready=false;
          }

		if(ready==true){

			//database

boolean inserted=false;
		for(int oy=1;oy<=5;oy++){

int countcell=0;
boolean levelcell=true;


				try{
	Connection con=DriverManager.getConnection(dburl,userdb,passdb);
	String squery1112="select level from cell"+oy+" ";
	Statement st1112=con.createStatement();
	ResultSet rs1112=st1112.executeQuery(squery1112);

	while(rs1112.next()){
		String dblevel=rs1112.getString("level");
		if(dblevel.equals("")){
		}
		else{
		countcell++;
		}
		if(!(dblevel.equals(level))){
			levelcell=false;
		}
		if(countcell>39){
			levelcell=false;
		}
	}
	con.close();



	if(levelcell==true){

		//insert in cell
PreparedStatement st=null;

try{
	Connection con44=DriverManager.getConnection(dburl,userdb,passdb);


	String squery="insert into cell"+oy+"(id,name,bmon,bdate,byear,age,sex,emon,edate,eyear,rmon,rdate,ryear,level,cases,dura,stat,type,atty,photo)value('"+idd+"','"+name+"','"+bmon+"','"+bdate+"','"+byear+"','"+age+"','"+sex+"','"+emon+"','"+edate+"','"+eyear+"','"+rmon+"','"+rdate+"','"+ryear+"','"+level+"','"+cases+"','"+dura+"','"+stats+"','"+type+"','"+atty+"',?)";
	st=con44.prepareStatement(squery);
	FileInputStream fin = new FileInputStream(file);
	st.setBinaryStream(1,fin);
	st.executeUpdate();


fin.close();
st.close();
con44.close();
}catch(Exception e6){
	JOptionPane.showMessageDialog(null,e6);
}




	// inserted in cell
		inserted=true;
		break;
	}//if true

	st1112.close();
	rs1112.close();

	if(oy==5&&inserted==false){
		JOptionPane.showMessageDialog(null,"Prison Cells reached it's limit","Invalid",JOptionPane.WARNING_MESSAGE);
	}
}catch(Exception eaa){
JOptionPane.showMessageDialog(null,eaa);
}
			}//end of loop













//table update

if(inserted==true){
int countts=tmodel.getRowCount();
               while(countts>0){
               	tmodel.removeRow(0);
               	countts--;
               }
for(int y2=1;y2<=5;y2++){
               try{

Connection con21b1=DriverManager.getConnection(dburl,userdb,passdb);



	String squery111b1="select id,name,cases,cell from cell"+y2+" ";
	Statement st111b1=con21b1.createStatement();
	ResultSet rs111b1=st111b1.executeQuery(squery111b1);

	while(rs111b1.next()){
		int id1s1=rs111b1.getInt("id");
		String name1s1=rs111b1.getString("name");
		String cases11s1=rs111b1.getString("cases");
		String cel1s1=rs111b1.getString("cell");

		String okiey11[]={String.valueOf(id1s1),name1s1,cases11s1,cel1s1};
		tmodel.addRow(okiey11);
	}


	con21b1.close();

	st111b1.close();
	rs111b1.close();



       }catch(Exception eee1){
       	JOptionPane.showMessageDialog(null,eee1);
       }
               }
                t2.setText("");
           c1.setSelectedIndex(0);
           c2.setSelectedIndex(0);
           c3.setSelectedIndex(0);;
           t3.setText("");
           r1.setSelected(false);
           r2.setSelected(false);
           c4.setSelectedIndex(0);
           c5.setSelectedIndex(0);
           c6.setSelectedIndex(0);
           c7.setSelectedIndex(0);
           c8.setSelectedIndex(0);
           c9.setSelectedIndex(0);
           r3.setSelected(false);
           r4.setSelected(false);
           t4.setText("");
           t5.setText("");
           c.setSelectedIndex(0);
           r5.setSelected(false);
           r6.setSelected(false);
           t6.setText("");
           t6.setEditable(false);



          b9.setBounds(271,680,140,30);
          b29.setVisible(false);

           f5.setVisible(true);
           f2.setVisible(false);

           JOptionPane.showMessageDialog(null,"Submit Sucessfully","Sucess",JOptionPane.INFORMATION_MESSAGE);
			no="";
           file=null;


}//inserted




           }
           }

           save.setEnabled(false);
           save.setVisible(false);

       }});
       b9.addActionListener ((ActionEvent e)->{{
           //show record frame 2

           no="";
           file=null;

           logo2.setIcon(null);

           b29.setVisible(false);
           b9.setBounds(271,680,140,30);
           b28.setVisible(false);

            t2.setEditable(true);
           c1.setEnabled(true);
           c2.setEnabled(true);
           c3.setEnabled(true);
           t3.setEditable(false);
           r1.setEnabled(true);
           r2.setEnabled(true);
           c4.setEnabled(true);
           c5.setEnabled(true);
           c6.setEnabled(true);
           c7.setEnabled(true);
           c8.setEnabled(true);
           c9.setEnabled(true);
           r3.setEnabled(true);
           r4.setEnabled(true);
           t4.setEditable(true);
           t5.setEditable(true);
           c.setEnabled(true);
           r5.setEnabled(true);
           r6.setEnabled(true);
           t6.setEditable(true);
           b8.setEnabled(true);
           b10.setEnabled(true);
           b11.setEnabled(true);

           t1.setText("");
           t2.setText("");
           c1.setSelectedIndex(0);
           c2.setSelectedIndex(0);
           c3.setSelectedIndex(0);;
           t3.setText("");
           r1.setSelected(false);
           r2.setSelected(false);
           c4.setSelectedIndex(0);
           c5.setSelectedIndex(0);
           c6.setSelectedIndex(0);
           c7.setSelectedIndex(0);
           c8.setSelectedIndex(0);
           c9.setSelectedIndex(0);
           r3.setSelected(false);
           r4.setSelected(false);
           t4.setText("");
           t5.setText("");
           c.setSelectedIndex(0);
           r5.setSelected(false);
           r6.setSelected(false);
           t6.setText("");
           t6.setEditable(false);

           save.setVisible(false);
			b8.setVisible(true);

    	   f5.setVisible(true);
           f2.setVisible(false);





       }});
       b10.addActionListener ((ActionEvent e)->{{
         //clear frame 2 prisoner form
         int a=JOptionPane.showConfirmDialog(f2,"Are you sure to clear all ?","Clear All",JOptionPane.YES_NO_OPTION);
         if(a==0){

		no="";
         logo2.setIcon(null);
           t2.setText("");
           c1.setSelectedIndex(0);
           c2.setSelectedIndex(0);
           c3.setSelectedIndex(0);;
           r1.setSelected(false);
           r2.setSelected(false);
           c4.setSelectedIndex(0);
           c5.setSelectedIndex(0);
           c6.setSelectedIndex(0);
           c7.setSelectedIndex(0);
           c8.setSelectedIndex(0);
           c9.setSelectedIndex(0);
           r3.setSelected(false);
           r4.setSelected(false);
           t4.setText("");
           t5.setText("");
           c.setSelectedIndex(0);
           r5.setSelected(false);
           r6.setSelected(false);
           t6.setText("");
           t6.setEditable(false);
         }

       }});

        b11.addActionListener ((ActionEvent ee)->{{
           //add photo

JFileChooser fc=new JFileChooser();
           fc.setCurrentDirectory(new File(System.getProperty("user.home")));
           fc.setDialogTitle("Prisoner Photo");
           if(fc.showOpenDialog(b11)==JFileChooser.APPROVE_OPTION){
           }
           file=fc.getSelectedFile();
           no=fc.getSelectedFile().getAbsolutePath();
           if(!(no.equals(""))){
           photo1=new ImageIcon(no);
 logo2.setIcon(photo1);
           }
       }});



       logo2.setBounds(550,130,160,160);

logo2.setBorder(BorderFactory.createEtchedBorder());
f2.add(logo2);


        b12.addActionListener ((ActionEvent e)->{{
           //log out frame 5
           int a=JOptionPane.showConfirmDialog(f5,"Are you sure to log out ?","Log-out",JOptionPane.YES_NO_OPTION);

           if(a==0){
searcht1.setText("");

 logo5.setIcon(null);
   ta0.setText("     \n" +
"	Personal Information\n" +
"\n" +
" Prisonner \n" +
"\n" +
" Name :\n" +
"\n" +
" Date of Birth :\n" +
"\n" +
" Age :\n" +
"\n" +
" Sex : \n" +
"\n" +
" Entrance Date :\n" +
"\n" +
" Release Date :\n" +
"\n" +
" Security Level :\n" +
"\n" +
" Criminal Case :\n" +
"\n" +
" Nationality :\n" +
"\n" +
" Status :\n" +
"\n" +
" Attorney : \n" +
" \n" +
" \n" +
" \n" +
" \n" +
" ");

            tf1.setForeground(new java.awt.Color(204, 204, 204));
      tf2.setForeground(new java.awt.Color(204, 204, 204));
      tf1.setText("Username ");
      tf2.setText("************");
           f5.setVisible(false);
           f1.setVisible(true);
           }

       }});
        b13.addActionListener ((ActionEvent e)->{{
           //Add

           no="";
           file=null;

searcht1.setText("");


      logo2.setIcon(null);


  logo5.setIcon(null);

   ta0.setText("     \n" +
"	Personal Information\n" +
"\n" +
" Prisonner \n" +
"\n" +
" Name :\n" +
"\n" +
" Date of Birth :\n" +
"\n" +
" Age :\n" +
"\n" +
" Sex : \n" +
"\n" +
" Entrance Date :\n" +
"\n" +
" Release Date :\n" +
"\n" +
" Security Level :\n" +
"\n" +
" Criminal Case :\n" +
"\n" +
" Nationality :\n" +
"\n" +
" Status :\n" +
"\n" +
" Attorney : \n" +
" \n" +
" \n" +
" \n" +
" \n" +
" ");

           t1.setText("");
           t2.setText("");
           c1.setSelectedIndex(0);
           c2.setSelectedIndex(0);
           c3.setSelectedIndex(0);;
           t3.setText("");
           r1.setSelected(false);
           r2.setSelected(false);
           c4.setSelectedIndex(0);
           c5.setSelectedIndex(0);
           c6.setSelectedIndex(0);
           c7.setSelectedIndex(0);
           c8.setSelectedIndex(0);
           c9.setSelectedIndex(0);
           r3.setSelected(false);
           r4.setSelected(false);
           t4.setText("");
           t5.setText("");
           c.setSelectedIndex(0);
           r5.setSelected(false);
           r6.setSelected(false);
           t6.setText("");
           t6.setEditable(false);


           b9.setBounds(271,680,140,30);
           b28.setVisible(false);
           f2.setVisible(true);
           f5.setVisible(false);

           b8.setVisible(true);
           b8.setEnabled(true);

int nextid=2019001;

for(int nu=1;nu<=5;nu++){

           try{
Connection con21b12=DriverManager.getConnection(dburl,userdb,passdb);



	String squery111b12="select id from cell"+nu+" ";
	Statement st111b12=con21b12.createStatement();
	ResultSet rs111b12=st111b12.executeQuery(squery111b12);

	while(rs111b12.next()){
		int id1s1=rs111b12.getInt("id");
	if(nextid<=id1s1){
		if(nextid<id1s1){
			nextid=id1s1;
			nextid++;
		}
		if(nextid==id1s1){
			nextid++;
		}

	}
	}


	con21b12.close();

	st111b12.close();
	rs111b12.close();

           }catch(Exception asa){
           	JOptionPane.showMessageDialog(null,asa);
           }
}
  try{
Connection con21b121=DriverManager.getConnection(dburl,userdb,passdb);



	String squery111b121="select id from retrieve ";
	Statement st111b121=con21b121.createStatement();
	ResultSet rs111b121=st111b121.executeQuery(squery111b121);

	while(rs111b121.next()){
		int id1s11=rs111b121.getInt("id");
		if(nextid<=id1s11){
		if(nextid<id1s11){
			nextid=id1s11;
			nextid++;
		}
		if(nextid==id1s11){
			nextid++;
		}

	}
	}


	con21b121.close();

	st111b121.close();
	rs111b121.close();

           }catch(Exception asa){
           	JOptionPane.showMessageDialog(null,asa);
           }
t1.setText(String.valueOf(nextid));

String a=c1.getSelectedItem().toString();
         int w=c2.getSelectedIndex();
          String b=c3.getSelectedItem().toString();
          int year=Integer.parseInt(b);

          String months55[]={"January","February","March","April","May","June","July","August","September","October","November","December"};

		  int indexmon55=0;

		  for(int v55=0;v55<months55.length;v55++){
		  	if(a.equals(months55[v55])){
		  		indexmon55=v55+1;
		  		break;
		  	}
		  }
int agee=0;
boolean rr=true;
while(rr==true){
	if(year<=c55){
		if(year<c55){
		agee++;
		year++;
		}
		if(year==c55){
		if(indexmon55<=a55&&w+1<=b55){
			agee++;
			year++;

		}
		else{
			break;
		}
	}

	}

	else{
		rr=false;
		break;
	}

}
agee=agee-1;
t3.setText(String.valueOf(agee));


       }});
        b15.addActionListener ((ActionEvent e)->{{
           //cells

searcht1.setText("");

 logo5.setIcon(null);
   ta0.setText("     \n" +
"	Personal Information\n" +
"\n" +
" Prisonner \n" +
"\n" +
" Name :\n" +
"\n" +
" Date of Birth :\n" +
"\n" +
" Age :\n" +
"\n" +
" Sex : \n" +
"\n" +
" Entrance Date :\n" +
"\n" +
" Release Date :\n" +
"\n" +
" Security Level :\n" +
"\n" +
" Criminal Case :\n" +
"\n" +
" Nationality :\n" +
"\n" +
" Status :\n" +
"\n" +
" Attorney : \n" +
" \n" +
" \n" +
" \n" +
" \n" +
" ");


           	int cell11=0;
           int cell22=0;
           int cell33=0;
           int cell44=0;
           int cell55=0;

           int y=table.getRowCount();

           for(int se=0;se<y;se++){
           	String ser=tmodel.getValueAt(se,3).toString();

           	if(ser.equals("1")){
           		cell11=cell11+1;
           	}

           	if(ser.equals("2")){
           		cell22=cell22+1;
           	}
           	if(ser.equals("3")){
           		cell33=cell33+1;
           	}
           	if(ser.equals("4")){
           		cell44=cell44+1;
           	}
           	if(ser.equals("5")){
           		cell55=cell55+1;
           	}

           }




           int total=cell11+cell22+cell33+cell44+cell55;


           label7.setText("Cell 1   :    "+cell11+"  /  40");
           label9.setText("Cell 2   :    "+cell22+"  /  40");
           label10.setText("Cell 3   :   "+cell33+"  /  40");
           label11.setText("Cell 4   :   "+cell44+"  /  40");
           label12.setText("Cell 5   :   "+cell55+"  /  40");
           label13.setText("Total Prisonner(s)  :  "+total+"  /  200");




           if(cell11==40){
           	  cell1.setBackground(Color.RED);
           }
           else{
           	cell1.setBackground(Color.GREEN);
           }

            if(cell22==40){
           	  cell2.setBackground(Color.RED);
           }
           else{
           	cell2.setBackground(Color.GREEN);
           }

            if(cell33==40){
           	  cell3.setBackground(Color.RED);
           }
           else{
           	cell3.setBackground(Color.GREEN);
           }

            if(cell44==40){
           	  cell4.setBackground(Color.RED);
           }
           else{
           	cell4.setBackground(Color.GREEN);
           }

 if(cell55==40){
           	  cell5.setBackground(Color.RED);
           }
           else{
           	cell5.setBackground(Color.GREEN);
           }





           lb9D.setBounds(780,0,80,80);
           lb10T.setBounds(840,0,80,80);




           fcell.add(lb9D);
           fcell.add(lb10T);




             label6.setBounds(565,3,300,30);
           label7.setBounds(80,580,200,30);
           label9.setBounds(80,600,200,30);
           label10.setBounds(210,580,200,30);
           label11.setBounds(210,600,200,30);
           label12.setBounds(329,580,200,30);
           label13.setBounds(80,630,300,30);
           bb27.setBounds(1040,600,80,30);

           label14.setBounds(765,350,200,30);
           label15.setBounds(1035,470,200,30);
           label16.setBounds(960,220,200,30);
           label17.setBounds(740,465,200,30);
           label18.setBounds(460,470,200,30);

           label20.setBounds(1010,350,200,30);
           label21.setBounds(885,495,200,30);
           label22.setBounds(745,270,200,30);
           label23.setBounds(745,290,200,30);
           label24.setBounds(85,193,200,30);
           label25.setBounds(750,280,200,30);
           label26.setBounds(765,180,200,30);
           label27.setBounds(345,280,200,30);
           label28.setBounds(445,280,200,30);
           label29.setBounds(545,280,200,30);
           label30.setBounds(640,280,200,30);
           label31.setBounds(840,280,200,30);
           label32.setBounds(900,348,200,30);
           label33.setBounds(1080,348,200,30);
           label34.setBounds(260,280,200,30);
           label35.setBounds(260,360,200,30);
           label36.setBounds(360,360,200,30);
           label37.setBounds(560,360,200,30);
           label38.setBounds(470,360,200,30);
           label39.setBounds(670,360,200,30);
           label40.setBounds(150,75,200,30);
           label41.setBounds(370,75,200,30);
           label42.setBounds(525,75,200,30);
           label43.setBounds(690,75,200,30);
           label44.setBounds(800,75,200,30);





           cell1.setBounds(240,150,140,100);
           cell2.setBounds(380,150,140,100);
           cell3.setBounds(520,150,140,100);
           cell4.setBounds(65,320,140,100);
           cell5.setBounds(65,420,140,100);
           jp1.setBounds(260,40,160,160);
           jp2.setBounds(420,40,160,160);
           jp3.setBounds(580,40,160,160);
           jp4.setBounds(20,220,160,160);
           jp5.setBounds(20,380,160,160);
           jp6.setBounds(935,150,220,170);
           jp7.setBounds(730,330,120,80);
           jp8.setBounds(940,420,215,140);
           jp9.setBounds(310,420,360,140);
           jp10.setBounds(670,410,180,150);
           jp11.setBounds(720,150,140,100);
           jp12.setBounds(230,150,440,110);
           jp13.setBounds(65,310,150,220);
           jp14.setBounds(65,150,80,60);
           jp15.setBounds(305,330,480,10);
           jp16.setBounds(65,180,80,80);
           jp17.setBounds(120,80,20,20);
           jp18.setBounds(340,80,20,20);
           jp19.setBounds(495,80,20,20);
           jp20.setBounds(660,80,20,20);
           jp21.setBounds(770,80,20,20);




           jpA.setBounds(60,145,840,420);
           jpB.setBounds(890,145,270,420);
           jpC.setBounds(60,297,200,265);
           jpD.setBounds(60,145,140,155);





           fcell.add(label6);
           fcell.add(label7);
           fcell.add(label9);
           fcell.add(label10);
           fcell.add(label11);
           fcell.add(label12);
           fcell.add(label13);
           fcell.add(bb27);

           fcell.add(label14);
           fcell.add(label15);
           fcell.add(label16);
           fcell.add(label17);
           fcell.add(label18);

           fcell.add(label20);
           fcell.add(label21);
           fcell.add(label22);
           fcell.add(label23);
           fcell.add(label24);
           fcell.add(label25);
           fcell.add(label26);
           fcell.add(label27);
           fcell.add(label28);
           fcell.add(label29);
           fcell.add(label30);
           fcell.add(label31);
           fcell.add(label32);
           fcell.add(label33);
           fcell.add(label34);
           fcell.add(label35);
           fcell.add(label36);
           fcell.add(label37);
           fcell.add(label38);
           fcell.add(label39);
           fcell.add(label40);
           fcell.add(label41);
           fcell.add(label42);
           fcell.add(label43);
           fcell.add(label44);



           fcell.add(cell1);
           fcell.add(cell2);
           fcell.add(cell3);
           fcell.add(cell4);
           fcell.add(cell5);


           fcell.add(jp6);
           fcell.add(jp7);
           fcell.add(jp8);
           fcell.add(jp9);
           fcell.add(jp10);
           fcell.add(jp11);
           fcell.add(jp12);
           fcell.add(jp13);
           fcell.add(jp14);
           fcell.add(jp15);
           fcell.add(jp16);
           fcell.add(jp17);
           fcell.add(jp18);
           fcell.add(jp19);
           fcell.add(jp20);
           fcell.add(jp21);





           fcell.add(jpD);
           fcell.add(jpC);
           fcell.add(jpA);
           fcell.add(jpB);












           fcell.setBounds(5,5,1270,770);
           fcell.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           fcell.setLayout(null);
           fcell.setVisible(true);
           f5.setVisible(false);




       }});
        b16.addActionListener ((ActionEvent e)->{{
           //update

           no="";
           file=null;



cellnumber="";

ttt=table.getSelectedRow();
if(ttt>=0){
searcht1.setText("");

 logo5.setIcon(null);
   ta0.setText("     \n" +
"	Personal Information\n" +
"\n" +
" Prisonner \n" +
"\n" +
" Name :\n" +
"\n" +
" Date of Birth :\n" +
"\n" +
" Age :\n" +
"\n" +
" Sex : \n" +
"\n" +
" Entrance Date :\n" +
"\n" +
" Release Date :\n" +
"\n" +
" Security Level :\n" +
"\n" +
" Criminal Case :\n" +
"\n" +
" Nationality :\n" +
"\n" +
" Status :\n" +
"\n" +
" Attorney : \n" +
" \n" +
" \n" +
" \n" +
" \n" +
" ");

String prisonid=table.getValueAt(ttt,0).toString();
String cellnum=table.getValueAt(ttt,3).toString();

cellnumber=cellnum;

Statement st=null;
try{

	Connection con=DriverManager.getConnection(dburl,userdb,passdb);
	String squery="select id,name,bmon,bdate,byear,age,sex,emon,edate,eyear,rmon,rdate,ryear,level,cases,dura,stat,type,atty,photo from cell"+cellnumber+" where id='"+prisonid+"'";

	Statement st1111=con.createStatement();
	ResultSet rs111=st1111.executeQuery(squery);


	while(rs111.next()){

		int id1=rs111.getInt("id");
		String name1=rs111.getString("name");
		String bmon1=rs111.getString("bmon");
		String bdate1=rs111.getString("bdate");
		String byear1=rs111.getString("byear");
		String age1=rs111.getString("age");
		String sex1=rs111.getString("sex");
		String emon1=rs111.getString("emon");
		String edate1=rs111.getString("edate");
		String eyear1=rs111.getString("eyear");
		String rmon1=rs111.getString("rmon");
		String rdate1=rs111.getString("rdate");
		String ryear1=rs111.getString("ryear");
		String level1=rs111.getString("level");
		String cases1=rs111.getString("cases");
		String dura1=rs111.getString("dura");
		String stat1=rs111.getString("stat");
		String type1=rs111.getString("type");
		String atty1=rs111.getString("atty");

			File file12=new File("pic"+id1+photoint+".jpg");
			photoint++;
FileOutputStream output2=new FileOutputStream(file12);
icon0=file12.getAbsolutePath();
InputStream input1 =rs111.getBinaryStream("photo");
byte[] buffer1=new byte[1024];
while(input1.read(buffer1)>0){
	output2.write(buffer1);


}
file=file12;
 no=icon0;
photo1=new ImageIcon(no);
 logo2.setIcon(photo1);

 output2.close();
 input1.close();
icon0="";

glevel=level1;


		t1.setText(String.valueOf(id1));
		t2.setText(name1);
		t3.setText(age1);
		t4.setText(cases1);
		t5.setText(dura1);
		t6.setText(atty1);


		c1.setSelectedItem(bmon1);
		c2.setSelectedItem(Integer.parseInt(bdate1));
		c3.setSelectedItem(Integer.parseInt(byear1));


		String r111=r1.getText();
		String r222=r2.getText();

		String r333=r3.getText();
		String r444=r4.getText();
		String r555=r5.getText();
		String r666=r6.getText();


		if(r111.equals(sex1)){
			r1.setSelected(true);
			r2.setSelected(false);
		}
		if(r222.equals(sex1)){
			r2.setSelected(true);
			r1.setSelected(false);
		}
		if(r333.equals(level1)){
			r3.setSelected(true);
			r4.setSelected(false);
		}
		if(r444.equals(level1)){
			r4.setSelected(true);
			r3.setSelected(false);
		}
		if(r555.equals(type1)){
			r5.setSelected(true);
			r6.setSelected(false);
		}
		if(r666.equals(type1)){
			r6.setSelected(true);
			r5.setSelected(false);
		}




		c4.setSelectedItem(emon1);
		c5.setSelectedItem(Integer.parseInt(edate1));
		c6.setSelectedItem(Integer.parseInt(eyear1));




		c7.setSelectedItem(rmon1);

if(rdate1.equals("N/A")){
	c8.setSelectedItem(rdate1);
}
else{
	c8.setSelectedItem(Integer.parseInt(rdate1));
}

if(ryear1.equals("N/A")){
	c9.setSelectedItem(ryear1);
}
else{
	c9.setSelectedItem(Integer.parseInt(ryear1));
}




		c.setSelectedItem(stat1);





	}
	con.close();
	st1111.close();
	rs111.close();
}catch(Exception eeee){
	JOptionPane.showMessageDialog(null,eeee);
}


		   t1.setEditable(false);
           t2.setEditable(false);
           c1.setEnabled(false);
           c2.setEnabled(false);
           c3.setEnabled(false);
           t3.setEditable(false);
           r1.setEnabled(false);
           r2.setEnabled(false);
           c4.setEnabled(false);
           c5.setEnabled(false);
           c6.setEnabled(false);
           c7.setEnabled(false);
           c8.setEnabled(false);
           c9.setEnabled(false);
           r3.setEnabled(false);
           r4.setEnabled(false);
           t4.setEditable(false);
           t5.setEditable(false);
           c.setEnabled(false);
           r5.setEnabled(false);
           r6.setEnabled(false);
           t6.setEditable(false);
           b8.setEnabled(false);
           b10.setEnabled(false);
           b11.setEnabled(false);

           save.setVisible(true);


           b9.setBounds(190,680,140,30);
           b28.setBounds(370,680,140,30);
           f2.add(b28);
           b28.setVisible(true);



           f2.setVisible(true);
           f5.setVisible(false);

           b8.setVisible(false);
           save.setEnabled(false);
           save.setVisible(true);
}
else{
	JOptionPane.showMessageDialog(null,"Select Prisoner");
}

       }});
        b17.addActionListener ((ActionEvent e)->{{
           //retrieve
searcht1.setText("");

 logo5.setIcon(null);
   ta0.setText("     \n" +
"	Personal Information\n" +
"\n" +
" Prisonner \n" +
"\n" +
" Name :\n" +
"\n" +
" Date of Birth :\n" +
"\n" +
" Age :\n" +
"\n" +
" Sex : \n" +
"\n" +
" Entrance Date :\n" +
"\n" +
" Release Date :\n" +
"\n" +
" Security Level :\n" +
"\n" +
" Criminal Case :\n" +
"\n" +
" Nationality :\n" +
"\n" +
" Status :\n" +
"\n" +
" Attorney : \n" +
" \n" +
" \n" +
" \n" +
" \n" +
" ");

           label5.setBounds(120,20,300,30);
           sc3.setBounds(20,60,350,200);
           b25.setBounds(20,300,80,30);
           b26.setBounds(282,300,80,30);


           f6.add(label5);
           f6.add(sc3);
           f6.add(b25);
           f6.add(b26);


           f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           f6.setBounds(450,190,405,420);
           f6.setLayout(null);
           f6.setVisible(true);
           f5.setVisible(false);

           // table

           //update table
               int countts=model1.getRowCount();
               while(countts>0){
               	model1.removeRow(0);
               	countts--;
               }
               try{


Connection con21bs=DriverManager.getConnection(dburl,userdb,passdb);



	String squery111bs="select id,name,cases from retrieve ";
	Statement st111bs=con21bs.createStatement();
	ResultSet rs111bs=st111bs.executeQuery(squery111bs);

	while(rs111bs.next()){
		int id1ss=rs111bs.getInt("id");
		String name1ss=rs111bs.getString("name");
		String cases11ss=rs111bs.getString("cases");

		String okiey1s[]={String.valueOf(id1ss),name1ss,cases11ss};
		model1.addRow(okiey1s);
	}


	con21bs.close();

	st111bs.close();
	rs111bs.close();



       }catch(Exception aeees){
       	JOptionPane.showMessageDialog(null,aeees);
       }



       }});
        cb1.addActionListener ((ActionEvent e)->{{
           //terms and conditions
           if(r10.isSelected()){
               b24.setEnabled(true);
           }
           if(r11.isSelected()){
               b24.setEnabled(false);
           }

           label1.setBounds(185,10,500,30);
           label2.setBounds(45,35,500,30);
           label3.setBounds(45,60,500,30);
           label4.setBounds(45,75,500,30);
           ta1.setBounds(45,110,400,370);
           r10.setBounds(45,500,300,20);
           r11.setBounds(45,520,300,20);
           b23.setBounds(230,560,100,30);
           b24.setBounds(342,560,100,30);


           f8.add(label1);
           f8.add(label2);
           f8.add(label3);
           f8.add(label4);
           f8.add(ta1);
           f8.add(r10);
           f8.add(r11);
           f8.add(b23);
           f8.add(b24);


           f8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           f8.setBounds(440,60,500,640);
           f8.setLayout(null);
           f8.setVisible(true);
           f3.setVisible(false);
           ta1.setEditable(false);
           if(cb1.isSelected()){
            b24.setEnabled(true);
            r10.setSelected(true);
           }

       }});
        b18.addActionListener ((ActionEvent ee)->{{
           //submit frame 3 sign up
           int a=JOptionPane.showConfirmDialog(f3,"Are you sure to submit ?","Confirm Sign-in",JOptionPane.YES_NO_OPTION);

           if(a==0){
           if(cb1.isSelected()){
          String name=t7.getText();
          String userid=t8.getText();
          String username =t9.getText();
          String password =t10.getText();

          String bmon =c10.getSelectedItem().toString();
          String bdate =c11.getSelectedItem().toString();
          String byear = c12.getSelectedItem().toString();

          String type="";
          if(r7.isSelected()){
          type =r7.getText();
          }
          if(r8.isSelected()){
          type =r8.getText();
          }
          if(r9.isSelected()){
          type =r9.getText();
          }

        //  check username
          	boolean matchy=false;
	Statement tr=null;
	try{

	Connection conn1=DriverManager.getConnection(dburl,userdb,passdb);
	String squery11121="select username from admin ";
	Statement st11121=conn1.createStatement();
	ResultSet rs11121=st11121.executeQuery(squery11121);

	String squery111211="select username from warden ";
	Statement st111211=conn1.createStatement();
	ResultSet rs111211=st111211.executeQuery(squery111211);

	while(rs11121.next()){

		String usernamematch=rs11121.getString("username");

		if((username.equals(usernamematch))){
matchy=true;
break;
	}
	}

		while(rs111211.next()){

		String usernamematch1=rs111211.getString("username");

		if((username.equals(usernamematch1))){
matchy=true;
break;
	}
	}

	conn1.close();
st11121.close();
	 rs11121.close();
	 rs111211.close();


	}catch(Exception hj){
		JOptionPane.showMessageDialog(null,hj);
	}


          if(name.equals("")){
          	JOptionPane.showMessageDialog(f3,"Input name","Input Data",JOptionPane.ERROR_MESSAGE);
          }
          else if(userid.equals("")){
          	JOptionPane.showMessageDialog(f3,"Input User ID.","Input Data",JOptionPane.ERROR_MESSAGE);
          }
          else if(type.equals("")){
          	JOptionPane.showMessageDialog(f3,"Select Type","Select Data",JOptionPane.ERROR_MESSAGE);
          }
          else if(username.equals("")){
          	JOptionPane.showMessageDialog(f3,"Input Username","Input Data",JOptionPane.ERROR_MESSAGE);
          }
           else if(matchy==true){
          	JOptionPane.showMessageDialog(f3,"Username exist","Try Again",JOptionPane.ERROR_MESSAGE);
          }
          else if(password.equals("")){
          	JOptionPane.showMessageDialog(f3,"Input Password","Input Data",JOptionPane.ERROR_MESSAGE);
          }

//cHECK USERNAME





else{

	Statement st=null;
try{

	Connection con=DriverManager.getConnection(dburl,userdb,passdb);
	String squery="insert into admin(name,userid,usertype,bmon,bdate,byear,username,password)value('"+name+"','"+userid+"','"+type+"','"+bmon+"','"+bdate+"','"+byear+"','"+username+"','"+password+"')";
	st=con.createStatement();
	st.executeUpdate(squery);

}
catch(Exception e){
	JOptionPane.showMessageDialog(null,e);
}









//table



          t7.setText("");
          t8.setText("");
          r7.setSelected(false);
          r8.setSelected(false);
          r9.setSelected(false);
          t9.setText("");
          t10.setText("");
          c10.setSelectedIndex(0);
          c11.setSelectedIndex(0);
          c12.setSelectedIndex(0);
          cb1.setSelected(false);

          f5.setVisible(true);
          f3.setVisible(false);

          JOptionPane.showMessageDialog(null,"Submit Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
           }
           }


           else{
               JOptionPane.showMessageDialog(f3,"Agree to Terms and Condition first !");
           }
        }

       }});
        b19.addActionListener ((ActionEvent e)->{{
           //clear sign up frame 3
           int a=JOptionPane.showConfirmDialog(f3,"Are you sure to clear all ?","Clear All",JOptionPane.YES_NO_OPTION);
          if (a==0){
           t7.setText("");
          t8.setText("");
          r7.setSelected(false);
          r8.setSelected(false);
          r9.setSelected(false);
          t9.setText("");
          t10.setText("");
          c10.setSelectedIndex(0);
          c11.setSelectedIndex(0);
          c12.setSelectedIndex(0);
          cb1.setSelected(false);
          }


       }});
        b199.addActionListener ((ActionEvent e)->{{
           //submit cancel
           int gg=JOptionPane.showConfirmDialog(null,"Are you sure to cancel ?","Cancel",JOptionPane.YES_NO_OPTION);
           if(gg==0){

           t7.setText("");
          t8.setText("");
          r7.setSelected(false);
          r8.setSelected(false);
          r9.setSelected(false);
          t9.setText("");
          t10.setText("");
          c10.setSelectedIndex(0);
          c11.setSelectedIndex(0);
          c12.setSelectedIndex(0);
          cb1.setSelected(false);

           f2.setVisible(true);
           f3.setVisible(false);
           }

       }});
        b20.addActionListener ((ActionEvent e)->{{
           //search release
int count1 =model.getRowCount();
while(count1>0){
	model.removeRow(0);
	count1--;
}
           String aaa=c13.getSelectedItem().toString();
           String sss=c14.getSelectedItem().toString();
           String ddd=c15.getSelectedItem().toString();

           String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};

		  int indexmon=0;

		  for(int v=0;v<months.length;v++){
		  	if(aaa.equals(months[v])){
		  		indexmon=v;
		  		break;
		  	}
		  }


           int sss1=Integer.parseInt(sss);
           int ddd1=Integer.parseInt(ddd);


for(int ia=1;ia<=5;ia++){

Statement st1111=null;
ResultSet rs111=null;
try{

	Connection con=DriverManager.getConnection(dburl,userdb,passdb);
	String squery="select * from cell"+ia+" ";

	 st1111=con.createStatement();
	 rs111=st1111.executeQuery(squery);


	while(rs111.next()){

boolean match=true;
int indexmon1=0;

 int id1=rs111.getInt("id");
		 String name1=rs111.getString("name");
		 String cases1=rs111.getString("cases");
		 String cell11=rs111.getString("cell");


		String rmon1=rs111.getString("rmon");
	String rdate1=rs111.getString("rdate");
		String ryear1=rs111.getString("ryear");


if(rmon1.equals("N/A")){
	match=false;
}
else{
		  for(int v1=0;v1<months.length;v1++){
		  	if(rmon1.equals(months[v1])){
		  		indexmon1=v1;
		  		break;
		  	}
		  }
		  }
		  if(rdate1.equals("N/A")){
		  	rdate1="0";
		  	match=false;
		  }
		   if(ryear1.equals("N/A")){
		  	ryear1="0";
		  	match=false;
		  }
		  int dd1=Integer.parseInt(rdate1);
		  int dd2=Integer.parseInt(ryear1);




while(match==true){

if(dd2<ddd1){
	match=true;
	break;
}
else if(dd2==ddd1){
if(indexmon1<indexmon){
	match=true;
	break;
}
else if(indexmon1==indexmon){
	if(dd1<sss1){
		match=true;
		break;
	}
	else if(dd1==sss1){
		match=true;
		break;
	}
else{

		match=false;
		break;
}
}
else{

	match=false;
	break;
}
}
else{
match=false;
break;
}
}















		if(match==true){
			String  arraylist1[]={String.valueOf(id1),name1,cases1,cell11};
		model.addRow(arraylist1);
		}
	}

st1111.close();
rs111.close();

}catch(Exception ww){
	JOptionPane.showMessageDialog(null,ww);
}

}//loop



       }});
        b21.addActionListener ((ActionEvent e)->{{
           //back release
int bv=JOptionPane.showConfirmDialog(null,"Are you sure to back ?","Back",JOptionPane.YES_NO_OPTION);
if(bv==0){

c13.setSelectedIndex(0);
c14.setSelectedIndex(0);
c15.setSelectedIndex(0);

           f5.setVisible(true);
           f4.setVisible(false);

           int ty=model.getRowCount();
           while(ty>0){
           	model.removeRow(0);
           	ty--;
           }
}
       }});
        b22.addActionListener ((ActionEvent e)->{{
           //release button in list 1


           int aa=list1.getSelectedRow();
if(aa>=0){
	String rid=list1.getValueAt(aa,0).toString();
	String rcell=list1.getValueAt(aa,3).toString();

               int t=JOptionPane.showConfirmDialog(f4,"Are you sure to release this prisoner ?","Confirm Release",JOptionPane.YES_NO_OPTION);
         if(t==0){
               //release prisoner

               Statement st=null;
try{

	Connection con=DriverManager.getConnection(dburl,userdb,passdb);
	String squerya="select id,name,bmon,bdate,byear,age,sex,emon,edate,eyear,rmon,rdate,ryear,level,cases,dura,stat,type,atty,photo from cell"+rcell+" where id='"+rid+"'";

	Statement st1111a=con.createStatement();
	ResultSet rs111a=st1111a.executeQuery(squerya);


	while(rs111a.next()){

		String idd=rs111a.getString("id");
		String name1=rs111a.getString("name");
		String bmon1=rs111a.getString("bmon");
		String bdate1=rs111a.getString("bdate");
		String byear1=rs111a.getString("byear");
		String age1=rs111a.getString("age");
		String sex1=rs111a.getString("sex");
		String emon1=rs111a.getString("emon");
		String edate1=rs111a.getString("edate");
		String eyear1=rs111a.getString("eyear");
		String rmon1=rs111a.getString("rmon");
		String rdate1=rs111a.getString("rdate");
		String ryear1=rs111a.getString("ryear");
		String level1=rs111a.getString("level");
		String cases1=rs111a.getString("cases");
		String dura1=rs111a.getString("dura");
		String stat1=rs111a.getString("stat");
		String type1=rs111a.getString("type");
		String atty1=rs111a.getString("atty");

		File file12=new File("pic"+idd+".jpg");
FileOutputStream output2=new FileOutputStream(file12);
icon0=file12.getAbsolutePath();
InputStream input1 =rs111a.getBinaryStream("photo");
byte[] buffer1=new byte[1024];
while(input1.read(buffer1)>0){
	output2.write(buffer1);


}

output2.close();
icon0="";
input1.close();

//insert in archive

PreparedStatement sty=null;
try{
	Connection con424=DriverManager.getConnection(dburl,userdb,passdb);
	String squery="insert into retrieve(id,name,bmon,bdate,byear,age,sex,emon,edate,eyear,rmon,rdate,ryear,level,cases,dura,stat,type,atty,photo)value('"+idd+"','"+name1+"','"+bmon1+"','"+bdate1+"','"+byear1+"','"+age1+"','"+sex1+"','"+emon1+"','"+edate1+"','"+eyear1+"','"+rmon1+"','"+rdate1+"','"+ryear1+"','"+level1+"','"+cases1+"','"+dura1+"','"+stat1+"','"+type1+"','"+atty1+"',?)";
	sty=con424.prepareStatement(squery);
	FileInputStream fin2 = new FileInputStream(file12);
	sty.setBinaryStream(1,fin2);
	sty.executeUpdate();


fin2.close();

sty.close();
con424.close();


//close

}catch(Exception es){
	JOptionPane.showMessageDialog(null,es);
}


	}
	con.close();
	st1111a.close();
	rs111a.close();
}catch(Exception eeee){
	JOptionPane.showMessageDialog(null,eeee);
}

//delete from cell database
Statement stbs=null;
try{
	Connection con4241=DriverManager.getConnection(dburl,userdb,passdb);
	String squeryee="delete from cell"+rcell+" where id="+rid+"";
	stbs=con4241.createStatement();
	stbs.executeUpdate(squeryee);

stbs.close();
con4241.close();
}catch(Exception es){
	JOptionPane.showMessageDialog(null,es);
}

//update table
	model.removeRow(aa);

               //update table
               int count=tmodel.getRowCount();
               while(count>0){
               	tmodel.removeRow(0);
               	count--;
               }
for(int y=1;y<=5;y++){
               try{

Connection con21=DriverManager.getConnection(dburl,userdb,passdb);



	String squery111="select id,name,cases,cell from cell"+y+" ";
	Statement st111=con21.createStatement();
	ResultSet rs111=st111.executeQuery(squery111);

	while(rs111.next()){
		int id1=rs111.getInt("id");
		String name1=rs111.getString("name");
		String cases11=rs111.getString("cases");
		String cel1=rs111.getString("cell");

		String okiey[]={String.valueOf(id1),name1,cases11,cel1};
		tmodel.addRow(okiey);
	}


	con21.close();

	st111.close();
	rs111.close();



       }catch(Exception eee){
       	JOptionPane.showMessageDialog(null,eee);
       }
               }


JOptionPane.showMessageDialog(null,"Released Successfully");



               }//confirmed





}//if row is selected
else{
	JOptionPane.showMessageDialog(null,"Select Prisoner");
}


       }});
        r10.addActionListener ((ActionEvent e)->{{
           //r10
           b24.setEnabled(true);
           cb1.setSelected(true);
       }});
        r11.addActionListener ((ActionEvent e)->{{
           //r11
           b24.setEnabled(false);
           cb1.setSelected(false);
       }});
    	b23.addActionListener ((ActionEvent e)->{{
           // terms and condition <back

               r11.setSelected(false);
               r10.setSelected(true);

           cb1.setSelected(false);
           f3.setVisible(true);
           f8.setVisible(false);
       }});
        b24.addActionListener ((ActionEvent e)->{{
           //terms and condition next>
           cb1.setSelected(true);
          f3.setVisible(true);
          f8.setVisible(false);
       }});
         b25.addActionListener ((ActionEvent e)->{{
           //back retrive
           int v=JOptionPane.showConfirmDialog(f6,"Are you sure to go back ?","Back",JOptionPane.YES_NO_OPTION);
           if(v==0){

         f5.setVisible(true);
         f6.setVisible(false);

         }
       }});
          b26.addActionListener ((ActionEvent e)->{{
           //retrieve data and add to prisoner cells
           int aa=list2.getSelectedRow();
           if(aa>=0){

           int t=JOptionPane.showConfirmDialog(f6,"Are you sure to retrive this prisoner ?","Confirm Retrive",JOptionPane.YES_NO_OPTION);
           if(t==0){
//release prisoner
String aaa1=model1.getValueAt(aa,0).toString();
               Statement st=null;
try{

	Connection con=DriverManager.getConnection(dburl,userdb,passdb);
	String squerya="select * from retrieve where id='"+aaa1+"'";

	Statement st1111a=con.createStatement();
	ResultSet rs111a=st1111a.executeQuery(squerya);


	while(rs111a.next()){
String idd1=rs111a.getString("id");
		String name1=rs111a.getString("name");
		String bmon1=rs111a.getString("bmon");
		String bdate1=rs111a.getString("bdate");
		String byear1=rs111a.getString("byear");
		String age1=rs111a.getString("age");
		String sex1=rs111a.getString("sex");
		String emon1=rs111a.getString("emon");
		String edate1=rs111a.getString("edate");
		String eyear1=rs111a.getString("eyear");
		String rmon1=rs111a.getString("rmon");
		String rdate1=rs111a.getString("rdate");
		String ryear1=rs111a.getString("ryear");
		String level1=rs111a.getString("level");
		String cases1=rs111a.getString("cases");
		String dura1=rs111a.getString("dura");
		String stat1=rs111a.getString("stat");
		String type1=rs111a.getString("type");
		String atty1=rs111a.getString("atty");

				File file12=new File("pic"+idd1+".jpg");
FileOutputStream output2=new FileOutputStream(file12);
icon0=file12.getAbsolutePath();
InputStream input1 =rs111a.getBinaryStream("photo");
byte[] buffer1=new byte[1024];
while(input1.read(buffer1)>0){
	output2.write(buffer1);


}
output2.close();
input1.close();
icon0="";


//insert in cell



 	//check status update
boolean inserted=false;
			for(int oy=1;oy<=5;oy++){

int countcell=0;
boolean levelcell=true;


				try{
	Connection cony=DriverManager.getConnection(dburl,userdb,passdb);
	String squery1112="select level from cell"+oy+" ";
	Statement st1112=cony.createStatement();
	ResultSet rs1112=st1112.executeQuery(squery1112);

	while(rs1112.next()){
		String dblevel=rs1112.getString("level");
		if(dblevel.equals("")){
		}
		else{
		countcell++;
		}
		if(!(dblevel.equals(level1))){
			levelcell=false;
		}
		if(countcell>39){
			levelcell=false;
		}
	}
	cony.close();



	if(levelcell==true){

		//insert in cell
PreparedStatement stt=null;

try{
	Connection con44=DriverManager.getConnection(dburl,userdb,passdb);
	String squery="insert into cell"+oy+"(id,name,bmon,bdate,byear,age,sex,emon,edate,eyear,rmon,rdate,ryear,level,cases,dura,stat,type,atty,photo)value('"+idd1+"','"+name1+"','"+bmon1+"','"+bdate1+"','"+byear1+"','"+age1+"','"+sex1+"','"+emon1+"','"+edate1+"','"+eyear1+"','"+rmon1+"','"+rdate1+"','"+ryear1+"','"+level1+"','"+cases1+"','"+dura1+"','"+stat1+"','"+type1+"','"+atty1+"',?)";
	stt=con44.prepareStatement(squery);
	FileInputStream fin = new FileInputStream(file12);
	stt.setBinaryStream(1,fin);
	stt.executeUpdate();


fin.close();
stt.close();
con44.close();
}catch(Exception e6){
	JOptionPane.showMessageDialog(null,e6);
}

	// inserted in cell
		inserted=true;
		break;
	}//if true

	st1112.close();
	rs1112.close();

		if(oy==5&&inserted==false){
		JOptionPane.showMessageDialog(f6,"Prison Cells reached it's limit","Invalid",JOptionPane.WARNING_MESSAGE);
	}
}catch(Exception eaa){
JOptionPane.showMessageDialog(null,eaa);
}
			}//end of loop

//inserted

if(inserted==true){
//delete from archive database
Statement stbs=null;
try{
	Connection con4241=DriverManager.getConnection(dburl,userdb,passdb);
	String squeryee="delete from retrieve where id="+aaa1+"";
	stbs=con4241.createStatement();
	stbs.executeUpdate(squeryee);

stbs.close();
con4241.close();
}catch(Exception es){
	JOptionPane.showMessageDialog(null,es);
}
//end of retrieve

 //update table of archive
               int countts=model1.getRowCount();
               while(countts>0){
               	model1.removeRow(0);
               	countts--;
               }
               try{

Connection con21bs=DriverManager.getConnection(dburl,userdb,passdb);



	String squery111bs="select id,name,cases from retrieve ";
	Statement st111bs=con21bs.createStatement();
	ResultSet rs111bs=st111bs.executeQuery(squery111bs);

	while(rs111bs.next()){
		int id1ss=rs111bs.getInt("id");
		String name1ss=rs111bs.getString("name");
		String cases11ss=rs111bs.getString("cases");

		String okiey1s[]={String.valueOf(id1ss),name1ss,cases11ss};
		model1.addRow(okiey1s);
	}


	con21bs.close();

	st111bs.close();
	rs111bs.close();



       }catch(Exception aeees){
       	JOptionPane.showMessageDialog(null,aeees);
       }

       //update table of prisoner

               int countts1=tmodel.getRowCount();
               while(countts1>0){
               	tmodel.removeRow(0);
               	countts1--;
               }
               for(int att=1;att<=5;att++){

               try{

Connection con21bs1=DriverManager.getConnection(dburl,userdb,passdb);



	String squery111bs1="select id,name,cases,cell from cell"+att+" ";
	Statement st111bs1=con21bs1.createStatement();
	ResultSet rs111bs1=st111bs1.executeQuery(squery111bs1);

	while(rs111bs1.next()){
		int id1ss2=rs111bs1.getInt("id");
		String name1ss2=rs111bs1.getString("name");
		String cases11ss2=rs111bs1.getString("cases");
		String cell8=rs111bs1.getString("cell");

		String okiey1s1[]={String.valueOf(id1ss2),name1ss2,cases11ss2,cell8};
		tmodel.addRow(okiey1s1);
	}


	con21bs1.close();

	st111bs1.close();
	rs111bs1.close();



       }catch(Exception aeees){
       	JOptionPane.showMessageDialog(null,aeees);
       }
               }
}


	}
	con.close();
	st1111a.close();
	rs111a.close();
}catch(Exception eeee){
	JOptionPane.showMessageDialog(null,eeee);
}


           }
           }
           else{
           	JOptionPane.showMessageDialog(null,"Select Prisoner");
           }
       }});
           bb27.addActionListener ((ActionEvent e)->{{
           //close cell
         f5.setVisible(true);
         fcell.setVisible(false);

       }});
           b28.addActionListener ((ActionEvent e)->{{
           //edit
           t2.setEditable(true);
           c1.setEnabled(true);
           c2.setEnabled(true);
           c3.setEnabled(true);
           t3.setEditable(false);
           r1.setEnabled(true);
           r2.setEnabled(true);
           c4.setEnabled(true);
           c5.setEnabled(true);
           c6.setEnabled(true);
           c7.setEnabled(true);
           c8.setEnabled(true);
           c9.setEnabled(true);
           r3.setEnabled(true);
           r4.setEnabled(true);
           t4.setEditable(true);
           t5.setEditable(true);
           c.setEnabled(true);
           r5.setEnabled(true);
           r6.setEnabled(true);
           t6.setEditable(true);

           b10.setEnabled(true);
           b11.setEnabled(true);

           save.setVisible(true);
           save.setEnabled(true);
	       b8.setVisible(false);
	       b8.setEnabled(false);

           b29.setBounds(370,680,140,30);
           f2.add(b29);
           b28.setVisible(false);
           b29.setVisible(true);




       }});
           b29.addActionListener ((ActionEvent e)->{{
           //cancel edit
           int bbb=JOptionPane.showConfirmDialog(null,"Are you sure to cancel ?","Cancel",JOptionPane.YES_NO_OPTION);
           if(bbb==0){

 no="";
           file=null;

Statement st=null;
try{

String kkk=t1.getText();

	Connection con=DriverManager.getConnection(dburl,userdb,passdb);
	String squery="select id,name,bmon,bdate,byear,age,sex,emon,edate,eyear,rmon,rdate,ryear,level,cases,dura,stat,type,atty,photo from cell"+cellnumber+" where id='"+kkk+"'";

	Statement st1111=con.createStatement();
	ResultSet rs111=st1111.executeQuery(squery);


	while(rs111.next()){
		String id1=rs111.getString("id");
		String name1=rs111.getString("name");
		String bmon1=rs111.getString("bmon");
		String bdate1=rs111.getString("bdate");
		String byear1=rs111.getString("byear");
		String age1=rs111.getString("age");
		String sex1=rs111.getString("sex");
		String emon1=rs111.getString("emon");
		String edate1=rs111.getString("edate");
		String eyear1=rs111.getString("eyear");
		String rmon1=rs111.getString("rmon");
		String rdate1=rs111.getString("rdate");
		String ryear1=rs111.getString("ryear");
		String level1=rs111.getString("level");
		String cases1=rs111.getString("cases");
		String dura1=rs111.getString("dura");
		String stat1=rs111.getString("stat");
		String type1=rs111.getString("type");
		String atty1=rs111.getString("atty");


			File file12=new File("pic"+id1+photoint+".jpg");
			photoint++;
FileOutputStream output2=new FileOutputStream(file12);
icon0=file12.getAbsolutePath();
InputStream input1 =rs111.getBinaryStream("photo");
byte[] buffer1=new byte[1024];
while(input1.read(buffer1)>0){
	output2.write(buffer1);


}
file=file12;
 no=icon0;
photo1=new ImageIcon(no);
 logo2.setIcon(photo1);


 output2.close();
 input1.close();
 icon0="";

		t2.setText(name1);
		t3.setText(age1);
		t4.setText(cases1);
		t5.setText(dura1);
		t6.setText(atty1);


		c1.setSelectedItem(bmon1);
	c2.setSelectedItem(Integer.parseInt(bdate1));
		c3.setSelectedItem(Integer.parseInt(byear1));

		String r111=r1.getText();
		String r222=r2.getText();

		String r333=r3.getText();
		String r444=r4.getText();

		String r555=r5.getText();
		String r666=r6.getText();


		if(r111.equals(sex1)){
			r1.setSelected(true);
			r2.setSelected(false);
		}
		if(r222.equals(sex1)){
			r2.setSelected(true);
			r1.setSelected(false);
		}

		if(r333.equals(level1)){
			r3.setSelected(true);
			r4.setSelected(false);
		}
		if(r444.equals(level1)){
			r4.setSelected(true);
			r3.setSelected(false);
		}


		if(r555.equals(type1)){
			r5.setSelected(true);
			r6.setSelected(false);
		}
		if(r666.equals(type1)){
			r6.setSelected(true);
			r5.setSelected(false);
		}


		c4.setSelectedItem(emon1);
		c5.setSelectedItem(Integer.parseInt(edate1));
		c6.setSelectedItem(Integer.parseInt(eyear1));

			c7.setSelectedItem(rmon1);

if(rdate1.equals("N/A")){
	c8.setSelectedItem(rdate1);
}
else{
	c8.setSelectedItem(Integer.parseInt(rdate1));
}

if(ryear1.equals("N/A")){
	c9.setSelectedItem(ryear1);
}
else{
	c9.setSelectedItem(Integer.parseInt(ryear1));
}


	c.setSelectedItem(stat1);

	}
	con.close();
	st1111.close();
	rs111.close();
}catch(Exception eeee){
	JOptionPane.showMessageDialog(null,eeee);
}







//editcancelled
           t2.setEditable(false);
           c1.setEnabled(false);
           c2.setEnabled(false);
           c3.setEnabled(false);
           t3.setEditable(false);
           r1.setEnabled(false);
           r2.setEnabled(false);
           c4.setEnabled(false);
           c5.setEnabled(false);
           c6.setEnabled(false);
           c7.setEnabled(false);
           c8.setEnabled(false);
           c9.setEnabled(false);
           r3.setEnabled(false);
           r4.setEnabled(false);
           t4.setEditable(false);
           t5.setEditable(false);
           c.setEnabled(false);
           r5.setEnabled(false);
           r6.setEnabled(false);
           t6.setEditable(false);
           b8.setEnabled(false);
           b10.setEnabled(false);
           b11.setEnabled(false);


save.setVisible(false);
	       b8.setVisible(true);


           b29.setVisible(false);
           b28.setVisible(true);
           }
       }});
           r1.addActionListener ((ActionEvent e)->{{
           //r1

               r1.setSelected(true);
               r2.setSelected(false);
       }});
           r2.addActionListener ((ActionEvent e)->{{
           //r2

                r1.setSelected(false);
               r2.setSelected(true);
       }});
           r3.addActionListener ((ActionEvent e)->{{
           //r3

               r3.setSelected(true);
               r4.setSelected(false);
       }});
           r4.addActionListener ((ActionEvent e)->{{
           //r4
                r3.setSelected(false);
               r4.setSelected(true);
       }});
           r5.addActionListener ((ActionEvent e)->{{
           //r5
               t6.setEditable(true);
               r5.setSelected(true);
               r6.setSelected(false);
       }});
           r6.addActionListener ((ActionEvent e)->{{
           //r6
               t6.setEditable(true);
                r5.setSelected(false);
               r6.setSelected(true);
       }});

           r7.addActionListener ((ActionEvent e)->{{
           //r4
                r7.setSelected(true);
                r8.setSelected(false);
                r9.setSelected(false);
       }});
           r8.addActionListener ((ActionEvent e)->{{
           //r5
                r8.setSelected(true);
                r7.setSelected(false);
                r9.setSelected(false);
       }});
           r9.addActionListener ((ActionEvent e)->{{
           //r6
                r9.setSelected(true);
                r8.setSelected(false);
                r7.setSelected(false);
       }});
            r10.addActionListener ((ActionEvent e)->{{
           //r3

               r10.setSelected(true);
               r11.setSelected(false);
               if(r10.isSelected()){
                   b24.setEnabled(true);
               }
       }});
           r11.addActionListener ((ActionEvent e)->{{
           //r4
                r10.setSelected(false);
               r11.setSelected(true);
                if(r11.isSelected()){
                   b24.setEnabled(false);
               }
       }});
           tf1.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent evt) {
         String y=tf1.getText();
         if(y.equals("Username ")){
        tf1.setText("");
        tf1.setForeground(new java.awt.Color(0, 0, 0));
         }
    }
     public void mouseExited(MouseEvent evt) {
        String y=tf1.getText();
         if(y.equals("")){
      tf1.setText("Username ");
      tf1.setForeground(new java.awt.Color(204, 204, 204));
      }
    }
});
           tf1.addKeyListener(new KeyAdapter() {
    public void keyTyped(KeyEvent evt) {
         String y=tf1.getText();
         if(y.equals("Username ")){
        tf1.setText("");
        tf1.setForeground(new java.awt.Color(0, 0, 0));
         }
    }
});


           tf2.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent evt) {
        String y=tf2.getText();
         if(y.equals("************")){
        tf2.setText("");
        tf2.setForeground(new java.awt.Color(0, 0, 0));
         }

    }
     public void mouseExited(MouseEvent evt) {
         String y=tf2.getText();
         if(y.equals("")){
      tf2.setText("************");
      tf2.setForeground(new java.awt.Color(204, 204, 204));

         }
}
});
            tf2.addKeyListener(new KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
         String y=tf2.getText();
         if(y.equals("************")){
        tf2.setText("");
        tf2.setForeground(new java.awt.Color(0, 0, 0));
         }
    }
});
 save.addActionListener ((ActionEvent e)->{{

           int a=JOptionPane.showConfirmDialog(f3,"Are you sure to save changes ?","Save",JOptionPane.YES_NO_OPTION);
           if(a==0){



          String name0=t2.getText();
          String bmon0= c1.getSelectedItem().toString();
          String bdate0 =c2.getSelectedItem().toString();
          String byear0 =c3.getSelectedItem().toString();;
          String age0=t3.getText();
          String emon0 =c4.getSelectedItem().toString();
          String edate0 =c5.getSelectedItem().toString();
          String eyear0 =c6.getSelectedItem().toString();
          String rmon0 =c7.getSelectedItem().toString();
          String rdate0 =c8.getSelectedItem().toString();
          String ryear0 =c9.getSelectedItem().toString();
          String cases0 =t4.getText();
          String dura0 =t5.getText();
          String stats0 =c.getSelectedItem().toString();
          String atty0 =t6.getText();

		  String sex0 ="";
		  String level0 ="";
		  String type0 ="";

          if(r1.isSelected()){
          sex0 =r1.getText();
          }
          if(r2.isSelected()){

          sex0 =r2.getText();
          }
          if(r3.isSelected()){
          level0 =r3.getText();
          }
          if(r4.isSelected()){
          level0 =r4.getText();
          }
          if(r5.isSelected()){
          type0 =r5.getText();
          }
          if(r6.isSelected()){
          type0 =r6.getText();
          }

          //database update

           //verification
           boolean under=false;
           int vage=Integer.parseInt(age0);
           if(vage<18){
           	under=true;
           }


          boolean ready0=true;

          int invalid10=c7.getSelectedIndex();
          int invalid20=c8.getSelectedIndex();
          int invalid30=c9.getSelectedIndex();

          boolean invalid110=false;
          boolean invalid220=false;
          boolean invalid330=false;

          boolean invalid1110=false;
          boolean invalid2220=false;
          boolean invalid3330=false;

          invalid110=invalid10!=0 && invalid20==0 && invalid30==0;
          invalid220=invalid10==0 && invalid20!=0 && invalid30==0;
          invalid330=invalid10==0 && invalid20==0 && invalid30!=0;

          invalid1110=(invalid10!=0 && invalid20!=0 && invalid30==0);
          invalid2220=invalid10==0 && invalid20!=0 && invalid30!=0;
          invalid3330=invalid10!=0 && invalid20==0 && invalid30!=0;

          boolean notcapable=true;
           String months1[]={"January","February","March","April","May","June","July","August","September","October","November","December"};

		  int indexmon0=-2;
		  int indexmon02=-1;

		  for(int v7=0;v7<months1.length;v7++){
		  	if(emon0.equals(months1[v7])){
		  		indexmon0=v7;
		  		break;
		  	}
		  }

		  for(int v71=0;v71<months1.length;v71++){
		  	if(rmon0.equals(months1[v71])){
		  		indexmon02=v71;
		  		break;
		  	}
		  	if(rmon0.equals("N/A")){
		  		indexmon02=110;
		  		break;
		  	}
		  }

		  String rdate11r="";
		  String ryear11r="";

		  if(rdate0.equals("N/A")){
		  	rdate11r="110";
		  }
		  else{
		  	rdate11r=rdate0;
		  }
		  if(ryear0.equals("N/A")){
		  	ryear11r="1101111";
		  }
		  else{
		  	ryear11r=ryear0;
		  }


		  int eyear1=Integer.parseInt(eyear0);
		  int ryear1=Integer.parseInt(ryear11r);
		  int edate1=Integer.parseInt(edate0);
		  int rdate1=Integer.parseInt(rdate11r);



          while(notcapable==true){

if(eyear1<ryear1){
	break;
}

else if(ryear1==eyear1){
if(indexmon0<indexmon02){
	break;
}
else if(indexmon0==indexmon02){
	if(edate1<rdate1){
		break;
	}
	else{
		notcapable=false;
		break;
	}
}
else{
	notcapable=false;
	break;
}

}

else{
	notcapable=false;
	break;
}

}



          if(name0.equals("")){
          	JOptionPane.showMessageDialog(null,"Input Name","Input Data",JOptionPane.ERROR_MESSAGE);
          	ready0=false;
          }
          else if(under==true){
          	JOptionPane.showMessageDialog(null,"Prisoner must be 18 above to detained  !!!","Invalid Age",JOptionPane.ERROR_MESSAGE);
          	ready0=false;
          }
          else if(invalid110==true||invalid220==true||invalid330==true||invalid3330==true||invalid2220==true||invalid1110==true||notcapable==false){
          	JOptionPane.showMessageDialog(null,"Invalid Release Date","Invalid",JOptionPane.ERROR_MESSAGE);
          	ready0=false;
          }
           else if(no.equals("")){
          	JOptionPane.showMessageDialog(null,"Select Prisoner Picture","Select",JOptionPane.ERROR_MESSAGE);
          	ready0=false;
          }
          else if(sex0.equals("")){
          	JOptionPane.showMessageDialog(null,"Select Gender","Select Data",JOptionPane.ERROR_MESSAGE);
        ready0=false;
          }
          else if(cases0.equals("")){
          	JOptionPane.showMessageDialog(null,"Input Case","Input Data",JOptionPane.ERROR_MESSAGE);
         ready0=false;
          }
          else if(dura0.equals("")){
          	JOptionPane.showMessageDialog(null,"Input Nationality","Input Data",JOptionPane.ERROR_MESSAGE);
         ready0=false;
          }
          else if(level0.equals("")){
          	JOptionPane.showMessageDialog(null,"Select Security Level","Select Data",JOptionPane.ERROR_MESSAGE);
         ready0=false;
          }
          else if(stats0.equals("")){
          	JOptionPane.showMessageDialog(null,"Input Status","Input Data",JOptionPane.ERROR_MESSAGE);
         ready0=false;
          }

          else if(type0.equals("")){
          	JOptionPane.showMessageDialog(null,"Select Type of Atty.","Select Data",JOptionPane.ERROR_MESSAGE);
ready0=false;
          }
          else if(atty0.equals("")){
          	JOptionPane.showMessageDialog(null,"Input Atty's Name","Input Data",JOptionPane.ERROR_MESSAGE);
         ready0=false;
          }

		if(ready0==true){

String updateid=t1.getText();



	//delete from existing cell

Statement stbs=null;
try{
	Connection con4241=DriverManager.getConnection(dburl,userdb,passdb);
	String squeryee="delete from cell"+cellnumber+" where id="+updateid+"";
	stbs=con4241.createStatement();
	stbs.executeUpdate(squeryee);

stbs.close();
con4241.close();
}catch(Exception es){
	JOptionPane.showMessageDialog(null,es);
}

			//check status update
boolean inserted=false;
			for(int oy=1;oy<=5;oy++){

int countcell=0;
boolean levelcell=true;


				try{
	Connection con=DriverManager.getConnection(dburl,userdb,passdb);
	String squery1112="select level from cell"+oy+" ";
	Statement st1112=con.createStatement();
	ResultSet rs1112=st1112.executeQuery(squery1112);

	while(rs1112.next()){
		String dblevel=rs1112.getString("level");
		if(dblevel.equals("")){
		}
		else{
		countcell++;
		}
		if(!(dblevel.equals(level0))){
			levelcell=false;
		}
		if(countcell>39){
			levelcell=false;
		}
	}
	con.close();



	if(levelcell==true){

		//insert in cell
PreparedStatement st=null;

try{
	Connection con44=DriverManager.getConnection(dburl,userdb,passdb);


	String squery="insert into cell"+oy+"(id,name,bmon,bdate,byear,age,sex,emon,edate,eyear,rmon,rdate,ryear,level,cases,dura,stat,type,atty,photo)value('"+updateid+"','"+name0+"','"+bmon0+"','"+bdate0+"','"+byear0+"','"+age0+"','"+sex0+"','"+emon0+"','"+edate0+"','"+eyear0+"','"+rmon0+"','"+rdate0+"','"+ryear0+"','"+level0+"','"+cases0+"','"+dura0+"','"+stats0+"','"+type0+"','"+atty0+"',?)";
	st=con44.prepareStatement(squery);
	FileInputStream fin = new FileInputStream(file);
	st.setBinaryStream(1,fin);
	st.executeUpdate();


fin.close();
st.close();
con44.close();
}catch(Exception e6){
	JOptionPane.showMessageDialog(null,e6);
}




	// inserted in cell
		inserted=true;
		break;
	}//if true

	st1112.close();
	rs1112.close();

		if(oy==5&&inserted==false){
		JOptionPane.showMessageDialog(null,"Prison Cells reached it's limit /Security Level cannot be changed","Invalid",JOptionPane.WARNING_MESSAGE);
	}
}catch(Exception eaa){
JOptionPane.showMessageDialog(null,eaa);
}
			}//end of loop






if(inserted==true){
int countts=tmodel.getRowCount();
               while(countts>0){
               	tmodel.removeRow(0);
               	countts--;
               }
for(int y2=1;y2<=5;y2++){
               try{

Connection con21b1=DriverManager.getConnection(dburl,userdb,passdb);



	String squery111b1="select id,name,cases,cell from cell"+y2+" ";
	Statement st111b1=con21b1.createStatement();
	ResultSet rs111b1=st111b1.executeQuery(squery111b1);

	while(rs111b1.next()){
		int id1s1=rs111b1.getInt("id");
		String name1s1=rs111b1.getString("name");
		String cases11s1=rs111b1.getString("cases");
		String cel1s1=rs111b1.getString("cell");

		String okiey11[]={String.valueOf(id1s1),name1s1,cases11s1,cel1s1};
		tmodel.addRow(okiey11);
	}


	con21b1.close();

	st111b1.close();
	rs111b1.close();



       }catch(Exception eee1){
       	JOptionPane.showMessageDialog(null,eee1);
       }
               }
                t2.setText("");
           c1.setSelectedIndex(0);
           c2.setSelectedIndex(0);
           c3.setSelectedIndex(0);;
           t3.setText("");
           r1.setSelected(false);
           r2.setSelected(false);
           c4.setSelectedIndex(0);
           c5.setSelectedIndex(0);
           c6.setSelectedIndex(0);
           c7.setSelectedIndex(0);
           c8.setSelectedIndex(0);
           c9.setSelectedIndex(0);
           r3.setSelected(false);
           r4.setSelected(false);
           t4.setText("");
           t5.setText("");
           c.setSelectedIndex(0);
           r5.setSelected(false);
           r6.setSelected(false);
           t6.setText("");
           t6.setEditable(false);



          b9.setBounds(271,680,140,30);
          b29.setVisible(false);

           f5.setVisible(true);
           f2.setVisible(false);

           JOptionPane.showMessageDialog(null,"Submit Sucessfully","Sucess",JOptionPane.INFORMATION_MESSAGE);
			no="";
           file=null;


}//inserted
		}//updated
           }//confirmed changed

       }});


        tf1.addKeyListener(new KeyAdapter(){
       	public void keyTyped(KeyEvent e){
       		char x=e.getKeyChar();
       		if(!(Character.isDigit(x)|| x==KeyEvent.VK_BACK_SPACE || x==KeyEvent.VK_DELETE ||Character.isLetter(x)||x==KeyEvent.VK_ENTER)){
       			e.consume();
       			JOptionPane.showMessageDialog(null,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
       		}
       	}
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b1.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b2.doClick();
       		}
       	}
       });

        tf2.addKeyListener(new KeyAdapter(){
       	public void keyTyped(KeyEvent e){
       		char x=e.getKeyChar();
       		if(!(Character.isDigit(x)|| x==KeyEvent.VK_BACK_SPACE ||x==KeyEvent.VK_DELETE|| Character.isLetter(x)||x==KeyEvent.VK_ENTER)){
       			e.consume();
       			JOptionPane.showMessageDialog(null,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
       		}
       	}

       		public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b1.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b2.doClick();
       		}
       	}
       });

   searcht1.addKeyListener(new KeyAdapter(){
       	public void keyTyped(KeyEvent e){
       		char x=e.getKeyChar();
       		if(!(Character.isDigit(x)||x==KeyEvent.VK_DELETE|| x==KeyEvent.VK_BACK_SPACE||x==KeyEvent.VK_ENTER)){

       			e.consume();

       				JOptionPane.showMessageDialog(null,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);


       		}

       	}
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b6.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			int vv=JOptionPane.showConfirmDialog(null,"Clear Searchfield ?","Clear",JOptionPane.YES_NO_OPTION);
       			if(vv==0){
       			searcht1.setText("");
       			}
       		}
       	}
       });

        t2.addKeyListener(new KeyAdapter(){
       	public void keyTyped(KeyEvent e){
       		char x=e.getKeyChar();
       		if(!(Character.isLetter(x)||x==KeyEvent.VK_DELETE||x==KeyEvent.VK_BACK_SPACE||x==KeyEvent.VK_SPACE||x==KeyEvent.VK_ENTER)){
       			e.consume();
       			JOptionPane.showMessageDialog(null,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
       		}
       	}

       		public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });



        t4.addKeyListener(new KeyAdapter(){
       	public void keyTyped(KeyEvent e){
       		char x=e.getKeyChar();
       		if(!(Character.isLetter(x)||Character.isDigit(x)||x==KeyEvent.VK_DELETE|| x==KeyEvent.VK_BACK_SPACE ||x==KeyEvent.VK_SPACE||x==KeyEvent.VK_ENTER)){
       			e.consume();
       			JOptionPane.showMessageDialog(null,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
       		}
       	}

       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });
        t5.addKeyListener(new KeyAdapter(){
       	public void keyTyped(KeyEvent e){
       		char x=e.getKeyChar();
       		if(!(Character.isLetter(x)||x==KeyEvent.VK_DELETE|| x==KeyEvent.VK_BACK_SPACE ||x==KeyEvent.VK_SPACE||x==KeyEvent.VK_ENTER)){
       			e.consume();
       			JOptionPane.showMessageDialog(null,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
       		}
       	}

       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });



        t6.addKeyListener(new KeyAdapter(){
       	public void keyTyped(KeyEvent e){
       		char x=e.getKeyChar();
       		if(!(Character.isLetter(x)||x==KeyEvent.VK_DELETE|| x==KeyEvent.VK_BACK_SPACE ||x==KeyEvent.VK_SPACE||x==KeyEvent.VK_ENTER)){
       			e.consume();
       			JOptionPane.showMessageDialog(null,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
       		}
       	}

       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });

       t7.addKeyListener(new KeyAdapter(){
       	public void keyTyped(KeyEvent e){
       		char x=e.getKeyChar();
       		if(!(Character.isLetter(x)||x==KeyEvent.VK_DELETE|| x==KeyEvent.VK_BACK_SPACE ||x==KeyEvent.VK_SPACE||x==KeyEvent.VK_ENTER||x==KeyEvent.VK_ESCAPE)){
       			e.consume();
       			JOptionPane.showMessageDialog(null,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
       		}
       	}

       		public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b18.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b19.doClick();
       		}
       		if(xx==KeyEvent.VK_ESCAPE){
       			b199.doClick();
       		}
       	}
       });

        t8.addKeyListener(new KeyAdapter(){
       	public void keyTyped(KeyEvent e){
       		char x=e.getKeyChar();
       		if(!(Character.isDigit(x)||x==KeyEvent.VK_DELETE|| x==KeyEvent.VK_BACK_SPACE ||Character.isLetter(x)||x==KeyEvent.VK_ENTER||x==KeyEvent.VK_ESCAPE)){
       			e.consume();
       			JOptionPane.showMessageDialog(null,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
       		}
       	}

       		public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b18.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b19.doClick();
       		}
       			if(xx==KeyEvent.VK_ESCAPE){
       			b199.doClick();
       		}
       	}
       });

        t9.addKeyListener(new KeyAdapter(){
       	public void keyTyped(KeyEvent e){
       		char x=e.getKeyChar();
       		if(!(Character.isDigit(x)||x==KeyEvent.VK_DELETE|| x==KeyEvent.VK_BACK_SPACE || Character.isLetter(x)||x==KeyEvent.VK_ENTER||x==KeyEvent.VK_ESCAPE)){
       			e.consume();
       			JOptionPane.showMessageDialog(null,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
       		}
       	}

       		public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b18.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b19.doClick();
       		}
       			if(xx==KeyEvent.VK_ESCAPE){
       			b199.doClick();
       		}
       	}
       });

        t10.addKeyListener(new KeyAdapter(){
       	public void keyTyped(KeyEvent e){
       		char x=e.getKeyChar();
       		if(!(Character.isDigit(x)||x==KeyEvent.VK_DELETE|| x==KeyEvent.VK_BACK_SPACE ||Character.isLetter(x)||x==KeyEvent.VK_ENTER||x==KeyEvent.VK_ESCAPE)){
       			e.consume();
       			JOptionPane.showMessageDialog(null,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
       		}
       	}

       		public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b18.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b19.doClick();
       		}
       			if(xx==KeyEvent.VK_ESCAPE){
       			b199.doClick();
       		}
       	}
       });

        c1.addKeyListener(new KeyAdapter(){
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });

        c2.addKeyListener(new KeyAdapter(){
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });

        c3.addKeyListener(new KeyAdapter(){
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });

 c4.addKeyListener(new KeyAdapter(){
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });

 c5.addKeyListener(new KeyAdapter(){
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });
 c6.addKeyListener(new KeyAdapter(){
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });

 c7.addKeyListener(new KeyAdapter(){
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });

 c8.addKeyListener(new KeyAdapter(){
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });

 c9.addKeyListener(new KeyAdapter(){
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });

c.addKeyListener(new KeyAdapter(){
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });

 c10.addKeyListener(new KeyAdapter(){

       		public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b18.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b19.doClick();
       		}
       			if(xx==KeyEvent.VK_ESCAPE){
       			b199.doClick();
       		}
       	}
       });
c11.addKeyListener(new KeyAdapter(){

       		public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b18.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b19.doClick();
       		}
       			if(xx==KeyEvent.VK_ESCAPE){
       			b199.doClick();
       		}
       	}
       });
c12.addKeyListener(new KeyAdapter(){

       		public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b18.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b19.doClick();
       		}
       			if(xx==KeyEvent.VK_ESCAPE){
       			b199.doClick();
       		}
       	}
       });
       r1.addKeyListener(new KeyAdapter(){
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });
       r2.addKeyListener(new KeyAdapter(){
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });
       r3.addKeyListener(new KeyAdapter(){
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });
       r4.addKeyListener(new KeyAdapter(){
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });
       r5.addKeyListener(new KeyAdapter(){
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });
       r6.addKeyListener(new KeyAdapter(){
       	public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b8.doClick();
       			save.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b10.doClick();
       		}
       	}
       });

       r7.addKeyListener(new KeyAdapter(){

       		public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b18.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b19.doClick();
       		}
       			if(xx==KeyEvent.VK_ESCAPE){
       			b199.doClick();
       		}
       	}
       });
       r8.addKeyListener(new KeyAdapter(){

       		public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b18.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b19.doClick();
       		}
       			if(xx==KeyEvent.VK_ESCAPE){
       			b199.doClick();
       		}
       	}
       });

       r9.addKeyListener(new KeyAdapter(){

       		public void keyPressed(KeyEvent e){
       		char xx=e.getKeyChar();
       		if(xx==KeyEvent.VK_ENTER){
       			b18.doClick();
       		}

       		if(xx==KeyEvent.VK_DELETE){
       			b19.doClick();
       		}
       			if(xx==KeyEvent.VK_ESCAPE){
       			b199.doClick();
       		}
       	}
       });

         table.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent evt) {

    	int roww=table.getSelectedRow();

    	String a1=table.getValueAt(roww,0).toString();
    	String a2=table.getValueAt(roww,3).toString();

    	if(roww>=0){

icon0="";
    	 fp5=new ImageIcon(icon0);
  logo5.setIcon(fp5);



try{

	Connection con=DriverManager.getConnection(dburl,userdb,passdb);
	String squery="select id,name,bmon,bdate,byear,age,sex,emon,edate,eyear,rmon,rdate,ryear,level,cases,dura,stat,type,atty,photo from cell"+a2+" where id='"+a1+"'";

	Statement st1111=con.createStatement();
	ResultSet rs111=st1111.executeQuery(squery);


	while(rs111.next()){

		int id1=rs111.getInt("id");
		String name1=rs111.getString("name");
		String bmon1=rs111.getString("bmon");
		String bdate1=rs111.getString("bdate");
		String byear1=rs111.getString("byear");
		String age1=rs111.getString("age");
		String sex1=rs111.getString("sex");
		String emon1=rs111.getString("emon");
		String edate1=rs111.getString("edate");
		String eyear1=rs111.getString("eyear");
		String rmon1=rs111.getString("rmon");
		String rdate1=rs111.getString("rdate");
		String ryear1=rs111.getString("ryear");
		String level1=rs111.getString("level");
		String cases1=rs111.getString("cases");
		String dura1=rs111.getString("dura");
		String stat1=rs111.getString("stat");
		String type1=rs111.getString("type");
		String atty1=rs111.getString("atty");


File file1=new File("pic"+id1+ha1+".jpg");
ha1++;
FileOutputStream output=new FileOutputStream(file1);
icon0=file1.getAbsolutePath();
InputStream input =rs111.getBinaryStream("photo");
byte[] buffer=new byte[1024];
while(input.read(buffer)>0){
	output.write(buffer);


}

fp5=new ImageIcon(icon0);
  logo5.setIcon(fp5);
	icon0="";

	output.close();
	input.close();





		   ta0.setText(
" \n" +
"	Personal Information\n" +
"\n" +
" Prisonner ID :  " + String.valueOf(id1)+"\n" +
"\n" +
" Name :  "+name1+"\n" +
"\n" +
" Date of Birth :  " +bmon1+"/"+bdate1+"/"+byear1+"\n"+
"\n" +
" Age :  "+age1+"\n" +
"\n" +
" Sex :  "+sex1+"\n" +
"\n" +
" Entrance Date :  "+emon1+"/"+edate1+"/"+eyear1+"\n" +
"\n" +
" Release Date :  "+rmon1+"/"+rdate1+"/"+ryear1+"\n" +
"\n" +
" Security Level :  "+level1+"\n" +
"\n" +
" Criminal Case :  "+cases1+"\n" +
"\n" +
" Nationality :  "+dura1+"\n" +
"\n" +
" Status :  "+stat1+"\n" +
"\n" +
" Attorney :  "+atty1+"\n" +

"");



         }
}catch(Exception baba){
	JOptionPane.showMessageDialog(null,baba);
}

}
}});






}//main
public static void SortFilter(JTable t,JTextField filter,TableRowSorter<TableModel>rowSorter){
	t.setRowSorter(rowSorter);
	filter.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void insertUpdate(DocumentEvent e){
			String text=filter.getText();

			if(text.trim().length()==0){
				rowSorter.setRowFilter(null);
			}
			else{
				rowSorter.setRowFilter(RowFilter.regexFilter("(?i)"+text));
			}
		}
			@Override
		public void removeUpdate(DocumentEvent e){
			String text=filter.getText();
			if(text.trim().length()==0){
				rowSorter.setRowFilter(null);

			}
			else{
				rowSorter.setRowFilter(RowFilter.regexFilter("(?i)"+text));
			}
		}
			@Override
		public void changedUpdate(DocumentEvent e){
			throw new UnsupportedOperationException("Not supported yet.");
		}
	});
}
}//class