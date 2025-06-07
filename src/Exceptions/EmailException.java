package Exceptions;

public class EmailException extends Exception{
    String message;
    public EmailException(String message){
        super(message);
    }
}
