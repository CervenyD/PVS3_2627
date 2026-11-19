package zloOfMyOwn.oop.collections;

public class StackOStrings
{
    String[] data;
    int top; //XDDDD YAOI REFERENCE


    StackOStrings()
    {
        data = new String[5];
        top = 0;
    }

    void push(String toPush)
    {
        data[top] = toPush;
        top++;
    }
    String pop()
    {
        String toPop = data[top-1];
        top--;
        return toPop;
        /*
        * or
        *
        * top--;
        * return data[top];
        *
        *
        *
        *
        */
    }
    String peek()
    {
        return data[top-1];
    }

    public static void main(String[] args)
    {

    }
}
