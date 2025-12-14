import java.util.HashSet;

public class Q7_Unique_Characters {

    //Input string: "abcaabbcc"
    //Print all unique characters and their total count.

    public static void main(String[] args) {

        String text = "abcaabbcc";
        char[] ch = text.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for( char character: ch)
        {
            if(set.add(character))
            {
                count++;
            }
        }
        System.out.println("The unique Characters are: " + set);
        System.out.println("Total unique characters: " + count);
    }
}
