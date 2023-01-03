package Mechanics.Interfaces;

import Mechanics.Board;
import Mechanics.Enums.TileColor;
import Mechanics.Piece;
import Mechanics.Position;
import Mechanics.Tile;

public interface TileInterface {
    void setMovable(Board board, Tile tile);
    Position getPosition();
    void setPosition(Position position);


    Piece getPiece();

    void setPiece(Piece piece);

    TileColor getColor();

    void setColor(TileColor color);
    Piece takeThePiece();

}
