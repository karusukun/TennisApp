package Logic;
import Library.*;
import javax.swing.*; 
import java.awt.*; 
import java.util.ArrayList;
import java.util.List;

public class ArcadeDrawingAlg implements DesignDrawnI  {
    public void PaintArcadeMode() {
        //throw new System.Exception("Not implemented");
    }
    public void AuxiliarPainting() {
        //throw new System.Exception("Not implemented");
    }
    public void DrawDesign(Design pDesign) {
        //drawFigures(pDesign.getFigureList(), g );
    }
    
    public void drawFigures(List<Figure> pfigureList, Graphics pGrap){
        int listLong=0;
        while(listLong < pfigureList.size()){
            if(pfigureList.get(listLong).getKindFigure() == kindFigure.Circle){
                Circle oval = (Circle) pfigureList.get(listLong);
                drawCircle(oval, pGrap);
            }
            listLong++;
        }
    }
    
    private void drawCircle(Circle pCircle, Graphics pGrap){
        pGrap.setColor(pCircle.getColor());
        pGrap.drawOval(pCircle.getX1(), pCircle.getY1(), pCircle.getRadio(), pCircle.getRadio());
        if(pCircle.getFill() ){
            pGrap.fillOval(pCircle.getX1(), pCircle.getY1(), pCircle.getRadio(), pCircle.getRadio());
        }
        
        Graphics2D pGrap2 = (Graphics2D) pGrap;
        Stroke stroke = new BasicStroke(pCircle.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0,
            new float[] { 10, 0 }, 0);
        pGrap2.setStroke(stroke);
        pGrap2.setColor(pCircle.getStroke());
        pGrap2.drawOval(pCircle.getX1(), pCircle.getY1(), pCircle.getRadio(), pCircle.getRadio());
    }

}
