package Logic;
import Library.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.QuadCurve2D;
import java.util.List;

public class FireDrawningAlg implements DesignDrawnI  {
    @Override
    public void paint(Graphics pGrapic){
        this.graphic = pGrapic;
        drawFigures(DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList());
    }
    //this method has to draw a circle or a fill circle
    private void drawCircle(Circle pCircle){
        Graphics2D pGrap2 = (Graphics2D) graphic;
        pGrap2.setColor(pCircle.getColor());
        if(pCircle.getFill() ){
            pGrap2.fillOval(pCircle.getX1(), pCircle.getY1(), pCircle.getRadio()*2, pCircle.getRadio()*2);
        }
        Stroke stroke = new BasicStroke(pCircle.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0,new float[] { 10, 0 }, 0);
        pGrap2.setStroke(stroke);
        pGrap2.setColor(pCircle.getStroke());
        pGrap2.drawOval(pCircle.getX1(), pCircle.getY1(), pCircle.getRadio()*2, pCircle.getRadio()*2);
    }
    
    //Method to draw a curve border
    private void drawCurveBorder(CurveBorder pBorder){
        Graphics2D pGrap2 = (Graphics2D) graphic;
        pGrap2.setColor(pBorder.getColor());
        Stroke stroke = new BasicStroke(pBorder.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0,new float[] { 10, 0 }, 0);
        pGrap2.setStroke(stroke);
        pGrap2.draw(new QuadCurve2D.Float(pBorder.getX1(), pBorder.getY1(),pBorder.getCtrlX(), pBorder.getCtrlY(), pBorder.getX2(), pBorder.getY2()));
    }
    
    //draw the sole
    private void drawSole(Sole pSole){
        Graphics2D pGrap2 = (Graphics2D) graphic;
        pGrap2.setColor(pSole.getColor());
        Stroke stroke = new BasicStroke(pSole.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 10, 0 }, 0);
        pGrap2.setStroke(stroke);
        pGrap2.drawLine(pSole.getX1(), pSole.getY1(), pSole.getX2(), pSole.getY2());
    }
     
    //draw a simple line
    private void drawStraightLine(StraightLine pLine){
        Graphics2D pGrap2 = (Graphics2D) graphic;
        pGrap2.setColor(pLine.getColor());
        Stroke stroke = new BasicStroke(pLine.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 10, 0 }, 0);
        pGrap2.setStroke(stroke);
        if(pLine.getFill()){
             pGrap2.drawLine(pLine.getX1()-1, pLine.getY1()-1, pLine.getX2()-1, pLine.getY2()-1);
             pGrap2.drawLine(pLine.getX1()+1, pLine.getY1()+1, pLine.getX2()+1, pLine.getY2()+1);
        }
       pGrap2.setColor(pLine.getStroke());
       pGrap2.drawLine(pLine.getX1(), pLine.getY1(), pLine.getX2(), pLine.getY2());
    }
   
    //draw the straigh border
    private void drawStraightBorder(StraightBorder pBorder){
        Graphics2D pGrap2 = (Graphics2D) graphic;
        pGrap2.setColor(pBorder.getColor());
        Stroke stroke = new BasicStroke(pBorder.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 10, 0 }, 0);
        pGrap2.setStroke(stroke);
        pGrap2.drawLine(pBorder.getX1(), pBorder.getY1(), pBorder.getX2(), pBorder.getY2());
    }
    
    //We do it with a parter example and help
    //method
    private void drawFillers(List<Figure> pfigureList){
        
        Graphics2D painter = (Graphics2D) graphic;
        painter.setBackground(Color.white);
        
        painter.clearRect(0, 0, 550, 520);
        int radioPoint = pfigureList.get(0).getDrawingPoint();

        int[] puntosX=new int[5];
        int[] puntosY=new int[5];
        for (int i=0;i<=4;i++){
            puntosX[i]=pfigureList.get(i).getX1() + radioPoint;
            puntosY[i]=pfigureList.get(i).getY1() + radioPoint;
        }             
        
        //fill the poligon of the points
        painter.setColor(pfigureList.get(0).getColor());
        painter.drawPolygon(puntosX, puntosY, puntosX.length);
        painter.fillPolygon(puntosX, puntosY, puntosX.length);
        painter.fillArc((pfigureList.get(0).getX1()+ radioPoint)-50, pfigureList.get(0).getY1()+ radioPoint,100,( pfigureList.get(4).getX1()- pfigureList.get(0).getY1()),90, 180);
        
        //draw the borders of the tennis
        painter.setColor(Color.black);
        painter.drawLine(pfigureList.get(1).getX1() + radioPoint, pfigureList.get(1).getY1() + radioPoint, pfigureList.get(2).getX1() + radioPoint, pfigureList.get(2).getY1() + radioPoint);
        painter.drawLine(pfigureList.get(2).getX1() + radioPoint, pfigureList.get(2).getY1() + radioPoint, pfigureList.get(3).getX1() + radioPoint, pfigureList.get(3).getY1() + radioPoint);
        painter.drawLine(pfigureList.get(3).getX1() + radioPoint, pfigureList.get(3).getY1() + radioPoint, pfigureList.get(4).getX1() + radioPoint, pfigureList.get(4).getY1() + radioPoint);
        painter.draw(new QuadCurve2D.Float(pfigureList.get(0).getX1() + radioPoint, pfigureList.get(0).getY1() + radioPoint, 255, 255, pfigureList.get(1).getX1() + radioPoint, pfigureList.get(1).getY1() + radioPoint));
        painter.draw(new QuadCurve2D.Float(pfigureList.get(0).getX1() + radioPoint, pfigureList.get(0).getY1() + radioPoint, 10, 200, pfigureList.get(4).getX1() + radioPoint, pfigureList.get(4).getY1() + radioPoint));
        painter.setColor(Color.white);
        painter.fillArc(pfigureList.get(0).getX1() + radioPoint, (pfigureList.get(0).getY1() + radioPoint)-40,( pfigureList.get(1).getX1()- pfigureList.get(0).getX1()),70,180, 180); 
    }
    
    //Method to draw the differents figures
    private void drawFigures(List<Figure> pfigureList){
        //drawFillers(pfigureList);
        int listLong=0;
        while(listLong < pfigureList.size()){
            //depend on the kind of figure it call the respective function of painting
            kindFigure typeFigure = pfigureList.get(listLong).getKindFigure();
            switch(typeFigure){
                case Circle:
                    Circle circle = (Circle) pfigureList.get(listLong);
                    drawCircle(circle);
                    break;
                    
                case CurveBorder:
                        CurveBorder border = (CurveBorder) pfigureList.get(listLong);
                        drawCurveBorder(border);
                    break;
                 
                case Sole:
                        Sole sole = (Sole) pfigureList.get(listLong);
                        drawSole(sole);
                    break;
                    
                case StraightLine:
                        StraightLine line = (StraightLine) pfigureList.get(listLong);
                        drawStraightLine(line);
                    break;
                    
                case StraighBorder:
                        StraightBorder recBorder = (StraightBorder) pfigureList.get(listLong);
                        drawStraightBorder(recBorder);
                    break;
                default:
                    System.out.println("Not found figure Fire\n");
                    break;
            }
            listLong++;
        }
        graphic.finalize();
    }
    
    public FireDrawningAlg() {
        this.graphic = null;
    }
    
    public FireDrawningAlg(Graphics graphic) {
        this.graphic = graphic;
    }
    
    public Graphics getGraphic() {
        return graphic;
    }

    public void setGraphic(Graphics graphic) {
        this.graphic = graphic;
    }
    
    private Graphics graphic;
    public void PaintFireMode() {
        //throw new System.Exception("Not implemented");
    }
    public void AuxiliarPainting() {
        //throw new System.Exception("Not implemented");
    }

}
