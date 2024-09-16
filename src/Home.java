public class Home {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.name = "Matrix";
        movie.releaseDate = 1999;
        movie.durationInMinutes = 136;

        movie.evaluate(9);
        movie.evaluate(7.5);
        movie.evaluate(6.9);
        System.out.println(movie.toString());
        System.out.println(movie.calculateAverage());
    }
}
