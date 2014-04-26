package Logic;
import Library.*;
import javax.swing.*; 
import java.awt.*; 
import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.List;

public class ArcadeDrawingAlg implements DesignDrawnI  {
    
    @Override       //paint method for the figures
    
    // f(n)= 5+(3681)N+ falta el fill -> O(n)=n
    public void paint(Graphics pGraphic){
        this.graphic = pGraphic;                //+1
        drawFigures(DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList()); //4+(3681)N+ falta el fill
    }
    
    // Method to draw a circle f(n)=3671
    private void drawCircle(Circle pCircle){
        Graphics2D pGrap2 = (Graphics2D) graphic;   //+1
        pGrap2.setColor(pCircle.getColor());        //+2+1+2 = 5
        pGrap2.drawOval(pCircle.getX1(), pCircle.getY1(), pCircle.getRadio()*2, pCircle.getRadio()*2);//+2+2+2+3+3+4 = 16
        //15+360*10 = 3614
        if(pCircle.getFill()){ //2+1
            int x = pCircle.getX1();//1+2=3
            int y = pCircle.getY1();//1+2=3
            int radio = pCircle.getRadio()*2;//1+2+1=4
            int angulo = 0;//+1
            while(angulo<=360){//1+360*
                pGrap2.fillArc(x, y, radio, radio, angulo, 360);//2+6
                angulo++;//2
            }
        }
        Stroke stroke = new BasicStroke(pCircle.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0,new float[] { 10, 0 }, 0);//+1+2+2+5 =10
        pGrap2.setStroke(stroke);//3
        pGrap2.setColor(pCircle.getStroke());//5
        pGrap2.drawOval(pCircle.getX1(), pCircle.getY1(), pCircle.getRadio()*2, pCircle.getRadio()*2);//+2+10+4
    }
    
    //Method to draw a curve border f(n)=36
    private void drawCurveBorder(CurveBorder pBorder){
        Graphics2D pGrap2 = (Graphics2D) graphic;//+1
        pGrap2.setColor(pBorder.getColor());//5
        Stroke stroke = new BasicStroke(pBorder.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0,new float[] { 10, 0 }, 0);//10
        pGrap2.setStroke(stroke);//3
        pGrap2.draw(new QuadCurve2D.Float(pBorder.getX1(), pBorder.getY1(),pBorder.getCtrlX(), pBorder.getCtrlY(), pBorder.getX2(), pBorder.getY2()));//17
    }
    
    //method to draw a straight lone f(n)= 116
    private void drawStraightLine(StraightLine pLine){
        Graphics2D pGrap2 = (Graphics2D) graphic;//1
        pGrap2.setColor(pLine.getColor());//5
        Stroke stroke = new BasicStroke(pLine.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 10, 0 }, 0);//10
        pGrap2.setStroke(stroke);//3
        int counter = 0;//1
        //1+2*38
        while(counter <= pLine.getX2()){//1+2*
           if(pLine.getFill()){//+1
                pGrap2.drawLine(pLine.getX1()-1, pLine.getY1()-1, pLine.getX2()-1, pLine.getY2()-1);//18
                pGrap2.drawLine(pLine.getX1()+1, pLine.getY1()+1, pLine.getX2()+1, pLine.getY2()+1);//18
           }
           counter++;//2
       }
       pGrap2.setColor(pLine.getStroke());//5
       pGrap2.drawLine(pLine.getX1(), pLine.getY1(), pLine.getX2(), pLine.getY2());//14
    }
   
    //Method to draw a sole f(n)=30
     private void drawSole(Sole pSole){
        Graphics2D pGrap2 = (Graphics2D) graphic;//1
        pGrap2.setColor(pSole.getColor());//5
        Stroke stroke = new BasicStroke(pSole.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 10, 0 }, 0);//10
        pGrap2.setStroke(stroke);//3
        pGrap2.drawLine(pSole.getX1(), pSole.getY1(), pSole.getX2(), pSole.getY2());//14
    }
     
    //Method to draw a straigh border f(n)= 33
    private void drawStraightBorder(StraightBorder pBorder){
        Graphics2D pGrap2 = (Graphics2D) graphic;//1
        pGrap2.setColor(pBorder.getColor());//5
        Stroke stroke = new BasicStroke(pBorder.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 10, 0 }, 0);//10
        pGrap2.setStroke(stroke);//3
        pGrap2.drawLine(pBorder.getX1(), pBorder.getY1(), pBorder.getX2(), pBorder.getY2());//14
    }
    
    //We do it with a parter example
    private void drawFillers(){
        Graphics2D painter = (Graphics2D) graphic;
        painter.setBackground(Color.white);
        
        ArrayList<DrawingPoint> pointsList = DesignLogic.getDesignLogicInstance().getActualDesign().getPoints();
        painter.clearRect(0, 0, 550, 520);
        int radioPoint = pointsList.get(0).getDrawingPoint();

       int[] puntosX=new int[pointsList.size()];
       int[] puntosY=new int[pointsList.size()];
        
        for (int i=0;i<pointsList.size();i++){
            puntosX[i]=pointsList.get(i).getX1() + radioPoint;
            puntosY[i]=pointsList.get(i).getY1() + radioPoint;
        }             
        
        painter.setColor(Color.CYAN);
        painter.fillPolygon(puntosX, puntosY, puntosX.length);painter.setColor(Color.white);
        painter.fillArc(pointsList.get(0).getX1() + radioPoint, (pointsList.get(0).getY1() + radioPoint)-40,( pointsList.get(1).getX1()- pointsList.get(0).getX1()),50,150, 200); ; 
    }
    
    //Method to draw figures f(n)= 4+(3681)N+ falta el fill
    private void drawFigures(List<Figure> pfigureList){
        //drawFillers();//Corregir fill
        int listLong=0;//1
        
        while(listLong < pfigureList.size()){//1+n*(3681)    ->el 3677 es del draw circle q es el peor caso
            kindFigure typeFigure = pfigureList.get(listLong).getKindFigure();//6
            switch(typeFigure){//1
                case Circle:            //3677
                    Circle circle = (Circle) pfigureList.get(listLong);//4
                    drawCircle(circle);//3671+1
                    break;//1
                    
                case CurveBorder:           //29
                        CurveBorder border = (CurveBorder) pfigureList.get(listLong);//4
                        drawCurveBorder(border); //23+1
                    break;//1
                 
                case Sole:              //36
                        Sole sole = (Sole) pfigureList.get(listLong);//4
                        drawSole(sole); //30+1
                    break;//1
                    
                case StraightLine:          //122
                        StraightLine line = (StraightLine) pfigureList.get(listLong);//4
                        drawStraightLine(line); //116+1
                    break;//1
                    
                case StraighBorder:         //39
                        StraightBorder recBorder = (StraightBorder) pfigureList.get(listLong);//4
                        drawStraightBorder(recBorder); //33+1
                    break;//1
                default:
                    System.out.println("Not found figure Arcade\n");//23
                    break;//1
            }
            listLong++;//2
        }
        graphic.finalize();//2
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
