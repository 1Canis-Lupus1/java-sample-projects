//Inhertitance(always constructor are called first, starting with the Parent)

public class inh{
	public static void main(String[] args){
		Child c=new Child();
		c.show();
	}
}

class Parent{
	public Parent(){System.out.println("Class A constructor");}	

	public void show(){System.out.println("In Class A");}
}

class Child extends Parent{
	public Child(){
		System.out.println("Class B constructor");
	}	

	public void print(){
		System.out.println("In Class B");
	}
}