import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner reading = new Scanner (System.in);
        double averageAssessment = 0 ;
        double note = 0;

        for (int i = 0; i <3; i++){
            System.out.println("Tell your movie review score");
            note = reading.nextDouble();
            averageAssessment += note;
        }
        System.out.println("Average Assessment " + averageAssessment/3);


    }
}
