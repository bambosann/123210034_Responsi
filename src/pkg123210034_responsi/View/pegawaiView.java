/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123210034_responsi.View;

/**
 *
 * @author Lenovo
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lab Informatika
 */
public class pegawaiView extends JFrame{
    
    public JButton buttonBack = new JButton("Back");
    
    public JTable table;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    
    public Object[] columnName = {"Id", "Nama","Email","Password","Role"};
    
    public pegawaiView(){
    dtm = new DefaultTableModel(columnName,0);
    table = new JTable(dtm);
    scrollPane = new JScrollPane(table);
    setTitle("Data Pegawai");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setVisible(true);
    setResizable(false);
    setLayout(null);
    setSize(700,400);
    add(scrollPane);
    scrollPane.setBounds(20, 20, 480, 300);
    
    add(buttonBack);
    buttonBack.setBounds(510, 190, 90, 20);
    }
}

