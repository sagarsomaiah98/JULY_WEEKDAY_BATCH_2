import org.testng.annotations.Test;

public class Priority_Methods {
	
	
	@Test(priority=3)
	public void LogOut() {
		
		System.out.println("logout method");
	}
	
	
	@Test(priority=1)
	public void composeTest() {
		
		System.out.println("Compose method");
	}

	
	
	@Test(priority=2)
	public void inbox() {
		
		System.out.println("inbox method");
	}
	

}
