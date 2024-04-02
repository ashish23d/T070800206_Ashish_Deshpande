package Method_Oeverriding;

public class Whatsapp2 extends Whasapapp1{
	
	public void SingleTick() {
		
		System.out.println(" chat");
		System.out.println("Single Tick for chat");
		
	}

	public void double_Tick() {
		super.SingleTick();
		System.out.println("Double Tick for chat");
	
	}
	public void double_blueTick() {
		System.out.println(" Double blue Tick for chat Delivery");
	}
	
	public void Offline() {
		 
		System.out.println("Show offline status");
	
	}
	public void VoiceCall() {
		 
		System.out.println("Added the feature of Voice Call");
	}
	
	public void VideoCall() {
		 
		System.out.println("Added the feature of Video Call");
	}

}
