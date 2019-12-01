package test;

public class Tesla implements interfac_IN{

	public static void main(String[] args) {
		Tesla t1= new Tesla();
		t1.length();
		t1.Airbag();
		t1.WifiCAR();
		
		System.out.println("Interface Implemented");

	}
	

	@Override
	public void length() {
		System.out.println("100");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Airbag() {
		System.out.println("5 bags");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void WifiCAR() {
		System.out.println("W320.11 System");
		// TODO Auto-generated method stub
		
	}
	
	

	
}
