package Library;

import java.awt.geom.QuadCurve2D;

/*
 * Class border has the information about the vertex
 * of the lines of the tennis' border
 */
public class Border extends Figure
{
   
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
        throw new UnsupportedOperationException("Not supported yet."); 

    }
    @Override
    public int getDrawingPoint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Border's attributes
    protected int _x2;
    protected int _y2;
}
