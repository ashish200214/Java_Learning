/*Encapsulation is the process of wrapping the data member and the member function so that data hiding and data abstraction both are implemented in single one unit is called encapsulation. */

Example :- class is best example of encapsulation.

1. In class to implement encapsulation data member must be private and method getValue and setValue must be public as shown below.

class A{

    private int a;

    void setValue(int a)

    {

        this.a=a;

    }

    

    int getValue()

    

    {

        return a;

    }

    

    

}    

class Main{

public static void main(String[]args)

{

    A objA=new A();

    objA.setValue(100);

    System.out.println(objA.getValue());

}

}
