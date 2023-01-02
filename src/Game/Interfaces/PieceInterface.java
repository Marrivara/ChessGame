package Game.Interfaces;

import Game.Board;
import Game.Piece;
import Game.Tile;

import java.awt.*;

public interface PieceInterface {
    boolean isMovable(Tile tile);
    void setMovable(Board board, Tile tile);
    Color getColor();
    Tile[] getMovableTiles();

    void setMovableTiles(Tile[] movableTiles);
}
