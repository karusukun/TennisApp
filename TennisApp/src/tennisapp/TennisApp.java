/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tennisapp;

import Controller.Controller;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.parse4j.ParseException;
import views.GUI.MainWindow;

/**
 *
 * @author Karusu
 */
public class TennisApp {

    /**
      @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, IOException {
        // TODO code application logic here
        
        
        
        MainWindow pwindow = new MainWindow();        
        try {
            Controller controller = new Controller(pwindow);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TennisApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
