package Abstraction;

public class ImplementAbstarct extends Abstarct2 {

	public static void main(String[] args) {

		ImplementAbstarct IA = new ImplementAbstarct();
		IA.NumberPlate();
		IA.BrandName();
		IA.Color();
		IA.dealer();
		IA.price();

	}

	@Override
	void BrandName() {System.out.println("Benz");
	
	}

	@Override
	void Color() {System.out.println("Yellow");

	}

	@Override
	void dealer() {System.out.println("Naveen Industries");
	
	}

	@Override
	void price() {System.out.println("69");
			
	}
	
	

}
