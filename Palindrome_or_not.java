import java.util.Scanner;
class Main{


    public static void main(String[]aegd)
    {
        Scanner sc=new Scanner(System.in);
        String name,Name;
        Main obj=new Main();
        System.out.println("Enter the first name :-");
        name=sc.nextLine();

        System.out.println("Enter the next name :-");
        Name=sc.nextLine();

       if(name.equals(Name))
       {
        System.out.println("Palindrome String");
       }
       else{
        System.out.println("Not Palindrome String");
       }
        

    }
}
