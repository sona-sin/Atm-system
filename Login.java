
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
JButton login,clear,signup;
JTextField cardtextField;
JPasswordField pintextField;
Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
			Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i2);
			JLabel label=new JLabel(i3);
                        label.setBounds(70,10,100,100);
			add(label);
                        
                        JLabel text =new JLabel("welcome to ATM");
                        text.setFont(new Font("Osward",Font.BOLD,38));
                        text.setBounds(200,40,400,40);
                        add(text);
                        
                        JLabel cardno =new JLabel("Card No");
                        cardno.setFont(new Font("Raleway",Font.BOLD,28));
                        cardno.setBounds(120,150,150,30);
                        add(cardno);
                        
                        
                        cardtextField=new JTextField();
                        cardtextField.setBounds(300,150,230,30);
                        cardtextField.setFont(new Font("Arial",Font.BOLD,14)); 
                        add(cardtextField);
                        
                        JLabel pin =new JLabel("PIN");
                        pin.setFont(new Font("Raleway",Font.BOLD,28));
                        pin.setBounds(120,220,250,30);
                        add(pin);
                        
                       
                        pintextField=new JPasswordField();
                        pintextField.setBounds(300,220,230,30);
                       pintextField.setFont(new Font("Arial",Font.BOLD,14)); 
                        add(pintextField);
                        
                       login=new JButton("SIGN IN");
                        login.setBounds(300,300,100,30);
                        login.setBackground(Color.BLACK);
                        login.setForeground(Color.WHITE);
                        login.addActionListener(this);
                        add(login);  
                        
                        clear=new JButton("CLEAR");
                        clear.setBounds(430,300,100,30);
                        clear.setBackground(Color.BLACK);
                        clear.setForeground(Color.WHITE);
                        clear.addActionListener(this);
                        add(clear); 
                        
                          signup=new JButton("SIGN UP");
                        signup.setBounds(300,350,230,30);
                        signup.setBackground(Color.BLACK);
                        signup.setForeground(Color.WHITE);
                       signup.addActionListener(this);
                        add(signup);  
                        getContentPane().setBackground(Color.WHITE);
			
    
   setSize(800,480);
   setVisible(true);
   setLocation(350,200);    
}
    public void actionPerformed(ActionEvent ae){
        try{
    if(ae.getSource()==login){
  
        
        Conn c=new Conn();
        String cardnumber =cardtextField.getText();
        String pin =pintextField.getText();
        String q="select *from login where cardnumber='"+cardnumber+"'and pin='"+pin+"'";
     try{
        ResultSet rs=c.s.executeQuery(q);
       if(rs.next()){
           setVisible(false);
           new Transaction(pin).setVisible(true);
       }else{
           JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
       }
     }catch(Exception e){
         System.out.println(e);
     }   
   
    }else if(ae.getSource()==clear){
        cardtextField.setText("");
        pintextField.setText("");
        
    }else if(ae.getSource()==signup){
        setVisible(false);
        new SignupOne().setVisible(true);
    }
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    new Login().setVisible(true);
    }
}
