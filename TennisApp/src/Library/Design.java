
package Library;

import java.util.*;

/*
 * Class Design has the information about the name,
 * figures, Id of the different designs of the tennis
 */
public class Design
{
    //Design's attributes
    private String _name;
    private List<Figure> _figureList;
    private int _designId;

    //Default builder
    public Design()
    {
        _name = "";
        _figureList = new ArrayList<>();
        _designId = 0;
    }

    //Instance of Design builder
    public Design(String pName, List<Figure> pFigureList, int pDesignId) {
        _name = pName;
        _figureList = pFigureList;
        _designId = pDesignId;
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

    public int getDesignId() {
        return _designId;
    }

    public void setDesignId(int _designId) {
        this._designId = _designId;
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

    //I've to ask what's the function of this ****
    private Design getDesign(String pName) {
        Design p = new Design();
        return p;
    }
}