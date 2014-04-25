/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tennisapp;

import Controller.Controller;
import javax.swing.UIManager;
import views.GUI.MainWindow;

/**
 *
 * @author Karusu
 */
public class TennisApp {

    /**
      @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try 
        {
            // select Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            // start application
        }
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
        
        
        MainWindow pwindow = new MainWindow();
        Controller _controller = new Controller(pwindow);
        
        
    }
    
}
