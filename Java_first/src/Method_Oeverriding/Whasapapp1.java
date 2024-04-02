
package Method_Oeverriding;

public class Whasapapp1 extends Whatsapp {
	
public void SingleTick() {
		
	 
		System.out.println("Single Tick for chat");
		
	}

	public void double_Tick() {
		super.SingleTick();
		System.out.println("Double Tick for chat");
	
	}
	public void double_blueTick() {
		System.out.println(" Double blue Tick for chat Delivery");
	}
}
