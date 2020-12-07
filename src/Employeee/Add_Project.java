package Employeee;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class Add_Project implements ActionListener{

    JFrame f;
    JLabel Id,Id1,Id2,Id3,Id4,Id5,Id6,Id7,Id8,Id9,Id10,Id11,Id12,Id15,Id16,Id17,Lab,Lab1;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    JButton ba,bb,b2,b3;

    Add_Project(int i){}
    
    Add_Project(){
        f = new JFrame("Add_Project");
        f.setBackground(Color.white);
        f.setLayout(null);

        Id15=new JLabel();
        Id15.setBounds(0,0,900,700);
        Id15.setLayout(null);
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/add_project.jpg"));
        Id15.setIcon(img1);

        Id8 = new JLabel("New Project Details");
        Id8.setBounds(320,30,500,50);
        Id8.setFont(new Font("serif",Font.BOLD,35));
        Id8.setForeground(Color.black);
        Id15.add(Id8);
        f.add(Id15);

 
        Id1 = new JLabel("Project-ID:");
        Id1.setBounds(20,150,100,30);
        Id1.setFont(new Font("serif",Font.BOLD,20));
        Id15.add(Id1);

        t1=new JTextField();
        t1.setBounds(190,150,200,30);
        Id15.add(t1);

        Id2 = new JLabel("Project Name:");
        Id2.setBounds(490,150,200,30);
        Id2.setFont(new Font("serif",Font.BOLD,20));
        Id15.add(Id2);

        t2=new JTextField();
        t2.setBounds(650,150,150,30);
        Id15.add(t2);

        Id3= new JLabel("Project Descripton:");
        Id3.setBounds(20,230,190,90);
        Id3.setFont(new Font("serif",Font.BOLD,20));
        Id15.add(Id3);

        t3=new JTextField();
        t3.setBounds(190,264,200,30);
        Id15.add(t3);

        Id4= new JLabel("Employee-ID:");  
        Id4.setBounds(490,200,200,30);
        Id4.setFont(new Font("serif",Font.BOLD,20));
        Id15.add(Id4);

        t4=new JTextField();
        t4.setBounds(650,200,150,30);
        Id15.add(t4);

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
        
        String a = t1.getText();//project id
        String bbb = t2.getText();//project name
        String c = t3.getText();//project-desc
        String d = t4.getText();//emp_id
        String e = t6.getText();//Employee name
        String ff = t5.getText();//Project status:
        
        if(ae.getSource() == ba){
            try{
                conn ccc = new conn();
                String q1 = "insert into projects values('"+a+"','"+bbb+"','"+c+"','"+d+"','"+e+"','"+ff+"')";
                ccc.s.executeUpdate(q1);
                JOptionPane.showMessageDialog(null,"Trigger3:Details Successfully Inserted into Projects!");
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
        new Add_Project();
    }
}
