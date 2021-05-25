package no.hvl.dat107;

import java.util.ArrayList;
import java.util.List;

public class HelloDAT107 {

	public static void main(String... blabla) {
		System.out.println("Hello DAT107");
//		List<String> l = new ArrayList<>();
//		;
//
//		l.add("en");
//		l.add("en");
//		System.out.println(l.size());
		
		
		System.out.println(finAvstandMellomPunkter(2,5,5,8));
		
	}

	public static double finAvstandMellomPunkter(double x1, double y1, double x2, double y2) {
		double xiAndre = Math.pow(x1 - x2, 2);
		double yiAndre = Math.pow(y1 - y2, 2);

		return Math.sqrt(xiAndre + yiAndre);
	}

}
