
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
        int num = in.nextInt ();
        int factorial=1;
        while(num!=1)
        {
            factorial=factorial*num;
            num=num-1;
        }
        System.out.println(factorial);
	}
}
