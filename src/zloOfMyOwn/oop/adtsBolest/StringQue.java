package zloOfMyOwn.oop.adtsBolest;

public class StringQue
{
    QueLink first, last;

    void enqueue(String toAdd)
    {
         //
        QueLink link = new QueLink();
        link.data = toAdd;
        //empty
        if (first == null)
        {
            first = link;
            // last = link;
        }
        else
        {
            //some1 in que
            last.next = link;
           // last = link;

        }
        last = link;
    }
    String dequeue()
    {
        if (first == null) return null;
        String toReturnn = first.data;
        first = first.next;


       return toReturnn;
    }
}
class QueLink
{
    String data;
    QueLink next;
}