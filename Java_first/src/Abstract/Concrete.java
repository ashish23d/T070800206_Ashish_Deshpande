package Abstract;

public class Concrete extends Abstraction {

	@Override
	public void colllege() {
		// TODO Auto-generated method stub
		System.out.println("This is College Method");
		
	}

	@Override
	public void Branch() {
		// TODO Auto-generated method stub
		System.out.println("This is Brach Method");
		
	}

	@Override
	public void Studet() {
		// TODO Auto-generated method stub
		System.out.println("This is Student Method");
		
	}
	
	public static void main(String[] args) {
		 
		Concrete obj= new Concrete();
		
		obj. colllege();
		obj.Branch();
		obj.Studet();
	}

}
