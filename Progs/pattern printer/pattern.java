import java.util.Scanner;
public class pattern{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the pattern number(Between 1 and 6[both inclusive]): ");
	int num=sc.nextInt();
	switch(num){
		case 1: //Pattern 1:
			//* * * *
			//* * * *
			//* * * *
			//* * * *
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					System.out.print("* ");
				}
			System.out.println();
			}
			break;
		
		case 2: //Pattern 2:	
			//* 
			//* *
			//* * * 
			//* * * *
			for(int i=1;i<=4;i++){
				for(int j=0;j<i;j++){
					System.out.print("* ");
				}
			System.out.println();
			}
			break;

		case 3: //Pattern 3:	
			//* * * *
			//*     *
			//*     *
			//* * * *
			for(int i=1;i<=4;i++){
				for(int j=1;j<=4;j++){
					if(i==1 || i==4 || j==1 || j==4){
						System.out.print("* ");
					}
					else{System.out.print("  ");}
				}
			System.out.println();
			}
			break;

		case 4: //Pattern 4:	
			//1 2 3 4
			//2 3 4 1
			//3 4 1 2 
			//4 1 2 3
			for(int i=0;i<4;i++){
				int val=i+1; 
				for(int j=0;j<4;j++){
					if(val<=4){System.out.print(val++ + " ");}
					else{
						val=1;
						System.out.print(val++ +  " ");
					}
				}
			System.out.println();
			}
			break;

		case 5: //Pattern 5:	
			//1
			//0 1
			//1 0 1
			//0 1 0 1
			//1 0 1 0 1
			int val=1;
			for(int i=1;i<=6;i++){
				for(int j=1;j<i;j++){
					if(val==1){
						System.out.print(val + " ");
						val=0;
					}
					else{
						System.out.print(val + " ");
						val=1;
					}
				}
			System.out.println();
			if((i==3) || (i==5)){val=1;}
			}	
			break;

		case 6: //Pattern 6:	
			//1
			//2 2
			//3 3 3
			//4 4 4 4
			//5 5 5 5 5
			for(int i=1;i<=5;i++){
				for(int j=0;j<i;j++){
					System.out.print(i +" ");
				}
			System.out.println();
			}
			break;

		default:System.out.println("ERROR!! Pattern NOT FOUND!!");
			break;
	}//end of switch	
	}
}