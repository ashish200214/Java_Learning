import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        int n1=0,n2=1,n3,i=3;
        System.out.print("Enter the range or number");
        
        int n=input.nextInt();
        n3=n1+n2;
        System.out.print(""+n1+","+n2+","+n3);
        while(i<n)
        {
            n1=n2;
            n2=n3;
            n3=n1+n2;
            System.out.print(","+n3);
            i++;
        }
    }
}
