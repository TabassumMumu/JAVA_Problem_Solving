import java.util.HashSet;

public class Q3_Duplicate_Value_remove {

    public static void main(String[] args) {
        int[] numbers = {11, 7, 7, 11, 2, 15, 6, 6};

        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for(int num: numbers)
        {
            if(set.add(num)) {
                sum = sum + num;
            }

        }
        System.out.println("Unique numbers: " + set);
        System.out.println("Sum of unique numbers: " + sum);
    }
}
