import java.util.Random;

public class Q9_Generate_Random_Password {

    //Generate a random password with the following rules:
    //Must be 8 characters long
    //Must include at least:
    //One uppercase letter
    //One lowercase letter
    //One numeric digit
    //One special character

    public static void main(String[] args) {

        String password = genrateRandomPassword(8);
        System.out.println(password);

    }

    public static String genrateRandomPassword(int length){

        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%&*";

        String allChars = upperCase + lowerCase + digits + specialChars;

        Random random = new Random();
        StringBuilder password = new StringBuilder(length);

        password.append(upperCase.charAt(random.nextInt(upperCase.length())));
        password.append(lowerCase.charAt(random.nextInt(lowerCase.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(specialChars.charAt(random.nextInt(specialChars.length())));

        for(int i= 4; i < length; i++)
        {
            password.append(allChars.charAt(random.nextInt( allChars.length())));
        }

        char[] pwdArray = password.toString().toCharArray();
        for (int i = 0; i < pwdArray.length; i++) {
            int randomIndex = random.nextInt(pwdArray.length);
            char temp = pwdArray[i];
            pwdArray[i] = pwdArray[randomIndex];
            pwdArray[randomIndex] = temp;
        }

        return new String(pwdArray);

    }
}
