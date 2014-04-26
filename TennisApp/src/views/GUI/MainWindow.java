/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views.GUI;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
import javax.swing.*;


/**
 *
 * @author Carlos
 */
public class MainWindow extends javax.swing.JFrame {
    
    //Creates new form MainWindow
        
    public MainWindow() {
        initComponents();
    }
  
    
    
    
    
  /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_canvas = new java.awt.Canvas();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_DesignList = new javax.swing.JList();
        jPanel_Figures = new javax.swing.JPanel();
        btn_NewLine = new javax.swing.JButton();
        btn_NewOrnament = new javax.swing.JButton();
        jPanel_Properties = new javax.swing.JPanel();
        slider_thickness = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        btn_ChangeColor = new javax.swing.JButton();
        checkbox_Fill = new java.awt.Checkbox();
        lbl_soleThickness = new javax.swing.JLabel();
        slider_SoleThickness = new javax.swing.JSlider();
        jPanel_Design = new javax.swing.JPanel();
        btn_NewDesign = new javax.swing.JButton();
        btn_LoadSelected = new javax.swing.JButton();
        btn_Edit = new javax.swing.JButton();
        btn_Arcade = new javax.swing.JButton();
        btn_Fire = new javax.swing.JButton();
        canvas_mainCanvas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jList_DesignList.setBackground(new java.awt.Color(47, 47, 47));
        jList_DesignList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jList_DesignList.setForeground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setViewportView(jList_DesignList);

        jPanel_Figures.setBackground(new java.awt.Color(47, 47, 47));

        btn_NewLine.setText("New Line");
        btn_NewLine.setFocusable(false);
        btn_NewLine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_NewLine.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btn_NewOrnament.setText("New Ornament");
        btn_NewOrnament.setFocusable(false);
        btn_NewOrnament.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_NewOrnament.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel_FiguresLayout = new javax.swing.GroupLayout(jPanel_Figures);
        jPanel_Figures.setLayout(jPanel_FiguresLayout);
        jPanel_FiguresLayout.setHorizontalGroup(
            jPanel_FiguresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FiguresLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel_FiguresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_NewOrnament, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_NewLine, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        jPanel_FiguresLayout.setVerticalGroup(
            jPanel_FiguresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FiguresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_NewLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_NewOrnament)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel_Properties.setBackground(new java.awt.Color(47, 47, 47));

        slider_thickness.setMaximum(15);
        slider_thickness.setMinimum(1);
        slider_thickness.setPaintLabels(true);
        slider_thickness.setPaintTicks(true);
        slider_thickness.setValue(1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Thickness");

        btn_ChangeColor.setText("Change Color");

        checkbox_Fill.setForeground(new java.awt.Color(255, 255, 204));
        checkbox_Fill.setLabel("Filled");

        lbl_soleThickness.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_soleThickness.setText("Sole Thickness");

        slider_SoleThickness.setMaximum(15);
        slider_SoleThickness.setMinimum(1);
        slider_SoleThickness.setValue(1);

        javax.swing.GroupLayout jPanel_PropertiesLayout = new javax.swing.GroupLayout(jPanel_Properties);
        jPanel_Properties.setLayout(jPanel_PropertiesLayout);
        jPanel_PropertiesLayout.setHorizontalGroup(
            jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                .addGroup(jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(slider_SoleThickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(checkbox_Fill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)
                            .addComponent(btn_ChangeColor))
                        .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(jLabel1))
                        .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(slider_thickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(lbl_soleThickness))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_PropertiesLayout.setVerticalGroup(
            jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PropertiesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkbox_Fill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ChangeColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slider_thickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_soleThickness)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slider_SoleThickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel_Design.setBackground(new java.awt.Color(47, 47, 47));

        btn_NewDesign.setText("New Design");

        btn_LoadSelected.setText("Load Selected Design");

        javax.swing.GroupLayout jPanel_DesignLayout = new javax.swing.GroupLayout(jPanel_Design);
        jPanel_Design.setLayout(jPanel_DesignLayout);
        jPanel_DesignLayout.setHorizontalGroup(
            jPanel_DesignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DesignLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel_DesignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_LoadSelected)
                    .addComponent(btn_NewDesign, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_DesignLayout.setVerticalGroup(
            jPanel_DesignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DesignLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_NewDesign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_LoadSelected)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btn_Edit.setText("Edit");

        btn_Arcade.setText("Arcade");

        btn_Fire.setText("Fire");

        canvas_mainCanvas.setBackground(new java.awt.Color(255, 255, 255));
        canvas_mainCanvas.setForeground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout canvas_mainCanvasLayout = new javax.swing.GroupLayout(canvas_mainCanvas);
        canvas_mainCanvas.setLayout(canvas_mainCanvasLayout);
        canvas_mainCanvasLayout.setHorizontalGroup(
            canvas_mainCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        canvas_mainCanvasLayout.setVerticalGroup(
            canvas_mainCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_Properties, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Figures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Design, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(canvas_mainCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(569, Short.MAX_VALUE)
                .addComponent(btn_Edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Arcade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Fire)
                .addGap(307, 307, 307))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Edit)
                    .addComponent(btn_Arcade)
                    .addComponent(btn_Fire))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_Design, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_Figures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(canvas_mainCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas Main_canvas;
    public javax.swing.JButton btn_Arcade;
    public javax.swing.JButton btn_ChangeColor;
    public javax.swing.JButton btn_Edit;
    public javax.swing.JButton btn_Fire;
    public javax.swing.JButton btn_LoadSelected;
    public javax.swing.JButton btn_NewDesign;
    public javax.swing.JButton btn_NewLine;
    public javax.swing.JButton btn_NewOrnament;
    public javax.swing.JPanel canvas_mainCanvas;
    public java.awt.Checkbox checkbox_Fill;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JList jList_DesignList;
    private javax.swing.JPanel jPanel_Design;
    private javax.swing.JPanel jPanel_Figures;
    private javax.swing.JPanel jPanel_Properties;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_soleThickness;
    public javax.swing.JSlider slider_SoleThickness;
    public javax.swing.JSlider slider_thickness;
    // End of variables declaration//GEN-END:variables
}
