import java.util.Scanner;
class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    int age;
      System.out.println ("enter your age");
      age = input.nextInt ();
    if (age >= 18)
      {
	System.out.println ("Eligible for voting");
      }
    else
      {
	System.out.println ("Not eligible for voting");
      }

  }
}
