package doggomain;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DoggoStream {

	private static Scanner sc;

	public static void doggoStream() {

		sc = new Scanner(System.in);
		System.out.println("What place is your doggo?");
		int doggoNumber = sc.nextInt();
		System.out.println("How many places?");
		int places = sc.nextInt();

		IntStream.range(1, places + 1).mapToObj(i -> {
			if (i != doggoNumber) {

				if (i == 11 || i == 12 || i == 13) {
					return "Place: " + i + "th";
				} else if ((i - 11) % 100 == 0) {
					return "Place: " + i + "th";
				} else if ((i - 12) % 100 == 0) {
					return "Place: " + i + "th";
				} else if ((i - 13) % 100 == 0) {
					return "Place: " + i + "th";
				} else if (i % 10 == 1) {
					return "Place: " + i + "st";
				} else if (i % 10 == 2) {
					return "Place: " + i + "nd";
				} else if (i % 10 == 3) {
					return "Place: " + i + "rd";
				} else {
					return "Place: " + i + "th";
				}
			} else {return "";}
		}).forEach(System.out::println);
	}

}
