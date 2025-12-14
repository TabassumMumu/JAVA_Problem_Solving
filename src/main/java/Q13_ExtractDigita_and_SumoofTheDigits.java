public class Q13_ExtractDigita_and_SumoofTheDigits {

    public static void main(String[] args) {

        String str = "A Core i7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece of mouse, what will be my total cost after giving 15% discount?";

        String[] numbers = str.replaceAll("[^0-9 ]", "").trim().split("\\s+");
        int laptopPrice = Integer.parseInt(numbers[1]);
        int mousePrice = Integer.parseInt(numbers[2]);

        int total = laptopPrice + mousePrice;

        double discount = total * 0.15;
        int finalCost = (int) (total - discount);

        System.out.println("Final Cost: " + finalCost + " tk");
    }
}
