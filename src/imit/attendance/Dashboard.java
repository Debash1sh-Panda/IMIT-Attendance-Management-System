package imit.attendance;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.Cursor;

public class Dashboard extends JFrame implements ActionListener{
    
    Choice choice1, choice2, choice3, choice4, choice5;
    JTextField tfusername;
    JButton view, logout, tracker, present, absent;
    JLabel nameofstaff, roleofstaff, emailofstaff;
    
    Dashboard(){
               
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        getContentPane().setBackground(new Color(225,225,225));
       
        // Heading part
        JLabel maintext2 = new JLabel("Attendance Record for MCA Students");
        maintext2.setBounds(360, 6, 1000, 70);
        maintext2.setBackground(new Color(29,75,100));
        maintext2.setFont(new Font("Raleway", Font.BOLD, 45));
        add(maintext2);
        
        // Details part
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(29, 59, 85));
        panel1.setBounds(0, 80, 1600, 200);
        add(panel1);
        
        // Staff Details
        nameofstaff = new JLabel ("Dr. Suvendu Ku Jaysingh");
        nameofstaff.setBounds(20, 20, 1000, 80);
        nameofstaff.setForeground(Color.white);
        nameofstaff.setFont(new Font("Railway", Font.BOLD, 35));
        panel1.add(nameofstaff);
        
        roleofstaff = new JLabel ("HOD, MBA & MCA");
        roleofstaff.setBounds(20, 60, 1000, 80);
        roleofstaff.setForeground(Color.white);
        roleofstaff.setFont(new Font("Railway", Font.BOLD, 25));
        panel1.add(roleofstaff);
        
        emailofstaff = new JLabel ("sjayasingh@gmail.com");
        emailofstaff.setBounds(20, 90, 1000, 80);
        emailofstaff.setForeground(Color.white);
        emailofstaff.setFont(new Font("Railway", Font.BOLD, 17));
        panel1.add(emailofstaff);
        
        // IMIT logo
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("imgs/Imitlogo.png"));
        JLabel image1 = new JLabel(i2);
        image1.setBounds(1280, 5, 200, 200);
        panel1.add(image1);
        
        // DropDown1
        JLabel choicename1 = new JLabel("Semester");
        choicename1.setBounds(70, 300, 100, 20);
        choicename1.setBackground(new Color(29, 75, 100));
        choicename1.setFont(new Font("Raleway", Font.BOLD, 15));
        add(choicename1);
        
        choice1 = new Choice();
        choice1.add("First");
        choice1.add("Second");
        choice1.add("Third");
        choice1.add("Four");
        choice1.setBounds(70, 323, 150, 80);
        choice1.setBackground(new Color(29, 75, 100));
        choice1.setForeground(Color.WHITE);
        choice1.setFont(new Font("Raleway", Font.BOLD, 13));
        add(choice1);
        
        //DropDown2
        JLabel choicename2 = new JLabel("Date");
        choicename2.setBounds(270, 300, 100, 20);
        choicename2.setBackground(new Color(29, 75, 100));
        choicename2.setFont(new Font("Raleway", Font.BOLD, 15));
        add(choicename2);
        
        tfusername = new JTextField();
        tfusername.setBounds(270, 323, 150, 20);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        tfusername.setBackground(new Color(29, 75, 100));
        tfusername.setForeground(Color.WHITE);
        tfusername.setFont(new Font("Raleway", Font.BOLD, 15));
        tfusername.setCaretColor(Color.WHITE);
        add(tfusername);
        
        //DropDown3
        JLabel choicename3 = new JLabel("Subject");
        choicename3.setBounds(470, 300, 100, 20);
        choicename3.setBackground(new Color(29, 75, 100));
        choicename3.setFont(new Font("Raleway", Font.BOLD, 15));
        add(choicename3);
        
        choice2 = new Choice();
        choice2.add("JAVA");
        choice2.add("ADA");
        choice2.add("OOAD");
        choice2.add("CN");
        choice2.add("IWP");
        choice2.setBounds(470, 323, 150, 40);
        choice2.setBackground(new Color(29, 75, 100));
        choice2.setForeground(Color.WHITE);
        choice2.setFont(new Font("Raleway", Font.BOLD, 13));
        add(choice2);
        
        //DropDown4
        JLabel choicename4 = new JLabel("Sections");
        choicename4.setBounds(670, 300, 100, 20);
        choicename4.setBackground(new Color(29, 75, 100));
        choicename4.setFont(new Font("Raleway", Font.BOLD, 15));
        add(choicename4);
        
        choice3 = new Choice();
        choice3.add("Sec A");
        choice3.add("Sec B");
        choice3.setBounds(670, 323, 150, 40);
        choice3.setBackground(new Color(29, 75, 100));
        choice3.setForeground(Color.WHITE);
        choice3.setFont(new Font("Raleway", Font.BOLD, 13));
        add(choice3);
        
        // Login Button
        logout = new JButton("Log Out");
        logout.setBounds(1420, 320, 100, 25);
        logout.setBorder(new LineBorder(new Color(133, 193, 233)));
        logout.setBackground(new Color(29, 75, 100));
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Raleway", Font.BOLD, 12));
        logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logout.addActionListener(this);
        add(logout);
        
        // view Button 
        view = new JButton("View Record");
        view.setBounds(1230, 315, 130, 35);
        view.setBorder(new LineBorder(new Color(133, 193, 233)));
        view.setBackground(new Color(29, 75, 100));
        view.setForeground(Color.WHITE);
        view.setFont(new Font("Raleway", Font.BOLD, 12));
        view.setCursor(new Cursor(Cursor.HAND_CURSOR));
        view.addActionListener(this);
        add(view);
        
        // view Button 
        tracker = new JButton("Attendance Tracker");
        tracker.setBounds(70, 430, 150, 40);
        tracker.setBorder(new LineBorder(new Color(133, 193, 233)));
        tracker.setBackground(new Color(29, 75, 100));
        tracker.setForeground(Color.WHITE);
        tracker.setFont(new Font("Raleway", Font.BOLD, 13));
        tracker.setCursor(new Cursor(Cursor.HAND_CURSOR));
        tracker.addActionListener(this);
        add(tracker);
        
        // view Button 
        present = new JButton("Present");
        present.setBounds(75, 530, 130, 35);
        present.setBorder(new LineBorder(new Color(133, 193, 233)));
        present.setBackground(new Color(29, 75, 100));
        present.setForeground(Color.WHITE);
        present.setFont(new Font("Raleway", Font.BOLD, 13));
        present.setCursor(new Cursor(Cursor.HAND_CURSOR));
        present.addActionListener(this);
        add(present);
        
        // view Button 
        view = new JButton("Absent");
        view.setBounds(75, 590, 130, 35);
        view.setBorder(new LineBorder(new Color(133, 193, 233)));
        view.setBackground(new Color(29, 75, 100));
        view.setForeground(Color.WHITE);
        view.setFont(new Font("Raleway", Font.BOLD, 13));
        view.setCursor(new Cursor(Cursor.HAND_CURSOR));
        view.addActionListener(this);
        add(view);
        
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Dashboard();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

}
