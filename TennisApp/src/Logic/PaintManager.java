package Logic;
import Library.Design;
import Library.DrawingPoint;
import Library.Figure;
import Library.PointID;
import Library.modePaint;
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
                      loadDesign(_canvas.getGraphics());

                }
            
            }
        }
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
        DesignDrawnI painter = _Painters.get(_ModeType);
        painter.paint(pG);
        
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