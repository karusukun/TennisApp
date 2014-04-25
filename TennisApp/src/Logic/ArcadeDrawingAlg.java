package Logic;
import Library.*;
import javax.swing.*; 
import java.awt.*; 
import java.util.ArrayList;
import java.util.List;

public class ArcadeDrawingAlg implements DesignDrawnI  {
    
    @Override
    public void paint(Graphics pGraphic){
        this.graphic = pGraphic;
        drawFigures(DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList());
        drawFigures(DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList());
    }
    
    private void drawCircle(Circle pCircle){
        Graphics2D pGrap2 = (Graphics2D) graphic;
        pGrap2.setColor(pCircle.getColor());
        pGrap2.drawOval(pCircle.getX1(), pCircle.getY1(), pCircle.getRadio(), pCircle.getRadio());
        if(pCircle.getFill() ){
            int x = pCircle.getX1();
            int y = pCircle.getY1();
            int radio = pCircle.getRadio();
            int angulo = 0;
            while(angulo<=360){
                pGrap2.fillArc(x, y, radio, radio, angulo, 360);
                angulo++;
            }
        }
        Stroke stroke = new BasicStroke(pCircle.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0,
            new float[] { 10, 0 }, 0);
        pGrap2.setStroke(stroke);
        pGrap2.setColor(pCircle.getStroke());
        pGrap2.drawOval(pCircle.getX1(), pCircle.getY1(), pCircle.getRadio(), pCircle.getRadio());
    }
    
    //Method to draw a curve border
    private void drawCurveBorder(CurveBorder pBorder){
        Graphics2D pGrap2 = (Graphics2D) graphic;
        pGrap2.setColor(pBorder.getColor());
        Stroke stroke = new BasicStroke(pBorder.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0,new float[] { 10, 0 }, 0);
        pGrap2.setStroke(stroke);
        pGrap2.draw(pBorder.getCurve());
    }
    
    //Method to draw a figure point
    private void drawPoint(DrawingPoint pPoint){
        Graphics2D pGrap2 = (Graphics2D) graphic;
        pGrap2.setColor(pPoint.getColor());
        int counter = 0;
        while(counter <= 360){
            pGrap2.fillArc(pPoint.getX1(), pPoint.getY1(),pPoint.getDrawingPoint() ,pPoint.getDrawingPoint() , 0, counter);
            counter++;
        }
    }
    
    private void drawStraightLine(StraightLine pLine){
        Graphics2D pGrap2 = (Graphics2D) graphic;
        pGrap2.setColor(pLine.getColor());
        Stroke stroke = new BasicStroke(pLine.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 10, 0 }, 0);
        pGrap2.setStroke(stroke);
        int counter = 0;
       while(counter <= pLine.getX2()){
           if(pLine.getFill()){
                pGrap2.drawLine(pLine.getX1()-1, pLine.getY1()-1, pLine.getX2()-1, pLine.getY2()-1);
                pGrap2.drawLine(pLine.getX1()+1, pLine.getY1()+1, pLine.getX2()+1, pLine.getY2()+1);
           }
           counter++;
       }
       pGrap2.setColor(pLine.getStroke());
       pGrap2.drawLine(pLine.getX1(), pLine.getY1(), pLine.getX2(), pLine.getY2());
    }
   
    private void drawStraightBorder(StraightBorder pBorder){
        Graphics2D pGrap2 = (Graphics2D) graphic;
        pGrap2.setColor(pBorder.getColor());
        Stroke stroke = new BasicStroke(pBorder.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 10, 0 }, 0);
        pGrap2.setStroke(stroke);
        pGrap2.drawLine(pBorder.getX1(), pBorder.getY1(), pBorder.getX2(), pBorder.getY2());
    }
    
    private void drawFillers(List<Figure> pfigureList){
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
    
    private void drawFigures(List<Figure> pfigureList){
        
        int listLong=0;
        while(listLong < pfigureList.size()){
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
                 
                case DrawPoint:
                        DrawingPoint point = (DrawingPoint) pfigureList.get(listLong);
                        drawPoint(point);
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
                    graphic.drawRect(12, 12, 12, 12);
                    break;
            }
            listLong++;
        }
        Graphics2D g2 = (Graphics2D) graphic;
        int radioPoint = pfigureList.get(0).getRadio();
        g2.setColor(Color.black);
        g2.drawLine(pfigureList.get(1).getX1() + radioPoint, pfigureList.get(1).getY1() + radioPoint, pfigureList.get(2).getX1() + radioPoint, pfigureList.get(2).getY1() + radioPoint);
        g2.drawLine(pfigureList.get(2).getX1() + radioPoint, pfigureList.get(2).getY1() + radioPoint, pfigureList.get(3).getX1() + radioPoint, pfigureList.get(3).getY1() + radioPoint);
        g2.drawLine(pfigureList.get(3).getX1() + radioPoint, pfigureList.get(3).getY1() + radioPoint, pfigureList.get(4).getX1() + radioPoint, pfigureList.get(4).getY1() + radioPoint);
        //g2.draw(new QuadCurve2D.Float(vFigures.get(0).getX() + halfPointSize, vFigures.get(0).getY() + halfPointSize, 255, 255, vFigures.get(1).getX() + halfPointSize, vFigures.get(1).getY() + halfPointSize));
        //g2.draw(new QuadCurve2D.Float(vFigures.get(0).getX() + halfPointSize, vFigures.get(0).getY() + halfPointSize, 10, 200, vFigures.get(4).getX() + halfPointSize, vFigures.get(4).getY() + halfPointSize));   
        g2.setColor(Color.white);
        g2.fillArc(pfigureList.get(0).getX1() + radioPoint, (pfigureList.get(0).getY1() + radioPoint)-40,( pfigureList.get(1).getX1()- pfigureList.get(0).getX1()),70,180, 180); 
    }
    
    public ArcadeDrawingAlg() {
        this.graphic = null;
    }
    
    public ArcadeDrawingAlg(Graphics graphic) {
        this.graphic = graphic;
    }
    
    public Graphics getGraphic() {
        return graphic;
    }

    public void setGraphic(Graphics graphic) {
        this.graphic = graphic;
    }
    
    private Graphics graphic;
}
