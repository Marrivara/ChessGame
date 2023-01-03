package Mechanics.Exceptions;

public class OutOfLimitsException extends Exception{
    public OutOfLimitsException() {
        super("YOUR INPUTS ARE OUT OF LIMITS!");
    }

    public OutOfLimitsException(String message) {
        super(message);
    }
}
