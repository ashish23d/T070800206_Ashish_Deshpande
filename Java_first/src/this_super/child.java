package this_super;

public class child extends parent {
	
	int a=10;
	int b=20;
	
	public void m1() {
		
		int a=50;
		int b=60;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(super.a);
		System.out.println(super.b);
	}
	
	public static void main(String[] args) {
		

	child obj=new child();
	
	
	obj.m1();
	 
	
		
		
	}

}
