package Game.Pieces;

import Game.Board;
import Game.Piece;
import Game.Tile;

import java.awt.*;

public class Bishop extends Piece {

    @Override
    public void setMovable(Board board, Tile tile) {
        int count = 0;
        Tile[] newMovable = new Tile[64];
        int rank = tile.getPosition().getRank();
        int file = tile.getPosition().getFile();
        //LEFT TOP
        while (rank < 8 && file > 1) {
            int i = 1;
            if (board.getTile(rank + i, file - i).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank + i, file - i)
                        .getPiece()
                        .getColor() == tile.getPiece().getColor()){//If the tile has a piece with same color
                    break;
                }else{//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank + i, file - i);
                    count++;
                    break;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank + i, file - i);
                count++;
            }
            rank++;
            file--;
        }
        file = tile.getPosition().getFile();
        rank = tile.getPosition().getRank();

        //LEFT BOTTOM
        while (rank > 1 && file > 1) {
            int i = 1;
            if (board.getTile(rank - i, file - i).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank - i, file - i)
                        .getPiece()
                        .getColor() == tile.getPiece().getColor()){//If the tile has a piece with same color
                    break;
                }else{//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank - i, file - i);
                    count++;
                    break;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank - i, file - i);
                count++;
            }
            rank--;
            file--;
        }
        file = tile.getPosition().getFile();
        rank = tile.getPosition().getRank();

        //RIGHT TOP
        while (file < 8 && rank < 8) {
            int i = 1;
            if (board.getTile(rank + i, file + i).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank + i, file + i)
                        .getPiece()
                        .getColor() == tile.getPiece().getColor()){//If the tile has a piece with same color
                    break;
                }else{//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank + i, file + i);
                    count++;
                    break;}

            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank + i, file + i);
                count++;
            }
            file++;
            rank++;
        }
        file = tile.getPosition().getFile();
        rank = tile.getPosition().getRank();

        //RIGHT BOTTOM
        while (file < 8 && rank > 1) {
            int i = 1;
            if (board.getTile(rank - i, file + i).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank - i, file + i)
                        .getPiece()
                        .getColor() == tile.getPiece().getColor()){//If the tile has a piece with same color
                    break;
                }else{//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank - i, file + i);
                    count++;
                    break;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank - i, file + i);
                count++;
            }
            file++;
            rank--;
        }

        Tile[] trimmedNewMovable = new Tile[count];
        for (int i = 0; i < count; i++){
            trimmedNewMovable[i] = newMovable[i];
        }
        setMovableTiles(trimmedNewMovable);
    }

    public Bishop(Color color){
        super(color);
    }

}
