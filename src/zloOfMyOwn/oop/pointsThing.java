package zloOfMyOwn.oop;

public class pointsThing
{
    public static void main(String[] args)
    {

    }
}
class Point
{
    private String name;
    private double x,y,z;
    private final double Z_DEFAULT = 0;

    private static int pointCounter = 1;

    public Point(String name, double x, double y, double z)
    {
        this(name, x, y);
        this.z = z;
    }

    public Point(String name, double x, double y)
    {
        this.name = name;
        this.x = x;
        this.y = y;
        z = Z_DEFAULT;
    }

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
        name = "Point no." + pointCounter;
        pointCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
