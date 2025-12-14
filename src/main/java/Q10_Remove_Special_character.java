import java.util.Scanner;

public class Q10_Remove_Special_character {

    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(specialCharacterRemoval(str));


    }

    public static String specialCharacterRemoval(String str){

        return str.replaceAll("[^a-zA-Z]", "");
    }
}
