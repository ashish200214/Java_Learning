import java.util.Scanner;

class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("enter the value of num1");
    int num1 = input.nextInt ();

      System.out.println ("enter the value of num2");
    int num2 = input.nextInt ();
      add (num1, num2);
      sub (num1, num2);
      mul (num1, num2);
      div (num1, num2);


  }
  public static void add (int num1, int num2)
  {
    System.out.println ("Addition is " + (num1 + num2));

  }
  public static void sub (int num1, int num2)
  {
    System.out.println ("Substraction is " + (num1 - num2));
  }
  public static void mul (int num1, int num2)
  {
    System.out.println ("Multiplication is" + (num1 * num2));
  }
  public static void div (int num1, int num2)
  {
    System.out.println ("Division is " + (num1 / num2));
  }
}
