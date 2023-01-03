package Mechanics.Exceptions;

public class EmptyTileSelectedException extends Exception{
    public EmptyTileSelectedException() {
        super("EMPTY TILE SELECTED!");
    }

    public EmptyTileSelectedException(String message) {
        super(message);
    }
}
