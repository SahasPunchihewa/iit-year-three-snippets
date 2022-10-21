package week1.tute;

public class Main
{
    public static void main(String[] args)
    {
        Date dob = new Date(25, 12, 1965);
        Director director = new Director("Bryan", "Singer");

        director.setDob(dob);
        director.setNumDirectedMovies(108);

        Movie movie = new Movie("X-men", "Action", director);

        movie.setNumAwards(8);

        System.out.println(movie);
    }
}
