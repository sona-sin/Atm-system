
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class SignupThree extends JFrame implements ActionListener{
JRadioButton r1,r2,r3,r4;
JCheckBox c1,c2,c3,c4,c5,c6,c7;
JButton submit,cancel;
String formno;
    SignupThree(String formno){
        this.formno=formno;
        setLayout(null);
        JLabel l1=new JLabel("page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,24));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type=new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100, 140 , 200 ,30);
        add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.white);
        r1.setBounds(100,180,250,20);
        add(r1);
        
        r2=new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.white);
        r2.setBounds(350 , 180 , 250 , 20);
        add(r2);
        
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.white);
        r3.setBounds(100,220,250,20);
        add(r3);
        
        r4=new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.white);
        r4.setBounds(350,220,250,20);
        add(r4);
        
        ButtonGroup groupaccount =new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel cardnumber=new JLabel("Card Number");
        cardnumber.setFont(new Font("Raleway",Font.BOLD,22));
        cardnumber.setBounds(100,300,200,30);
        add(cardnumber);
        
         JLabel number=new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel carddetails=new JLabel("Your 16 digit card number");
        carddetails.setFont(new Font("Raleway",Font.BOLD,12));
        carddetails.setBounds(100,330,300,20);
        add(carddetails);
        
        JLabel pin=new JLabel("PIN");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
         JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        JLabel pindetails=new JLabel("Your 4 digit  pin");
        pindetails.setFont(new Font("Raleway",Font.BOLD,12));
        pindetails.setBounds(100,400,300,20);
        add(pindetails);
        
         JLabel services=new JLabel("Services Required : ");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,250,30);
        add(services);
        
        c1=new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2=new JCheckBox("Mobile Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3=new JCheckBox("Internet Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4=new JCheckBox("EMAIL & SMS alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5=new JCheckBox("E-Statements");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6=new JCheckBox("Cheque book");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7=new JCheckBox("I hereby declaires that the above enterd datails are correct to the best of my knowlwdge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,16));
        c7.setBounds(100,670,700,30);
        add(c7);
        
        submit =new JButton("Submit");
        submit.setFont(new Font("Raleway",Font.BOLD,16));
submit.setBackground(Color.black);
submit.setForeground(Color.white);
submit.setBounds(200,710,100,30);
submit.addActionListener(this);
add(submit);

cancel =new JButton("Cancel");
        cancel.setFont(new Font("Raleway",Font.BOLD,16));
cancel.setBackground(Color.black);
cancel.setForeground(Color.white);
cancel.setBounds(400,710,100,30);
cancel.addActionListener(this);

add(cancel);
        
getContentPane().setBackground(Color.white);        
         setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==submit){
      String accountType=null;
      if(r1.isSelected()){
          accountType="Saving Account";
      }else if(r2.isSelected()){
          accountType="Fixed Deposite Account";
          }else if(r3.isSelected()){
          accountType="Current Account";
      }else if(r4.isSelected()){
          accountType="Reccuring Deposite Account";
      }
      Random random=new Random();
String cardnumber="" +Math.abs((random.nextLong()%90000000L))+5040936000000000L;
String pin=""+Math.abs((random.nextLong()%9000L)+1000L);
   
    String facility="";
    if(c1.isSelected()){
        facility=facility+"ATM Card";
        
    }else if(c2.isSelected()){
        facility=facility+"Mobile Banking";
        
    }else if(c3.isSelected()){
        facility=facility+"Internet Banking";
        
    }else if(c4.isSelected()){
        facility=facility+"EMAIL & SMS alerts";
        
    }else if(c5.isSelected()){
        facility=facility+"E-Statement";
        
    }else if(c6.isSelected()){
        facility=facility+"Cheque book";
        
//    }else if(c7.isSelected()){
//        facility=facility+"I hereby declaires that the above enterd datails are correct to the best of my knowlwdge";
//        
    }
    
    try{
        if(accountType.equals("")){
        JOptionPane.showMessageDialog(null, "Account Type is Required");
        }else{
        Conn c=new Conn();
        String query1="insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pin+"','"+facility+"')";
        String query2="insert into login values('"+ formno +"','"+ cardnumber +"','"+ pin +"')";
        c.s.executeUpdate(query1);
          c.s.executeUpdate(query2);
          JOptionPane.showMessageDialog(null,"Card Number :"+cardnumber+"\n pin: "+pin);
       
          setVisible(false);
       new Deposit(pin).setVisible(true);
        }
    }
   catch(Exception e){
        System.out.println(e);
    }
     
    }else if(ae.getSource()==cancel){
       setVisible(false);
       new Login().setVisible(true);
    }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    new SignupThree("");
    }
    
}
