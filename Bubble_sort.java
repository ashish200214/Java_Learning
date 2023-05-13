//Bubble_sort
import java.util.Scanner;

class Bubble_sort{
    static void display(int a[],int n)
    {
        System.out.println("Sorted array is \n");
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
    static void bubble_sort(int a[],int n)
    {
        int i,j;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j+1]<a[j])
                {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        display(a,n);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int [5];
        System.out.println("Enter 5 element in th array\n");
        int i;
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }

        //bubble sort
        bubble_sort(a,5);

    }
}
