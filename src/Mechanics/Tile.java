package Mechanics;

import Mechanics.Enums.TileColor;
import Mechanics.Interfaces.TileInterface;

import java.awt.*;

public class Tile implements TileInterface {
    private Position position;
    private Piece piece;
    private Color tileColor;
    private boolean selected;

    public Tile(Position position,Piece piece, Color color){
        this.position = position;
        this.piece = piece;
        this.tileColor = color;
        selected = false;
    }
    public Tile(Position position){
        this.position = position;
        this.piece = null;
        this.tileColor = null;
    }
    public Tile(Tile tile){
        this.position = tile.getPosition();
        this.piece = tile.getPiece();
        this.tileColor = tile.getColor();
    }
    public boolean getSelected(){return selected;}
    public void changeSelected(){selected = !selected;}
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

    public Color getColor() {
        return tileColor;
    }

    public void setColor(Color color) {
        this.tileColor = color;
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
