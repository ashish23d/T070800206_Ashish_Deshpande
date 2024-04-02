package oops;

public class inheritanceChild extends inheritance_Parent {
//single level inheritance and by   multiple classes with extends it can be a multiple inheritance
	public void bike() {
		System.out.println("Im bike from chile");
		
	}
	
	public void money() {
		System.out.println("Im money from chile");
		
	}
	
	
	public static void main(String[] args) {
	 
		
		inheritanceChild obj=new inheritanceChild();
		
		obj.bike();
		obj.house();
		obj.Car();
		obj.money();
		//obj.farm();
		
	}
	}

