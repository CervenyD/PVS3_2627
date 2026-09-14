package zloOfMyOwn.ParseBasics;

import fileworks.DataExport;
import fileworks.DataImport;


public class ParseFile
{
    public static void main(String[] args)
    {
        String path = "data/countries.txt";
        DataImport dataim = new DataImport(path);
        DataExport dataex = new DataExport("outp.txt");
        /*String theOutpIGuess = dataim.readLine();
        String[]info = theOutpIGuess.split(";");
        String state = info[0];
        String continent = info[1];
        long population = Long.parseLong(info[2]);
        double avgDeathAge = Double.parseDouble(info[3]);
        System.out.println("Stát : " + state + ", Kontinent : " + continent + ", Populace : " + population + ", Průměrná úmrtnost : " + avgDeathAge);
        while(dataim.hasNext())
        {
            System.out.println(dataim.readLine());

        }*/

        //Country Czechia = new Country("Czech Republic", "Europe",10_000_000, 89.0);
        //System.out.println(Czechia);

        /* Tf do i need to do man:
           1. Read File
                Read Line

        //Sht to do later : learn the export thing
         */
        /*(dataim.hasNext()) {
            String line = dataim.readLine();
            String[] info = line.split(";");
            String cntryName = info[0];
            String continent = info[1];
            long population = Long.parseLong(info[2]);
            double avgDeathAge = Double.parseDouble(info[3]);
            Country cntry1 = new Country(cntryName, continent, population, avgDeathAge);
            System.out.println(cntry1);
        }*/
        Country lowestPopulation = new Country("placehold","placehold",0,0);

        Country highestDeathAge = new Country("placehold","placehold",0,0);
        while(dataim.hasNext())
        {

            String line = dataim.readLine();
            String[] info = line.split(";");
            String cntryName = info[0];
            String continent = info[1];
            long population = Long.parseLong(info[2]);
            double avgDeathAge = Double.parseDouble(info[3]);



            Country cntry1 = new Country(cntryName, continent, population, avgDeathAge);
            if(cntry1.avgDeathAge > highestDeathAge.avgDeathAge)
            {
                highestDeathAge.state = cntry1.state;
                highestDeathAge.continent = cntry1.continent;
                highestDeathAge.population = cntry1.population;
                highestDeathAge.avgDeathAge = cntry1.avgDeathAge;
            }
            if(cntry1.population < lowestPopulation.avgDeathAge)
            {
                lowestPopulation.state = cntry1.state;
                lowestPopulation.continent = cntry1.continent;
                lowestPopulation.population = cntry1.population;
                lowestPopulation.avgDeathAge = cntry1.avgDeathAge;
            }
            //System.out.println(cntry1);
        }
        System.out.println(highestDeathAge);
        System.out.println(lowestPopulation);
      //  dataex.FinishExport();
        dataim.finishImport();
    }    
}
