package sougandhika;

public class chair extends furniture{
	void setStructure(){
		System.out.println("chair is a furniture");
	}
	
	public static void main(String [] args){
		furniture obj=new chair();
		obj.setStructure();
	}
	

}
