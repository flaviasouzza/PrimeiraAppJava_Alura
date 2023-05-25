import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner reading = new Scanner (System.in);

        System.out.println("Type your favorite movie");
        String movie = reading.nextLine();

        System.out.println("Release Year");
        int releaseYear = reading.nextInt();

        System.out.println("Tell your movie review score");
        double assessment = reading.nextDouble();

        System.out.println(movie);
        System.out.println(releaseYear);
        System.out.println(assessment);
    }
}
