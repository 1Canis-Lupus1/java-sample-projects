//Perfect Number or Not

import java.util.Scanner;

public class prft{
	public static void main(String[] args){
		//6= factors(1,2,3) =1+2+3=6 so perfect
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Possitive Number(Excluding 0): ");
		int n=sc.nextInt();				
		int sum=0;
		for(int i=1;i<n;i++){
			if(n%i==0){sum+=i;}
		}
		if(sum==n){System.out.println("Perfect Number!!");}
		else{System.out.print("Not a Perfect Number!!");}
	}
} 