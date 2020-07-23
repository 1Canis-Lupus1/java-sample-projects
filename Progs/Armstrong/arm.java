//Armstrong Number
//eg- 153= 1 5 3=(1*1*1)+(5*5*5)+(3*3*3)=153 ->So Armstrong number!!

import java.util.Scanner;

public class arm{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number to check: ");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(temp!=0){
			int rem=temp%10;
			sum+=(rem*rem*rem);
			temp/=10;
		}	
		if(sum==n){System.out.println("Armstrong Number");}
		else{System.out.println("Not an Armstrong Number");}
	}
}