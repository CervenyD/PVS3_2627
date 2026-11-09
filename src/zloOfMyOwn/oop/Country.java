package zloOfMyOwn.oop;

import java.util.Comparator;

public class Country implements Comparable<Country>
{
    String name;
    String continent;
    Long population;
    Double avgAge;
    Comparator<Country> BY_AGE = new Comparator<Country>()
    {
        @Override
        public int compareTo(Country c1,Country c2)
        {

            return Double.compare(c1.avgAge, c2.avgAge);
        }
    };
    Comparable<Country> BY_NAME_LENGTH = new Comparable<Country>()
    {
        @Override
        public int compareTo(Country o1,Country c2)
        {

            return 0;
        }
    };
    public Country(String name,String continent,long population,double avgAge)
    {
        this.name = name;
        this.continent = continent;
        this.population = population;
        setAvgAge(avgAge);
    }
    public Country(String name,String continent,long population)
    {
        this.name = name;
        this.continent = continent;
        this.population = population;
        setAvgAge(avgAge);
    }
    public void setAvgAge(double avgAge)
    {
        if (avgAge >= 13 && avgAge <=100)
        {
            this.avgAge = 0.0;

        }

    }
}
