public class Movie {
    //Attributes from a class
    String movieName;
    int releaseDate;
    boolean includedInPlan;
    double movieRateSum;
    int totalRate;
    int durationInMinutes;

    //Methods from a class => Actions
    void showMovieInfo() {
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("+ O nome do filme é: " + movieName);
        System.out.println("+ Lançado em: " + releaseDate);
        System.out.println("++++++++++++++++++++++++++++++++");

    }

    void rateMovie(double movieRateFromUser) {
        movieRateSum += movieRateFromUser;
        totalRate++;
    }

    double averageMovieRate() {
        return movieRateSum / totalRate;
    }
}
