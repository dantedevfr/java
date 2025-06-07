package Exceptions;

public class SueldoException extends Exception {
    String message;
    public SueldoException(String message){
        super(message);
    }
}
