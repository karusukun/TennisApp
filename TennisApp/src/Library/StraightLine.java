package Library;
    /*
     * This class has the positions of the vertex 
     * realted at straight lines
     */
public class StraightLine extends Figure
{
    //StraightLine's attributes
    private int _x2;
    private int _y2;

    public StraightLine(int pFigureID, int pThickness, int pX1,int pX2, int pY1,int pY2) {
        _figureId = pFigureID;
        stroke_Thickness = pThickness;
        _x1 = pX1;
        _x2 = pX1;
        _y1 = pY1;
        _y2 = pY2;
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
}
