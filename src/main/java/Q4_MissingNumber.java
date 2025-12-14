public class Q4_MissingNumber {

    //Find the missing number in the array:
    //numbers[] = {0, 1, 2, 4, 5}
    //Use the formula: n(n+1)/2 - sum(array)

    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 4, 5};
        int n = numbers.length;
        int totalArraySum = n * (n+1)/2;
        int sumofArray = 0;

        for(int i=0; i< numbers.length; i++)
        {
            sumofArray += numbers[i];
        }

        int missingNumber = totalArraySum - sumofArray;
        System.out.println("The missing number is: " + missingNumber);

    }
}
