package zloOfMyOwn.Test1;

import fileworks.*;

import java.util.ArrayList;


public class Movie
{
    String name;
    int releaseDate;
    String genre;
    double rating;

    public Movie(String name, int releaseDate, String genre, double rating)
    {
        this.releaseDate = releaseDate;
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    @Override
    public String toString()
    {
        return "Movie{" +
                "name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }

    public static void main(String[] args)
    {
        DataImport dImp = new DataImport("data/movieList.txt");
        DataExport dExp = new DataExport("./horrors.txt");



        Movie bestRated = new Movie("placeholder",0,"placeholder",.0);
        int postMileniumMovieCounter = 0;
        ArrayList<Movie> horrorz = new ArrayList<>();

        while(dImp.hasNext())
        {
            String linecky = dImp.readLine();

            String[] tokeny = linecky.split(";");

            Movie currentMovie = new Movie(tokeny[0],Integer.parseInt(tokeny[1]),tokeny[2],Double.parseDouble(tokeny[3]));

            if (currentMovie.genre.contains("horror"))
            {
                horrorz.add(currentMovie);
            }
            if (currentMovie.releaseDate > 2000)
            {
                postMileniumMovieCounter++;
            }
            if (currentMovie.rating > bestRated.rating)
            {
                bestRated.name = currentMovie.name;
                bestRated.releaseDate = currentMovie.releaseDate;
                bestRated.genre = currentMovie.genre;
                bestRated.rating = currentMovie.rating;
            }
        }
        for (Movie movie : horrorz)
        {
            dExp.writeLine(movie.name + ";" + movie.releaseDate + ";" + movie.rating);
        }

        System.out.println("Počet filmů po roce 2000 : " + postMileniumMovieCounter);
        System.out.println("Film s nejlepším ratingem : \"" + bestRated.name + "\"");

        dImp.finishImport();
        dExp.finishExport();//Well, všechno mi funguje až na ten freaking export(resp. to nepíše do toho souboru)
    }
}
