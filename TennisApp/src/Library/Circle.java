package Library;

/*
 * Class Circle has the information about the radio
 * of the circle
 */
public class Circle extends Figure
{
    //Circle's attributes
    private int _radio;

    public Circle(int pRadio, int pX, int pY) {
        _radio = pRadio;
        _x1 = pX;
        _y1 = pY;
        _kindFigure = kindFigure.Circle;
    }

    public int getRadio() {
        return _radio;
    }

    public void setRadio(int _radio) {
        this._radio = _radio;
    }
}
