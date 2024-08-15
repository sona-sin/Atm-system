
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public  class SignupOne extends JFrame implements ActionListener{
    
long random;
JTextField nameTextField,fathersNameTextField,emailTextField,addressTextField,cityTextField, stateTextField,pincodeTextField , mobilenumberTextField;
JButton next;
JRadioButton male,female,other,married,unmarried;
JDateChooser dateChooser;
SignupOne(){
    setLayout(null);
    Random ran=new Random();
     random=(Math.abs(ran.nextLong()%9000L)+1000L);
    
    JLabel formno=new JLabel("APPLICATION FORM NO." +random);
    formno.setFont(new Font ("Raleway",Font.BOLD,38));
    formno.setBounds(140,20,600,40);
    add(formno);
    
      JLabel personalDetails=new JLabel("PAGE 1: Personal Details");
    personalDetails.setFont(new Font ("Raleway",Font.BOLD,22));
    personalDetails.setBounds(290,80,400,30);
    add( personalDetails);
    
    JLabel name=new JLabel("NAME:");
   name.setFont(new Font ("Raleway",Font.BOLD,20));
   name.setBounds(100,140,100,30);
    add( name);
     nameTextField=new JTextField();
    nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
    nameTextField.setBounds(300,140,400,30);
    add(nameTextField);
    
     JLabel fathersName=new JLabel("FATHER'S NAME:");
   fathersName.setFont(new Font ("Raleway",Font.BOLD,20));
   fathersName.setBounds(100,190,200,30);
    add( fathersName);
    fathersNameTextField=new JTextField();
    fathersNameTextField.setFont(new Font("Raleway",Font.BOLD,14));
    fathersNameTextField.setBounds(300,190,400,30);
    add(fathersNameTextField);
    
     JLabel dob=new JLabel("DATE OF BIRTH:");
   dob.setFont(new Font ("Raleway",Font.BOLD,20));
   dob.setBounds(100,240,200,30);
    add( dob);
    
     dateChooser=new JDateChooser();
    dateChooser.setBounds(300,240,400,30);
    dateChooser.setForeground(new Color(105,105,105));
    add(dateChooser);
    
     JLabel gender=new JLabel("GENDER:");
   gender.setFont(new Font ("Raleway",Font.BOLD,20));
   gender.setBounds(100,290,200,30);
    add( gender); 
    
 male=new JRadioButton("MALE");
male.setBounds(300,290,60,30);
male.setBackground(Color.WHITE);
add(male);

 female=new JRadioButton("FEMALE");
female.setBounds(450,290,100,30);
female.setBackground(Color.WHITE);
add(female);

ButtonGroup gendergroup=new ButtonGroup();
gendergroup.add(male);
gendergroup.add(female);

JLabel email=new JLabel("EMAIL ADDRESS:");
   email.setFont(new Font ("Raleway",Font.BOLD,20));
   email.setBounds(100,340,200,30);
    add( email);
  emailTextField=new JTextField();
   emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
    emailTextField.setBounds(300,340,400,30);
    add(emailTextField);
    
    JLabel mobilenumber=new JLabel("CONTACT NUMBER:");
   mobilenumber.setFont(new Font ("Raleway",Font.BOLD,20));
   mobilenumber.setBounds(100,390,200,30);
    add( mobilenumber);
   mobilenumberTextField=new JTextField();
    mobilenumberTextField.setFont(new Font("Raleway",Font.BOLD,14));
    mobilenumberTextField.setBounds(300,390,400,30);
    add(mobilenumberTextField);
    
    JLabel marritalStatus=new JLabel("MARRITAL STATUS:");
   marritalStatus.setFont(new Font ("Raleway",Font.BOLD,20));
   marritalStatus.setBounds(100,440,200,30);
    add( marritalStatus);
    

    married=new JRadioButton("MARRIED");
married.setBounds(300,440,100,30);
married.setBackground(Color.WHITE);
add(married);


unmarried=new JRadioButton("UNMARRIED");
unmarried.setBounds(450,440,100,30);
unmarried.setBackground(Color.WHITE);
add(unmarried);


other=new JRadioButton("OTHER");
other.setBounds(630,440,100,30);
other.setBackground(Color.WHITE);
add(other);

ButtonGroup maritalgroup=new ButtonGroup();
maritalgroup.add(married);
maritalgroup.add(unmarried);
maritalgroup.add(other);

    JLabel address=new JLabel("ADDRESS:");
   address.setFont(new Font ("Raleway",Font.BOLD,20));
   address.setBounds(100,490,200,30);
    add( address);
   
    addressTextField=new JTextField();
    addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
    addressTextField.setBounds(300,490,400,30);
    add(addressTextField);
    
    JLabel city=new JLabel("CITY:");
   city.setFont(new Font ("Raleway",Font.BOLD,20));
   city.setBounds(100,540,200,30);
    add( city);
    
    
    cityTextField=new JTextField();
    cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
    cityTextField.setBounds(300,540,400,30);
    add(cityTextField);
    
    JLabel state=new JLabel("STATE:");
   state.setFont(new Font ("Raleway",Font.BOLD,20));
   state.setBounds(100,590,100,30);
    add( state);
    
   
    stateTextField=new JTextField();
    stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
    stateTextField.setBounds(300,590,400,30);
    add(stateTextField);
    
    JLabel pincode=new JLabel("PINCODE:");
   pincode.setFont(new Font ("Raleway",Font.BOLD,20));
   pincode.setBounds(100,640,100,30);
    add( pincode);
    
  
    pincodeTextField=new JTextField();
    pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
    pincodeTextField.setBounds(300,640,400,30);
    add(pincodeTextField);
    
     next =new JButton("NEXT");
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setFont(new Font("Raleway",Font.BOLD,14));
    next.setBounds(620,680,80,30);
    next.addActionListener(this);
    add(next);
    
    
    getContentPane().setBackground(Color.WHITE);
    setSize(850,800);
    setLocation(350,10);
    setVisible(true);
}
    public void actionPerformed(ActionEvent ae){
      String formno="" +random; 
      String name=nameTextField.getText();
       String fathersName=fathersNameTextField.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender =null;
if(male.isSelected()){        
    gender="MALE";
      
    }else{
    gender="FEMALE";
}
String email=emailTextField.getText();
String mobilenumber=mobilenumberTextField.getText();
String marrital=null;
if(married.isSelected()){
    marrital="MARRIED";
}else if(unmarried.isSelected()){
    marrital="UMNARRIED";
}else{
  marrital="other";  
}
String address=addressTextField.getText();
String city=cityTextField.getText();
String state=stateTextField.getText();
String pincode=pincodeTextField.getText();
    try{
    if(name.equals("")){
        JOptionPane.showMessageDialog(null,"NAME is Required");
}else{
        Conn c=new Conn();
        String query="insert into signup values('"+formno+"','"+name+"','"+fathersName+"','"+dob+"','"+gender+"','"+email+"','"+mobilenumber+"','"+marrital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
        c.s.executeUpdate(query);
        
        setVisible(false);
        new SignupTwo(formno).setVisible(true);
    }
    }catch (Exception e){
            System.out.println(e);
            }
    
    }
//    "String'"+variable+"'String"
    public static void main(String[] args) {
     new SignupOne();
        // TODO code application logic here
    }
    
}
