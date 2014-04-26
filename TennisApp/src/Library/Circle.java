package Library;

import java.awt.geom.QuadCurve2D;

/*
 * Class Circle has the information about the radio
 * of the circle
 */
public class Circle extends Figure
{
    public Circle(int pRadio, int pX, int pY) {
        _radio = pRadio;
        _x1 = pX;
        _y1 = pY;
        _kindFigure = kindFigure.Circle;
    }
    
    @Override
    public int getRadio() {
        return _radio;
    }
    
    @Override
    public void setRadio(int _radio) {
        this._radio = _radio;
    }

    @Override
    public QuadCurve2D getCurve() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getX2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setX2(int _x2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getY2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setY2(int _y2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDrawingPoint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Circle's attributes
    private int _radio;
}
