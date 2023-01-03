package Mechanics;

import Mechanics.Enums.TileColor;
import Mechanics.Pieces.*;

import java.awt.*;

public class PiecePlacer {
    public static Board place(){
        Tile[][] board = new Tile[8][8];

        //Row 1
        board[0][0] = new Tile(new Position("a",1),new Rook(Color.WHITE),   TileColor.BLACK);
        board[0][1] = new Tile(new Position("b",1),new Knight(Color.WHITE), TileColor.WHITE);
        board[0][2] = new Tile(new Position("c",1),new Bishop(Color.WHITE), TileColor.BLACK);
        board[0][3] = new Tile(new Position("d",1),new Queen(Color.WHITE),  TileColor.WHITE);
        board[0][4] = new Tile(new Position("e",1),new King(Color.WHITE),   TileColor.BLACK);
        board[0][5] = new Tile(new Position("f",1),new Bishop(Color.WHITE), TileColor.WHITE);
        board[0][6] = new Tile(new Position("g",1),new Knight(Color.WHITE), TileColor.BLACK);
        board[0][7] = new Tile(new Position("h",1),new Rook(Color.WHITE),   TileColor.WHITE);
        //Row 2
        board[1][0] = new Tile(new Position("a",2),new Pawn(Color.WHITE), TileColor.WHITE);
        board[1][1] = new Tile(new Position("b",2),new Pawn(Color.WHITE), TileColor.BLACK);
        board[1][2] = new Tile(new Position("c",2),new Pawn(Color.WHITE), TileColor.WHITE);
        board[1][3] = new Tile(new Position("d",2),new Pawn(Color.WHITE), TileColor.BLACK);
        board[1][4] = new Tile(new Position("e",2),new Pawn(Color.WHITE), TileColor.WHITE);
        board[1][5] = new Tile(new Position("f",2),new Pawn(Color.WHITE), TileColor.BLACK);
        board[1][6] = new Tile(new Position("g",2),new Pawn(Color.WHITE), TileColor.WHITE);
        board[1][7] = new Tile(new Position("h",2),new Pawn(Color.WHITE), TileColor.BLACK);
        //Row 3
        board[2][0] = new Tile(new Position("a",3),null, TileColor.BLACK);
        board[2][1] = new Tile(new Position("b",3),null, TileColor.WHITE);
        board[2][2] = new Tile(new Position("c",3),null, TileColor.BLACK);
        board[2][3] = new Tile(new Position("d",3),null, TileColor.WHITE);
        board[2][4] = new Tile(new Position("e",3),null, TileColor.BLACK);
        board[2][5] = new Tile(new Position("f",3),null, TileColor.WHITE);
        board[2][6] = new Tile(new Position("g",3),null, TileColor.BLACK);
        board[2][7] = new Tile(new Position("h",3),null, TileColor.WHITE);
        //Row 4
        board[3][0] = new Tile(new Position("a",4),null, TileColor.WHITE);
        board[3][1] = new Tile(new Position("b",4),null, TileColor.BLACK);
        board[3][2] = new Tile(new Position("c",4),null, TileColor.WHITE);
        board[3][3] = new Tile(new Position("d",4),null, TileColor.BLACK);
        board[3][4] = new Tile(new Position("e",4),null, TileColor.WHITE);
        board[3][5] = new Tile(new Position("f",4),null, TileColor.BLACK);
        board[3][6] = new Tile(new Position("g",4),null, TileColor.WHITE);
        board[3][7] = new Tile(new Position("h",4),null, TileColor.BLACK);
        //Row 5
        board[4][0] = new Tile(new Position("a",5),null, TileColor.BLACK);
        board[4][1] = new Tile(new Position("b",5),null, TileColor.WHITE);
        board[4][2] = new Tile(new Position("c",5),null, TileColor.BLACK);
        board[4][3] = new Tile(new Position("d",5),null, TileColor.WHITE);
        board[4][4] = new Tile(new Position("e",5),null, TileColor.BLACK);
        board[4][5] = new Tile(new Position("f",5),null, TileColor.WHITE);
        board[4][6] = new Tile(new Position("g",5),null, TileColor.BLACK);
        board[4][7] = new Tile(new Position("h",5),null, TileColor.WHITE);
        //Row 6
        board[5][0] = new Tile(new Position("a",6),null, TileColor.WHITE);
        board[5][1] = new Tile(new Position("b",6),null, TileColor.BLACK);
        board[5][2] = new Tile(new Position("c",6),null, TileColor.WHITE);
        board[5][3] = new Tile(new Position("d",6),null, TileColor.BLACK);
        board[5][4] = new Tile(new Position("e",6),null, TileColor.WHITE);
        board[5][5] = new Tile(new Position("f",6),null, TileColor.BLACK);
        board[5][6] = new Tile(new Position("g",6),null, TileColor.WHITE);
        board[5][7] = new Tile(new Position("h",6),null, TileColor.BLACK);
        //Row 7
        board[6][0] = new Tile(new Position("a",7),new Pawn(Color.BLACK), TileColor.BLACK);
        board[6][1] = new Tile(new Position("b",7),new Pawn(Color.BLACK), TileColor.WHITE);
        board[6][2] = new Tile(new Position("c",7),new Pawn(Color.BLACK), TileColor.BLACK);
        board[6][3] = new Tile(new Position("d",7),new Pawn(Color.BLACK), TileColor.WHITE);
        board[6][4] = new Tile(new Position("e",7),new Pawn(Color.BLACK), TileColor.BLACK);
        board[6][5] = new Tile(new Position("f",7),new Pawn(Color.BLACK), TileColor.WHITE);
        board[6][6] = new Tile(new Position("g",7),new Pawn(Color.BLACK), TileColor.BLACK);
        board[6][7] = new Tile(new Position("h",7),new Pawn(Color.BLACK), TileColor.WHITE);
        //Row 8
        board[7][0] = new Tile(new Position("a",8),new Rook(Color.BLACK),   TileColor.WHITE);
        board[7][1] = new Tile(new Position("b",8),new Knight(Color.BLACK), TileColor.BLACK);
        board[7][2] = new Tile(new Position("c",8),new Bishop(Color.BLACK), TileColor.WHITE);
        board[7][3] = new Tile(new Position("d",8),new Queen(Color.BLACK),  TileColor.BLACK);
        board[7][4] = new Tile(new Position("e",8),new King(Color.BLACK),   TileColor.WHITE);
        board[7][5] = new Tile(new Position("f",8),new Bishop(Color.BLACK), TileColor.BLACK);
        board[7][6] = new Tile(new Position("g",8),new Knight(Color.BLACK), TileColor.WHITE);
        board[7][7] = new Tile(new Position("h",8),new Rook(Color.BLACK),   TileColor.BLACK);

        return new Board(board);
    }

}
