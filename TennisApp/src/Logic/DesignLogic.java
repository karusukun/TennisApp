package Logic;
import Library.Figure;
import Library.Design;
import Library.StraightLine;
import java.util.*;
 import java.io.*;

/*
 * This class works on the designs
 * it has a lis of designs an the actual design
 */
public final class DesignLogic
{
    //DesignLogic's attributes
    private static DesignLogic _designLogicInstance = null;
    private List<Design> _DesignList;
    private Design _ActualDesign;

    //Default builder
    private DesignLogic() {
        _DesignList = new ArrayList<>();
        _ActualDesign = new Design();
    }

    public static DesignLogic getDesignLogicInstance() {
        return _designLogicInstance;
    }

    public static void setDesignLogicInstance(DesignLogic _designLogicInstance) {
        DesignLogic._designLogicInstance = _designLogicInstance;
    }

    public List<Design> getDesignList() {
        return _DesignList;
    }

    public void setDesignList(List<Design> _DesignList) {
        this._DesignList = _DesignList;
    }

    public Design getActualDesign() {
        return _ActualDesign;
    }

    public void setActualDesign(Design _ActualDesign) {
        this._ActualDesign = _ActualDesign;
    }

    public int getActualDesignId()
    {
        return _ActualDesign.getDesignId();
    } //End get of the Actual Design's ID

    //Save the actual design        ***HAVE TO IMPLEMENT***
    public void saveActualDesign()
    {
        try { 
        }
        catch(Exception e){
            //System.console().writer(e);

        }
    }

    //Select a specific design as actual design
    public Design selectActualDesing(int pDesignId)
    {
        int position = 0;
        try
        {
            while (position < _DesignList.size() &&  pDesignId != _DesignList.get(position).getDesignId())
            {
                position++;
            }
        }
        catch (Exception e)
        {
            //System.Console.WriteLine(indexException.ToString());
        }
        return _DesignList.get(position);
    }

    //Set the figure's atributtes
    public void setFigurePos(int pFigureId, int pX, int pY) {
        List<Figure> figureList = this._ActualDesign.getFigureList();
        int figurePosition = 0;
        while (figurePosition < figureList.size() && figureList.get(figurePosition).getFigureId() != pFigureId) {
                figurePosition++;
        }
        figureList.get(figurePosition).setX1(pX);
        figureList.get(figurePosition).setY1(pY);
    }

    //Change the color of the figure
    public void setFigureColor(String pColor, int pFigureId) {
        List<Figure> figureList = this._ActualDesign.getFigureList();
        int figurePosition = 0;
        try
        {
           while (figurePosition < figureList.size() && figureList.get(figurePosition).getFigureId() != pFigureId) {
                figurePosition++;
            }
            figureList.get(figurePosition).setColor(Integer.parseInt(pColor, 16));  //Convert string color to hexadecimal
        }
        catch (Exception e)
        {
            //System.Console.WriteLine(indexException.ToString());
        }
    }

    //Change the thickness of the figure's line
    public void setFigureThickness(int pThickness, int pFigureId) {
         List<Figure> figureList = this._ActualDesign.getFigureList();
        int figurePosition = 0;
        try
        {
            while (figurePosition < figureList.size() && figureList.get(figurePosition).getFigureId() != pFigureId) {
                figurePosition++;
            } 
            figureList.get(figurePosition).setStroke_Thickness(pThickness);
        }
        catch (Exception e)
        {
            //System.Console.WriteLine(indexException.ToString());
        }
    }

    //Create a new design 
    private void createDesign(String pName)
    {
        Design newDesign = new Design(pName, null, 0); //Create the new design with the name
        _DesignList.add(newDesign); //Add the new design at the design list
    }

    //Do a new line         *****
    private void createLine(int pX1, int pX2, int pY1, int pY2, int pThickness, int pID)
    {
        StraightLine newLine = new StraightLine(pID, pThickness, pX1, pX2, pY1, pY2);
        this._ActualDesign.getFigureList().add(newLine); //Add the new line at the figure list in the actual design
    }
}//End DesignLogic Class