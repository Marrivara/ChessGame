package Game;

import Game.Interfaces.PieceInterface;

import java.awt.*;

public abstract class Piece implements PieceInterface {
    private Tile[] movableTiles;


    private Color color;

    public abstract void setMovable(Board board, Tile tile);

    public Piece(Color color){this.color = color;}

    public boolean isMovable(Tile tileToMove){
        for(Tile tile: movableTiles) {
            if (tile.equals(tileToMove)) {
                return true;
            }
        }return false;
    }
    public Color getColor(){return color;}

    public Tile[] getMovableTiles(){
        return movableTiles;
    }
    public abstract String getName();
    public void setMovableTiles(Tile[] movableTiles){
        this.movableTiles = movableTiles;
    }


}
