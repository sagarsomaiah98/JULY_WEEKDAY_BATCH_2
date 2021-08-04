import java.util.Scanner;

public class Multiple_Read {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name=sc.next();
		
		System.out.println("Enter the age: ");
		String age=sc.next();
		System.out.println("Enter the gender: ");
		String gender=sc.next();
		
		System.out.println(" the information entered above is ");
		System.out.println(name+" - "+age+" "+gender);
		
		System.out.println(name.charAt(3));

	}

}
