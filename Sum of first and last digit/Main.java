import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int flag=0;
		int count =0;
		int mul=1;
		int temp=num;
        while (num!=0) 
        { 
            num = num/10; 
            ++flag; 
        } 
        while(count!=flag-1)
        {
            mul=mul*10;
            count=count+1;
        }
        int sum=(temp/mul)+(temp%10);
        System.out.println(sum);
	}
}