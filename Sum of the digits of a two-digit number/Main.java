import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int a = n1%10;
      int b = n1/10;
     int avg = (a+b);
      System.out.println(avg);
   }
}