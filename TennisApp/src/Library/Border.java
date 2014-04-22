package Library;
/*
 * Class border has the information about the vertex
 * of the lines of the tennis' border
 */
public class Border extends Figure
{
    //Border's attributes
    protected int _x2;
    protected int _y2;

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
