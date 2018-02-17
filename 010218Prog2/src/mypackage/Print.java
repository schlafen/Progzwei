package mypackage;

public interface Print {
	public void printHeader ();
	public void printContent ();
	public void printFooter ();
	public default void printAuthor() {
		System.out.println("Default-Autor");
	}
	public static void printClassInfo () {
		System.out.println("Hier ist eine statische Methode");
	}
}
