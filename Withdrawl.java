
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
//import java.sql.*;


public class Withdrawl  extends JFrame implements ActionListener{

    JTextField t1,t2;
    JButton withdraw,b2,b3;
    JLabel l1,l2,l4;
    String pin;
    Withdrawl(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(0, 0, 900, 900);
        add(Image);
        
        l1 = new JLabel("MAXIMUM WITHDRAWAL IS RS.10,000..");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        
        l2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System", Font.BOLD, 16));
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 25));
        
        withdraw = new JButton("WITHDRAW");
        b2 = new JButton("BACK");
        
        setLayout(null);
        
        l1.setBounds(180,300,400,22);
        Image.add(l1);
        
        l2.setBounds(220,350,400,22);
        Image.add(l2);
        
        t1.setBounds(180,380,320,28);
        Image.add(t1);
        
        withdraw.setBounds(350,480,150,22);
        Image.add(withdraw);
        
        b2.setBounds(350,520,150,22);
        Image.add(b2);
        
        withdraw.addActionListener(this);
        b2.addActionListener(this);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        try{
            String amount = t1.getText();
            Date date = new Date();
            if(ae.getSource()==withdraw){
                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Withdraw");
                }else{
                    Conn c1 = new Conn();
                    c1.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdraw', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                    
                    setVisible(false);
                    new Transaction(pin).setVisible(true);
}
            }else if(ae.getSource()==b2){
                setVisible(false);
                new Transaction(pin).setVisible(true);
            }
        }catch(Exception e){
//                e.printStackTrace();
                System.out.println("error: "+e);
        }
            
    }

   
    public static void main(String[] args) {
        // TODO code application logic here
         new Withdrawl("").setVisible(true);
    }
    
}
