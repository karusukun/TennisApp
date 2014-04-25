package Logic;
import Library.Design;
import Library.modePaint;
import java.util.*;
import javax.swing.JPanel;

public class PaintManager {
    

    public PaintManager()
    {
        _Painters = new Hashtable<modePaint, DesignDrawnI>();
        _Painters.put(modePaint.Edit, new EditorDrawning());
        _Painters.put(modePaint.Arcade, new ArcadeDrawingAlg());
        _Painters.put(modePaint.Fire, new FireDrawningAlg());
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

    public void loadDesign(Design pDesign) 
    {
        DesignDrawnI painter = _Painters.get(_ModeType);
        painter.DrawDesign(pDesign, _panelPaint.getGraphics());
    }
    

    public void setMode(modePaint pMode)
    {
        _ModeType = pMode;
    }

    public void setPanelPaint(JPanel _panelPaint) {
        this._panelPaint = _panelPaint;
    }
    
    private modePaint _ModeType;    
    private static PaintManager _PainterLogic;
    private Dictionary<modePaint, DesignDrawnI> _Painters;
    private List<Design> _designList;
}