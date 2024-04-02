package constructor;


public class default_constructor {

	int a;
	float b;
	char c;
	boolean d;
	public void method1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	public void method2() {
		
	}
	public static void main(String[] args) {
		 default_constructor obj= new default_constructor();
		 	obj.method1();
	}
}

 

//rough
//by creating class object  static method/non static method