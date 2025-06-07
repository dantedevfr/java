package Exceptions;

public class EdadException extends Exception{
    String message;
    public EdadException(String message){
        super(message);
    }
}
