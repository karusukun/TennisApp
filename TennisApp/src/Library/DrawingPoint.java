package Library;

import java.awt.Color;
import java.awt.geom.QuadCurve2D;

/*
 * Class DrawingPoint has the information about
 * the points of the tennis (point ID)
 */
public class DrawingPoint extends Figure
{
    
    //Class builder
    public DrawingPoint(int pX, int pY, PointID pID) {
        _drawingPoint = 15; //radius of the circle
        _x1 = pX;
        _y1 = pY;
        _kindFigure = kindFigure.DrawPoint;
        _ID = pID;
    }

    @Override
    public int getDrawingPoint() {
        return _drawingPoint;
    }

    public PointID getID() {
        return _ID;
    }

    public void setID(PointID _ID) {
        this._ID = _ID;
    }    

   
    
    //DrawingPoint's attributes
    private int _drawingPoint;
    private PointID _ID;

    
    @Override
    public QuadCurve2D getCurve() {
        return null;
    }

    @Override
    public int getX2() {
        return 0;
    }

    @Override
    public void setX2(int _x2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getY2() {
        return 0;
    }

    @Override
    public void setY2(int _y2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRadio() {
        return 0;
    }

    @Override
    public void setRadio(int _radio) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}