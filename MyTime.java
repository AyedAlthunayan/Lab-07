public class MyTime {
    private int hour =0;
    private int minute =0;
    private int second =0;
    public MyTime(){

    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setTime (int hour, int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) throws Exception {
        if (hour<0 || hour>23){
            throw new Exception ("Number not int the average");
        }
        this.hour = hour;

    }

    public void setMinute(int minute) throws Exception{
        if (hour<0 || hour>59){
            throw new Exception ("Number not int the average");
        }
        this.minute = minute;

    }

    public void setSecond(int second) throws Exception{
        if (hour<0 || hour>59){
            throw new Exception ("Number not int the average");
        }
        this.second = second;

    }
    public String toString (){
        return "HH:MM:SS:\n" +
                "with leading zeros, e.g."+hour+":"+minute+":"+second;
    }
    public MyTime nextSecond(){
        {
            try {
                setTime(hour, minute, ++second);
                return this;
            }
            catch(IllegalArgumentException e) {}

            second = 0;
            return nextMinute();
        }
    }
    public MyTime nextMinute(){
        try {
            setTime(hour, ++minute, second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        minute = 0;
        return nextHour();
    }

    public MyTime nextHour(){
        try {
            setTime(++hour, minute, second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        hour = 0;
        return this;
    }
    public MyTime previousSecond(){
        try {
            setTime(hour, minute, --second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        second = 59;
        return previousMinute();
    }
    public MyTime previousMinute(){
        try {
            setTime(hour, --minute, second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        minute = 59;
        return previousHour();
    }
    public MyTime previousHour(){
        try {
            setTime(--hour, minute, second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        hour = 23;
        return this;

    }


}
