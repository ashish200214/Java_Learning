class A{
	void m1(String s){
		System.out.println("A String - arg");
	}

	void m1(Integer io){
		System.out.println("A Integer - arg");

	}


}


class B extends A{
	void m1(Object obj){
		System.out.println("B Object - arg");
	}

	void m1(String s){
		System.out.println("B String - arg");
	}
	void m1(Integer io){
		System.out.println("B Integer - arg");
	}
}

class MOL10{
	public static void main(String[]args){
		B b = new B();
		b.m1("a");
		b.m1(10);

		System.out.println();
		A a =new B();
		a.m1("a");
		a.m1(10);

	}
}