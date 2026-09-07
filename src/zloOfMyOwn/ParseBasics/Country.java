package zloOfMyOwn.ParseBasics;

public class Country
{
    String state, continent;
    long population;
    double avgDeathAge;

    @Override
    public String toString() {
        return "Country{" +
                "state='" + state + '\'' +
                ", continent='" + continent + '\'' +
                ", population=" + population +
                ", avgDeathAge=" + avgDeathAge +
                '}';
    }

    public Country(String state, String continent, long population, double avgDeathAge)
    {
        this.state = state;
        this.continent = continent;
        this.population = population;
        this.avgDeathAge = avgDeathAge;
    }

}
