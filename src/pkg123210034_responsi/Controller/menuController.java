/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123210034_responsi.Controller;

import pkg123210034_responsi.Model.menuModel;
import pkg123210034_responsi.View.Menu;

/**
 *
 * @author Lenovo
 */
public class menuController {
    menuModel model;
    Menu view;

    public menuController(menuModel model, Menu view) {
       this.model = model;
        this.view = view;
        String user = model.username;
        view.labelWelcome.setText("Selamat Datang " + user);
    }
    
}
