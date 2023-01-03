package Mechanics.Interfaces;

import Mechanics.Board;
import Mechanics.Tile;

import java.awt.*;

public interface PieceInterface {
    boolean isMovable(Tile tile);
    void setMovable(Board board, Tile tile);
    Color getColor();
    Tile[] getMovableTiles();
    public String getName();
    void setMovableTiles(Tile[] movableTiles);
}
