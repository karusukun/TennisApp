/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package DataAccess;

/**
 *
 * @author Carlos
 */
import Library.*    ;
import Logic.DesignLogic;
import Logic.Report;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.zip.InflaterInputStream;
import org.parse4j.Parse;
import org.parse4j.ParseException;
import org.parse4j.ParseObject;
import org.parse4j.ParseQuery;
import org.parse4j.callback.GetCallback;


public class ParseDataAccess {
    
    
     private ParseDataAccess(){
       Parse.initialize("KgYLTyS96RdYizIsFsS8KQKTKzn3GBExdWjvNfel", "ej2iZCPQcn5xHiMF8fUwRIVcRURKTn0ILTXakU3a");      

    }
    
    public String saveDesing( Design Value) throws IOException
    {
        String keyID = "";
        
        _tennisParse = new ParseObject("TennisDesigns");
        try
            {   
                                
                _tennisParse.put("DesignName", Value.getName());
                _tennisParse.put("Figures",DesignLogic.getDesignLogicInstance().writeObject(Value));
                
                _tennisParse.save();
                String objectId = _tennisParse.getObjectId();
                keyID = objectId;
                System.out.println("resId[" + Value.getName() + "] --> " + objectId);
            }
            catch(ParseException e)
            {
                System.out.println(e.toString());
            }
        return keyID;
    }
    
    public String saveReport(Report Value) throws IOException
    {
        String keyID = "";
        
        _tennisParse = new ParseObject("TennisReports");
        try
            {                                   
                _tennisParse.put("Best Time execution", Value.getBestTimeExecution());
                _tennisParse.put("Date",Value.getDate__reportDate().toString());
                _tennisParse.put("Fire Time",Value.getFloat__fireTime().toString());
                _tennisParse.put("Arcade Time", Value.getFloat__arcadeTime().toString());
                
                _tennisParse.save();
                String objectId = _tennisParse.getObjectId();
                keyID = objectId;
                System.out.println("resId[" + Value.getDate__reportDate().toString() + "] --> " + objectId);
            }
            catch(ParseException e)
            {
                System.out.println(e.toString());
            }
        return keyID;
    }
    
    public static void getItems(String ID) throws ParseException, IOException, ClassNotFoundException{
    
        try
        {
            ParseQuery<ParseObject> query = ParseQuery.getQuery("TennisDesigns");
            query.selectKeys(Arrays.asList("Figures"));        
            List<ParseObject> results = query.find();
            for(int cont=0;cont<results.size();cont++){


                Object dataValue = results.get(cont).get("Figures");
                DesignLogic.getDesignLogicInstance().getDesignList().add(DesignLogic.getDesignLogicInstance().readObject((byte[])dataValue));
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    public static ParseDataAccess getInstance()
    {
        if(_instance == null)
        {
            _instance = new ParseDataAccess();
        }
        return _instance;
    }
    
    private ParseObject _tennisParse;
    private static ParseDataAccess _instance;
}
