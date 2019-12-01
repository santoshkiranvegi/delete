package THIS;

public class THIS_V2 {

	public static void main(String[] args) {
		THIS_V2 vref= new THIS_V2();
		System.out.println(vref.a);
	}

	int a=10;
	 int b=20;
	 int c= 30;
	 
	 THIS_V2(){
		 a= 40;
		 this.a=a;
		 
	 }
	 /*THIS_V2(int a, int b, int c){
		 
		 a= 40;
		 b= 50;
		 c= 60;
		 this.a =a;
		 this.b=b;
		 
	 }*/
	 
}
