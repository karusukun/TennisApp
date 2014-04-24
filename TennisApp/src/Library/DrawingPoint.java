package Library;

/*
 * Class DrawingPoint has the information about
 * the points of the tennis (point ID)
 */
public class DrawingPoint extends Figure
{
    
    //Class builder
    public DrawingPoint(int pDrawingPoint, int pX, int pY) {
        _drawingPoint = pDrawingPoint;
        _x1 = pX;
        _y1 = pY;
        _kindFigure = kindFigure.DrawPoint;
    }

    public int getDrawingPoint() {
        return _drawingPoint;
    }

    public void setDrawingPoint(int _drawingPoint) {
        this._drawingPoint = _drawingPoint;
    } 
    
    //DrawingPoint's attributes
    private int _drawingPoint;
  
}