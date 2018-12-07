package doggomain;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] Args) {
		sc = new Scanner(System.in);
		DoggoStream.doggoStream();
		//getPlaces();

	}
	public static void getPlaces() {
		System.out.println("What place is your doggo?");
		int doggoNumber = sc.nextInt();
		System.out.println("How many places?");
		int places = sc.nextInt();

		for (int i = 1; i <= places; i++) {
			if (i != doggoNumber) {
				
				if ( i == 11 || i == 12 || i == 13) {
					System.out.println("Place: " + i + "th");
				}
				else if ((i-11) % 100 == 0) {
					System.out.println("Place: " + i + "th");
				}
				else if ((i-12) % 100 == 0) {
					System.out.println("Place: " + i + "th");
				}
				else if ((i-13) % 100 == 0) {
					System.out.println("Place: " + i + "th");
				}
				else if (i % 10 == 1) {
					System.out.println("Place: " + i + "st");
				} else if (i % 10 == 2) {
					System.out.println("Place: " + i + "nd");
				} else if (i % 10 == 3) {
					System.out.println("Place: " + i + "rd");
				} else {
					System.out.println("Place: " + i + "th");
				}
			}
		}

	}
}
