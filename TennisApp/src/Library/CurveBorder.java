package Library;

import java.awt.geom.QuadCurve2D;

public class CurveBorder extends Border
{    
    public CurveBorder(int pX, int pY, int pX2, int pY2, int pCtrlX, int pCtrlY) {
        this._x1=pX;
        this._y1=pY;
        this._x2=pX2;
        this._y2=pY2;
        this.ctrlX=pCtrlX;
        this.ctrlY=pCtrlY;
        _kindFigure = kindFigure.CurveBorder;
        this.angle = 0;
    }
    
    
    //Getters and setters of the properties
    
    public int getCtrlX() {
        return ctrlX;
    }

    public void setCtrlX(int ctrlX) {
        this.ctrlX = ctrlX;
    }

    public int getCtrlY() {
        return ctrlY;
    }

    public void setCtrlY(int ctrlY) {
        this.ctrlY = ctrlY;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
    
    private int ctrlX;
    private int ctrlY;
    private int angle;
}