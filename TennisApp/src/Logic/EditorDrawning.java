package Logic;
import Library.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.List;

public class EditorDrawning implements DesignDrawnI {
    
     @Override
    public void paint( Graphics pGraphic){
        drawFigures(DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList(), pGraphic);
    }
    
    //method to draw the figures in editor mode
    private void drawFigures(List<Figure> figureList, Graphics pGraphic){
        Graphics2D graphic = (Graphics2D) pGraphic;
        graphic.setBackground(Color.white);
        
        graphic.clearRect(0, 0, 550, 520);
        graphic.setColor(Color.black);
        
        int listLong=0;
        while(listLong < figureList.size()){
            kindFigure typeFigure = figureList.get(listLong).getKindFigure();
            switch(typeFigure){
                case Circle:
                    Circle circle = (Circle) figureList.get(listLong);
                    if(circle.getFill()){
                        graphic.setColor(circle.getColor());
                        graphic.fillOval(circle.getX1(),circle.getY1(),circle.getRadio(),circle.getRadio());
                        graphic.setColor(circle.getStroke());
                        graphic.drawOval(circle.getX1(),circle.getY1(),circle.getRadio(),circle.getRadio());
                    }else{
                        graphic.setColor(circle.getStroke());
                        graphic.drawOval(circle.getX1(),circle.getY1(),circle.getRadio(),circle.getRadio());
                    }
                    
                    break;
                    
                case DrawPoint:
                        DrawingPoint point = (DrawingPoint) figureList.get(listLong);
                        graphic.fillOval(point.getX1(),point.getY1(),point.getDrawingPoint(),point.getDrawingPoint());
                    break;
                    
                case StraightLine:
                        StraightLine line = (StraightLine) figureList.get(listLong);
                        graphic.drawLine(line.getX1(),line.getY1(),line.getX2(),line.getY2());
                    break;
                    
                default:
                    break;
            }
            listLong++;
        }      
        int radio = figureList.get(0).getRadio();
        
        //draw the borders
        graphic.drawLine(figureList.get(1).getX1() + radio, figureList.get(1).getY1() + radio, figureList.get(2).getX1() + radio, figureList.get(2).getY1() + radio);
        graphic.drawLine(figureList.get(2).getX1() + radio, figureList.get(2).getY1() + radio, figureList.get(3).getX1() + radio, figureList.get(3).getY1() + radio);
        graphic.drawLine(figureList.get(3).getX1() + radio, figureList.get(3).getY1() + radio, figureList.get(4).getX1() + radio, figureList.get(4).getY1() + radio);
        graphic.draw(new QuadCurve2D.Float(figureList.get(0).getX1() + radio, figureList.get(0).getY1() + radio, 255, 255, figureList.get(1).getX1() + radio, figureList.get(1).getY1() + radio));
        graphic.draw(new QuadCurve2D.Float(figureList.get(0).getX1() + radio, figureList.get(0).getY1() + radio, 10, 200, figureList.get(4).getX1() + radio, figureList.get(4).getY1() + radio));

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