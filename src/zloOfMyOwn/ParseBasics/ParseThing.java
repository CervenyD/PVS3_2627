package zloOfMyOwn.ParseBasics;
import java.util.Arrays;

public class ParseThing
{
    public static void Main(String[] args)
    {
        String smth = "Here's ur thing ig : I CAST FIREBALL";
        //smth.substring(smth.indexOf(""));
        String[] things = smth.split(":");
        System.out.println("Stuff" + Arrays.toString(things));
    }
}
