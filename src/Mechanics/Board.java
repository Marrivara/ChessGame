package Mechanics;

import Mechanics.Exceptions.EmptyTileSelectedException;
import Mechanics.Exceptions.OutOfLimitsException;
import Mechanics.Exceptions.UnsupportedMoveException;
import Mechanics.Exceptions.WrongPieceSelectedException;
import Mechanics.Interfaces.BoardInterface;

import java.awt.*;

public class Board implements BoardInterface {
    private Tile[][] board;
    private Piece[] capturedPieces = new Piece[32];;
    private int capturedPiecesCount = 0;

    private boolean isWhiteTurn;

    public Board(Tile[][] board){
        this.board = board;
        isWhiteTurn = true;
    }

    public void placeTheMovables(Board board){
        for (int i = 0; i < this.board.length; i++){
            for(int j = 0; j < this.board[i].length; j++){
                Piece piece = board.getTile(i+1,j+1).getPiece();
                if(piece != null){
                    piece.setMovable(board,this.board[i][j]);
                }else{

                }
            }
        }
    }

    public void movePiece(int fromRank, int fromFile, int toRank, int toFile) throws Exception{
        if(!(fromRank<9 && fromRank>0 && fromFile>0 && fromFile<9 && toRank<9 && toRank>0 && toFile>0 && toFile<9)){
            throw new OutOfLimitsException();
        }

        Tile fromTile = board[fromRank - 1][fromFile - 1];

        Tile toTile = board[toRank - 1][toFile - 1];

        if(fromTile.getPiece() != null){
            if(isWhiteTurn){
                if(fromTile.getPiece().getColor() == Color.BLACK){
                    throw new WrongPieceSelectedException("ITS WHITE'S TURN!");
                }
            }else{
                if(fromTile.getPiece().getColor() == Color.WHITE){
                    throw new WrongPieceSelectedException("ITS BLACK'S TURN!");
                }
            }
            if(fromTile.getPiece().isMovable(toTile)) {
                //Move The Tile
                Piece pieceToMove = fromTile.takeThePiece();
                if (toTile.getPiece() != null) {
                    //Capture the other piece
                    capturedPieces[capturedPiecesCount] = toTile.takeThePiece();
                    capturedPiecesCount++;
                }
                toTile.setPiece(pieceToMove);
                placeTheMovables(this);
                isWhiteTurn = !isWhiteTurn;
                System.out.println(pieceToMove.getName() + " moved to " + toTile.getPosition().getPosition());
            }else{throw new UnsupportedMoveException();}
        }else{throw new EmptyTileSelectedException();}

    }

    public Tile getTileByInt(int first, int second){
        return board[first][second];
    }

    public Tile getTile(int rank, int file){
        return board[rank-1][file-1];
    }


    public Tile getTile(Position position){ return board[position.getRank() - 1][position.getFile() - 1];}

    @Override
    public String toString(){
        {
            StringBuilder sb = new StringBuilder();

            // add the top row of column labels
            sb.append("    A      B      C      D      E      F      G      H\n");

            for (int i = 0; i < 8; i++) {
                // add the row number label
                sb.append((i + 1) + " ");

                for (int j = 0; j < 8; j++) {
                    Piece piece = board[i][j].getPiece();
                    if (piece == null) {
                        // add an empty space if there is no piece
                        sb.append("      |");
                    } else {
                        // add the piece's symbol if there is a piece
                        sb.append(piece.getName() + "|");
                    }
                }

                // add a newline at the end of the row
                sb.append("\n");
            }

            return sb.toString();
        }
    }
}

