import java.util.Scanner;

public class Q12_Finding_Binary_Number {

    //Check if a given string is a valid binary number (only contains 0 and 1).

    public static void main(String[] args) {

        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        String number = sc. next();

        boolean isbinary = number.matches("[01]+");

        if (isbinary) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
