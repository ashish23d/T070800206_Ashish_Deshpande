package methods;

public class Method_calling extends Static_from_same_class {
	
	public static void college() {
		System.out.println("This is Class form diffrent package");
		
		
	}
	public static void main(String[] args) {
		
	
      Static_from_same_class obj= new Static_from_same_class();
      Static_from_same_class.college();
      college();
      Static_from_same_class.newcollege();
		 
	}	 
	
	
}
	
	
