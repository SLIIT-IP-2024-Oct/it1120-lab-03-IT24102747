import java.util.Scanner;
public class IT24102747Lab3Q1B
{
public static void main (String []args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the price of a kilogram of rice");
	double price = input.nextDouble();
	System.out.print("Enter the number of kilos you wanna buy");
	double n_kilos = input.nextDouble();
	double bill = n_kilos*price;
	double f_bill = bill*90/100;
	System.out.print("You're final bill with the discount is:" + f_bill);
	input.close();
}
}