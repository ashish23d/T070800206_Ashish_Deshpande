package oops;

//Method Overriding Example
public class MethodOverriding_Child extends MethodOverriding_Parent  {

	public void bike (){
		
		System.out.println("This is bike form child class");
		super.bike();
		
	}
	
	public static void main(String[] args) {
		
		
		
		MethodOverriding_Child obj=new MethodOverriding_Child();
		
		obj.bike();
		
		
	}
}
