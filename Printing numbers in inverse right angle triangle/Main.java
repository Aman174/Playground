import java.util.*;
public class Main
{
 public static void main(String args[])
 { 
    int i,j,n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int m=n;
    for(i=1;i<=n;i++)
    {
        for(j=1;j<i;j++)
        {
            System.out.print("");
        }
        for(j=i;j<=n;j++)
        {
            System.out.print(n-j+1);
        }
        System.out.println("");
    } 
 }
}