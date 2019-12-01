package THIS;

public class constr {
	int a=1,b=2;
	
	constr(int x,int y){
		System.out.println(a+" :constructor "+ b);
	}
	
	void m1(){
		System.out.println(a+" method "+b);
		a=3000;
		System.out.println(a+" method "+b);
	}
	
	void m2(){
		System.out.println(a);
	}
	
	void m3(int a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		constr obj=new constr(10,20);
		obj.a=4000;
		int x=(int)obj.a;
		obj.m1();
		obj.m3(x);
		
		
	}

}
