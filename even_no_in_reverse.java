import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        int i;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int n=input.nextInt();
        i=n;
        while(i>=1)
        {
            if(i%2==0)
            {
                System.out.print(i + "\n");
            }
            i--;
        }
        
    }
}
