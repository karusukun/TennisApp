/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views.GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Carlos
 */
public class MainWindow extends javax.swing.JFrame {
    
    //Creates new form MainWindow
        
    public MainWindow() {
        
        setContentPane(new JLabel(new ImageIcon("resources/background.jpg")));
        initComponents();
        setSize(1200, 800);
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
        btn_ChangeColor = new javax.swing.JButton();
        checkbox_Fill = new java.awt.Checkbox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel_Properties = new javax.swing.JPanel();
        slider_thickness = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        lbl_soleThickness = new javax.swing.JLabel();
        slider_SoleThickness = new javax.swing.JSlider();
        btn_SetOutlineColor = new javax.swing.JButton();
        btn_SetSoleColor = new javax.swing.JButton();
        btn_SetProperties = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel_Design = new javax.swing.JPanel();
        btn_NewDesign = new javax.swing.JButton();
        btn_LoadSelected = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        canvas_mainCanvas = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_Fire = new javax.swing.JButton();
        btn_Arcade = new javax.swing.JButton();
        btn_Edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jList_DesignList.setBackground(new java.awt.Color(47, 47, 47));
        jList_DesignList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jList_DesignList.setForeground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setViewportView(jList_DesignList);

        jPanel_Figures.setBackground(new java.awt.Color(47, 47, 47));

        btn_NewLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Writing.png"))); // NOI18N
        btn_NewLine.setFocusable(false);
        btn_NewLine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_NewLine.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btn_NewOrnament.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Graphing-Spreadsheets.png"))); // NOI18N
        btn_NewOrnament.setFocusable(false);
        btn_NewOrnament.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_NewOrnament.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btn_ChangeColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/PhotoshopCS2.png"))); // NOI18N
        btn_ChangeColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChangeColorActionPerformed(evt);
            }
        });

        checkbox_Fill.setForeground(new java.awt.Color(255, 255, 204));
        checkbox_Fill.setLabel("Filled");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Draw Line");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Change Color");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Draw Circle");

        javax.swing.GroupLayout jPanel_FiguresLayout = new javax.swing.GroupLayout(jPanel_Figures);
        jPanel_Figures.setLayout(jPanel_FiguresLayout);
        jPanel_FiguresLayout.setHorizontalGroup(
            jPanel_FiguresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FiguresLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel_FiguresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(btn_NewLine, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel_FiguresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_NewOrnament, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(46, 46, 46)
                .addGroup(jPanel_FiguresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_FiguresLayout.createSequentialGroup()
                        .addComponent(btn_ChangeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(checkbox_Fill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(59, 59, 59))
        );
        jPanel_FiguresLayout.setVerticalGroup(
            jPanel_FiguresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FiguresLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel_FiguresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_NewLine, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_FiguresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_NewOrnament, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel_FiguresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_ChangeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkbox_Fill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel_FiguresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel_Properties.setBackground(new java.awt.Color(47, 47, 47));

        slider_thickness.setMaximum(15);
        slider_thickness.setMinimum(1);
        slider_thickness.setPaintLabels(true);
        slider_thickness.setPaintTicks(true);
        slider_thickness.setValue(1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("Thickness");

        lbl_soleThickness.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_soleThickness.setForeground(new java.awt.Color(255, 255, 153));
        lbl_soleThickness.setText("Sole Thickness");

        slider_SoleThickness.setMaximum(15);
        slider_SoleThickness.setMinimum(1);
        slider_SoleThickness.setValue(1);

        btn_SetOutlineColor.setText("Set Outline Color");
        btn_SetOutlineColor.setToolTipText("");

        btn_SetSoleColor.setText("Set Sole Color");

        btn_SetProperties.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Zip.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Set Properties");

        javax.swing.GroupLayout jPanel_PropertiesLayout = new javax.swing.GroupLayout(jPanel_Properties);
        jPanel_Properties.setLayout(jPanel_PropertiesLayout);
        jPanel_PropertiesLayout.setHorizontalGroup(
            jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                .addGroup(jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(slider_SoleThickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slider_thickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_SetOutlineColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_SetSoleColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                        .addGroup(jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel1))
                            .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(lbl_soleThickness)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btn_SetProperties, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(37, 37, 37))
        );
        jPanel_PropertiesLayout.setVerticalGroup(
            jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PropertiesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slider_thickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_SetOutlineColor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_soleThickness)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_PropertiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_SetSoleColor)
                            .addComponent(slider_SoleThickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(btn_SetProperties, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_PropertiesLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Design.setBackground(new java.awt.Color(47, 47, 47));

        btn_NewDesign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/WinRAR.png"))); // NOI18N
        btn_NewDesign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewDesignActionPerformed(evt);
            }
        });

        btn_LoadSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Notepad.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("New Design");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Load Selected Design");

        javax.swing.GroupLayout jPanel_DesignLayout = new javax.swing.GroupLayout(jPanel_Design);
        jPanel_Design.setLayout(jPanel_DesignLayout);
        jPanel_DesignLayout.setHorizontalGroup(
            jPanel_DesignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DesignLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_DesignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_DesignLayout.createSequentialGroup()
                        .addComponent(btn_LoadSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel_DesignLayout.createSequentialGroup()
                        .addComponent(btn_NewDesign, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_DesignLayout.setVerticalGroup(
            jPanel_DesignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DesignLayout.createSequentialGroup()
                .addGroup(jPanel_DesignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_DesignLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btn_NewDesign, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_DesignLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel_DesignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_DesignLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_LoadSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_DesignLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );

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
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(47, 47, 47));
        jPanel1.setForeground(new java.awt.Color(47, 47, 47));

        btn_Fire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Firefox.png"))); // NOI18N

        btn_Arcade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/IE.png"))); // NOI18N

        btn_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Paint.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Fire, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Arcade, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_Edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btn_Fire, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_Arcade, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Design, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(canvas_mainCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_Figures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_Design, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel_Properties, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(canvas_mainCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_Figures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(404, 404, 404))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NewDesignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewDesignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_NewDesignActionPerformed

    private void btn_ChangeColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChangeColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ChangeColorActionPerformed

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
    public javax.swing.JButton btn_SetOutlineColor;
    public javax.swing.JButton btn_SetProperties;
    public javax.swing.JButton btn_SetSoleColor;
    public javax.swing.JPanel canvas_mainCanvas;
    public java.awt.Checkbox checkbox_Fill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JList jList_DesignList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Design;
    private javax.swing.JPanel jPanel_Figures;
    private javax.swing.JPanel jPanel_Properties;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_soleThickness;
    public javax.swing.JSlider slider_SoleThickness;
    public javax.swing.JSlider slider_thickness;
    // End of variables declaration//GEN-END:variables
}
