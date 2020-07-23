//Final Variable

import java.util.Scanner;

class final1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Radius: ");
		double r=sc.nextDouble();
		final double pi=3.141;			//Final Variable
		double area=pi*(r*r);
		System.out.println("Area of circle is: "+area);
	}
}