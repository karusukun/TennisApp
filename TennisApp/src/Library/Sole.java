package Library;

import java.awt.geom.QuadCurve2D;

    /*
     * It has properties like positions of
     * the sole's points
     */
public class Sole extends Figure
{
    //Sole's attributes
    private int _x2;
    private int _y2;

    //Default builder
    private  Sole() {
        
        _x1 = _x2 = _y1 = _y2 = 0;
        this._kindFigure = kindFigure.Sole;
        
    }

    public int getX2() {
        return _x2;
    }

    public void setX2(int _x2) {
        this._x2 = _x2;
    }

    public int getY2() {
        return _y2;
    }

    public void setY2(int _y2) {
        this._y2 = _y2;
    }

    
    @Override
    public QuadCurve2D getCurve() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRadio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRadio(int _radio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDrawingPoint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}