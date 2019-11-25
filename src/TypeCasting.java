
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//If compiler performs internal type casting then is Implicit
// It should need to perform Smaller to Bigger data type		
	
/*	byte b= 's';
	int x='a';
	double d = 10;
	System.out.println(x);
	System.out.println(d);
	System.out.println(b);
	*/
	
		//If Programmer performs type casting then is Explicit
		// It should need to perform Bigger to Smaller data type
		
		int a= 20;
		
		byte b = (byte)a;
			System.out.println(b);
		
		
	}

}
