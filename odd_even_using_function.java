import java.util.Scanner;

class Main{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=input.nextInt();
        oddeven(n);
        
    }
    
    public static void oddeven(int n)
    {
        if(n%2==0)
        {
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
