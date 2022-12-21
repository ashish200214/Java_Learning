class A {
    int a;
    String b;

    A() {
        a = 10;
        b = "Ashish";

        System.out.println("a = " + a + " b = " + b);
    }

    A(A ref) {
        a = ref.a;
        b=ref.b;
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        A a1 = new A(); // object created to the first A()
        A a2 = new A(a1); // object is passed
    }
}
