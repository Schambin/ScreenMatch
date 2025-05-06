//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Movie filmeUm = new Movie();

        filmeUm.movieName = "Rio";
        filmeUm.durationInMinutes= 180;
        filmeUm.includedInPlan = true;
        filmeUm.movieRateSum = 10;

        filmeUm.showMovieInfo();
        filmeUm.rateMovie(10);
        filmeUm.rateMovie(5);
        filmeUm.rateMovie(7);

        System.out.println(filmeUm.movieRateSum);
        System.out.println(filmeUm.totalRate);

        System.out.println(filmeUm.averageMovieRate());

    }
}