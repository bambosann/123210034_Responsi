/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123210034_responsi.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import pkg123210034_responsi.Model.hewanModel;
import pkg123210034_responsi.View.Menu;
import pkg123210034_responsi.View.hewanView;

/**
 *
 * @author Lab Informatika
 */
public class hewanController {
    hewanModel hewanModel;
    hewanView hewanView;
    Object header[] = {"ID","Nama","Kelas","Jenis Makanan"};
        String id;
        String nama;
        String kelas;
        String jenis;
    public hewanController(hewanModel hewanModel,hewanView hewanView){
        this.hewanModel = hewanModel;
        this.hewanView = hewanView;
        
        hewanView.table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);

                int selectedRow = hewanView.table.getSelectedRow();
                if (selectedRow != -1) {
                    // Get data from selected row
                    id = hewanView.table.getValueAt(selectedRow, 0).toString();
                    nama = hewanView.table.getValueAt(selectedRow, 1).toString();
                    kelas = hewanView.table.getValueAt(selectedRow, 2).toString();
                    jenis = hewanView.table.getValueAt(selectedRow, 3).toString();

                    // Set data to text fields
                    hewanView.inputId.setText(id);
                    hewanView.inputNama.setText(nama);
                    hewanView.inputKelas.setText(kelas);
                    hewanView.inputJenis.setText(jenis);
                }  
            }
        });
        if(hewanModel.getHewanData()!=0){
            String dataHewan[][] = hewanModel.readHewan();
            hewanView.table.setModel((new JTable(dataHewan,header).getModel()));
        }
        else{
        JOptionPane.showMessageDialog(null, "no data");
        }
        hewanView.buttonAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
            String nama = hewanView.getNama();
            String kelas = hewanView.getKelas();
            String jenis = hewanView.getJenis();
                try {
                    hewanModel.addHewan(nama, kelas, jenis);
                } catch (Exception ex) {
                    Logger.getLogger(hewanController.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dataHewan[][] = hewanModel.readHewan();
                hewanView.table.setModel((new JTable(dataHewan,header).getModel()));
            }
        } );
        hewanView.buttonUpdate.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            String namaUpdate = hewanView.getNama();
            String kelasUpdate = hewanView.getKelas();
            String jenisUpdate = hewanView.getJenis();
                try {
                    hewanModel.updateHewan(id, namaUpdate, kelasUpdate, jenisUpdate);
                } catch (Exception ex) {
                    Logger.getLogger(hewanController.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dataHewan[][] = hewanModel.readHewan();
                hewanView.table.setModel((new JTable(dataHewan,header).getModel()));
            
            }}
           );
        hewanView.buttonDelete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 String nama = hewanView.getNama();
                try {
                    hewanModel.deleteHewan(nama);
                } catch (Exception ex) {
                    Logger.getLogger(hewanController.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dataHewan[][] = hewanModel.readHewan();
                hewanView.table.setModel((new JTable(dataHewan,header).getModel()));
            }
        
        });  
         hewanView.buttonBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               Menu menu = new Menu();
               menu.setVisible(true);
               hewanView.dispose();
            }        
        }); 
    }
    
}
