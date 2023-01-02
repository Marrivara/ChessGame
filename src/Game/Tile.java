package Game;

import Game.Enums.TileColor;
import Game.Interfaces.TileInterface;

public class Tile implements TileInterface {
    private Position position;
    private Piece piece;
    private TileColor color;

    public Tile(Position position,Piece piece, TileColor color){
        this.position = position;
        this.piece = piece;
        this.color = color;

    }
    public Tile(Position position){
        this.position = position;
        this.piece = null;
        this.color = null;
    }
    public Tile(Tile tile){
        this.position = tile.getPosition();
        this.piece = tile.getPiece();
        this.color = tile.getColor();
    }

    public void setMovable(Board board, Tile tile){
        piece.setMovable(board, tile);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public TileColor getColor() {
        return color;
    }

    public void setColor(TileColor color) {
        this.color = color;
    }

    public Piece takeThePiece(){
        Piece piece = this.piece;
        this.piece = null;
        return piece;
    }

    @Override
    public boolean equals(Object other){
        // self check
        if (this == other)
            return true;
        // null check
        if (other == null)
            return false;
        // type check and cast
        if (getClass() != other.getClass())
            return false;
        Tile tile = (Tile) other;
        // field comparison
        return position.equals(tile.position);
    }
}
