package JavaExceptionAndErrorHandling;


	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	public class ReadFile {
	    public static void main(String[] args) {
	        String fileName = "example.txt"; // Change this to your file's name

	        try {
	            // Attempt to open and read the file
	            FileReader fileReader = new FileReader(fileName);
	            BufferedReader bufferedReader = new BufferedReader(fileReader);

	            String line;
	            while ((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }

	            // Close the file
	            bufferedReader.close();
	        } catch (FileNotFoundException e) {
	            // Handle the FileNotFoundException
	            System.err.println("File Not Found: " + fileName);
	            e.printStackTrace(); // This prints the stack trace for debugging purposes
	        } catch (IOException e) {
	            // Handle other IOExceptions
	            System.err.println("An error occurred while reading the file: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
	}

