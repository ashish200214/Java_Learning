
/*1. This keyword refers to the current object of the class or instance variable.
Example 
int a; // this refer to instance variable because, instance variable is part of the object of class A.
class A{
int a;
A(int a)
{
this.a=a;
}
}


2. This keyword is also used to call the default constructor of the same class .
3. 2. Example

class A{
A()
{
System.out.println("Hello I am default constructor");
}

A(int a)
{
this();  // this will call the default constructor 
}
}

3.It also call the parameterized constructor as same as 2nd.


class A{
A(int a)
{
System.out.println("Hello I am default constructor");

}
A()
{
this(100); // call parameterized constructor 
}


}
*/

