public class Checkweather2 {

    public static void main(String[] args) {
        int x = 2; // Raining?
        int y = 2; // Snowing?

        if (x == 1 || y == 1) {
            System.out.println("There will be sleet");
        } else {
            System.out.println("No sleet, perhaps just rain?");
        }
    }
}
