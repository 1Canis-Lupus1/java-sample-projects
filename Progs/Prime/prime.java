//Prime number or Not

import java.util.Scanner;

public class prime{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int counter=0;
		if(num==1){System.out.println("1 is neither Prime nor Composite.");counter=-1;}
		for(int i=2;i<num;i++){
			if(num%i==0){System.out.println("Not a Prime Number.");counter++;break;}
		}
		if(counter==0){System.out.println("Prime Number.");}
	}
}