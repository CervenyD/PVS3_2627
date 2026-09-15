package zloOfMyOwn.oop;
import fileworks.DataImport;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Track
{
    String name;
    int year;
    double rating;
    int duration;

    public Track(int year, String name, double rating, int duration) {
        this.year = year;
        this.name = name;
        this.rating = rating;
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration() {
        if (duration<0)
        {
            System.out.println("Invalid duration, dumbass");
            return;
        }
        this.duration = duration;
    }

    @Override
    public String toString()
    {
        return "Track{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                ", duration=" + duration +
                '}';
    }
    public static void main(String[] args)
    {
        DataImport dImp = new DataImport("data/tracks.txt");
        ArrayList<Track> tracks = new ArrayList<>();
        while(dImp.hasNext())
        {
         String linecky = dImp.readLine();
         String[] casti = linecky.split(";");
         Track Songa = new Track(Integer.parseInt(casti[0]),casti[1],Double.parseDouble(casti[2]),Integer.parseInt(casti[3]));
        }
    }
}
