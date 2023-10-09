package JavaExceptionAndErrorHandling;

public class AgeValidation {
	// AgeValidation.java
	    public static void main(String[] args) {
	        try {
	            int age = getUserAge();
	            if (age < 18) {
	                throw new InvalidAgeException("Age must be 18 or older.");
	            }
	            System.out.println("Valid age: " + age);
	        } catch (InvalidAgeException e) {
	            System.err.println("Error: " + e.getMessage());
	        }
	    }

	    public static int getUserAge() {
	        int age = 15; 
	        return age;
	    }
	}



