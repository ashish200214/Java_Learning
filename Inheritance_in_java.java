import javax.sql.rowset.spi.SyncResolver;

/*In heritance in Java :-  When one class inherit the property of the other 
i.e. parent class is called inheritance in java. In below program we are trying inherit property of A class in B*/
class A {
static int a=10,b=20;

}

class B extends A { 
public static void main(String[] args) {
    System.out.println("Value of a = "+a+" Value of b = "+b);
}
}

/*In class B we didn't declared the attribute a and b but still we can assessing it because of class B 
 * inherit the property of class A
 * A class = superclass
 * B class = child class
 * extends word is used to inherit property of other class
 */

