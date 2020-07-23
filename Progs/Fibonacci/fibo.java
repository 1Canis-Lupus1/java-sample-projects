//Fibonacci Sereis: [0] 1 1 2 3 5 8 13 21...n

import java.util.Scanner;

public class fibo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n=sc.nextInt();
		int v1=0;
		int v2=1;
		int prev;
		int curr;
		int sum=v1+v2;
		curr=sum;
		System.out.print(v2+" ");
		for(int i=0;i<(n-1);i++){
			System.out.print(sum+" ");
			prev=curr;
			curr=sum;
			sum=prev+curr;
		}
		System.out.println();
	}
}