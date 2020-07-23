import java.util.*;

public class arr{
	static  {
		System.out.println("User defined 2-D Arrays");
		}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row count: ");
		int row=sc.nextInt();
		System.out.print("Enter column count: ");
		int col=sc.nextInt();	
		int ar[][]=new int[row][col];
		Random r=new Random();
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				ar[i][j]=r.nextInt();
			}
		}
		System.out.println("The Array is: ");
		for(int k[]:ar){
			for(int l:k){System.out.print(l+" ");}
		System.out.println();
		}
	}
}