package Logic;
import Library.CurveBorder;
import Library.Design;
import Library.DrawingPoint;
import Library.Figure;
import Library.PointID;
import Library.Sole;
import Library.StraightBorder;
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
        
        
        DrawingPoint pointA,pointB,pointC,pointD,pointE;
        
        pointA = new DrawingPoint(60, 130, PointID.A);
        pointB = new DrawingPoint(300, 130, PointID.B);
        pointC = new DrawingPoint(360, 200, PointID.C);
        pointD = new DrawingPoint(450, 290, PointID.D);
        pointE = new DrawingPoint(60, 290, PointID.E);
        
        int radius = pointA.getDrawingPoint();
        
        //Add the borders to the design
        pDesign.addFigure(new CurveBorder(pointA.getX1()+ radius ,pointA.getY1() + radius ,pointE.getX1() + radius ,pointE.getY1() + radius,50, 180));
        pDesign.addFigure(new CurveBorder(pointA.getX1()+ radius ,pointA.getY1() + radius ,pointB.getX1() + radius,pointB.getY1() + radius,150, 200));
        pDesign.addFigure(new StraightBorder(pointB.getX1() + radius, pointC.getX1() + radius , pointB.getY1() + radius , pointC.getY1() + radius));
        pDesign.addFigure(new StraightBorder(pointC.getX1() + radius, pointD.getX1() + radius ,pointC.getY1() + radius , pointD.getY1() + radius));
        
        
        //Add Sole
        pDesign.addFigure(new Sole(pointD.getX1() + radius, pointE.getX1() + radius, pointD.getY1() + radius, pointE.getY1()+ radius));
        
        
        //Add the drawing points to the design
        pDesign.addFigure(pointA);
        pDesign.addFigure(pointB);
        pDesign.addFigure(pointC);
        pDesign.addFigure(pointD);
        pDesign.addFigure(pointE);
        
        
        
                
        this._DesignList.add(pDesign);
        selectActualDesing(pName);
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
    
    public void selectActualDesing(String pName)
    {        
        try
        {
                for(Design iterator : _DesignList)
                {
                    if(iterator.getName().equals(pName))
                    {
                        setActualDesign(iterator);
                    }
                }
        }    
        catch (Exception e)
        {
            //System.Console.WriteLine(indexException.ToString());
        }
        
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