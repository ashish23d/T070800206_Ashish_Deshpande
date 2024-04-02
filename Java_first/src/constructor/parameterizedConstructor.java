package constructor;

public class parameterizedConstructor {

	int i;
	float j;
	String p;
	public parameterizedConstructor(int a, float b , String d) {
		i =a;
		j=b;
		p=d;
		
	}
	public void method()
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(p);
	}
	public static void main(String[] args) {
		 parameterizedConstructor obj=new  parameterizedConstructor(12,10f,"Ashish");
		 obj.method();
	}
}
