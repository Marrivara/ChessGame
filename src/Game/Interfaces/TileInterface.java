package Game.Interfaces;

import Game.Board;
import Game.Enums.TileColor;
import Game.Piece;
import Game.Position;
import Game.Tile;

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
