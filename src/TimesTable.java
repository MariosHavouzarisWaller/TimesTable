import java.util.Scanner;

public class TimesTable {
    // Using a For loop to display a user input times table up to 12 x the input
    public static void main(String[] args) {
        // Initialise Scanner & the Variables
        Scanner reader = new Scanner(System.in);
        int result;

        System.out.print("What times table would you like?: ");
        int timesTable = reader.nextInt();
        System.out.print("\n");
        // This loop iterates i up to 12 and multiplies each iteration of i with the user input
        for (int i = 1; i <= 12; i++) {
            result = timesTable * i;
            System.out.println(i + " x " + timesTable + " = " + result);
        }
    }
}
