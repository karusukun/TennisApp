package Logic;
import Library.*;
import static Library.PointID.A;
import java.awt.Color;
import java.awt.Graphics;
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
        System.out.println("they see me rolling the hatin");
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
                      System.out.println("yup its worken");
                      DesignLogic.getDesignLogicInstance().setFigurePos(actualDP.getFigureId(), pX- diameter/2, pY - diameter/2);
                      switch(actualDP.getID())
                      {
                          case A:
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(0).setX1(actualDP.getX1());
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(0).setY1(actualDP.getY1());
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(1).setX1(actualDP.getX1());
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(1).setY1(actualDP.getY1());
                            break;
                          case B:
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(1).setX2(actualDP.getX1());
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(1).setY2(actualDP.getY1());
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(2).setX1(actualDP.getX1());
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(2).setY1(actualDP.getY1());
                            break;
                          case C:
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(2).setX2(actualDP.getX1());
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(2).setY2(actualDP.getY1());
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(3).setX1(actualDP.getX1());
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(3).setY1(actualDP.getY1());
                              break;
                          case D:
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(3).setX2(actualDP.getX1());
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(3).setY2(actualDP.getY1());
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(4).setX1(actualDP.getX1());
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(4).setY1(actualDP.getY1());
                              break;
                          case E:
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(4).setX2(actualDP.getX1());
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(4).setY2(actualDP.getY1());
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(0).setX2(actualDP.getX1());
                              DesignLogic.getDesignLogicInstance().getActualDesign().getFigureList().get(0).setY2(actualDP.getY1());
                              break;
                      }
                      loadDesign(_canvas.getGraphics());

                }
            
            }
        }
    }
    
    public void NewLine(int pX1, int pX2, int pY1, int pY2, Color pColor, int pStroke)
    {
        StraightLine newLine = new StraightLine(pX1,pX2,pY1,pY2);
        newLine.setColor(pColor);
        newLine.setStroke(pColor);
        newLine.setStroke_Thickness(pStroke);
        
        DesignLogic.getDesignLogicInstance().getActualDesign().addFigure(newLine);
        loadDesign(_canvas.getGraphics());
    
    }
    
    public void newCircle(int pRadio, int pX, int pY, Color pColor, int pStroke, boolean fill)
    {
        Circle newCircle = new Circle(pRadio,pX,pY);
        newCircle.setColor(pColor);
        newCircle.setStroke(pColor);
        newCircle.setStroke_Thickness(pStroke);
        newCircle.setFill(fill);
        
        DesignLogic.getDesignLogicInstance().getActualDesign().addFigure(newCircle);
        loadDesign(this._canvas.getGraphics());
    }
        
        
    
    
    public void RequestDrawn(Design pDesign) {
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

    public void loadDesign(Graphics pG) 
    {
        long timeStart = System.currentTimeMillis();
        DesignDrawnI painter = _Painters.get(_ModeType);
        painter.paint(pG);
        long timeEnd = System.currentTimeMillis();
        Report rep = new Report(_ModeType, timeEnd-timeStart);
//this._canvas.paint(painter.paint(pDesign,pG));
        
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