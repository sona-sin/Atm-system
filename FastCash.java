
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.sql.*;
import java.util.Date;
import java.sql.ResultSet;

public class FastCash extends JFrame implements ActionListener {

    JLabel l1, l2;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    JTextField t1;
    String pin;

    FastCash(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 900, 900);
        add(l3);

        l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));

        b1 = new JButton("Rs 100");
        b2 = new JButton("Rs 500");
        b3 = new JButton("Rs 1000");
        b4 = new JButton("Rs 2000");
        b5 = new JButton("Rs 5000");
        b6 = new JButton("Rs 10000");
        b7 = new JButton("BACK");

        setLayout(null);

        l1.setBounds(235, 350, 700, 35);
        l3.add(l1);

        b1.setBounds(170, 400, 150, 22);
        l3.add(b1);

        b2.setBounds(350, 400, 150, 22);
        l3.add(b2);

        b3.setBounds(170, 440, 150, 22);
        l3.add(b3);

        b4.setBounds(350, 440, 150, 22);
        l3.add(b4);

        b5.setBounds(170, 480, 150, 22);
        l3.add(b5);

        b6.setBounds(350, 480, 150, 22);
        l3.add(b6);

        b7.setBounds( 350,520,150,20);
        l3.add(b7);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b7) {
                this.setVisible(false);
                new Transaction(pin).setVisible(true);
}else{
            String amount = ((JButton)ae.getSource()).getText().substring(3); 
            Conn c = new Conn();
            try{
                ResultSet rs=c.s.executeQuery("select *from bank where pin = '"+pin+"'");
            int balance =0;
            while(rs.next()){
                if(rs.getString("type").equals("Deposite")){
                    balance +=Integer.parseInt(rs.getString("amount"));
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                    }
            }
            
                if(ae.getSource() != b7 && balance < Integer.parseInt(amount)){
                JOptionPane.showMessageDialog(null,"Insufficient Balance");
                
            
                    Date date = new Date();
                c.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdraw', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                }
                setVisible(false);
                new Transaction(pin).setVisible(true);
                
        } catch (Exception e) {
           System.out.println(e);
        }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
     new FastCash("").setVisible(true);
    }
    
}
