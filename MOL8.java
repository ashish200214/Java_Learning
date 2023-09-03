class A{
	void m1(Object obj){
		System.out.println("A Object - arg");
	}
}

class B extends A{
	void m1(String s){
		System.out.println("B string - arg");
	}
}

class MOL8{
	public static void main(String[]args){
		B b = new B();
		b.m1("a");
		b.m1(10);

		System.out.println();
		A a = new B();
		a.m1("a");
		a.m1(10);
	}
}