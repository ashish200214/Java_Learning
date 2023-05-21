/*When one object have many different forms or behaviour is considered as polymorphism.

Poly = many morphism = forms

Example 

Person son, brother, friend ,etc

Void person(son);

Void person(brother);

Void person(friend);

Types of polymorphism

1. Compile time polymorphism

2. Runtime polymorphism

1. Compile time polymorphism performed at compile time . Overloading is considered as compile time polymorphism.

Overloading:-

Overloading is the process in which , when same method are used many times in one class with different forms like with parameter,without parameter or with return type or without return type then it is considered as overloading.

Example 

class A{

void display()

{

}

Void display(int a)

{

}

Void display(int a,int b)

{

}

int display()

{

}

}

2. runtime polymorphism :-

When polymorphism performed at run time then it is considered as runtime polymorphism.

Example overiding is type of runtime polymorphism

Overiding:-  It is the process in which, in super class and sub class the method is same for both such polymorphism is considered as runtime polymorphism

Without inheritance it is not possible to perform overiding.

Example

class A

{

void show()

{

System.out.println("hello super class");

}

}

class B extends A {

void show()

{

System.out.println("hello sub class");

}

}*/
