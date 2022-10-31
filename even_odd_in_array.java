import java.util.Scanner;
class Main{
       public static void main(String[]args)
       {
              Scanner input=new Scanner(System.in);
              int []a=new int[5];
              int i,ch;
              System.out.println("enter 5 element in array");
              for(i=0;i<5;i++)
              {
                     a[i]=input.nextInt();
              }
              System.out.println("enter:\n1:Even Number\tOdd Number\n");
              ch=input.nextInt();
              switch(ch)
              {
                     case 1:
                            even(a);
                            break;
                     case 2:
                            odd(a);
                            break;
                     default:
                     System.out.println("Enter correct choice between 1 and 2\n");
              }
              
            
       }
       static void even(int a[])
       {
              System.out.println("even Number in array");
              int i;
              for(i=0;i<5;i++)
              {
                     if(a[i]%2==0)
                     System.out.println(a[i]);
              }
       }
       
       static void odd(int a[])
       {
              int i;
              for(i=0;i<5;i++)
              {
                     if(a[i]%2!=0)
                     System.out.println(a[i]);
              }
       }
}
