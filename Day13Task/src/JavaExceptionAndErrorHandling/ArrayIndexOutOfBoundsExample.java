package JavaExceptionAndErrorHandling;

public class ArrayIndexOutOfBoundsExample {
	    public static void main(String[] args) {
	        int[] numbers = { 1, 2, 3, 4, 5 };

	        try {
	            int index = 6; // Trying to access an index that is out of bounds
	            int value = numbers[index];
	            System.out.println("Value at index " + index + ": " + value);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
	        }
	    }
	}



