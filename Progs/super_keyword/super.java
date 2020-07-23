//Playing with 'super' keyword

class super1{
	public static void main(String[] args){
		Child c=new Child(5);
		c.show();
	}
} 

class Parent{
	int temp=5;
	public Parent(){System.out.println("Default Const-A");}
	
	public Parent(int i){System.out.println("Parameterized Const-A");}

	public void show(){System.out.println("In Parent class...");}
}

class Child extends Parent{
	public Child(){System.out.println("Default Const-B");}

	public Child(int i){super(i);System.out.println("Parameterized Const-B");}
	public void show(){super.show();System.out.println("Temp value in the Parent class is "+super.temp);}
}