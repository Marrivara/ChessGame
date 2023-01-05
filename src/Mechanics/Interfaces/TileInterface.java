package Mechanics.Interfaces;

import Mechanics.Board;
import Mechanics.Enums.TileColor;
import Mechanics.Piece;
import Mechanics.Position;
import Mechanics.Tile;

import java.awt.*;

public interface TileInterface {
    void setMovable(Board board, Tile tile);
    Position getPosition();
    void setPosition(Position position);


    Piece getPiece();

    void setPiece(Piece piece);

    Color getColor();

    void setColor(Color color);
    Piece takeThePiece();

}
