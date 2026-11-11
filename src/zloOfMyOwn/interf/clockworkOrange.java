package zloOfMyOwn.interf;

public class clockworkOrange
{
    public static void main(String[] args) {
        digitalOrange dOr = new digitalOrange(2077,5,12,13,5,0);
    }
}
class digitalOrange implements timeThing
{
    int sec,min,hour,day,month,year;

    public digitalOrange(int year, int month, int day, int hour,int min, int sec)
    {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
        this.day = day;
        this.month = month;
        this.year = year;

    }

    @Override
    public void printTime()
    {

    }
}
class stopworkOrange //i love referncing random niche stuff in my thingies
{
    long msecs;

    long start;

    long stop;

    public stopworkOrange(long msecs)
    {
        this.msecs = msecs;
    }
    void staatoDesu()
    {
        start = msecs;
    }

    void addMilisecs(long addValue)
    {

    }

    void reset()
    {

    }
}