import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter value of base");
        int base=input.nextInt();
        System.out.println("enter the exponent");
        int exponent=input.nextInt();
        int power=1;
        for(int i=1;i<=exponent;i++)
        {
            power=power*base;
        }
        System.out.println("The Answer is " + power);
        
    }
}
