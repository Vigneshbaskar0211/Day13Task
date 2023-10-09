package JavaExceptionAndErrorHandling;
//InvalidAgeException.java
import java.io.Serializable;

class InvalidAgeException extends Exception implements Serializable {
 public static final long serialVersionUID = 1L;

 public InvalidAgeException(String message) {
     super(message);
 }
}
