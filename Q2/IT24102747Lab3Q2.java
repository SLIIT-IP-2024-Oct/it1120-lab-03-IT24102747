import java.util.Scanner;
public class IT24102747Lab3Q2
{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter monthly salary");
		double m_sal = input.nextDouble();
		System.out.println("Enter the number of overtime hours worked");
		double OT_hours = input.nextDouble();
		System.out.println("Enter the hourly rate");
		double rate = input.nextDouble();
		double OT_amt= OT_hours*rate;
		double t_salary = m_sal + OT_amt;
		System.out.println("The total salary is:" + t_salary);
		input.close();
	}
}