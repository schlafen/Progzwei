package mypackage;

// Siehe Kapitel 3, Folie 18
import java.util.*;

public class Buch {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1, 2, 3));
		ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(4, 5, 6));
		ArrayList<Integer> row3 = new ArrayList<>(Arrays.asList(7, 8, 9));
		matrix.add(row1);
		matrix.add(row2);
		matrix.add(row3);
		System.out.println(matrix);

		System.out.println(matrix.get(1).get(0));
		row2.set(0, 444);
		//matrix.set(1, row2);
		System.out.println(matrix.get(1).get(0));

		ArrayList<String> kapitel = new ArrayList<>();
		String zeile1 = "Erste Zeile ", zeile2 = "Zweite Zeile";
		kapitel.add(zeile1);
		kapitel.add(zeile2);

		ArrayList<ArrayList<String>> buch = new ArrayList<>();
		buch.add(kapitel);
		System.out.println("Buch: " + buch);
	}
}
