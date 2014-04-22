package Logic;
import java.util.*;

/*
 * It has the datas of the report and call
 * the methods to do it
 */
public final class TennisPaintLogic {

    //TennisPaintLogic's atributtes
    private static TennisPaintLogic _tennisPaintLogicInstance = null;   //Instance of tennisPaintLogic
    private List<String> report__reportList;    //List of reports 

    //Defautl builder
    private TennisPaintLogic() {
        report__reportList = new ArrayList<>();
    }

    public static TennisPaintLogic getTennisPaintLogicInstance() {
        return _tennisPaintLogicInstance;
    }

    public static void setTennisPaintLogicInstance(TennisPaintLogic _tennisPaintLogicInstance) {
        TennisPaintLogic._tennisPaintLogicInstance = _tennisPaintLogicInstance;
    }

    public List<String> getReport__reportList() {
        return report__reportList;
    }

    public void setReport__reportList(List<String> report__reportList) {
        this.report__reportList = report__reportList;
    }  

    //Calc the time ejecution of the app
    public void Float_calcTimeEjecution() {
         //throw new System.Exception("Not implemented");
    }

    //Create a report of the app
    public void Void_createReport() {
        //throw new System.Exception("Not implemented");
    }

    private PaintManager paintManager;
    private Report report;
    private DesignLogic designLogic;
    //private Controler controler;

 }
