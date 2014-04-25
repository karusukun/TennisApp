package Library;

import java.awt.geom.QuadCurve2D;

    /*
     * This class has the positions of the vertex 
     * realted at straight lines
     */
public class StraightLine extends Figure
{
    
    public StraightLine(int pX1,int pX2, int pY1,int pY2) {
        _x1 = pX1;
        _x2 = pX2;
        _y1 = pY1;
        _y2 = pY2;
        _kindFigure = kindFigure.StraightLine;
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
    
    //StraightLine's attributes
    private int _x2;
    private int _y2;

    @Override
    public QuadCurve2D getCurve() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
