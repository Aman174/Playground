import java.util.Scanner;

public class Main 
{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Number, Reminder, Sum = 0;
		sc = new Scanner(System.in);
		Number = sc.nextInt();
		
		while(Number > 0) {
			Reminder = Number % 10;
			Sum = Sum+ Reminder;
			Number = Number / 10;
		}
		System.out.println(Sum);
	}
}