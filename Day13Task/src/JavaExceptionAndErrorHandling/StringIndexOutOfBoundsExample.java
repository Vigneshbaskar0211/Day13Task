package JavaExceptionAndErrorHandling;

public class StringIndexOutOfBoundsExample {
	    public static void main(String[] args) {
	        String text = "Hello, World";

	        try {
	            char character = text.charAt(15); // Trying to access an index that is out of bounds
	            System.out.println("Character at index 15: " + character);
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("String Index Out of Bounds Exception: " + e.getMessage());
	        }
	    }
	}


