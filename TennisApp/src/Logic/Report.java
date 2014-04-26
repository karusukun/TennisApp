package Logic;

import DataAccess.ParseDataAccess;
import Library.modePaint;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Date;

public class Report {
    
    
    private void createReportTxt(){
        
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 

            File file = new File("Report.txt"); 

            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF8")); 

            out.append("\n Design Name: "+ this.string__designName);
            out.append(" ");
            out.append("\n Date: "+this.date__reportDate); 
            out.append(" ");
            out.append("\n Arcade time: "+this.float__arcadeTime); 
            out.append(" ");
            out.append("\n Fire time: "+this.float__fireTime); 
            out.append(" ");
            out.append("\n Best time task: "+Float.toString(this.bestTimeExecution));
            out.append(" ");
            out.close(); 

        }catch(IOException e){}; 
        }
    
    public Report(modePaint pMode, float pTime) throws IOException{
        
        try
        {
            
            Date date = new Date();
            this.date__reportDate = date.toString();
            this.string__designName = DesignLogic.getDesignLogicInstance().getActualDesign().getName();

            if(pMode == modePaint.Arcade){
                this.float__arcadeTime = Float.toString(pTime/1000);
            }if(pMode == modePaint.Fire){
                this.float__fireTime =  Float.toString(pTime/1000);
            }if(bestTimeExecution > pTime/100){
                this.bestTimeExecution = pTime/100;
            }
            ParseDataAccess.getInstance().saveReport(this);
            createReportTxt();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
    
    public String getString__designName() {
        return string__designName;
    }

    public void setString__designName(String string__designName) {
        this.string__designName = string__designName;
    }

    public String getFloat__arcadeTime() {
        return float__arcadeTime;
    }

    public void setFloat__arcadeTime(String float__arcadeTime) {
        this.float__arcadeTime = float__arcadeTime;
    }

    public String getFloat__fireTime() {
        return float__fireTime;
    }

    public void setFloat__fireTime(String float__fireTime) {
        this.float__fireTime = float__fireTime;
    }

    public String getDate__reportDate() {
        return date__reportDate;
    }

    public void setDate__reportDate(String date__reportDate) {
        this.date__reportDate = date__reportDate;
    }

    public TennisPaintLogic getTennisPaintLogic() {
        return tennisPaintLogic;
    }

    public void setTennisPaintLogic(TennisPaintLogic tennisPaintLogic) {
        this.tennisPaintLogic = tennisPaintLogic;
    }

    //Method
    public float getBestTimeExecution() {
        return bestTimeExecution;
    }

    public void setBestTimeExecution(float bestTimeExecution) {
        this.bestTimeExecution = bestTimeExecution;
    }
    
    private TennisPaintLogic tennisPaintLogic;
    //Report's atributtes
    private float bestTimeExecution;
    private String string__designName;
    private String float__arcadeTime;
    private String float__fireTime;
    private String date__reportDate;

}