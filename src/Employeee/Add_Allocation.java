package Employeee;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class Add_Allocation implements ActionListener{

    JFrame f;
    JLabel Id,Id1,Id2,Id3,Id4,Id5,Id6,Id7,Id8,Id9,Id10,Id11,Id12,Id15,Id16,Id17,Lab,Lab1;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    JButton ba,bb,b2,b3;

    Add_Allocation(int i){}
    
    Add_Allocation(){
        f = new JFrame("Add_Allocation");
        f.setBackground(Color.white);
        f.setLayout(null);

        Id15=new JLabel();
        Id15.setBounds(0,0,900,700);
        Id15.setLayout(null);
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/add_allocation.jpg"));
        Id15.setIcon(img1);

        Id8 = new JLabel("Enter Allocation Details");
        Id8.setBounds(50,5,500,50);
        Id8.setFont(new Font("serif",Font.BOLD,35));
        Id8.setForeground(Color.black);
        Id15.add(Id8);
        f.add(Id15);

 
        Id1 = new JLabel("Allocation-ID:");
        Id1.setBounds(20,100,190,30);
        Id1.setFont(new Font("serif",Font.BOLD,26));
        Id15.add(Id1);

        t1=new JTextField();
        t1.setBounds(240,100,200,30);
        Id15.add(t1);

        Id2 = new JLabel("Employee ID:");
        Id2.setBounds(20,160,190,30);
        Id2.setFont(new Font("serif",Font.BOLD,26));
        Id15.add(Id2);

        t2=new JTextField();
        t2.setBounds(240,160,200,30);
        Id15.add(t2);

        Id3= new JLabel("Project ID:");
        Id3.setBounds(20,135,300,190);
        Id3.setFont(new Font("serif",Font.BOLD,26));
        Id15.add(Id3);

        t3=new JTextField();
        t3.setBounds(240,220,200,30);
        Id15.add(t3);
        
        

        Id4= new JLabel("Date of Allocation:");  
        Id4.setBounds(20,195,300,190);
        Id4.setFont(new Font("serif",Font.BOLD,26));
        Id15.add(Id4);

        t4=new JTextField();
        t4.setBounds(240,280,200,30);
        Id15.add(t4);

        Id5= new JLabel("Due Date:");
        Id5.setBounds(20,255,300,190);
        Id5.setFont(new Font("serif",Font.BOLD,26));
        Id15.add(Id5);

        t5=new JTextField();
        t5.setBounds(240,340,200,30);
        Id15.add(t5);

        Id6= new JLabel("Allocation status:");
        Id6.setBounds(20,310,300,190);
        Id6.setFont(new Font("serif",Font.BOLD,26));
        Id15.add(Id6);

        t6=new JTextField();
        t6.setBounds(240,395,200,30);
        Id15.add(t6);

        

        

        Lab=new JLabel();
        Lab.setBounds(200,450,250,200);
	Id15.add(Lab);

        Lab1=new JLabel("");
        Lab1.setBounds(600,450,250,200);
        Id15.add(Lab1);

        ba = new JButton("Submit");
        ba.setBackground(Color.BLACK);
        ba.setForeground(Color.WHITE);
        ba.setBounds(250,550,150,40);
        
        Id15.add(ba);

        bb=new JButton("Cancel");   
        bb.setBackground(Color.BLACK);
        bb.setForeground(Color.WHITE);
        bb.setBounds(450,550,150,40);
        
        Id15.add(bb);
        
        ba.addActionListener(this);
        bb.addActionListener(this);
        
        f.setVisible(true);
        f.setSize(900,700);
        f.setLocation(400,150);
    }

    public void actionPerformed(ActionEvent ae){
        
        String a = t1.getText();//
        String bbb = t2.getText();//
        String c = t3.getText();//
        String d=t4.getText();//
        String ef=t5.getText();//
        String gh=t6.getText();//
        
        if(ae.getSource() == ba){
            try{
                conn ccccc = new conn();
                String q1 = "insert into allocation values('"+a+"','"+bbb+"','"+c+"','"+d+"','"+ef+"','"+gh+"')";
                ccccc.s.executeUpdate(q1);
                JOptionPane.showMessageDialog(null,"Trigger5:Details Successfully Inserted into Allocations!");
                f.setVisible(false);
                new details();
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(ae.getSource() == bb){
            f.setVisible(false);
            new details();
        }
    }
    public static void main(String[ ] arg){
        new Add_Allocation();
    }
}
