import java.util.Scanner;

public class UserProfile {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter you name");
		String name =console.next();
		System.out.println("please ebter your age");
		String age =console.next();
		System.out.println("please enter you gender");
		String gender = console.next();
		System.out.println("please entet your job preference");
		String job=console.next();
		System.out.println("please enter your nationality");
		String nationality=console.next();
		System.out.println("please enter you type blod");
		String blod=console.next();
		System.out.println("My name is "+ name + ". I'm " + age + " years old. My gender is " + gender + ". My job preference is " + job + " and I'm " + nationality + ". My blood type is " + blod+ ".");
	} 
}
