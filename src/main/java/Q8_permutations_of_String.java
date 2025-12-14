public class Q8_permutations_of_String {

    //Input string: "cat"
    //Print all possible permutations of the string and count them.

    static int count = 0;

    public static void main(String[] args) {

        String str = "cat";
        permutations( str, "");
        System.out.println("The number of permutations : " + count);

    }
    public static void  permutations( String str, String perm)
    {
        if(str.isEmpty())
        {
            System.out.println(perm);
            count++;
            return;
        }

        for( int i = 0; i< str.length(); i++)
        {
            char ch = str.charAt(i);
            String remaining = str.substring(0,i) + str.substring( i+1);
            permutations( remaining, perm + ch);
        }
    }
}
