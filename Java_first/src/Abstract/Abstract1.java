package Abstract;

public class Abstract1 {

	public void car() {
		System.out.println("This is Car Method");
		
	}
	
	public void bike() {
		System.out.println("This is Bike Method");
		
	}

	public void Moblie() {
		System.out.println("This is Mobile Method");
		
	}
	
	public void House() {
		System.out.println("This is House Method");
		
	}
	public void Farm() {
		System.out.println("This is Farm Method");
		
	}
	
	public static void main(String[] args) {
		
		Abstract1 obj=new Abstract1();
		
		obj.car();
		obj.Moblie();
		obj.House();
	}
}
