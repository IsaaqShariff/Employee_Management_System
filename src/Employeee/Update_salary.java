package Employeee;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class Update_salary extends Add_Allocation implements ActionListener{

    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id30,id15,lab,lab1;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t55;
    JButton b,b1,b2,b3; 
    String id_emp;

    Update_salary (String idaa){
        super(0);
        f=new JFrame("Update Salary details");
        f.setVisible(true);
        f.setSize(900,500);
        f.setLocation(450,250);
        f.setBackground(Color.white);
        f.setLayout(null);

        id_emp=idaa;    
        id15=new JLabel();
        id15.setBounds(0,0,900,500);
        id15.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/update_salary.jpg"));
        id15.setIcon(img);

        id8 = new JLabel("Update Salary Detail:");
        id8.setBounds(50,10,500,50);
        id8.setFont(new Font("serif",Font.BOLD,40));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);


        id1 = new JLabel("Employee_name:");  
        id1.setBounds(50,100,150,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(200,100,150,30);
        id15.add(t1);

        id2 = new JLabel("Employee ID:");
        id2.setBounds(440,100,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(600,100,150,30);
        id15.add(t2);

        id3= new JLabel("Basic Salary:");
        id3.setBounds(50,150,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(200,150,150,30);
        id15.add(t3);

        id4= new JLabel("Medical Allowance:");
        id4.setBounds(440,150,190,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(600,150,150,30);   
        id15.add(t4);

        id5= new JLabel("Bonus:");
        id5.setBounds(50,200,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(200,200,150,30);
        id15.add(t5);

        /*id6= new JLabel("Allocation Status:");
        id6.setBounds(440,200,180,30);
        id6.setFont(new Font("serif",Font.BOLD,20));    
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(600,200,150,30);
        id15.add(t6);*/

        /*id7= new JLabel("Job Post:");
        id7.setBounds(50,250,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(200,250,150,30);
        id15.add(t7);

        id9= new JLabel("Aadhar No:");
        id9.setBounds(400,250,100,30);  
        id9.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id9);

        t8=new JTextField();
        t8.setBounds(600,250,150,30);
        id15.add(t8);
        
        id30= new JLabel("Department Name:");
        id30.setBounds(400,300,190,30);  
        id30.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id30);

        t55=new JTextField();
        t55.setBounds(600,300,150,30);
        id15.add(t55);

        id10= new JLabel("Employee Id:");
        id10.setBounds(50,300,150,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id10);
        f.setVisible(false);
        t9=new JTextField();
        t9.setBounds(200,300,150,30);
        id15.add(t9);*/

        b=new JButton("Update");
        b.setBounds(250,400,100,30);
        b.addActionListener(this);
        id15.add(b);

        b1=new JButton("Cancel");
        b1.setBounds(450,400,100,30);
        b1.addActionListener(this);
        id15.add(b1);

        showData(idaa);
    }

    int i=0;
    String age,dat;

    void showData(String s){
        try{
            conn con = new conn();
            String str = "select * from salary where emp_id = '"+s+"'";
            ResultSet rs = con.s.executeQuery(str);

            if(rs.next()){
                f.setVisible(true);
                i=1;

                t1.setText(rs.getString("employee_name"));
                t2.setText(rs.getString("emp_id"));
                t3.setText(rs.getString("salary_basic"));
                t4.setText(rs.getString("medical_allowance"));
                t5.setText(rs.getString("bonus"));
                /*t6.setText(rs.getString("allocation_status"));
                /*t7.setText(rs.getString(9));
                t8.setText(rs.getString(10));
                t9.setText(rs.getString(11));
                t55.setText(rs.getString(12));*/
                

                /*age=rs.getString(3);
                dat=rs.getString(4);*/
            }
            if(i==0)
                JOptionPane.showMessageDialog(null,"ID Not Found");
            new Search_Allocation();
        }catch(Exception ex){}
        f.setVisible(true);
        f.setSize(900,500);
        f.setLocation(400,100);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b && i==1){
            try{
                conn cons = new conn();
                String str = "update salary set employee_name='"+t1.getText()+"',emp_id='"+t2.getText()+"',salary_basic='"+t3.getText()+"',medical_allowance='"+t4.getText()+"',bonus='"+t5.getText()+"' where emp_id='"+id_emp+"'";
                cons.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"Successfully Updated");
                f.setVisible(false);
                new Search_Employee();
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
        if(ae.getSource()==b1){
            f.setVisible(false);
            details d=new details();
        }
    }

    public static void main(String[] arg){
        new Update_salary("Update Salary");
    }
}