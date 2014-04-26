/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Library.modePaint;
import Logic.DesignLogic;
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
import javax.swing.JOptionPane;
import views.GUI.MainWindow;

/**
 *
 * @author Carlos
 */
public class Controller implements ActionListener, MouseListener, MouseMotionListener, WindowListener{

    
    MainWindow _mainWindow;
    
    private int _firstX = 0;
    private int _firstY = 0;
    private int _strokeThickness = 1;
    private Color _color =Color.BLACK;
    private boolean _Fill=false;
    private boolean _lineSelected = false;
    private boolean _circleSelected = false;
    private boolean _drawingPointSelection = true;
    
    
    
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
            _color = JColorChooser.showDialog(_mainWindow, "Select a Color", Color.black);            
        } else if (ae.getSource() == _mainWindow.btn_Arcade)
        {
            PaintManager.getInstance().setMode(modePaint.Arcade);
            PaintManager.getInstance().loadDesign(this._mainWindow.canvas_mainCanvas.getGraphics());
        } else if(ae.getSource() == _mainWindow.btn_Edit)
        {
            PaintManager.getInstance().setMode(modePaint.Edit);
            PaintManager.getInstance().loadDesign(this._mainWindow.canvas_mainCanvas.getGraphics());
        } else if(ae.getSource() == _mainWindow.btn_Fire)
        {
            PaintManager.getInstance().setMode(modePaint.Fire);
            PaintManager.getInstance().loadDesign(this._mainWindow.canvas_mainCanvas.getGraphics());
        } else if(ae.getSource() == _mainWindow.btn_LoadSelected)
        {
            System.out.println(_mainWindow.jList_DesignList.getSelectedValue().toString());
            //DesignLogic.getDesignLogicInstance().selectActualDesing(_mainWindow.JList_DesignsList.getName());
        } else if(ae.getSource() == _mainWindow.btn_NewDesign)
        {
            String pName = JOptionPane.showInputDialog("Input Design Name");
            DesignLogic.getDesignLogicInstance().newDesign(pName);
            _mainWindow.jList_DesignList.setModel(DesignLogic.getDesignLogicInstance().designNames());
            PaintManager.getInstance().loadDesign(this._mainWindow.canvas_mainCanvas.getGraphics());
            
        } else if(ae.getSource() == _mainWindow.btn_NewLine)
        {
            this._lineSelected = true;
            this._circleSelected = this._drawingPointSelection = false;
        } else if(ae.getSource() == _mainWindow.btn_NewOrnament)
        {
            this._circleSelected = true;
            this._lineSelected = _drawingPointSelection = false;
        }
            
        
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
        if(_circleSelected || _lineSelected)
        {
            _firstX = me.getX();
            _firstY = me.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
        _strokeThickness = _mainWindow.slider_thickness.getValue();
        
        if(_lineSelected)
        {
            PaintManager.getInstance().NewLine(_firstX, me.getX(),_firstY, me.getY(), _color, _strokeThickness);
        } else if(_circleSelected)
        {
            int pRadio = Integer.parseInt(JOptionPane.showInputDialog("Enter radio"));
            PaintManager.getInstance().newCircle(pRadio, me.getX(), me.getY(), _color, _strokeThickness, this._mainWindow.checkbox_Fill.getState());
            
        }
        _circleSelected = _lineSelected = false;
        _drawingPointSelection = true;
        
        if(me.getSource() == _mainWindow.slider_SoleThickness)
        {
            DesignLogic.getDesignLogicInstance().getActualDesign();
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
     
    }

    @Override
    public void mouseExited(MouseEvent me) {
       
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        if (_drawingPointSelection){
            PaintManager.getInstance().MoveEditPoint(me.getX(),me.getY());            
        }
        
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        
    }

    @Override
    public void windowOpened(WindowEvent we) {
        
       PaintManager.getInstance().setCanvas(_mainWindow.canvas_mainCanvas);
       PaintManager.getInstance().setMode(modePaint.Edit);
        
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
