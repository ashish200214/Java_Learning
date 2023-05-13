import java.util.Scanner;
class Array{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int a[]=new int[n];

        System.out.println("\nEnter "+n+" array element");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int total=0;
        //Adding the marks entered by user
        for(int i=0;i<n;i++)
        {
            total+=a[i];
        }
        System.out.println("Average of the marks is "+(total/n));
    }
}
