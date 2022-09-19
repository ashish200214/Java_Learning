import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        int n,i;
        System.out.println("enter the number");
        n=input.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.print(i*n + "\n");
        }
        
    }
}
