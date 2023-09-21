package newconsepts;

interface Iphone_Mobile {

	public void colour();
	public void model();
	public void browser();
	default void charger() {
		System.out.println("iphone has differe cable charger");
	}
	
		
	}


