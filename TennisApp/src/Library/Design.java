
package Library;
import java.awt.Polygon;
import java.util.*;

/*
 * Class Design has the information about the name,
 * figures, Id of the different designs of the tennis
 */
public class Design
{
    //Default builder

    //Instance of Design builder
    public Design(String pName) {
        _name = pName;
        _figureList = new ArrayList<Figure>();
        _designId = _id;
        _id++;
    }
    
    public void addFigure(Figure pFigure)
    {
        _figureList.add(pFigure);
    }

    public String getName() {
        return _name;
    }
    

    public void setName(String _name) {
        this._name = _name;
    }

    public List<Figure> getFigureList() {
        return _figureList;
    }

    public void setFigureList(List<Figure> _figureList) {
        this._figureList = _figureList;
    }

    public int getDesignId() {
        return _designId;
    }

    public void setDesignId(int _designId) {
        this._designId = _designId;
    }

    public List<Polygon> getPolygonList() {
        return _polygonList;
    }

    public void setPolygonList(List<Polygon> _polygonList) {
        this._polygonList = _polygonList;
    }
    
    //Return a specific figure based on the figure's ID
    public Figure getFigure(int pFigureId) {
        int figurePosition = 0;
        while ((figurePosition < _figureList.size()) && (_figureList.get(figurePosition)._figureId != pFigureId))
        {
            figurePosition++;
        }
        return _figureList.get(figurePosition);
    }   //End of getFigure
    
    public Sole getSole()
    {
        for(Figure iterator : this._figureList)
        {
            if(iterator.getKindFigure() == kindFigure.Sole)
            {
                return (Sole)iterator;
            }
            
        }
        return null;
    }

    //I've to ask what's the function of this ****
    private Design getDesign(String pName) {
        Design p = new Design(pName);
        return p;
    }
    
    //Design's attributes
    private String _name;
    private List<Figure> _figureList;
    private List<Polygon> _polygonList;
    private int _designId;
    private static int _id=0;
}