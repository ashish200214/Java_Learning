import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        int n,i,fact=1;
        System.out.println("enter the number");
        n=input.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is "+fact);
    }
}
