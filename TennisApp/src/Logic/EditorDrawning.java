package Logic;
import Library.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.List;

public class EditorDrawning implements DesignDrawnI  {
    
     @Override
    public void paint(Design pDesign, Graphics pGrapic){
        //drawFillers(pDesign.getFigureList(), pGrapic);
        drawFigures(pDesign.getFigureList(), pGrapic);
    }
    
    private void drawFigures(List<Figure> vFigures, Graphics grafica){
        System.out.println("Imprimendo en modo Editor");
        //super.paint(grafica);

        Graphics2D g2 = (Graphics2D) grafica;
        g2.setColor(Color.black);
        
        for (int figures = 0; figures < vFigures.size(); figures++){
            if (vFigures.get(figures).getKindFigure() == kindFigure.DrawPoint ){
                g2.fillOval(vFigures.get(figures).getX1(), vFigures.get(figures).getY1(), vFigures.get(figures).getDrawingPoint(), vFigures.get(figures).getDrawingPoint());
            }
            else if (vFigures.get(figures).getKindFigure() == kindFigure.StraightLine){
                g2.drawLine(vFigures.get(figures).getX1(), vFigures.get(figures).getY1(), vFigures.get(figures).getX2(), vFigures.get(figures).getY2());
            }
            else if (vFigures.get(figures).getKindFigure() == kindFigure.Circle){
                g2.drawOval(vFigures.get(figures).getX1(), vFigures.get(figures).getY1(), vFigures.get(figures).getRadio(), vFigures.get(figures).getRadio());
            }
            else if (vFigures.get(figures).getKindFigure() == kindFigure.CurveBorder){
                g2.draw(vFigures.get(figures).getCurve());
            }
            else if (vFigures.get(figures).getKindFigure() == kindFigure.Sole){
                g2.drawLine(vFigures.get(figures).getX1(), vFigures.get(figures).getY1(), vFigures.get(figures).getX2(), vFigures.get(figures).getY2());
            }
                        
        }
        
        int radio = vFigures.get(0).getRadio();
        
        g2.drawLine(vFigures.get(1).getX1() + radio, vFigures.get(1).getY1() + radio, vFigures.get(2).getX1() + radio, vFigures.get(2).getY1() + radio);
        g2.drawLine(vFigures.get(2).getX1() + radio, vFigures.get(2).getY1() + radio, vFigures.get(3).getX1() + radio, vFigures.get(3).getY1() + radio);
        g2.drawLine(vFigures.get(3).getX1() + radio, vFigures.get(3).getY1() + radio, vFigures.get(4).getX1() + radio, vFigures.get(4).getY1() + radio);
        g2.draw(new QuadCurve2D.Float(vFigures.get(0).getX1() + radio, vFigures.get(0).getY1() + radio, 255, 255, vFigures.get(1).getX1() + radio, vFigures.get(1).getY1() + radio));
        g2.draw(new QuadCurve2D.Float(vFigures.get(0).getX1() + radio, vFigures.get(0).getY1() + radio, 10, 200, vFigures.get(4).getX1() + radio, vFigures.get(4).getY1() + radio));

    }
    
     private void drawFillers(List<Figure> pfigureList, Graphics graphic){
        Graphics2D g2 = (Graphics2D) graphic;
        g2.setBackground(Color.white);
        
        g2.clearRect(0, 0, 550, 520);
        int radioPoint = pfigureList.get(0).getRadio();

        int[] puntosX=new int[5];
        int[] puntosY=new int[5];
        for (int i=0;i<=4;i++){
            puntosX[i]=pfigureList.get(i).getX1() + radioPoint;
            puntosY[i]=pfigureList.get(i).getY1() + radioPoint;
        }             
        
        g2.setColor(pfigureList.get(0).getColor());
        g2.drawPolygon(puntosX, puntosY, puntosX.length);
        g2.fillPolygon(puntosX, puntosY, puntosX.length);
        g2.fillArc((pfigureList.get(0).getX1()+ radioPoint)-50, pfigureList.get(0).getY1()+ radioPoint,100,( pfigureList.get(4).getX1()- pfigureList.get(0).getY1()),90, 180);
        
        /*g2.setColor(Color.black);
        g2.drawLine(pfigureList.get(1).getX1() + radioPoint, pfigureList.get(1).getY1() + radioPoint, pfigureList.get(2).getX1() + radioPoint, pfigureList.get(2).getY1() + radioPoint);
        g2.drawLine(pfigureList.get(2).getX1() + radioPoint, pfigureList.get(2).getY1() + radioPoint, pfigureList.get(3).getX1() + radioPoint, pfigureList.get(3).getY1() + radioPoint);
        g2.drawLine(pfigureList.get(3).getX1() + radioPoint, pfigureList.get(3).getY1() + radioPoint, pfigureList.get(4).getX1() + radioPoint, pfigureList.get(4).getY1() + radioPoint);
        //g2.draw(new QuadCurve2D.Float(vFigures.get(0).getX() + halfPointSize, vFigures.get(0).getY() + halfPointSize, 255, 255, vFigures.get(1).getX() + halfPointSize, vFigures.get(1).getY() + halfPointSize));
        //g2.draw(new QuadCurve2D.Float(vFigures.get(0).getX() + halfPointSize, vFigures.get(0).getY() + halfPointSize, 10, 200, vFigures.get(4).getX() + halfPointSize, vFigures.get(4).getY() + halfPointSize));   
        g2.setColor(Color.white);
        g2.fillArc(pfigureList.get(0).getX1() + radioPoint, (pfigureList.get(0).getY1() + radioPoint)-40,( pfigureList.get(1).getX1()- pfigureList.get(0).getX1()),70,180, 180); */
    }
     
    
}
    /*
    @Override
    public void paint(Design pDesing, Graphics pGrap) {
        Graphics2D graphic = (Graphics2D) pGrap;
        graphic.setBackground(Color.white);
        
        graphic.clearRect(0, 0, 550, 520);
        graphic.setColor(Color.black);
        graphic.setStroke(2);
        List<Figure> figureList = pDesing.getFigureList();
        
        int listLong=0;
        while(listLong < figureList.size()){
            kindFigure typeFigure = figureList.get(listLong).getKindFigure();
            switch(typeFigure){
                case Circle:
                    Circle circle = (Circle) figureList.get(listLong);
                    graphic.drawOval(circle.getX1(),circle.getY1(),circle.getRadio(),circle.getRadio());
                    break;
                    
                case CurveBorder:
                        CurveBorder border = (CurveBorder) figureList.get(listLong);
                        graphic.draw(border.getCurve());
                    break;
                 
                case DrawPoint:
                        DrawingPoint point = (DrawingPoint) figureList.get(listLong);
                        graphic.fillOval(point.getX1(),point.getY1(),point.getDrawingPoint(),point.getDrawingPoint());
                    break;
                    
                case StraightLine:
                        StraightLine line = (StraightLine) figureList.get(listLong);
                        graphic.drawLine(line.getX1(),line.getY1(),line.getX2(),line.getY2());
                    break;
                    
                case StraighBorder:
                        StraightBorder recBorder = (StraightBorder) figureList.get(listLong);
                        graphic.drawLine(recBorder.getX1(), recBorder.getY1(), recBorder.getX2(), recBorder.getY2());
                    break;
                default:
                    break;
            }
            listLong++;
        }
    }       
}
*/