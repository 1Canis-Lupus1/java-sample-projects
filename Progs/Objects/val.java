class Emp{
	private String eName="TEST";
	private int eId=0;

	public int seteId(int j){
		eId=j;
	}

	public void geteId(){
		return eId;
	}
	
	public void show(){
		System.out.println(eName+" "+eId);
	}
}

public class val{
	public static void main(String[] args){
		Emp e1=new Emp();
		//e1.eName("Shubham");
		e1.seteId(001);
		System.out.println(geteId());
		//e1.show();
	}	
}