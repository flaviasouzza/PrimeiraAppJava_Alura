import java.util.Scanner;

public class OtherLoop  {
    public static void main(String[] args) {
        Scanner reading = new Scanner (System.in);
        double averageAssessment = 0 ;
        double note = 0;
        int totalGrades = 0;

        while ( note != -1){
            System.out.println("Tell your movie review score or -1 for end");
            note = reading.nextDouble();

            if (note != -1) {
                averageAssessment += note;
                totalGrades++;
            }
        }
        System.out.println("Average Assessment " + averageAssessment/3);


    }
}
