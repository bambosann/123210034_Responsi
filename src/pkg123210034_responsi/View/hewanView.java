/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123210034_responsi.View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lab Informatika
 */
public class hewanView extends JFrame{
    JLabel labelId = new JLabel("ID");
    JLabel labelNama = new JLabel("Nama");
    JLabel labelKelas = new JLabel("Kelas");
    JLabel labelJenis = new JLabel("Jenis");
    
    public JTextField inputId = new JTextField();
    public JTextField inputNama = new JTextField();
    public JTextField inputKelas = new JTextField();
    public JTextField inputJenis = new JTextField();
    
    public JButton buttonAdd = new JButton("Add");
    public JButton buttonUpdate = new JButton("Update");
    public JButton buttonDelete = new JButton("Delete");
    public JButton buttonClear = new JButton("Clear");
    
    public JTable table;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    
    public Object[] columnName = {"Id", "Nama","Kelas","Jenis_makanan"};
    
    public hewanView(){
    dtm = new DefaultTableModel(columnName,0);
    table = new JTable(dtm);
    scrollPane = new JScrollPane(table);
    setTitle("Data Hewan");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setVisible(true);
    setResizable(false);
    setLayout(null);
    setSize(700,400);
    add(scrollPane);
    scrollPane.setBounds(20, 20, 480, 300);
    add(labelId);
    labelId.setBounds(510, 20, 90, 20);
    add(inputNama);
    inputNama.setBounds(510, 40, 90, 20);
    add(labelKelas);
    labelKelas.setBounds(510, 60, 90, 20);
    add(inputJenis);
    inputJenis.setBounds(510, 80, 90, 20);
    
    add(buttonAdd);
    buttonAdd.setBounds(510, 190, 90, 20);
    add(buttonUpdate);
    buttonUpdate.setBounds(510, 220, 90, 20);
    add(buttonDelete);
    buttonDelete.setBounds(510, 250, 90, 20);
    add(buttonClear);
    buttonClear.setBounds(510, 280, 90, 20);
    }

    public String getId(){
        return inputId.getText();
    }
    public String getNama(){
        return inputNama.getText();
    }
    public String getKelas(){
        return inputKelas.getText();
    }
    public String getJenis(){
        return inputJenis.getText();
    }
    public void setAll(){
     inputId.setText("");
     inputNama.setText("");
     inputKelas.setText("");
     inputJenis.setText("");
    }
}
