package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.sql.*;

public class SignupTwo extends JFrame implements ActionListener {

    
JTextField panTextField,adhTextField;
JComboBox reli,occ,cat,in,edu;
JButton next,sc,ea;
String formno;
JRadioButton yes,no;
SignupTwo(String formno){
    this.formno=formno;
    setLayout(null);
    
    setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 2 ");
      JLabel additionalDetails=new JLabel("PAGE 2: ADDITIONAL DETAILS");
    additionalDetails.setFont(new Font ("Raleway",Font.BOLD,22));
    additionalDetails.setBounds(290,80,400,30);
    add( additionalDetails);
    
    JLabel religion=new JLabel("Religion:");
   religion.setFont(new Font ("Raleway",Font.BOLD,20));
   religion.setBounds(100,140,200,30);
    add( religion);
    
     String valRelision[]={"Hindu","Muslim","Sikh","Cristian","others"};
   reli=new JComboBox(valRelision);
     reli.setBackground(Color.white);
     reli.setBounds(300,140,400,30);
    add(reli);
    
     JLabel category=new JLabel("Category:");
   category.setFont(new Font ("Raleway",Font.BOLD,20));
   category.setBounds(100,200,200,30);
    add( category);
    
     String valCategory[]={"General","Obc","Sc","St","others"};
     cat=new JComboBox(valCategory);
     cat.setBackground(Color.white);
     cat.setBounds(300,200,400,30);
    add(cat);
    
     JLabel income=new JLabel("Income:");
   income.setFont(new Font ("Raleway",Font.BOLD,20));
   income.setBounds(100,260,200,30);
    add( income);
    
    String valIncome[]={"1-150000","<150000","<250000","<5000000","More Than 5000000"};
      in=new JComboBox(valIncome);
     in.setBackground(Color.white);
     in.setBounds(300,260,400,30);
    add(in);
    
   
    
     JLabel education=new JLabel("Education");
   education.setFont(new Font ("Raleway",Font.BOLD,20));
   education.setBounds(100,320,200,30);
    add( education); 

  String valEducation[]={"Under Graduate","Graduate","Pst Graduate","Diploma","Others"};
      edu=new JComboBox(valEducation);
     edu.setBackground(Color.white);
     edu.setBounds(300,320,400,30);
    add(edu);
   
    JLabel occu=new JLabel("Occupation:");
   occu.setFont(new Font ("Raleway",Font.BOLD,20));
   occu.setBounds(100,380,200,30);
    add( occu);
   String valOccupation[]={"business","private Job","Student","Government Job","self Employeed","others"};
      occ=new JComboBox(valOccupation);
     occ.setBackground(Color.white);
     occ.setBounds(300,380,400,30);
    add(occ);
   
    JLabel sc=new JLabel("Senior Citizen:");
   sc.setFont(new Font ("Raleway",Font.BOLD,20));
   sc.setBounds(100,440,200,30);
    add( sc);
    

    yes=new JRadioButton("YES");
yes.setBounds(300,440,100,30);
yes.setBackground(Color.WHITE);
add(yes);


no=new JRadioButton("NO");
no.setBounds(450,440,100,30);
no.setBackground(Color.WHITE);
add(no);



ButtonGroup scgroup=new ButtonGroup();
scgroup.add(yes);
scgroup.add(no);

    JLabel pan=new JLabel("Pan Number:");
   pan.setFont(new Font ("Raleway",Font.BOLD,20));
   pan.setBounds(100,490,200,30);
    add( pan);
   
    panTextField=new JTextField();
    panTextField.setFont(new Font("Raleway",Font.BOLD,14));
    panTextField.setBounds(300,490,400,30);
    add(panTextField);
    
    JLabel adh=new JLabel("Adhaar Number:");
   adh.setFont(new Font ("Raleway",Font.BOLD,20));
   adh.setBounds(100,550,200,30);
    add( adh);
    
    
    adhTextField=new JTextField();
    adhTextField.setFont(new Font("Raleway",Font.BOLD,14));
    adhTextField.setBounds(300,550,400,30);
    add(adhTextField);
    
    JLabel ea=new JLabel("Existing Account:");
   ea.setFont(new Font ("Raleway",Font.BOLD,20));
  ea.setBounds(100,600,200,30);
    add( ea);
    
   yes=new JRadioButton("YES");
yes.setBounds(300,600,100,30);
yes.setBackground(Color.WHITE);
add(yes);


no=new JRadioButton("NO");
no.setBounds(450,600,100,30);
no.setBackground(Color.WHITE);
add(no);

ButtonGroup eagroup=new ButtonGroup();
eagroup.add(yes);
eagroup.add(no);

     next =new JButton("NEXT");
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setFont(new Font("Raleway",Font.BOLD,14));
    next.setBounds(620,650,80,30);
    next.addActionListener(this);
    add(next);
    
    
    getContentPane().setBackground(Color.WHITE);
    setSize(850,800);
    setLocation(350,10);
    setVisible(true);
}
    public void actionPerformed(ActionEvent ae){
String religion =(String)reli.getSelectedItem();
String category =(String)cat.getSelectedItem();
String income =(String)in.getSelectedItem();
String education =(String)edu.getSelectedItem();
String occu =(String)occ.getSelectedItem();
        String sc =null;
if(yes.isSelected()){        
    sc="YES";
      
    }else{
   sc="NO";
}
String panc=panTextField.getText();
String adhc=adhTextField.getText();
String ea=null;
if(yes.isSelected()){
    ea="YES";
}else {
   ea="NO";
}
    try{
    if(adhc.equals("")){
        JOptionPane.showMessageDialog(null,"Adhaar number is Required");
}else{
        Conn c=new Conn();
        String query="insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occu+"','"+sc+"','"+panc+"','"+adhc+"','"+ea+"')";
        c.s.executeUpdate(query);
        setVisible(false);
        new SignupThree(formno).setVisible(true);
    }
    }catch (Exception e){
            System.out.println(e);
            }
    
    }
    public static void main(String[] args) {
        new SignupTwo("").setVisible(true);
    }
    
}
