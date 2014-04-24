package Library;

public class CurveBorder extends Border
{

    public CurveBorder(int px, int py,int _width) {
        _x1 = px;
        _y1 = py;
        this._width = _width;
        this.height = _width/2;
        this._arcAngle1 =  135;
        this._startAngle = 180;
        _kindFigure = kindFigure.CurveBorder;
    }

    public int getWidth() {
        return _width;
    }

    public void setWidth(int _width) {
        this._width = _width;
    }

    public int getArcAngle1() {
        return _arcAngle1;
    }

    public void setArcAngle1(int _arcAngle1) {
        this._arcAngle1 = _arcAngle1;
    }

    public int getStartAngle() {
        return _startAngle;
    }

    public void setStartAngle(int _startAngle) {
        this._startAngle = _startAngle;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    private int _width;
    private int height;
    private int _arcAngle1;
    private int _startAngle;
}