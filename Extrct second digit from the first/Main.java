import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
        int temp;
        for (temp = input; temp > 0;)
        {
            if (temp < 99) 
            {
                System.out.println(temp % 10);
                break;
            } 
            else 
            {
                temp = temp / 10;
            }
        }
    }
}