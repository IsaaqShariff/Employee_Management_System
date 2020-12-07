package Employeee;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class Add_department implements ActionListener{

    JFrame f;
    JLabel Id,Id1,Id2,Id3,Id4,Id5,Id6,Id7,Id8,Id9,Id10,Id11,Id12,Id15,Id16,Id17,Lab,Lab1;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    JButton ba,bb,b2,b3;

    Add_department(int i){}
    
    Add_department(){
        f = new JFrame("Add_department");
        f.setBackground(Color.white);
        f.setLayout(null);

        Id15=new JLabel();
        Id15.setBounds(0,0,900,700);
        Id15.setLayout(null);
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/add_department.jpg"));
        Id15.setIcon(img1);

        Id8 = new JLabel("Enter New Department Details");
        Id8.setBounds(50,5,500,50);
        Id8.setFont(new Font("serif",Font.BOLD,35));
        Id8.setForeground(Color.black);
        Id15.add(Id8);
        f.add(Id15);

 
        Id1 = new JLabel("Department-ID:");
        Id1.setBounds(20,200,190,30);
        Id1.setFont(new Font("serif",Font.BOLD,26));
        Id15.add(Id1);

        t1=new JTextField();
        t1.setBounds(240,200,200,30);
        Id15.add(t1);

        Id2 = new JLabel("Department-Name:");
        Id2.setBounds(20,400,300,30);
        Id2.setFont(new Font("serif",Font.BOLD,26));
        Id15.add(Id2);

        t2=new JTextField();
        t2.setBounds(290,400,190,30);
        Id15.add(t2);

        Id3= new JLabel("Department Description:");
        Id3.setBounds(20,230,300,190);
        Id3.setFont(new Font("serif",Font.BOLD,26));
        Id15.add(Id3);

        t3=new JTextField();
        t3.setBounds(320,300,400,60);
        Id15.add(t3);
        
        

        Id4= new JLabel("No of Employees");  
        Id4.setBounds(490,200,200,30);
        Id4.setFont(new Font("serif",Font.BOLD,20));
        Id15.add(Id4);

        t4=new JTextField();
        t4.setBounds(650,200,150,30);
        Id15.add(t4);/*

        Id5= new JLabel("Employee name:");
        Id5.setBounds(20,350,150,90);
        Id5.setFont(new Font("serif",Font.BOLD,20));
        Id15.add(Id5);

        t5=new JTextField();
        t5.setBounds(190,383,200,30);
        Id15.add(t5);

        Id6= new JLabel("Project status:");
        Id6.setBounds(490,250,150,30);
        Id6.setFont(new Font("serif",Font.BOLD,20));
        Id15.add(Id6);

        t6=new JTextField();
        t6.setBounds(650,250,150,30);
        Id15.add(t6);*/

        

        

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
        
        String a = t1.getText();//department id
        String bbb = t2.getText();//department name
        String c = t3.getText();//department-desc
        String d=t4.getText();//no of emp
        
        
        if(ae.getSource() == ba){
            try{
                conn cccc = new conn();
                String q1 = "insert into department values('"+a+"','"+bbb+"','"+c+"','"+d+"')";
                cccc.s.executeUpdate(q1);
                JOptionPane.showMessageDialog(null,"Trigger4:Details Successfully Inserted into department!");
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
        new Add_department();
    }
}
