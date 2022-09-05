import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        int age;
       
        Scanner input=new Scanner(System.in);
        System.out.println("enter you age");
        age=input.nextInt();
        System.out.println((age>=18)?"You eligible for voting":"you not eligible for voting");
          
        }
}
