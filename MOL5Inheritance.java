class A{
	void m1(int a){
		System.out.println("A int - arg");
	}

}

class B extends A{
	void m1(float f){
		System.out.println("B float - arg");
	}
}

class MOL5Inheritance{
	public static void main(String[]args){
		B b = new B();
		b.m1(20);
		b.m1('a');
		b.m1(50L);

		System.out.println();

		A a =new B();
		a.m1(50);
		a.m1('a');
		//a.m1(50L);
	}
}