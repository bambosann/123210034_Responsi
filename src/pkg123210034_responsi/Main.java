/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123210034_responsi;

import pkg123210034_responsi.Controller.loginController;
import pkg123210034_responsi.Model.userModel;
import pkg123210034_responsi.View.LoginPageView;
import pkg123210034_responsi.View.Menu;

/**
 *
 * @author Lab Informatika
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        userModel model = new userModel();
        LoginPageView view = new LoginPageView();
        loginController controller = new loginController(model,view);
        // TODO code application logic here
    }
    
}
