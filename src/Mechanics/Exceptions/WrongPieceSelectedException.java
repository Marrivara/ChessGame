package Mechanics.Exceptions;

public class WrongPieceSelectedException extends Exception{
    public WrongPieceSelectedException() {
        super("ITS OTHER COLOR'S TURN!");
    }

    public WrongPieceSelectedException(String message) {
        super(message);
    }
}
