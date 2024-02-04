import java.util.Scanner;

public class Calculator {

	// TODO complete addition function returns a double
	// TODO complete subtraction function returns a double
	// TODO complete multiplication function returns a double
	// TODO complete division function...throw error when dividing by zero...returns
	// a double

	public static void main(String[] args) {

		System.out.println("Welcome to the Calculator Program");

		// initialized three variables
		double num1, num2, result;
		int operation = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			operation = menu(scanner);

			switch (operation) {

			case 1: {
				// result = add(num1,num2);

				break;
			}
			case 2: {
				// result = sub(num1,num2);

				break;
			}
			case 3: {
				// result = multi(num1, num2);

				break;
			}
			case 4: {
				// result = div(num1,num2);
				// handle error when user tries to divide by 0

				break;
			}
			default:
				if (operation != 0) {
					System.out.println("Invalid choice. Please enter a number between 1 and 4.");
				}
				continue;

			}
		} while (operation != 0);
		System.out.println("Goodbye!");

	}

	private static int menu(Scanner scanner) {
		System.out.println("Select an option:");
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		System.out.println("0: Exit Calculator");

		return scanner.nextInt();
	}

}
