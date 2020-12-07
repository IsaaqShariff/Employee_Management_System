package Employeee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Print_Data_Salary implements ActionListener{
    JFrame f;
    JLabel id8,id,aid,id1,aid1,id2,aid2,id3,aid3,id4,aid4,id5,aid5,id6,aid6,id7,aid7,id9,id10,id11,id12,id13,id14,id15,id16,id17,lab;
    String emp_id,employee_name,acc_no,salary_basic,medical_allowance,bonus,father,address,phone,email,education,post,age,dob,aadhar,allocation_id,project_id,assigned_date,due_date,allocation_status;
    JButton b1,b2;
    ImageIcon icon;

    Print_Data_Salary (String e_id){
        try{
            conn con = new conn();
            String str = "select * from salary where emp_id = '"+e_id+"'";
            ResultSet rs= con.s.executeQuery(str);

            while(rs.next()){

               
                employee_name = rs.getString("employee_name");
                emp_id = rs.getString("emp_id");
                acc_no = rs.getString("acc_no");
                salary_basic = rs.getString("salary_basic");
                medical_allowance=rs.getString("medical_allowance");
                bonus=rs.getString("bonus");
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
 
        f=new JFrame("Displaying Information About Salaries given to Employees in the Enterprise");
        f.setVisible(true);
        f.setSize(595,642);
        f.setLocation(450,200);
        f.setBackground(Color.white);
        f.setLayout(null);


        id9=new JLabel();
        id9.setBounds(0,0,595,642);
        id9.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/print.jpg"));
        id9.setIcon(img);

        id8 = new JLabel(" Fetched Salary Details");
        id8.setBounds(150,10,300,30);
        f.add(id8);
        id8.setFont(new Font("serif",Font.BOLD,25));
        id9.add(id8);
        f.add(id9);

        id = new JLabel("Employee Name:");
        id.setBounds(100,70,240,30);
        id.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id);

        aid = new JLabel(employee_name);
        aid.setBounds(350,70,200,30);
        aid.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid);

        id1 = new JLabel("Employee ID:");
        id1.setBounds(100,120,300,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id1);

        aid1 = new JLabel(emp_id);
        aid1.setBounds(350,120,300,30);
        aid1.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid1);

  
        id2 = new JLabel("Account no:"); 
        id2.setBounds(100,170,300,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id2);

        aid2 = new JLabel(acc_no);
        aid2.setBounds(350,170,300,30);
        aid2.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid2);

        id3= new JLabel("Base Salary:");
        id3.setBounds(100,220,290,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id3);

        aid3= new JLabel(salary_basic);
        aid3.setBounds(350,220,300,30);
        aid3.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid3);


        id4= new JLabel("Medical Allowance:");  
        id4.setBounds(100,270,190,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id4);

        aid4= new JLabel(medical_allowance);
        aid4.setBounds(350,270,300,30); 
        aid4.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid4);

        
        id5= new JLabel("Bonus:");
        id5.setBounds(100,320,150,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id5);

        aid5= new JLabel(bonus);
        aid5.setBounds(350,320,300,30);
        aid5.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid5);

        
        /*id6= new JLabel("Education:");
        id6.setBounds(100,370,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id6);

        aid6= new JLabel(education);
        aid6.setBounds(250,370,300,30); 
        aid6.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid6);


        id7= new JLabel("Job Post:");
        id7.setBounds(100,420,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id7);

        aid7= new JLabel(post);
        aid7.setBounds(250,420,300,30);
        aid7.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid7);*/
        
        
       
        
        b1=new JButton("Print");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100,520,100,30);
        b1.addActionListener(this);
        id9.add(b1);

        b2=new JButton("cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(250,520,100,30);
        b2.addActionListener(this);
        id9.add(b2);


    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){
            JOptionPane.showMessageDialog(null,"printed successfully");
            f.setVisible(false);
            details d=new details();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new View_Salary();
        }
    }
    public static void main(String[] args){
        new Print_Data_Salary("Print_Data_Salary");
    }

}
