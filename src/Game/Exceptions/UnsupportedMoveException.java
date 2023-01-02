package Game.Exceptions;

public class UnsupportedMoveException extends Exception{
    public UnsupportedMoveException() {
        super("PIECE IS NOT ABLE TO MOVE TO THAT POSITION!");
    }

    public UnsupportedMoveException(String message) {
        super(message);
    }
}
