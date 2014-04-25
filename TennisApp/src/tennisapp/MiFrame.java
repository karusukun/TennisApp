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
        Circle c = new Circle(150,30,50);
        c.setFill(true);
        c.setColor(Color.CYAN);
        c.setStroke(Color.MAGENTA);
        c.setStroke_Thickness(6);
                
        CurveBorder border = new CurveBorder(1,200, 150,80,135,180);
        border.setColor(Color.RED);
        border.setStroke(Color.ORANGE);
        border.setStroke_Thickness(6);
        
        StraightLine rec = new StraightLine(123, 400, 400, 200);
        rec.setColor(Color.GREEN);
        rec.setStroke_Thickness(2);
        rec.setFill(true);
        rec.setStroke(Color.BLACK);
        
        DrawingPoint point = new DrawingPoint(10, 300, 200);
        point.setColor(Color.BLACK);
        
        StraightBorder pBorder = new StraightBorder(123, 300, 200, 150);
        pBorder.setStroke_Thickness(2);
        pBorder.setColor(Color.CYAN);
        
        figList.add(c);
        figList.add(border);
        figList.add(point);
        figList.add(rec);
        figList.add(pBorder);
        
        
        g.drawLine(400, 400, 300, 200);
        
        Polygon polygon2 = new Polygon();
        polygon2.addPoint(400,400);
        polygon2.addPoint(300,200);
        polygon2.addPoint(rec.getX1(),rec.getY1());
        polygon2.addPoint(rec.getX2(),rec.getY2());

        //g.fillPolygon(polygon2);

        int valoresX[]= {400,300,rec.getX2(),rec.getX2()};
        int valoresY[]= {400,200,rec.getY2(),rec.getY1()};
        //g.fillPolygon(valoresX, valoresY, 4 );
        Design d = new Design();
        d.setFigureList(figList);
        example.DrawDesign(d);
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