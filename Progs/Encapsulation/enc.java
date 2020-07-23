//Modifying static values using objects

public class enc{
	public static void main(String[] args){
		Employee e=new Employee();
		//e.seteId(800);
		//e.seteName("Shub");
		e.show();		
	}
}

class Employee{
	private String eName="Default";
	private int eId=0;

	public void show(){
		System.out.println(eName+" "+eId);
	} 

	public void seteId(int i){
		this.eId=i;
	}

	public void seteName(String name){
		this.eName=name;
	}
}