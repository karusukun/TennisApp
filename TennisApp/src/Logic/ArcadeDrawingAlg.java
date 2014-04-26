package Logic;
import Library.*;
import javax.swing.*; 
import java.awt.*; 
import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.List;

public class ArcadeDrawingAlg implements DesignDrawnI  {
    
    @Override       //paint method for the figures
    public void paint(Graphics pGraphic){
        this.graphic = pGraphic;                //+1
        drawFigures(DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList());
    }
    
    // Method to draw a circle O(n)=3671
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
    
    //Method to draw a curve border O(n)=23
    private void drawCurveBorder(CurveBorder pBorder){
        Graphics2D pGrap2 = (Graphics2D) graphic;//+1
        pGrap2.setColor(pBorder.getColor());//5
        Stroke stroke = new BasicStroke(pBorder.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0,new float[] { 10, 0 }, 0);//10
        pGrap2.setStroke(stroke);//3
        pGrap2.draw(pBorder.getCurve());//4
    }
    
    //method to draw a straight lone O(n)= 116
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
   
    //Method to draw a sole O(n)=30
     private void drawSole(Sole pSole){
        Graphics2D pGrap2 = (Graphics2D) graphic;//1
        pGrap2.setColor(pSole.getColor());//5
        Stroke stroke = new BasicStroke(pSole.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 10, 0 }, 0);//10
        pGrap2.setStroke(stroke);//3
        pGrap2.drawLine(pSole.getX1(), pSole.getY1(), pSole.getX2(), pSole.getY2());//14
    }
     
    //Method to draw a straigh border O(n)= 33
    private void drawStraightBorder(StraightBorder pBorder){
        Graphics2D pGrap2 = (Graphics2D) graphic;//1
        pGrap2.setColor(pBorder.getColor());//5
        Stroke stroke = new BasicStroke(pBorder.getStroke_Thickness(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 10, 0 }, 0);//10
        pGrap2.setStroke(stroke);//3
        pGrap2.drawLine(pBorder.getX1(), pBorder.getY1(), pBorder.getX2(), pBorder.getY2());//14
    }
    
    //We do it with a parter example
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
        
        painter.setColor(pfigureList.get(0).getColor());
        painter.drawPolygon(puntosX, puntosY, puntosX.length);
        painter.fillPolygon(puntosX, puntosY, puntosX.length);
        painter.fillArc((pfigureList.get(0).getX1()+ radioPoint)-50, pfigureList.get(0).getY1()+ radioPoint,100,( pfigureList.get(4).getX1()- pfigureList.get(0).getY1()),90, 180);
        
        painter.setColor(Color.black);
        painter.drawLine(pfigureList.get(1).getX1() + radioPoint, pfigureList.get(1).getY1() + radioPoint, pfigureList.get(2).getX1() + radioPoint, pfigureList.get(2).getY1() + radioPoint);
        painter.drawLine(pfigureList.get(2).getX1() + radioPoint, pfigureList.get(2).getY1() + radioPoint, pfigureList.get(3).getX1() + radioPoint, pfigureList.get(3).getY1() + radioPoint);
        painter.drawLine(pfigureList.get(3).getX1() + radioPoint, pfigureList.get(3).getY1() + radioPoint, pfigureList.get(4).getX1() + radioPoint, pfigureList.get(4).getY1() + radioPoint);
        painter.draw(new QuadCurve2D.Float(pfigureList.get(0).getX1() + radioPoint, pfigureList.get(0).getY1() + radioPoint, 255, 255, pfigureList.get(1).getX1() + radioPoint, pfigureList.get(1).getY1() + radioPoint));
        painter.draw(new QuadCurve2D.Float(pfigureList.get(0).getX1() + radioPoint, pfigureList.get(0).getY1() + radioPoint, 10, 200, pfigureList.get(4).getX1() + radioPoint, pfigureList.get(4).getY1() + radioPoint));
        painter.setColor(Color.white);
        painter.fillArc(pfigureList.get(0).getX1() + radioPoint, (pfigureList.get(0).getY1() + radioPoint)-40,( pfigureList.get(1).getX1()- pfigureList.get(0).getX1()),70,180, 180); 
    }
    
    //Method to draw figures O(n)= 2+(3679)N+ falta el fill
    /*It recives a list of figures to draw and paint it with a graphics*/
    private void drawFigures(List<Figure> pfigureList){
        //drawFillers(DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList());//Corregir fill
        int listLong=0;//1
        while(listLong < pfigureList.size()){//1+n*(3677+2)
            kindFigure typeFigure = pfigureList.get(listLong).getKindFigure();
            switch(typeFigure){
                case Circle:
                    Circle circle = (Circle) pfigureList.get(listLong);//4
                    drawCircle(circle);//3671+1
                    break;//1
                    
                case CurveBorder:
                        CurveBorder border = (CurveBorder) pfigureList.get(listLong);//4
                        drawCurveBorder(border); //23+1
                    break;//1
                 
                case Sole:
                        Sole sole = (Sole) pfigureList.get(listLong);//4
                        drawSole(sole); //30+1
                    break;//1
                    
                case StraightLine:
                        StraightLine line = (StraightLine) pfigureList.get(listLong);//4
                        drawStraightLine(line); //116+1
                    break;//1
                    
                case StraighBorder:
                        StraightBorder recBorder = (StraightBorder) pfigureList.get(listLong);//4
                        drawStraightBorder(recBorder); //33+1
                    break;//1
                default:
                    System.out.println("Not found figure Arcade\n");//23
                    break;//1
            }
            listLong++;//2
        }
        graphic.finalize();
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
