package Game.Interfaces;

import Game.Board;
import Game.Position;
import Game.Tile;

public interface BoardInterface {
    void placeTheMovables(Board board);

    void movePiece(int fromRank, int fromFile, int toRank, int toFile) throws Exception;

    Tile getTileByInt(int first, int second);

    Tile getTile(int rank, int file);

    Tile getTile(Position position);

}
