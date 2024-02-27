package Axis_TestNGG;


import org.testng.annotations.Test;


public class priority {
	
	@Test(priority = 0)
	public void f() {
		System.out.println("Hii");
	}
	
	@Test(priority = 1)
	public void g() {
		System.out.println("Hii 1");
	}
	
	@Test()
	public void h() {
		System.out.println("Hii 2");
	}
	
	

}
