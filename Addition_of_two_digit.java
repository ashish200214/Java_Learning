import java.util.Scanner;
class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    int num1, s1, s2, sum;
      System.out.println ("enter value of number num1");
      num1 = input.nextInt ();
      s1 = num1 / 10;
      s2 = num1 % 10;
      sum = s1 + s2;
      System.out.println ("Addition of two integer is " + sum);


  }
}
