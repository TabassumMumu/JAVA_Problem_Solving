public class Q2_Find_Prime_Numbers {

    //Given an array:
    //numbers[] = {11, 7, 2, 15, 6}
    //Calculate the sum of all prime numbers in the array.

    public static boolean isPrime(int num){

        if(num <= 1)
        {
            return false;
        }
        for(int i=2; i <= Math.sqrt(num); i++)
        {
            if(num%i == 0)
            {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] numbers = {11, 7, 2, 15, 6};

        for(int num: numbers)
        {
            if(isPrime(num))
            {
                System.out.println(num + " Prime Number");
            }
            else {
                System.out.println(num + " Not a prime number");
            }
        }

    }
}
