package JavaExceptionAndErrorHandling;
	import java.util.Scanner;

	public class DivisionCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter the first integer: ");
	            int num1 = scanner.nextInt();

	            System.out.print("Enter the second integer: ");
	            int num2 = scanner.nextInt();

	            if (num2 == 0) {
	                System.out.println("Error: Division by zero is not allowed.");
	            } else {
	                int result = num1 / num2;
	                System.out.println("Result of division: " + result);
	            }
	        } catch (java.util.InputMismatchException e) {
	            System.out.println("Error: Please enter valid integers.");
	        } finally {
	            scanner.close();
	        }
	    }
	}



