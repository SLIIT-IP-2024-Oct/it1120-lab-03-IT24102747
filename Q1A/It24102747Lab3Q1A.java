import java.util.Scanner;

public class IT24102747Lab3Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = input.nextDouble();

        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double numberOfKgs = input.nextDouble();

        
        double totalAmount = pricePerKg * numberOfKgs;

        
        System.out.println("The total amount you have to pay is: " + totalAmount);
    }
}
