package zloOfMyOwn.interf;

public class clockworkOrange
{
    public static void main(String[] args) {
        digitalOrange dOr = new digitalOrange(,,,,,2027);
    }
}
class digitalOrange implements timeThing
{
    int sec,min,hour,day,month,year;

    public digitalOrange(int sec, int min, int hour, int day, int month, int year) {
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