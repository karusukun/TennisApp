package Library;

import java.awt.geom.QuadCurve2D;

public class CurveBorder extends Border
{    
    public CurveBorder(int pX, int pY, int pX2, int pY2, int pCtrlX, int pCtrlY) {
        this.curve = new QuadCurve2D.Float(pX, pY, pCtrlX, pCtrlY, pX2, pY2);
        _kindFigure = kindFigure.CurveBorder;
        this.angle = 0;
    }
    
    
    //Getters and setters of the properties
    
    

    public void setCurve(QuadCurve2D curve) {
        this.curve = curve;
    }

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
    
    
    
    @Override
    public QuadCurve2D getCurve() {
        return curve;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
    
    private QuadCurve2D curve;
    private int ctrlX;
    private int ctrlY;
    private int angle;
}