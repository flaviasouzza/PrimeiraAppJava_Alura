public class Conditional {
    public static void main(String[] args) {
        int releaseYear = 1990;
        boolean includeInThePlan = true;
        double movieNote = 8.1;
        String typePlan = "Premium";

        if(releaseYear >= 2022) {
            System.out.println("Release that customers are enjoying");
        }
        else{
            System.out.println("Retro movie worth watching");
        }
        if (includeInThePlan == true  || typePlan.equals ("Premium") ){
            System.out.println("Movie available to watch");
        }
        else {
            System.out.println("Must pay movie rental");
        }
    }
}
