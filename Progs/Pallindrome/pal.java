//Number Pallindrome or Not

import java.util.*;

public class pal{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check for Pallindrome: ");
		int s=sc.nextInt();
		int temp=s;
		int num=0;
		while(temp!=0){
			int rem=temp%10;
			num=num*10+rem;
			temp/=10;
		}	
		if(s==num){System.out.println("Pallindrome");}
		else{System.out.println("Not Pallindrome");}
		

		//String Pallindrome(NOT WORKING!!!):
		//String rev=s.substring(s.length()-1,-1);
		//if(s.equals(rev)){System.out.println("String is Pallindrome!!");}
		//else{System.out.println("String Not a Pallindrome!!");}				
	}
}