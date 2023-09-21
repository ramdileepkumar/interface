package newconsepts;

public class  Mobiles  implements  Iphone_Mobile,Android_Mobile {
	
	
	public static void main(String[] args) {
	Mobiles mbl= new Mobiles();
	mbl.colour();
	mbl.model();
	mbl.browser();
	mbl.oneplus();
	mbl.cost();
	mbl.charger();
	Android_Mobile.call();
	mbl.charger();

	}
	public void colour() {
		System.out.println("black");
		
	}
	public void model() {
		System.out.println("iphone 15 plus");
	}
	public void browser() {
		System.out.println("it contains safari browser");
	}
	public void oneplus() {
		System.out.println("my second fav mobile");
	}
	public void cost() {
		System.out.println("35999");
	}
	public void charger() {
		System.out.println("c type charger");
	}
	
	
	


}
