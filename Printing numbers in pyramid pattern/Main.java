import java.util.Scanner;
class Main
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count=0;
		for(int row_no = 1 ; row_no <= n ; row_no++)
		{
			for(int space = 1 ; space <= (n-row_no) ; space++ ) 
			{
				System.out.print(" ");
			}
			for(int col_no = 1 ; col_no <= row_no ; col_no++)
			{
			    count=count+1;
				System.out.print(count);
				System.out.print(" ");
			}
			System.out.print("\n");			
		}
	}
}