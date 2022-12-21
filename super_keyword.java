
/*super keyword :- It is used to differentiate the super class attribute,method and constructor  from the sub class
 * when same name variable,method are used in in sub and parent class.
*/
class A {
        int a=10;   
}

 class B extends A {
        int a=20;
        void show() {
            System.out.println(a);
            System.out.println(super.a);
        }
 }

 class Test {
    public static void main(String[] args) {
        B r=new B();
        r.show();
    }
 }



//super and sub class which having same methods
/*super keyword :- It is used to differentiate the super class attribute,method and constructor  from the sub class
 * when same name variable,method are used in in sub and parent class.
*/
class A {
       void show() {
        System.out.println("Hello super class");
       }
}

 class B extends A {
  
        void show() {
            super.show();
            System.out.println("Hello sub class");
        }
 }

 class Test {
    public static void main(String[] args) {
        B r=new B();
        r.show();
    }
 }
