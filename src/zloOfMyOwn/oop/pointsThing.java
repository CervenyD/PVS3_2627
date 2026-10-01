package zloOfMyOwn.oop;
import fileworks.DataImport;

import java.util.ArrayList;


public class pointsThing
{
    public static void main(String[] args)
    {
        DataImport dImp = new DataImport("data/points.txt");

        ArrayList<Point> pointzz = new ArrayList<>();


        String linec;
        String[] parameterz;
        while (dImp.hasNext())
        {
            linec = dImp.readLine();
            parameterz = linec.split(",");


            switch (parameterz.length)
            {
                case 2:
                    pointzz.add(new Point(Double.parseDouble(parameterz[0]),Double.parseDouble(parameterz[1])));
                    break;
                case 3:
                    pointzz.add(new Point(parameterz[0], Double.parseDouble(parameterz[1]), Double.parseDouble(parameterz[2])));
                    break;
                case 4:
                    pointzz.add(new Point(parameterz[0], Double.parseDouble(parameterz[1]), Double.parseDouble(parameterz[2]), Double.parseDouble(parameterz[3])));
                    break;
            }
        }

        dImp.finishImport();
        for(Point pointt: pointzz)
        {
            System.out.println(pointt);
        }

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
