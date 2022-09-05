import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner input=new Scanner (System.in);
        char ch;
        int n;
        System.out.println("enter the character");
        ch=input.next().charAt(0);
        n=(int)ch;
        System.out.println("Ascii value is " + n);
        
        
    }
}
