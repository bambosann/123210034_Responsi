/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123210034_responsi.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import pkg123210034_responsi.Model.pegawaiModel;
import pkg123210034_responsi.View.Menu;
import pkg123210034_responsi.View.pegawaiView;

/**
 *
 * @author Lab Informatika
 */
public class pegawaiController {
    pegawaiModel pegawaiModel;
    pegawaiView pegawaiView;
    Object header[] = {"ID","Nama","Email","Password", "Role"};
    public pegawaiController(pegawaiModel pegawaiModel,pegawaiView pegawaiView){
        this.pegawaiModel = pegawaiModel;
        this.pegawaiView = pegawaiView;
        if(pegawaiModel.getPegawaiData()!=0){
            String dataPegawai[][] = pegawaiModel.readPegawai();
            pegawaiView.table.setModel((new JTable(dataPegawai,header).getModel()));
        }
        else{
        JOptionPane.showMessageDialog(null, "no data");
        }
        pegawaiView.buttonBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               Menu menu = new Menu();
               menu.setVisible(true);
               pegawaiView.dispose();
            }        
        });   
    }
    
}
