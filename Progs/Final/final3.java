//Final Class- cannot be Extended(i.e. no Inheritance)

public class final3{
	public static void main(String[] args){
		
	}
}

final class Parent{
	public void show(){
		System.out.println("Final Class");
	}
}

class Child extends Parent{		//ERROR
	public void print(){
		System.out.println("This cannot be inherited.");
	}
}