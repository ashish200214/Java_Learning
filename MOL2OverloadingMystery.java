class CalleeImp{
	public void foo(Object o){
		System.out.println("Object Parameter");
	}
	public void foo(String s){
		System.out.println("String parameter");
	}

	public void foo(Integer i){
		System.out.println("Integer parameter");
	}	
}

public class MOL2OverloadingMystery{
	public static void main(String[]args){
		CalleeImp cl = new CalleeImp();

		Object ob1 = new Object();
		Object ob2 = "HariKrishna";
		Object ob3 = new Integer(7279);

		cl.foo(ob1);
		cl.foo(ob2);
		cl.foo(ob3);

		System.out.println();
		cl.foo((String)ob2);
		cl.foo((Integer)ob3);

		System.out.println();
		cl.foo((String)ob1);
		cl.foo((Integer)ob1);
		cl.foo((String)ob3);
		cl.foo((Integer)ob2);
	}
}