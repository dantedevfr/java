package Exceptions;

public class PasswordException extends Exception{
String message;
public PasswordException(String message){
   super(message);
}
}
