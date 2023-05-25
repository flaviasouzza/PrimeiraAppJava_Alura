public class AluraJava {
    public static void main(String[] args) {
        System.out.println("This is your Love Movies");
        System.out.println("Movie: Top Gun: Maverick");

        int releaseYear = 2022;
        System.out.println("Realease Year: " + releaseYear);
        boolean includeInThePlan = true;
        double movieNote = 8.1;

        double averages = (9.8 + 6.33 + 8.0) / 3;
        System.out.println(averages);

        String synopsis;
        synopsis = """
            Movie Top Gun Maverick 
            80's heatthrob adventure movie
            Very Good!
            Release Year            
            """ + releaseYear;
        System.out.println(synopsis);

        int classification = (int) (averages / 2);
        System.out.println(classification);
    }
}
