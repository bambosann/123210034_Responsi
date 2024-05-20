/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123210034_responsi.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import pkg123210034_responsi.Model.hewanModel;
import pkg123210034_responsi.View.hewanView;

/**
 *
 * @author Lab Informatika
 */
public class hewanController {
    hewanModel hewanModel;
    hewanView hewanView;
    Object header[] = {"ID","Nama","Kelas","Jenis Makanan"};
    public hewanController(hewanModel hewanModel,hewanView hewanView){
        this.hewanModel = hewanModel;
        this.hewanView = hewanView;
        if(hewanModel.getHewanData()!=0){
            String dataHewan[][] = hewanModel.readHewan();
            hewanView.table.setModel((new JTable(dataHewan,header).getModel()));
        }
        else{
        JOptionPane.showMessageDialog(null, "no data");
        }
        hewanView.buttonAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
            String id = hewanView.getId();
            String nama = hewanView.getNama();
            String kelas = hewanView.getKelas();
            String jenis = hewanView.getJenis();
                try {
                    hewanModel.addHewan(id, nama, kelas, jenis);
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
                String id = hewanView.getId();
            String nama = hewanView.getNama();
            String kelas = hewanView.getKelas();
            String jenis = hewanView.getJenis();
                try {
                    hewanModel.updateHewan(id, nama, kelas, jenis);
                } catch (Exception ex) {
                    Logger.getLogger(hewanController.class.getName()).log(Level.SEVERE, null, ex);
                }
                String dataHewan[][] = hewanModel.readHewan();
                hewanView.table.setModel((new JTable(dataHewan,header).getModel()));
            }
            }
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
        hewanView.buttonClear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               hewanView.setAll();
            }        
        });   
    }
    
}
