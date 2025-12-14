import java.util.Scanner;

public class Q12_Finding_Binary_Number {

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
