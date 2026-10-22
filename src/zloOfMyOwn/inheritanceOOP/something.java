package zloOfMyOwn.inheritanceOOP;
import fileworks.DataImport;

import java.util.ArrayList;
import java.util.List;

class Animal
{
    protected String name;
    private double energy;

    public void eat() {
        energy += Math.exp(-energy);
    }

    public void makeNoise() {
        System.out.println("Make some noise");
    }

    public Animal(String name, double energy)
    {
        this.name = name;
        this.energy = energy;
    }
}

class Dog extends Animal
{
    public String breed;

    public Dog(String name, double energy, String breed)
    {
        super(name, energy);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Bork");
    }
}

class Cat extends Animal
{
    public Cat(String name, double energy) {
        super(name, energy);
    }

    @Override
    public void makeNoise() {
        System.out.println("Burunyuuu~");
    }

}
class Pig extends Animal
{
    int mudPercentage;

    public Pig(String name, double energy, int mudPercentage)
    {
        super(name, energy);
        this.mudPercentage = mudPercentage;
    }

    void freakAroundInMud()
    {
        mudPercentage += 10;
        mudPercentage = Math.min(mudPercentage, 100);
    }
    public void makeNoise() {
        System.out.println("Kebab");
    }
}

class Main {
    public static void main(String[] args)
    {
        DataImport dImp = new DataImport("data/animals.txt");

        dImp.readLine(); //skip da headeurruh


        List<Animal> animalFarm = new ArrayList<>();

        while (dImp.hasNext())
        {
            String linec = dImp.readLine();
            String[] partsNService = linec.trim().split(";");

            switch (partsNService[0])
            {
                case "Dog":
                    animalFarm.add(new Dog(partsNService[2],Double.parseDouble(partsNService[1]),partsNService[3] ));
                    break;
                case "Cat":
                    animalFarm.add(new Cat(partsNService[2],Double.parseDouble(partsNService[1])));
                    break;
                case "Pig":
                    animalFarm.add(new Dog(partsNService[2],Double.parseDouble(partsNService[1]),partsNService[4]));
                    break;
                default:
                    animalFarm.add(new Animal(partsNService[2],Double.parseDouble(partsNService[1])));
                    break;
            }
        }

        for (Animal animal :animalFarm)
        {

        }








    }
}