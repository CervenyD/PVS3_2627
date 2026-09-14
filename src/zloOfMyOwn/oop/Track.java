package zloOfMyOwn.oop;

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
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                ", duration=" + duration +
                '}';
    }
}
