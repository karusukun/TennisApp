
package Library;
    
import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;

    /*
     * This class have the chacacteristics like thickness, color ...
     * of differents figures like circle, lines, points and other figures.
    */
public class Figure
{
    //Figure's attributes
    protected int _fill;
    protected int stroke_Thickness;
    protected int _stroke;
    protected int _figureId;
    protected int  _color;         //It saves an hexadecimal number, Have to parse to hex
    //**
    protected int _x1;
    protected int _y1;
    protected kindFigure _kindFigure;

    //Builder
    public Figure() { 
        _figureId = 0; 
        _x1 = 0;
        _y1 = 0;
        stroke_Thickness = 0;
        _fill = 0;
        _color = 0x0;
        _stroke = 0;
        _kindFigure = kindFigure.SimpleFigure;
    }

    public kindFigure getKindFigure() {
        return _kindFigure;
    }

    public void setKindFigure(kindFigure _kindFigure) {
        this._kindFigure = _kindFigure;
    }
    
    public int getFill() {
        return _fill;
    }

    public void setFill(int _fill) {
        this._fill = _fill;
    }

    public int getStroke_Thickness() {
        return stroke_Thickness;
    }

    public void setStroke_Thickness(int stroke_Thickness) {
        this.stroke_Thickness = stroke_Thickness;
    }

    public int getStroke() {
        return _stroke;
    }

    public void setStroke(int _stroke) {
        this._stroke = _stroke;
    }

    public int getFigureId() {
        return _figureId;
    }

    public void setFigureId(int _figureId) {
        this._figureId = _figureId;
    }

    public int getColor() {
        return _color;
    }

    public void setColor(int _color) {
        this._color = _color;
    }

    public int getX1() {
        return _x1;
    }

    public void setX1(int _x1) {
        this._x1 = _x1;
    }

    public int getY1() {
        return _y1;
    }

    public void setY1(int _y1) {
        this._y1 = _y1;
    }
        
}