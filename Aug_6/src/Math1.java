
public class Math1 {
	
	
	public static int max(int a, int b) {
		
		
		if(a>b)
			return a;
		else return b;
	}

	
	public static  int min(int a, int b) {
		
		if(a<b)
			return a;
		else return b;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(min(10, 20));
		
		System.out.println(max(50, 100));
	}
	}

