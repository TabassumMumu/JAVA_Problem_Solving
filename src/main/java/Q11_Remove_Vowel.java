import java.sql.SQLOutput;
import java.util.Scanner;

public class Q11_Remove_Vowel {

    public static void main(String[] args) {

        System.out.println("Enter the Sentence: ");
        StringBuilder result = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String vowel = "AEIOUaeiou";
        char[] ch = str.toCharArray();

        for(char character:ch)
        {
            if (vowel.indexOf(character) == -1)
            {
                result.append(Character.toLowerCase(character));
            }
        }
        System.out.println(result.toString());

    }
}
