import java.util.Scanner;

public class SecondProgram {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		String name =sc.nextLine();
		System.out.println("The Entered name is "+name);
		sc.close();
	}
}
