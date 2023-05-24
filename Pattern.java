public class Pattern{
    static void pattern1(){
        int n=5,row,column;

        for(row=1;row<=n;row++)
        {
            for(column=1;column>=row;column--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2()
    {
        int row,column,n=5;
        for(row=1;row<=n;row++)
        {
            for(column=1;column<=n;column++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(){
        int row,column,n=5;
        for(row=1;row<=n;row++)
        {
            for(column=n;column>=row;column--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    
    static void pattern4()
    {
        int row,column,n=5,space;
        for(row=1;row<=n;row++) {
            for(space=0;space<row-1;space++)
            {
                System.out.print(" ");
            }
            for(column=n;column>=row;column--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern5() 
    {
        int row,column,n=5,space;
        for(row=1;row<=n;row++)
        {
            for(space=row;space<=n-1;space++)
            {
                System.out.print(" ");
            }
            for(column=1;column<=row;column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6()
    {
        int row,column,space,n=5;
       
        for(row=1;row<=n;row++)
        {
            for(space=row;space<=n-1;space++)
            {
                System.out.print(" ");
            }
            for(column=1;column<=row;column++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7()
    {
        int row,column,n=5;
        for(row=1;row<=n;row++)
        {
            for(column=1;column<=row;column++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(row=1;row<=n;row++)
        {
            for(column=n;column>=row;column--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        
    }

    static void pattern8()
    {
        int row,column,space,n=8;
        for(row=1;row<=n;row++)
        {
            for(space=n-1;space>=row;space--)
            {
                System.out.print(" ");
            }
            for(column=1;column<=row;column++)
            {
                System.out.print("*");
            }   
            System.out.println();
        }

        for(row=1;row<=n;row++)
        {
            for(space=1;space<=row-1;space++)
            {
                System.out.print(" ");
            }
            for(column=n;column>=row;column--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[]aegs)
    {
         
        pattern8();
    }
}
