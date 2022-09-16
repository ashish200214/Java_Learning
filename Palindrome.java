import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        int remainder,reverse=0,original;
        
        System.out.println("enter the number");
        int n=input.nextInt();
        original=n;
        while(n!=0)
        {
            remainder=n%10;
            reverse=reverse*10+remainder;
            n/=10;
        }
        if(original==reverse)
        {
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
        
        
    }
}
