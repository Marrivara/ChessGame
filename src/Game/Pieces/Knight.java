package Game.Pieces;

import Game.Board;
import Game.Piece;
import Game.Position;
import Game.Tile;

import java.awt.*;

public class Knight extends Piece {


    @Override
    public void setMovable(Board board, Tile tile) {
        int count = 0;
        int rank = tile.getPosition().getRank();
        int file = tile.getPosition().getFile();
        Tile[] newMovable = new Tile[8];

        if (file > 2 && rank < 8){
            if (board.getTile(rank + 1, file - 2).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank + 1, file - 2)
                        .getPiece()
                        .getColor() != tile.getPiece().getColor()){//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank + 1, file - 2);
                    count++;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank + 1, file - 2);
                count++;
            }
        }
        if (file > 1 && rank < 7){
            if (board.getTile(rank + 2, file - 1).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank + 2, file - 1)
                        .getPiece()
                        .getColor() != tile.getPiece().getColor()){//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank + 2, file - 1);
                    count++;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank + 2, file - 1);
                count++;
            }
        }
        if (file < 8 && rank < 7){
            if (board.getTile(rank + 2, file + 1).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank + 2, file + 1)
                        .getPiece()
                        .getColor() != tile.getPiece().getColor()){//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank + 2, file + 1);
                    count++;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank + 2, file + 1);
                count++;
            }
        }
        if (file < 7 && rank < 8){
            if (board.getTile(rank + 1, file + 2).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank + 1, file + 2)
                        .getPiece()
                        .getColor() != tile.getPiece().getColor()){//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank + 1, file + 2);
                    count++;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank + 1, file + 2);
                count++;
            }
        }
        if (file < 7 && rank > 1){
            if (board.getTile(rank - 1, file + 2).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank - 1, file + 2)
                        .getPiece()
                        .getColor() != tile.getPiece().getColor()){//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank - 1, file + 2);
                    count++;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank - 1, file + 2);
                count++;
            }
        }
        if (file < 8 && rank > 2){
            if (board.getTile(rank - 2, file + 1).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank - 2, file + 1)
                        .getPiece()
                        .getColor() != tile.getPiece().getColor()){//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank - 2, file + 1);
                    count++;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank - 2, file + 1);
                count++;
            }
        }
        if (file > 1 && rank > 2){
            if (board.getTile(rank - 2, file - 1).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank - 2, file - 1)
                        .getPiece()
                        .getColor() != tile.getPiece().getColor()){//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank - 2, file - 1);
                    count++;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank - 2, file - 1);
                count++;
            }
        }
        if (file > 2 && rank > 1){
            if (board.getTile(rank - 1, file - 2).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank - 1, file - 2)
                        .getPiece()
                        .getColor() != tile.getPiece().getColor()){//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank - 1, file - 2);
                    count++;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank - 1, file - 2);
                count++;
            }
        }

        Tile[] trimmedNewMovable = new Tile[count];
        for (int i = 0; i < count; i++){
            trimmedNewMovable[i] = newMovable[i];
        }
        setMovableTiles(trimmedNewMovable);

    }

    public Knight(Color color){
        super(color);
    }

}