package Logic;
import Library.Design;
import Library.DrawingPoint;
import Library.Figure;
import Library.PointID;
import Library.StraightLine;
import java.awt.Color;
 import java.io.*;
import java.util.*;
import javax.swing.DefaultListModel;

/*
 * This class works on the designs
 * it has a lis of designs an the actual design
 */
public final class DesignLogic
{
    

    //Default builder
    private DesignLogic() {
        _DesignList = new ArrayList<Design>();
        _ActualDesign = null;
    }

    public static DesignLogic getDesignLogicInstance() {
        
        if(_designLogicInstance == null)
        {
            _designLogicInstance = new DesignLogic();
        }
        return _designLogicInstance;
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
    public void newDesign(String pName)
    {
        Design pDesign = new Design(pName);
        
        //Add the drawing points to the design
        DrawingPoint pointA,pointB,pointC,pointD,pointE;
        
        pointA = new DrawingPoint(60, 130, PointID.A);
        pointB = new DrawingPoint(300, 130, PointID.B);
        pointC = new DrawingPoint(360, 200, PointID.C);
        pointD = new DrawingPoint(450, 290, PointID.D);
        pointE = new DrawingPoint(60, 290, PointID.E);
        
        
        
        pDesign.addFigure();
        pDesign.addFigure();
        pDesign.addFigure();
        pDesign.addFigure();
        pDesign.addFigure();
        
        //Add the borders to the design
        
        
        this._DesignList.add(pDesign);
        setActualDesign(selectActualDesing(pName));
        System.out.println(_ActualDesign.getName());
    }
    
    public DefaultListModel<String> designNames()
    {
        DefaultListModel<String> nameList = new DefaultListModel<>();
        for(Design iterator : _DesignList)
        {
            nameList.addElement(iterator.getName());
        }
        return nameList;
    }
    
    public Design selectActualDesing(String pName)
    {
        int position = 0;
        try
        {
            while (position < _DesignList.size() &&  true != pName.equals(_DesignList.get(position).getName()))
            {
                position++;
            }
            return _DesignList.get(position);
        }
        catch (Exception e)
        {
            //System.Console.WriteLine(indexException.ToString());
        }
        return null;
        
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
    public void setFigureColor(Color pColor, int pFigureId) {
        List<Figure> figureList = this._ActualDesign.getFigureList();
        int figurePosition = 0;
        try
        {
           while (figurePosition < figureList.size() && figureList.get(figurePosition).getFigureId() != pFigureId) {
                figurePosition++;
            }
            figureList.get(figurePosition).setColor(pColor);  //Convert string color to hexadecimal
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
        Design newDesign = new Design(pName); //Create the new design with the name
        _DesignList.add(newDesign); //Add the new design at the design list
    }

    //Do a new line         *****
    private void createLine(int pX1, int pX2, int pY1, int pY2, int pThickness, int pID)
    {
        StraightLine newLine = new StraightLine(pX1, pX2, pY1, pY2);
        newLine.setFigureId(pID);
        newLine.setStroke_Thickness(pThickness);
        this._ActualDesign.getFigureList().add(newLine); //Add the new line at the figure list in the actual design
    }
    
    //DesignLogic's attributes
    private static DesignLogic _designLogicInstance = null;
    private List<Design> _DesignList;
    private Design _ActualDesign;
}//End DesignLogic Class