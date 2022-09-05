import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("enter value of num1");
        int num1=input.nextInt();
        System.out.println("enter value of num2");
        int num2=input.nextInt();
        System.out.println("Addition of number is "+(num1+num2));
        System.out.println("Substraction of number is "+(num1-num2));
        System.out.println("Division of number is "+(num1/num2));
        System.out.println("Multiplication of number is "+(num1*num2));
        System.out.println("Modulus of number is "+(num1%num2));
        
        
    }
}
