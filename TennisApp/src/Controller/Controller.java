/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Library.modePaint;
import Logic.PaintManager;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JColorChooser;
import views.GUI.MainWindow;

/**
 *
 * @author Carlos
 */
public class Controller implements ActionListener, MouseListener, MouseMotionListener, WindowListener{

    
    MainWindow _mainWindow;
    private boolean _lineSelected = false;
    private boolean _circleSelected = false;
    private boolean _drawingPointSelected = true;
    
    public Controller(MainWindow pWindow)
    {
        this._mainWindow = pWindow;
        setActionListener(this);
        setMouseListener(this);
        setMouseMotionListener(this);
        setWindowListener(this);
        this._mainWindow.setVisible(true);
    }
    
    
      public void setActionListener(ActionListener listener){
        _mainWindow.btn_Arcade.addActionListener(listener);
        _mainWindow.btn_ChangeColor.addActionListener(listener);
        _mainWindow.btn_Edit.addActionListener(listener);
        _mainWindow.btn_Fire.addActionListener(listener);
        _mainWindow.btn_LoadSelected.addActionListener(listener);
        _mainWindow.btn_NewDesign.addActionListener(listener);
        _mainWindow.btn_NewLine.addActionListener(listener);
        _mainWindow.btn_NewOrnament.addActionListener(listener);
        
    }  
    
    public void setMouseListener(MouseListener listener){
        _mainWindow.canvas_mainCanvas.addMouseListener(listener);
        
    }
    
    public void setMouseMotionListener(MouseMotionListener listener){
        _mainWindow.canvas_mainCanvas.addMouseMotionListener(listener);
    }

    public void setWindowListener(WindowListener listener){
        _mainWindow.addWindowListener(listener);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == _mainWindow.btn_ChangeColor)
        {
            JColorChooser.showDialog(_mainWindow, "Select Color", Color.black);            
        }
            
        
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
     
    }

    @Override
    public void mouseExited(MouseEvent me) {
       
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        if (_drawingPointSelected){
            PaintManager.getInstance().MoveEditPoint(me.getX(),me.getY());
        }
        
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        
    }

    @Override
    public void windowOpened(WindowEvent we) {
        
       PaintManager.getInstance().setCanvas(_mainWindow.canvas_mainCanvas);
        
    }

    @Override
    public void windowClosing(WindowEvent we) {
        
    }

    @Override
    public void windowClosed(WindowEvent we) {
        
    }

    @Override
    public void windowIconified(WindowEvent we) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        
    }

    @Override
    public void windowActivated(WindowEvent we) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        
    }
    
}
