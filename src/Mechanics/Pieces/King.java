package Mechanics.Pieces;

import Mechanics.Board;
import Mechanics.Piece;
import Mechanics.Tile;

import java.awt.*;

public class King extends Piece{

    public King(Color color){
        super(color);
        int colorVar = color== Color.WHITE ? 0: 1;
        setPieceImage(super.importIMG().getSubimage(4*132,colorVar*132,132,132));
    }
    @Override
    public void setMovable(Board board, Tile tile) {
        int count = 0;
        int rank = tile.getPosition().getRank();
        int file = tile.getPosition().getFile();
        Tile[] newMovable = new Tile[8];

        if (file > 1 && rank < 8){
            if (board.getTile(rank + 1, file - 1).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank + 1, file - 1)
                        .getPiece()
                        .getColor() != tile.getPiece().getColor()){//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank + 1, file - 1);
                    count++;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank + 1, file - 1);
                count++;
            }
        }
        if (rank < 8){
            if (board.getTile(rank + 1, file).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank + 1, file)
                        .getPiece()
                        .getColor() != tile.getPiece().getColor()){//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank + 1, file);
                    count++;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank +1, file);
                count++;
            }
        }
        if (file < 8 && rank < 8){
            if (board.getTile(rank + 1, file + 1).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank + 1, file + 1)
                        .getPiece()
                        .getColor() != tile.getPiece().getColor()){//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank + 1, file + 1);
                    count++;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank + 1, file + 1);
                count++;
            }
        }
        if (file < 8){
            if (board.getTile(rank, file + 1).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank, file + 1)
                        .getPiece()
                        .getColor() != tile.getPiece().getColor()){//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank, file + 1);
                    count++;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank, file + 1);
                count++;
            }
        }
        if (file < 8 && rank > 1){
            if (board.getTile(rank - 1, file + 1).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank - 1, file + 1)
                        .getPiece()
                        .getColor() != tile.getPiece().getColor()){//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank - 1, file + 1);
                    count++;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank - 1, file + 1);
                count++;
            }
        }
        if (rank > 1){
            if (board.getTile(rank - 1, file).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank - 1, file)
                        .getPiece()
                        .getColor() != tile.getPiece().getColor()){//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank - 1, file);
                    count++;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank - 1, file);
                count++;
            }
        }
        if (file > 1 && rank > 1){
            if (board.getTile(rank - 1, file - 1).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank - 1, file - 1)
                        .getPiece()
                        .getColor() != tile.getPiece().getColor()){//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank - 1, file - 1);
                    count++;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank - 1, file - 1);
                count++;
            }
        }
        if (file > 1){
            if (board.getTile(rank, file - 1).getPiece() != null) {//If the tile is not empty
                if(board.getTile(rank, file - 1)
                        .getPiece()
                        .getColor() != tile.getPiece().getColor()){//If the tile has a piece with different color
                    newMovable[count] = board.getTile(rank, file - 1);
                    count++;
                }
            } else {//If the tile is empty
                newMovable[count] = board.getTile(rank, file - 1);
                count++;
            }
        }

        Tile[] trimmedNewMovable = new Tile[count];
        for (int i = 0; i < count; i++){
            trimmedNewMovable[i] = newMovable[i];
        }
        setMovableTiles(trimmedNewMovable);
    }
    public String getName() {return "King  ";}

}
