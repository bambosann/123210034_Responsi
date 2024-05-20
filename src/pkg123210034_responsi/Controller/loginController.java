/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123210034_responsi.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pkg123210034_responsi.Model.userModel;
import pkg123210034_responsi.View.LoginPageView;

/**
 *
 * @author Lab Informatika
 */
public class loginController {
    userModel model;
    LoginPageView view;
    
    public loginController (userModel model, LoginPageView view){
        this.model = model;
        this.view = view;
    
        view.blogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String username = view.GetUsername();
               String password = view.GetPassword();
               model.loginUser(username,password);
               view.logout();
            }
        });
        
    
    }
    
    
}
