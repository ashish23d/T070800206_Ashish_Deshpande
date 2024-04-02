package oops;

public class Method_overloading {

	public void add(){
		int a=30;
		System.out.println(a);
	}
	public void add(int a) {
		 
		System.out.println(a);
		System.out.println("");
		
	}
	
	public void add(int a,String b) {
		 
		System.out.println(a);
		System.out.println(b);
		System.out.println(" ");
	}
	
	public void add(String a,int b) {
	 
		System.out.println(b);
		System.out.println(a);
		System.out.println(" ");
	}
	
	public void add(String a, String b) {
		 
		System.out.println(a);
		System.out.println(b);
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		
		Method_overloading obj=new Method_overloading();
		
		obj.add();
		obj.add(10);
		obj.add(11,"a");
		obj.add("b",12);
		obj.add("c","d");
	}
}
