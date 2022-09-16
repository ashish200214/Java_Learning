import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        int reverse=0,remainder;
        System.out.println("enter the number");
        int n=input.nextInt();
        while(n!=0)
        {
            remainder=n%10;
            reverse=reverse*10+remainder;
            n/=10;
            
        }
        System.out.println("Reverse of number is "+reverse);
    }
}
