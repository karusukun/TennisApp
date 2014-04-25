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
    
    private void drawFigures(List<Figure> vFigures, Graphics grafica){
        System.out.println("Imprimendo en modo Editor");
        //super.paint(grafica);
        
        Graphics2D g2 = (Graphics2D) grafica;
        g2.setColor(Color.black);
        
        g2.setBackground(Color.white);
        g2.clearRect(0, 0, 550, 520);
        
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