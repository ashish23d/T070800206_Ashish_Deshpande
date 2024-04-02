package Method_Oeverriding;

public class Whatsapp3 extends Whatsapp2 {
	

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


	public void images() {
		
		System.out.println("Added To Upload the Images");
	}
	public void video() {
		
		System.out.println("Added To Upload the Video in status");
	}
	
	
}
