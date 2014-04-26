package Logic;
import Library.*;
import com.sun.org.apache.bcel.internal.generic.FLOAD;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Arc2D;
import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.List;

public class EditorDrawning implements DesignDrawnI {
    
     @Override
    public void paint( Graphics pGraphic){
        try
        {
            drawFigures(DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList(), pGraphic);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    //Method to draw a curve border
    private void drawCurveBorder(CurveBorder pBorder, Graphics graphic){
        Graphics2D pGrap2 = (Graphics2D) graphic;
        pGrap2.setColor(Color.BLACK);
        Stroke stroke = new BasicStroke(pBorder.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0,new float[] { 10, 0 }, 0);
        pGrap2.setStroke(stroke);
        pGrap2.draw(new QuadCurve2D.Float(pBorder.getX1(), pBorder.getY1(),pBorder.getCtrlX(), pBorder.getCtrlY(), pBorder.getX2(), pBorder.getY2()));
    }
    
    //draw the sole
    private void drawSole(Sole pSole, Graphics graphic){
        Graphics2D pGrap2 = (Graphics2D) graphic;
        pGrap2.setColor(Color.BLACK);
        Stroke stroke = new BasicStroke(pSole.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 10, 0 }, 0);
        pGrap2.setStroke(stroke);
        pGrap2.drawLine(pSole.getX1(), pSole.getY1(), pSole.getX2(), pSole.getY2());
    }
    
    //draw the straigh border
    private void drawStraightBorder(StraightBorder pBorder, Graphics graphic){
        Graphics2D pGrap2 = (Graphics2D) graphic;
        pGrap2.setColor(Color.BLACK);
        Stroke stroke = new BasicStroke(pBorder.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 10, 0 }, 0);
        pGrap2.setStroke(stroke);
        pGrap2.drawLine(pBorder.getX1(), pBorder.getY1(), pBorder.getX2(), pBorder.getY2());
    }
    
    //method to draw the figures in editor mode
    private void drawFigures(List<Figure> figureList, Graphics pGraphic){
        Graphics2D graphic = (Graphics2D) pGraphic;
        graphic.setBackground(Color.white);
        
        graphic.clearRect(0, 0, 800, 600);
        graphic.setColor(Color.black);
        for(int listLong=0;listLong < figureList.size();listLong++){
            kindFigure typeFigure = figureList.get(listLong).getKindFigure();
            switch(typeFigure){
                case Circle:
                    Circle circle = (Circle) figureList.get(listLong);
                    if(circle.getFill()){
                        graphic.setColor(circle.getColor());
                        graphic.fillOval(circle.getX1(),circle.getY1(),circle.getRadio()*2,circle.getRadio()*2);
                        graphic.setColor(circle.getStroke());
                        graphic.drawOval(circle.getX1(),circle.getY1(),circle.getRadio()*2,circle.getRadio()*2);
                    }else{
                        graphic.setColor(circle.getStroke());
                        graphic.drawOval(circle.getX1(),circle.getY1(),circle.getRadio()*2,circle.getRadio()*2);
                    }
                    break;
                    
                case DrawPoint:
                        DrawingPoint point = (DrawingPoint) figureList.get(listLong);
                        graphic.fillOval(point.getX1(),point.getY1(),point.getDrawingPoint()*2,point.getDrawingPoint()*2);
                    break;
                    
                case StraightLine:
                        StraightLine line = (StraightLine) figureList.get(listLong);
                        graphic.drawLine(line.getX1(),line.getY1(),line.getX2(),line.getY2());
                    break;
                    
                case CurveBorder:
                        CurveBorder border = (CurveBorder) figureList.get(listLong);
                        drawCurveBorder(border,graphic);
                    break;
                 
                case StraighBorder:
                        StraightBorder recBorder = (StraightBorder) figureList.get(listLong);
                        drawStraightBorder(recBorder, graphic);
                    break;
                
                case Sole:
                        Sole sole = (Sole) figureList.get(listLong);
                        drawSole(sole, graphic);
                    break;
                    
                default:                    
                    break;
            }
        }
        graphic.finalize();
    }
     
    
}