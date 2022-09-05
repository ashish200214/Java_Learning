import java.util.Scanner;
class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    int a;
      System.out.println ("enter value of a");
      a = input.nextInt ();
    ++a;
      System.out.println ("Increment of a is  " + a);
  }
}
