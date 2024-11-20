import java.util.Scanner;
public class IT24102747Lab3Q3{
	public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the amount ");
        int amount = input.nextInt();
        int count = 0 ;
        
        
        if (amount >= 5000) {
            count = amount / 5000;
			System.out.println("5000 notes :" + count);
            amount = amount%5000;
        }
        if (amount >= 1000) {
            count = amount / 1000;
			System.out.println("1000 notes :" + count);
            amount %= 1000;
        }
        if (amount >= 500) {
            count = amount / 500;
			System.out.println("500 notes:" + count);
            amount %= 500;
        }
        if (amount >= 200) {
            count = amount / 200;
			System.out.println("200 notes :" + count);
            amount %= 200;
        }
        if (amount >= 100) {
            count = amount / 100;
			System.out.println("100 notes :" + count);
            amount %= 100;
        }
        if (amount >= 50) {
            count = amount / 50;
			System.out.println("50 notes:" + count);
            amount %= 50;
        }
        if (amount >= 20) {
            count = amount / 20;
			System.out.println("20 notes :" + count);
            amount %= 20;
        }
        if (amount >= 10) {
            count = amount / 10;
			System.out.println("10 notes :" + count);
            amount %= 10;
        }
        if (amount >= 5) {
            count = amount / 5;
			System.out.println("5 notes :" + count);
            amount %= 5;
        }
        if (amount >= 2) {
            count = amount / 2;
			System.out.println("2 notes :" + count);
            amount %= 2;
        }
            
			count = amount/1;
			System.out.println("1 notes:" + );
        
        input.close();
    }
}
