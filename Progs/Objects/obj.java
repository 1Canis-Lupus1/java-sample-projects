//Counting number of times an object is created
class demo{
	static int i=0;
	public demo(){
		i++;
	}
}


public class obj{
	public static void main(String[] args){
		demo d1=new demo();
		demo d2=new demo();
		demo d3=new demo();
		System.out.printf("%d Objects created.",demo.i);		
	}
}