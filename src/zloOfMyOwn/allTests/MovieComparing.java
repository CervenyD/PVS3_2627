package zloOfMyOwn.allTests;
//Doplnte atributy pro Film
//
//Jsou jimi:
//Název filmu,
//Rok vydani,
//rating (4.5, 7.8... vyssi = lepsi)
//doba trvani ve vterinach
//
//Vypis do konzole:
//Vypsano serazene dle data vydani od nejstarsich
//Vypsano serazeno dle jmena
//TOP 10 filmu dle ratingu

import fileworks.DataImport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Link na odevzdani GIST:
//https://forms.cloud.microsoft/Pages/ResponsePage.aspx?id=f_BDFfkwekCetYp67EGP_1pSNPXTVBFPg7PGychWGEdUM040WFhKVFpJQ1RBUVZYVUU2MUYxS0hETCQlQCNjPTEu


public class MovieComparing
{
    public static void main(String[] args)
    {
        DataImport dImp = new DataImport("data/Movies.txt");


        String line;
        String[] movieInfo;
        List<Movie> movies = new ArrayList<>();
        while (dImp.hasNext())
        {
            line = dImp.readLine();
            movieInfo = line.split(";");

            Movie movie = new Movie(movieInfo[0], Integer.parseInt(movieInfo[1]),Integer.parseInt(movieInfo[3]),Double.parseDouble(movieInfo[2]));
            movies.add(movie);
        }

        Collections.shuffle(movies);

        Collections.sort(movies,);





    }
}


class Movie
{
    String name;
    int yearOfRelease, movieLength;
    double rating;

    public Movie(String name, int yearOfRelease, int movieLength, double rating)
    {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.movieLength = movieLength;
        this.rating = rating;
    }
    public static final Comparator<Movie> BY_NAME = new Comparator<Movie>()
    {
        @Override
        public int compare(Movie o1, Movie o2)
        {

            return 0;
        }
    };
    public static final Comparator<Movie> BY_RELEASEDATE = new Comparator<Movie>()
    {
        @Override
        public int compare(Movie o1, Movie o2)
        {

            return Integer.compare(o1.yearOfRelease,o2.yearOfRelease);
        }
    };
    public static final Comparator<Movie> BY_RATING = new Comparator<Movie>()
    {
        @Override
        public int compare(Movie o1, Movie o2)
        {

            return Double.compare(o1.rating,o2.rating);
        }
    };

}