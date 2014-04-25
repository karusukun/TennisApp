package tennisApp;
import Library.*;
import Logic.ArcadeDrawingAlg;
import Logic.DesignLogic; 
import Logic.PaintManager;
import java.awt.*; 
import java.awt.event.*; 
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class MiFrame extends JFrame { 
 
    public MiFrame() { 
        super("¡Hola mundo con ventanas!"); 
        //setBackground(Color.orange); 
        setSize(500,500); 
        setVisible(true);
    } 
    
    
        
    
    public static void main(String args[]) { 
        
        MiFrame mf = new MiFrame(); 
        
        List<Figure> figList = new ArrayList();
        
        

//Datos de prueba
        
        Circle c = new Circle(150,30,50);
        c.setFill(true);
        c.setColor(Color.CYAN);
        c.setStroke(Color.MAGENTA);
        c.setStroke_Thickness(6);
                
        CurveBorder border = new CurveBorder(200, 150,300,130,80,80);
        border.setColor(Color.RED);
        border.setStroke(Color.ORANGE);
        border.setStroke_Thickness(1);
        
        StraightLine rec = new StraightLine(123, 400, 400, 200);
        rec.setColor(Color.GREEN);
        rec.setStroke_Thickness(2);
        rec.setFill(true);
        rec.setStroke(Color.BLACK);
        
        DrawingPoint point = new DrawingPoint(300, 200, PointID.A);
        
        StraightBorder pBorder = new StraightBorder(123, 300, 200, 150);
        pBorder.setStroke_Thickness(2);
        pBorder.setColor(Color.CYAN);
        
        c.setFill(true);
        c.setColor(Color.CYAN);
        c.setStroke(Color.MAGENTA);
        c.setStroke_Thickness(6);
                
        border = new CurveBorder(200, 150,300,130,80,80);
        border.setColor(Color.RED);
        border.setStroke(Color.ORANGE);
        border.setStroke_Thickness(1);
        
        
        rec = new StraightLine(123, 400, 400, 200);
        rec.setColor(Color.GREEN);
        rec.setStroke_Thickness(2);
        rec.setFill(true);
        rec.setStroke(Color.BLACK);
        
        point = new DrawingPoint(300, 200, PointID.A);
        
        pBorder = new StraightBorder(123, 300, 200, 150);
        pBorder.setStroke_Thickness(2);
        pBorder.setColor(Color.CYAN);
        
        
        
        figList.add(c);
        figList.add(border);
        figList.add(point);
        figList.add(rec);
        figList.add(pBorder);
        
        Design d = new Design("Prueba");
                //Datos de prueba
        

        
                
        d.setFigureList(figList);
        mf.getGraphics().drawLine(230,123,455,200);
       
        PaintManager.getInstance().setMode(modePaint.Fire);
        DesignLogic.getDesignLogicInstance().setActualDesign(d);
        PaintManager.getInstance().loadDesign( mf.getGraphics());
        
        //PaintManager.getInstance().setMode(modePaint.Arcade);
        //PaintManager.getInstance().loadDesign(d, mf.getGraphics());
        

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