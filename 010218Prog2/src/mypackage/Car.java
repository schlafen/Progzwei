package mypackage;


public class Car extends Vehicle implements Print {

	private boolean sunroof;
	public Car (double p, int v, boolean s){
		super (p, v);
		sunroof = s;
	}
	

	public String getDetails () {
		return ("Preis: " + super.getPrice() + " VMax: " + super.getVmax() + " Schiebedach: " + sunroof);
	}


	

	public void printHeader() {
		System.out.println("Hier die Daten der Klasse Car");		
	}


	public void printContent() {
		this.getDetails();		
	}


	public void printFooter() {
		System.out.println("Abschluss der Klasse Car");
		
	}
	



	public static void main(String[] args) {
		Vehicle v = new Car (10000, 200, true);
		Car c = new Car (11000, 210, true);
		
		Car[0] myCarArray = new Car(100, 100, true);
		
		
	}
}