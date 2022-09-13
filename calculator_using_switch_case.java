import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1=input.nextInt();
        System.out.println("Enter the num2");
        int num2=input.nextInt();
        System.out.println("enter\n1=addition\n2=Substraction\n3=Multiplication\n4=Division\n5=Modulus");
        int choice=input.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Additon of number is "+(num1+num2));
                break;
            case 2:
                System.out.println("Substraction of number is "+(num1-num2));
                break;
            case 3:
                System.out.println("Multiplication of number is "+(num1*num2));
                break;
            case 4:
                System.out.println("Division of number is "+(num1/num2));
                break;
            case 5:
                System.out.println("Modulus of number is "+(num1%num2));
                break;
            default:
                System.out.println("Enter correct choice");
                
        }
    }
}
