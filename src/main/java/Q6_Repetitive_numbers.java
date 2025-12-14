import java.util.HashSet;

public class Q6_Repetitive_numbers {

    //numbers[] = {1, 2, 3, 4, 4, 5, 6, 6, 7}
    //Return only the repetitive elements.

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 4, 5, 6, 6, 7};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();

        for(int num : numbers)
        {
            if(!set.add(num))
            {
                set1.add(num);
            }
        }
        System.out.println("Repeated Numbers are: " + set1);
    }
}
