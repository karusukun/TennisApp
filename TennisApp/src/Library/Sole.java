package Library;
    /*
     * It has properties like positions of
     * the sole's points
     */
public class Sole extends Figure
{
    //Sole's attributes
    private static Sole _soleInstance = null;
    private int _x2;
    private int _y2;

    //Default builder
    private  Sole() {
        _x1 = 0;
        _x2 = 0;
        _y1 = 0;
        _y2 = 0;
    }

    public static Sole getSoleInstance() {
        return _soleInstance;
    }

    public static void setSoleInstance(Sole _soleInstance) {
        Sole._soleInstance = _soleInstance;
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