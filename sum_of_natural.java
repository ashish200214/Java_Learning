// Program to calculatre sum of natural number
import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number n");
        int n=input.nextInt();
        int sum=0,i=1;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Addition of natural number is "+sum);
    }
}
