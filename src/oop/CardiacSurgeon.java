package oop.inheritance;

<<<<<<< HEAD:src/oop/CardiacSurgeon.java
import java.util.ArrayList;

class CardiacSurgeon extends Surgeon{
=======
public class CardiacSurgeon extends Surgeon{
>>>>>>> a11638d18e5b5646f70f39360a2c87c58e5e07bd:src/oop/inheritance/CardiacSurgeon.java

    final static int CS_BONUS = 35000;

    public CardiacSurgeon(String name) {
        super(name);
        salary += CS_BONUS;
    }

    public void cardiacSurgery(){
        System.out.println("Cut my heart into pieces...");
        salary += 30000;
    }
}
