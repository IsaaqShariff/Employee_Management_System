package Employeee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class details  implements ActionListener{

    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;

    details(){
        f=new JFrame("Employee Management System Dashboard");
        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0,0,750,500);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/details.jpg"));
        l1.setIcon(i1);
        f.add(l1);

        l2 = new JLabel("Employee Details");
        l2.setBounds(430,20,200,40);
        l2.setFont(new Font("serif",Font.BOLD,25));
        l2.setForeground(Color.black);
        l1.add(l2);
        
        l3 = new JLabel("Project Details");
        l3.setBounds(14,20,200,40); //from(left,,,top)
        l3.setFont(new Font("serif",Font.BOLD,25));
        l3.setForeground(Color.black);
        l1.add(l3);
        
        l4 = new JLabel("Department Details");
        l4.setBounds(14,130,250,40); //from(left,,,top)
        l4.setFont(new Font("serif",Font.BOLD,25));
        l4.setForeground(Color.black);
        l1.add(l4);
        
        l5 = new JLabel("Clients");
        l5.setBounds(14,245,250,40); //from(left,,,top)
        l5.setFont(new Font("serif",Font.BOLD,25));
        l5.setForeground(Color.black);
        l1.add(l5);
        
        l6 = new JLabel("Allocations");
        l6.setBounds(14,345,250,40); //from(left,,,top)
        l6.setFont(new Font("serif",Font.BOLD,25));
        l6.setForeground(Color.black);
        l1.add(l6);
        
        l7 = new JLabel("Salary Details");
        l7.setBounds(430,220,200,40); //from(left,,,top)
        l7.setFont(new Font("serif",Font.BOLD,28));
        l7.setForeground(Color.black);
        l1.add(l7);
        
        b1=new JButton("Add");
        b1.setBounds(420,80,100,40);
        b1.setFont(new Font("Georgia",Font.BOLD,16));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        
        l1.add(b1);


        b2=new JButton("View");
        b2.setBounds(530,80,100,40);
        b2.setFont(new Font("Georgia",Font.BOLD,16));
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("Remove");
        b3.setBounds(420,140,100,40);
        b3.setFont(new Font("Georgia",Font.BOLD,16));
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        l1.add(b3);

        b4=new JButton("Update");
        b4.setBounds(530,140,100,40);
        b4.setFont(new Font("Georgia",Font.BOLD,16));
        b4.setBackground(Color.BLUE);
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        l1.add(b4);
        
        b5=new JButton("Add");
        b5.setBounds(14,80,100,40);
        b5.setFont(new Font("Georgia",Font.BOLD,16));
        b5.setBackground(Color.BLUE);
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        l1.add(b5);
        
        b6=new JButton("View");
        b6.setBounds(134,80,100,40);
        b6.setFont(new Font("Georgia",Font.BOLD,16));
        b6.setBackground(Color.BLUE);
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        l1.add(b6);
        
        b7=new JButton("Add");
        b7.setBounds(14,185,100,40);
        b7.setFont(new Font("Georgia",Font.BOLD,16));
        b7.setBackground(Color.BLUE);
        b7.setForeground(Color.WHITE);
        b7.addActionListener(this);
        l1.add(b7);
        
        b8=new JButton("View");
        b8.setBounds(134,185,100,40);
        b8.setFont(new Font("Georgia",Font.BOLD,16));
        b8.setBackground(Color.BLUE);
        b8.setForeground(Color.WHITE);
        b8.addActionListener(this);
        l1.add(b8);
        
       b9=new JButton("Add");
        b9.setBounds(14,295,100,40);
        b9.setFont(new Font("Georgia",Font.BOLD,16));
        b9.setBackground(Color.BLUE);
        b9.setForeground(Color.WHITE);
        b9.addActionListener(this);
        l1.add(b9);
        
        b10=new JButton("View");
        b10.setBounds(134,295,100,40);
        b10.setFont(new Font("Georgia",Font.BOLD,16));
        b10.setBackground(Color.BLUE);
        b10.setForeground(Color.WHITE);
        b10.addActionListener(this);
        l1.add(b10);
        
        
        
        b11=new JButton("Add");
        b11.setBounds(14,395,100,40);
        b11.setFont(new Font("Georgia",Font.BOLD,16));
        b11.setBackground(Color.BLUE);
        b11.setForeground(Color.WHITE);
        b11.addActionListener(this);
        l1.add(b11);
        
        b12=new JButton("View");
        b12.setBounds(134,395,100,40);
        b12.setFont(new Font("Georgia",Font.BOLD,16));
        b12.setBackground(Color.BLUE);
        b12.setForeground(Color.WHITE);
        b12.addActionListener(this);
        l1.add(b12);
        
        
        b13=new JButton("Update");
        b13.setBounds(254,395,100,40);
        b13.setFont(new Font("Georgia",Font.BOLD,16));
        b13.setBackground(Color.BLUE);
        b13.setForeground(Color.WHITE);
        b13.addActionListener(this);
        l1.add(b13);
        
        b14=new JButton("Add");
        b14.setBounds(420,280,100,40);
        b14.setFont(new Font("Georgia",Font.BOLD,16));
        b14.setBackground(Color.BLUE);
        b14.setForeground(Color.WHITE);
        b14.addActionListener(this);
        
        l1.add(b14);


        b15=new JButton("View");
        b15.setBounds(530,280,100,40);
        b15.setFont(new Font("Georgia",Font.BOLD,16));
        b15.setBackground(Color.BLUE);
        b15.setForeground(Color.WHITE);
        b15.addActionListener(this);
        l1.add(b15);

        b16=new JButton("Remove");
        b16.setBounds(420,340,100,40);
        b16.setFont(new Font("Georgia",Font.BOLD,16));
        b16.setBackground(Color.BLUE);
        b16.setForeground(Color.WHITE);
        b16.addActionListener(this);
        l1.add(b16);

        b17=new JButton("Update");
        b17.setBounds(530,340,100,40);
        b17.setFont(new Font("Georgia",Font.BOLD,16));
        b17.setBackground(Color.BLUE);
        b17.setForeground(Color.WHITE);
        b17.addActionListener(this);
        l1.add(b17);

        f.setVisible(true);
        f.setSize(700,500);
        f.setLocation(450,200);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
            new Add_Employee();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new View_Employee();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            new Remove_Employee();
        }
        if(ae.getSource()==b4){
            f.setVisible(false);
            new Search_Employee();
        }
        if(ae.getSource()==b5){
            f.setVisible(false);
            new Add_Project();
        }
        if(ae.getSource()==b6){
            f.setVisible(false);
            new View_Projects();
        }
        if(ae.getSource()==b7){
            f.setVisible(false);
            new Add_department();
        }
        if(ae.getSource()==b8){
            f.setVisible(false);
            new View_department();
        }
        if(ae.getSource()==b9){
            f.setVisible(false);
            new Add_Clients();
        }
        if(ae.getSource()==b10){
            f.setVisible(false);
            new View_Clients();
        }
        if(ae.getSource()==b11){
            f.setVisible(false);
            new Add_Allocation();
        }
        if(ae.getSource()==b12){
            f.setVisible(false);
            new View_Allocation();
        }
        if(ae.getSource()==b13){
            f.setVisible(false);
            new Search_Allocation();
        }
         if(ae.getSource()==b14){
            f.setVisible(false);
            new Add_Salary();
        }
        if(ae.getSource()==b15){
            f.setVisible(false);
            new View_Salary();
        }
        if(ae.getSource()==b16){
            f.setVisible(false);
            new Remove_Salary();
        }
        if(ae.getSource()==b17){
            f.setVisible(false);
            new Search_Salary();
        }
    }

    public static void main(String[ ] arg){
        details d = new details();
    }
}
