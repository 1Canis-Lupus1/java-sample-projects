//Final Method- cannot be over-ridden

public class final2{
	public static void main(String[] args){
		Parent p=new Parent();
		p.show();		
	}
}

class Parent{
	final public void show(){	//Final Method
		System.out.println("Final method of Parent class.");
	}
}

class Child extends Parent{
	public void show(){		//ERROR as 'final method' cannot be "over-ridden"
		System.out.println("Method of Child class.");
	}
}