package zloOfMyOwn.oop;

public class Country
{
    String name;
    String continent;
    Long population;
    Double avgAge;

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
