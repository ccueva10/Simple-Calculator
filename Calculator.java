import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		System.out.println("Welcome to the Calculator Program\n");

		// initialized three variables
		Scanner scanner = new Scanner(System.in);
	   do {
	       double num1 = getValidNumber("Enter the first number: ", scanner);
	       double num2 = getValidNumber("Enter the second number: ", scanner);
	       double result;

		
			int operation = menu(scanner);

			switch (operation) {

			case 1: {
			
				result = add(num1,num2);

				break;
			}
			case 2: {
				result = sub(num1,num2);

				break;
			}
			case 3: {
				result = multi(num1, num2);

				break;
			}
			case 4: {
				if (num2 == 0) {
					System.out.println("Cannot divide by 0");
					break;
				}
				result = div(num1,num2);
				// handle error when user tries to divide by 0

				break;
			}
			 case 0: {
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
			 }
			default:
				if (operation != 0) {
					System.out.println("Invalid choice. Please enter a number between 1 and 4.");
				}
				continue;
			}
				//Allow the user to choose whether to perform another calculation or exit the programm
				System.out.print("Do you want to perform another calculation? (yes/no): ");
        			String choice = scanner.next();
            			if (!choice.equalsIgnoreCase("yes")) {
                			break;
           	 		}
       			 } while (true);
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
	
	  private static double getValidNumber(String prompt, Scanner scanner) {
	        double number;
	        while (true) {
	            System.out.print(prompt);

	            if (scanner.hasNextDouble()) {
	                number = scanner.nextDouble();
	                break;
	            } 
	            else {
	                System.out.println("Invalid input. Please enter a valid number");
	                scanner.next();
	            }
	        }
	        return number;
	    }
	
    private static double add(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
        return result;
    }
    private static double sub(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
        return result;
    }
    private static double multi(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
        return result;
    }
    private static double div(double num1, double num2) {
        double result = num1 / num2;
        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
        return result;
    }
}
