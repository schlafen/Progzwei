package mypackage;
//Siehe Kapitel 2, Folie 7  

public abstract class Vehicle implements Comparable<Vehicle> {
	private double price;
	private int vmax;
	public Vehicle (double p, int v){
			price = p; vmax = v;
	}
	public double getPrice (){
		return price;
	}
	public int getVmax (){
		return vmax;
	}
	
	public abstract String getDetails ();
	
}
