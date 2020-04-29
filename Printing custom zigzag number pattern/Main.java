//To print X-pattern
import java.util.*;
public class Main
{
    public static void main(String args[])
    { 
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        
        for (int i = 1; i <= len; i++) 
        {
            if(i%2!=0)
            {
                for (int j = 1; j < len; j++)
                {
                    System.out.print(i);
                }
                System.out.print(i+1);
                System.out.println(""); 
            }
            else
            {
                System.out.print(i+1);
                for (int j = 1; j < len; j++)
                {
                    System.out.print(i);
                }
                System.out.println(""); 
            }
        }  
    }
}