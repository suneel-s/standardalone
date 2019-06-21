
public class SampleMain {

	public void method1()
	{
	System.out.println("Inside method1");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside SampleMain");
		System.out.println("main()");
		SampleMain sm=new SampleMain();
		sm.method1();
		
	}

}
