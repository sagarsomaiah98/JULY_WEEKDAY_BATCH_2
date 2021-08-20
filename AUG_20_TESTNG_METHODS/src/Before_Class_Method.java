import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Before_Class_Method {
	
	
	
	
	
	@Test
	public void test1() {
		
		System.out.println("Test1 testng method");
	}
	
	
	@Test
	public void test2() {
		
		System.out.println("Test2 testng method");
	}

	@Test
	public void test3() {
		
		System.out.println("Test3 testng method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
		
	}
	@AfterClass
	public void after() {
		System.out.println("After Class");
		
	}
	
	@Test
	public void test4() {
		
		System.out.println("Test4 testng method");
	}

}
