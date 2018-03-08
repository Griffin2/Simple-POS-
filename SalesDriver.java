package LAB9;

import java.util.Scanner;

public class SalesDriver {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		boolean valid = true;
		System.out.println("Pencil Store\n");
		// sentinel
		do {
			System.out.println("You are purchasing pencils");
			System.out.print("Input Quantity: ");
			int qty = read.nextInt();

			// constructor
			Sales reciepts = new Sales(new Item("Supreme Pencil", 123, 5.00, 10.00), qty);
			System.out.println(reciepts.toString());

			read.nextLine();
			System.out.println("conintue? y/n");
			String response = read.nextLine();

			// comparing strings
			if (response.equalsIgnoreCase("n")) {
				System.out.println("Thanks!");
				valid = false;
			}
		} while (valid);

		read.close();
	}
}
