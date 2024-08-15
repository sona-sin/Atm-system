
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transaction extends JFrame implements ActionListener{
     JLabel l1;
    JButton deposite,withdrawl,fastcash,ministatement,balanceEnquiry,Pin;
     JButton b7;
    String pin;
Transaction(String pin){
    this.pin = pin;
ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2);
JLabel Image=new JLabel(i3);
Image.setBounds(0,0,900,900);
add(Image);

 l1 = new JLabel("Please Select Your Transaction");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(220,300,600,20);
        Image.add(l1);
        
       
        deposite = new JButton("DEPOSIT");
         deposite.setBounds(170,400,150,20);
        Image.add(deposite);
        deposite.addActionListener(this);
        
        withdrawl = new JButton("CASH WITHDRAWL");
        withdrawl.setBounds(350,400,150,20);
        Image.add(withdrawl);
        withdrawl.addActionListener(this);
        
       fastcash = new JButton("FAST CASH");
        fastcash.setBounds(170,440,150,20);
        Image.add(fastcash);
        fastcash.addActionListener(this);
        
        ministatement = new JButton("MINI STATEMENT");
        ministatement.setBounds(350,440,150,20);
        Image.add(ministatement);
        ministatement.addActionListener(this);
        
       Pin = new JButton("PIN CHANGE");
        Pin.setBounds(170,480,150,20);
        Image.add(Pin);
        Pin.addActionListener(this);
        
        balanceEnquiry = new JButton("BALANCE ENQUIRY");
        balanceEnquiry.setBounds(350,480,150,20);
        Image.add(balanceEnquiry);
        balanceEnquiry.addActionListener(this);
        
        b7 = new JButton("EXIT");
         b7.setBounds(350,520,150,20);
        Image.add(b7);
        b7.addActionListener(this);
        
        setLayout(null);
      
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposite){ 
            setVisible(false);
            new Deposit(pin).setVisible(true);
        }else if(ae.getSource()==withdrawl){ 
            setVisible(false);
            new Withdrawl(pin).setVisible(true);
        }else if(ae.getSource()==fastcash){ 
            setVisible(false);
            new FastCash(pin).setVisible(true);
        }else if(ae.getSource()==ministatement){ 
            new MiniStatement(pin).setVisible(true);
        }else if(ae.getSource()==Pin){ 
            setVisible(false);
            new Pin(pin).setVisible(true);
        }else if(ae.getSource()==balanceEnquiry){ 
            this.setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        }else if(ae.getSource()==b7){ 
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Transaction("").setVisible(true);
    }
    
}
