import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the num1");
        int num1=input.nextInt();
        System.out.println("Enter the num2");
        int num2=input.nextInt();
        System.out.println("enter 1 for additoin\n2 for substraction");
        int choice=input.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Addition of number is "+(num1+num2));
                break;
            case 2:
                System.out.println("substraction of number is "+(num1-num2));
                break;
            default:
                 System.out.println("enter correct choice");
        }
    }
}
