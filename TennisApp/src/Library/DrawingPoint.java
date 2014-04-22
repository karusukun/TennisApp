package Library;

/*
 * Class DrawingPoint has the information about
 * the points of the tennis (point ID)
 */
public class DrawingPoint extends Figure
{
    //DrawingPoint's attributes
    private int _drawingPointId;

    //Class builder
    public DrawingPoint(int pDrawingPointId, int pX, int pY) {
        _drawingPointId = pDrawingPointId;
        _x1 = pX;
        _y1 = pY;
    }

    public int getDrawingPointId() {
        return _drawingPointId;
    }

    public void setDrawingPointId(int _drawingPointId) {
        this._drawingPointId = _drawingPointId;
    }   
}