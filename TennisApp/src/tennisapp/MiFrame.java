package tennisApp;
import Library.*;
import Logic.ArcadeDrawingAlg;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class MiFrame extends JFrame { 
 
    public MiFrame() { 
        super("¡Hola mundo con ventanas!"); 
        //setBackground(Color.orange); 
        setSize(500,500); 
        setVisible(true); 
    } 
    
    public void paint(Graphics g) {
        //g.drawArc(200, 150,80, 80, 180, 135);
        
        ArcadeDrawingAlg example = new ArcadeDrawingAlg(g);
        List<Figure> figList = new ArrayList();
        
        //Datos de prueba
        
        CurveBorder cb = new CurveBorder(5,10,);
        
        
        
        Design d = new Design();
        d.setFigureList(figList);
        example.DrawDesign(d, g);
    } 
    public static void main(String args[]) { 
        MiFrame mf = new MiFrame(); 

        mf.addWindowListener( new WindowAdapter() { 
        public void windowClosing( WindowEvent evt ){ 
        System.exit( 0 );} 
        }); 
    }
} 
/*
// Fig. 12.21: DrawPolygons.java
// Drawing polygons.

import java.awt.*;
import javax.swing.*;

public class MiFrame extends JFrame {

   // set window's title bar String and dimensions
   public MiFrame()
   {
      super( "Drawing Polygons" );

      setSize( 275, 230 );
      setVisible( true );
   }

   // draw polygons and polylines
   public void paint( Graphics g )
   {
      super.paint( g );  // call superclass's paint method

      int xValues[] = { 20, 40, 50, 30, 20, 15 };
      int yValues[] = { 50, 50, 60, 80, 80, 60 };
      Polygon polygon1 = new Polygon( xValues, yValues, 6 );

      g.drawPolygon( polygon1 );

      int xValues2[] = { 70, 90, 100, 80, 70, 65, 60 };
      int yValues2[] = { 100, 100, 110, 110, 130, 110, 90 };

      g.drawPolyline( xValues2, yValues2, 7 );

      int xValues3[] = { 120, 140, 150, 190 };
      int yValues3[] = { 40, 70, 80, 60 };

      g.fillPolygon( xValues3, yValues3, 4 );

      Polygon polygon2 = new Polygon();
      polygon2.addPoint( 165, 135 );
      polygon2.addPoint( 175, 150 );
      polygon2.addPoint( 270, 200 );
      polygon2.addPoint( 200, 220 );
      polygon2.addPoint( 130, 180 );

      g.fillPolygon( polygon2 );

   } // end method paint

   // execute application
   public static void main( String args[] )
   {
      MiFrame application = new MiFrame();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // end class DrawPolygons
*/