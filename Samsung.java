package week4.day1;

public class Samsung implements AndroidDesign{

	public void startphone() {
		// TODO Auto-generated method stub
		System.out.println("startphone");
		
	}

	public void makecall() {
		// TODO Auto-generated method stub
		System.out.println("makecall");
	}

	   
   

  public void sendsms() {
	// TODO Auto-generated method stub
	System.out.println("sendsms");
  }
	
public static void main(String[] args){
	Samsung data= new Samsung();
		data.startphone();
		data.makecall();
		data.sendsms();
	}
}

