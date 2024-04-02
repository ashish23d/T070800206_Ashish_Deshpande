package methods;

 
public class Static_from_same_class {
	
	public static void college() {
		System.out.println("College from class static");
		
	}
	
	public static void newcollege() {
		System.out.println("This is School class static");
	}
	public void car()
	{
		System.out.println( "this is not static method");
	}

	
	public static void main(String[] args) {
		college();
		newcollege();
		
		Static_from_same_class obj= new Static_from_same_class();
		
		obj.car();
		
		 
	}
}

