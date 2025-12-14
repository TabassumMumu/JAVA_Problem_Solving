import java.util.Scanner;

public class Q14_Currency_BreakDown {

    //Write a program to break down a given amount into currency notes.
    //Available notes: [1000, 500, 200, 100, 50, 20, 10, 5, 2, 1]

    public static void main(String[] args) {
        System.out.println("Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int[] notes = {1000,500,200,100,50,20,10,5,2,1};

        for(int note: notes)
        {
           if(amount >= note)
           {
               int count = amount/note;
               amount = amount%note;
               System.out.println(note + " X " + count);
           }
        }
    }
}
