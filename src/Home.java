import com.aluracourses.screenmatch.models.Movie;

public class Home {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setName("Matrix");
        movie.setReleaseDate(1999);
        movie.setDurationInMinutes(136);
        movie.setIncludedInPlan(true);

        movie.evaluate(9);
        movie.evaluate(7.5);
        movie.evaluate(6.9);
        System.out.println(movie.calculateAverage());
    }
}
