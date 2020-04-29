import java.util.Scanner;
class Main
{
    static void printDivisors(int n) 
    { 
        for (int i=1;i<=n;i++) 
            if (n%i==0) 
                System.out.printf("%d\n",i); 
    } 
    public static void main(String args[]) 
    { 
      	Scanner in = new Scanner(System.in);
		int num = in.nextInt();
        printDivisors(num);
    } 
} 