package Logic;

public class Report {

    //Report's atributtes
            private String string__designName;
            private String float__arcadeTime;
            private String float__fireTime;
            private String date__reportDate;

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

    private TennisPaintLogic tennisPaintLogic;

}