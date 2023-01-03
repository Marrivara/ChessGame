package Game.Pieces;

import Game.Board;
import Game.Piece;
import Game.Tile;

import java.awt.*;

public class Pawn  extends Piece {

    @Override
    public void setMovable(Board board, Tile tile) {
        int rank = tile.getPosition().getRank();
        int file = tile.getPosition().getFile();
        Tile[] newMovable = new Tile[0];

        if(getColor().equals(Color.WHITE) && rank < 8) {
            newMovable = setMovableForColor(Color.WHITE, board, tile, rank, file);
        }else{
            if (rank > 1) {
               newMovable = setMovableForColor(Color.BLACK, board, tile, rank, file);
            }
        }
        setMovableTiles(newMovable);
    }

    private Tile[] setMovableForColor(Color color, Board board, Tile tile, int rank, int file){
        int count = 0;
        Tile[] newMovable = new Tile[3];
        int difference;

        if(color.equals(Color.WHITE)){
            difference = 1;
        }else{difference = -1;}

        //If upper piece is empty
        if (board.getTile(rank + difference, file).getPiece() == null) {
            newMovable[count] = board.getTile(rank + difference, file);
            count++;
        }

        //If up and left has a piece with a different color
        if(file < 8) {
            if (board.getTile(rank + difference, file + 1).getPiece() != null && board.getTile(rank + difference, file + 1).getPiece().getColor() != getColor()) {
                newMovable[count] = board.getTile(rank + difference, file + 1);
                count++;
            }
        }

        if(file > 1) {
            if (board.getTile(rank + difference, file - 1).getPiece() != null && board.getTile(rank + difference, file - 1).getPiece().getColor() != getColor()) {
                newMovable[count] = board.getTile(rank + difference, file - 1);
                count++;
            }
        }

        Tile[] trimmedNewMovable = new Tile[count];
        for (int i = 0; i < count; i++){
            trimmedNewMovable[i] = newMovable[i];
        }
        return trimmedNewMovable;
    }
    public String getName() {return "Pawn  ";}
    public Pawn(Color color){
        super(color);
    }
}
