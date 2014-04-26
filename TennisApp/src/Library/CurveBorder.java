package Library;

import java.awt.geom.QuadCurve2D;

public class CurveBorder extends Border
{
    //CurveBorder builder
    public CurveBorder(){
        this.curve = new QuadCurve2D.Float();
        this._kindFigure = kindFigure.CurveBorder;
    }
    
    public CurveBorder(int pX, int pY, int pX2, int pY2, int pCtrlX, int pCtrlY) {
        this.curve = new QuadCurve2D.Float(pX, pY, pCtrlX, pCtrlY, pX2, pY2);
        _kindFigure = kindFigure.CurveBorder;
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
    
   @Override
    public int getRadio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRadio(int _radio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getX2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setX2(int _x2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getY2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setY2(int _y2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDrawingPoint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private QuadCurve2D curve;
    private int ctrlX;
    private int ctrlY;
}