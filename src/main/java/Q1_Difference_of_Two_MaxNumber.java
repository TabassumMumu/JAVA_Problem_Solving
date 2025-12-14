public class Q1_Difference_of_Two_MaxNumber {

    public static void main(String[] args) {
        int[] numbers = {11, 7, 2, 15, 6};
        int max = numbers[0];
        int secondMax = numbers[0];

        for(int i=0; i<numbers.length; i++){

            if(numbers[i]>max){
                secondMax = max;
                max = numbers[i];
            }

            else if (numbers[i]<max && numbers[i]>secondMax)
            {
                secondMax = numbers[i];
            }

        }
        System.out.println("Max number is: "+ max);
        System.out.println("Second max Number is: " + secondMax);
        int difference = max-secondMax;
        System.out.println("Difference between max and second max is: "+ difference);
    }
}
