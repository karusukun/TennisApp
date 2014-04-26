package Logic;
import Library.*;
import static Library.PointID.A;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintManager {
    

    public PaintManager()
    {
        _Painters = new Hashtable<modePaint, DesignDrawnI>();
        _designList = new ArrayList<Design>();
        _Painters.put(modePaint.Edit, new EditorDrawning());
        _Painters.put(modePaint.Arcade, new ArcadeDrawingAlg());
        _Painters.put(modePaint.Fire, new FireDrawningAlg());
    }
    
    
    public void MoveEditPoint(int pX,int pY)
    {
        try
        {
            int diameter = 30;
            DrawingPoint actualDP = new DrawingPoint(0,0,null);
            List<Figure> figureList;


            figureList = DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList();


            for( Figure Iterator : figureList)
            { 
                if(actualDP.getKindFigure()  == Iterator.getKindFigure())
                {    
                    actualDP = (DrawingPoint)Iterator;

                    if(pX >= actualDP.getX1() && pX <= (actualDP.getX1() + diameter) && pY >= actualDP.getY1() && pY <= (actualDP.getY1()+ diameter))
                    {
                          int radius = actualDP.getDrawingPoint();
                          DesignLogic.getDesignLogicInstance().setFigurePos(actualDP.getFigureId(), pX- diameter/2, pY - diameter/2);
                          switch(actualDP.getID())
                          {
                              case A:
                                  System.out.print("Entra punto a");
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(0).setX1(actualDP.getX1() + radius);
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(0).setY1(actualDP.getY1() + radius);
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(1).setX1(actualDP.getX1() + radius);
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(1).setY1(actualDP.getY1() + radius);
                                break;
                              case B:
                                  System.out.print("Entra punto b");
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(1).setX2(actualDP.getX1()+ radius);
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(1).setY2(actualDP.getY1()+ radius);
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(2).setX1(actualDP.getX1()+ radius);
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(2).setY1(actualDP.getY1()+ radius);
                                break;
                              case C:
                                  System.out.print("Entra punto c");
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(2).setX2(actualDP.getX1()+ radius);
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(2).setY2(actualDP.getY1()+ radius);
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(3).setX1(actualDP.getX1()+ radius);
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(3).setY1(actualDP.getY1()+ radius);
                                  break;
                              case D:
                                  System.out.print("Entra punto d");
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(3).setX2(actualDP.getX1()+ radius);
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(3).setY2(actualDP.getY1()+ radius);
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(4).setX1(actualDP.getX1()+ radius);
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(4).setY1(actualDP.getY1()+ radius);
                                  break;
                              case E:
                                  System.out.print("Entra punto e");
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(4).setX2(actualDP.getX1()+ radius);
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(4).setY2(actualDP.getY1()+ radius);
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(0).setX2(actualDP.getX1()+ radius);
                                  DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(0).setY2(actualDP.getY1()+ radius);
                                  break;
                          }
                          loadDesign(_canvas.getGraphics());

                    }

                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
    public void NewLine(int pX1, int pX2, int pY1, int pY2, Color pColor, int pStroke)
    {
        try
        {
            StraightLine newLine = new StraightLine(pX1,pX2,pY1,pY2);
            newLine.setColor(pColor);
            newLine.setStroke(pColor);
            newLine.setStroke_Thickness(pStroke);

            DesignLogic.getDesignLogicInstance().getActualDesign().addFigure(newLine);
            loadDesign(_canvas.getGraphics());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void newCircle(int pRadio, int pX, int pY, Color pColor, int pStroke, boolean fill)
    {
        try
        {
            Circle newCircle = new Circle(pRadio,pX,pY);
            newCircle.setColor(pColor);
            newCircle.setStroke(pColor);
            newCircle.setStroke_Thickness(pStroke);
            newCircle.setFill(fill);

            DesignLogic.getDesignLogicInstance().getActualDesign().addFigure(newCircle);
            loadDesign(this._canvas.getGraphics());
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
        

    public List<Design> getDesignList() {
        return _designList;
    }

    public void setDesignList(List<Design> _designList) {
        this._designList = _designList;
    }

    public static PaintManager getInstance() 
    {
        if (_PainterLogic==null)
        {
            _PainterLogic = new PaintManager();
        }
        return _PainterLogic;
    }

    public void loadDesign(Graphics pG) throws IOException 
    {
        try{
            long timeStart = System.currentTimeMillis();
            DesignDrawnI painter = _Painters.get(_ModeType);
            painter.paint(pG);
            long timeEnd = System.currentTimeMillis();
            Report rep = new Report(_ModeType, timeEnd-timeStart);
        }catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
    }
    

    public void setMode(modePaint pMode)
    {
        _ModeType = pMode;
    }

    public JPanel getCanvas() {
        return _canvas;
    }

    public void setCanvas(JPanel _canvas) {
        this._canvas = _canvas;
    }
    
    
    
    private modePaint _ModeType;    
    private static PaintManager _PainterLogic;
    private Dictionary<modePaint, DesignDrawnI> _Painters;
    private List<Design> _designList;
    
    public JPanel _canvas = null;

}