/*Overriding in Java :- When two or more method having same name , same parameter using in different class 
 * such process in java is called overriding. Overriding can take place only in Inheritance . TO perform overriding 
 * it must have superclass and subclass.
 */

class A{
        void display() {
                System.out.println("HELLO I AM IN SUPER CLASS");
        }

}

class B extends A{              //Inheritance is required to perform overriding
    void display() {
        System.out.println("HELLO I AM OVERRIDIED BY SUPER CLASS");
    }

    public static void main(String[] args) {
        B obj_b=new B();
        obj_b.display();
    }
}
