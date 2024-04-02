package Method_Oeverriding;

public class Google4 extends Google3 {
	
		public void Apps() {
				super.Apps();
				System.out.println(" IN the 2008 Chrome was Introduce");
				System.out.println(" IN the 2005 Google+ was Introduce");
				System.out.println(" IN the 2005 to 2011 Google launch Many usefull apps");
				System.out.println(" IN the 2013 Google was Launch Google Pay");
				
				
		}

			public void featrue() {
				super.feature();
				System.out.println("Adding the various Features in the search");
				System.out.println("Adds the Filltering search for the search");
				System.out.println(" IN the 2023 Google adds Google BART AI ");
			}
			
		public static void main(String[] args) {
			
			Google4 obj=new Google4();
			
			
			obj.Apps();
			obj.feature();
			 
			
		}
			
				

}
