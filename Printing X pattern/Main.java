import java.util.*;
public class Main
{
    public static void main(String args[])
    { 
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        for (int i = 0; i < len; i++) 
        { 
            int j = len - 1 - i; 
            for (int k = 0; k < len; k++) 
            { 
                if (k == i || k == j) 
                    System.out.print("*"); 
                else
                    System.out.print(" "); 
            } 
            System.out.println(""); 
        }  
    }
}