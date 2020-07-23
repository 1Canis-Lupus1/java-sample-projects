//importing "System.out" from "java.lang" and use it in code
//(NOT WORKING AS INTENDED)

//import java.lang.System.out;
import java.util.Scanner;

public class stat{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String s=sc.nextLine();
		String s1="Hello";
		System.out.println(s1+" "+s);
	}
}