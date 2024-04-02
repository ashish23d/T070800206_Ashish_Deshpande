package methods;

public class variable {

	
	int a=10;
	static int b=20;
	
	public void m1()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public void m2() {
		System.out.println(a);
		
	}
	 
	public static void main(String[] args) {
		
		
		
		variable obj=new variable();
		obj.m1();
		obj.m2();
	}
}
