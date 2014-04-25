package Logic;
import Library.Design;
import Library.DrawingPoint;
import Library.PointID;
import Library.modePaint;
import java.awt.Graphics;
import java.util.*;
import javax.swing.JPanel;

public class PaintManager {
    

    public PaintManager()
    {
        _Painters = new Hashtable<modePaint, DesignDrawnI>();
        _designList = new ArrayList<Design>();
        _editPoints = new ArrayList<DrawingPoint>();
        pruebas = new Design("prueba");
        _Painters.put(modePaint.Edit, new EditorDrawning());
        _Painters.put(modePaint.Arcade, new ArcadeDrawingAlg());
        _Painters.put(modePaint.Fire, new FireDrawningAlg());
    }
    
    
    public void setDrawingPoints()
    {
        if(DesignLogic.getDesignLogicInstance().getActualDesign() == null)
        {
            pruebas.getFigureList().add(new DrawingPoint(40,50,PointID.A));
            pruebas.getFigureList().add(new DrawingPoint(200,50,PointID.B));
            pruebas.getFigureList().add(new DrawingPoint(250,100,PointID.C));
            pruebas.getFigureList().add(new DrawingPoint(300,300,PointID.D));
            pruebas.getFigureList().add(new DrawingPoint(40,300,PointID.E));
        }
        
        
    }
    
    public void MoveEditPoint(int pX,int pY)
    {
        int diameter = _editPoints.get(0).getRadio()*2;
        DrawingPoint actualDP;
        
        for(int iteratorPoints = 0; iteratorPoints < _editPoints.size(); iteratorPoints++)
        {
            actualDP =_editPoints.get(iteratorPoints);
            if(pX >= actualDP.getX1() && pX <= (actualDP.getX1() + diameter) && pY >= actualDP.getY1() && pY <= (actualDP.getY1()+ diameter))
            {
                  DesignLogic.getDesignLogicInstance().setFigurePos(actualDP.getFigureId(), pX- diameter/2, pY - diameter/2);
                  setMode(modePaint.Arcade);
                  loadDesign(pruebas,graphicspruebas);
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

    public void loadDesign(Design pDesign, Graphics pG) 
    {
        DesignDrawnI painter = _Painters.get(_ModeType);
        painter.DrawDesign(pDesign, pG);
    }
    

    public void setMode(modePaint pMode)
    {
        _ModeType = pMode;
    }
    
    private modePaint _ModeType;    
    private static PaintManager _PainterLogic;
    private Dictionary<modePaint, DesignDrawnI> _Painters;
    private List<Design> _designList;
    private List<DrawingPoint> _editPoints;
    private Design pruebas; //PRUEBAS PURPOSE
    public Graphics graphicspruebas = null; //pruebas purpose 
}