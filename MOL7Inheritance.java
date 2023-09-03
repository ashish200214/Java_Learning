class A{
	void m1(float f){
		System.out.println("A float - arg");

	}
}

class B extends A{
	void m1(int a){
		System.out.println("b int - arg");
	}
	void m1(long l){
		System.out.println("B long - arg");
	}
	void m1(float f){
		System.out.println("B float - arg");
	}


}

class MOL7Inheritance{
	public static void main(String[]args){
		B b = new B();
		b.m1(50);
		b.m1('a');
		b.m1(50L);

		System.out.println();
		A a = new B();
		a.m1('a');
		a.m1(10);
		a.m1(50L);
	}
}

