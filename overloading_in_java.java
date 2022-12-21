/*When two or more method is used in one class with same name but with different parameter such 
 * process is called Overloading in Java.
 */
class A {
    A(int a, int b) {
        System.out.println("Addition of two number is " + (a + b));

    }

    A(int a, String name) {
        System.out.println("Name = " + name + "  , " + "Roll No =" + a);
    }

    public static void main(String[] args) {
        A a1 = new A(10, 20);
        A a2 = new A(10, "Ashish");
    }
}
