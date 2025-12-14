import java.util.HashMap;
import java.util.Map;

public class Q5_Occurance_of_Numbers {

    //numbers[] = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4}
    //Count the occurrence of each number.

    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        HashMap <Integer, Integer> map = new HashMap<>();
        int count = 0;

        for( int num: numbers)
        {
            map.put(num, map.getOrDefault( num,0)+ 1);
        }
        for(Map.Entry<Integer , Integer> entry : map.entrySet())
        {
                System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
