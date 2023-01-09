package Mechanics;

import Mechanics.Enums.TileColor;
import Mechanics.Pieces.*;

import java.awt.*;

public class PiecePlacer {
    public static Board place(){
        Tile[][] board = new Tile[8][8];

        Color darkBrown = new Color(177,110,65);
        Color lightBrown = new Color(255,213,153);
        //Row 1
        board[0][0] = new Tile(new Position("a",1),new Rook(Color.WHITE),   darkBrown);
        board[0][1] = new Tile(new Position("b",1),new Knight(Color.WHITE), lightBrown);
        board[0][2] = new Tile(new Position("c",1),new Bishop(Color.WHITE), darkBrown);
        board[0][3] = new Tile(new Position("d",1),new Queen(Color.WHITE),  lightBrown);
        board[0][4] = new Tile(new Position("e",1),new King(Color.WHITE),   darkBrown);
        board[0][5] = new Tile(new Position("f",1),new Bishop(Color.WHITE), lightBrown);
        board[0][6] = new Tile(new Position("g",1),new Knight(Color.WHITE), darkBrown);
        board[0][7] = new Tile(new Position("h",1),new Rook(Color.WHITE),   lightBrown);
        //Row 2
        board[1][0] = new Tile(new Position("a",2),new Pawn(Color.WHITE), lightBrown);
        board[1][1] = new Tile(new Position("b",2),new Pawn(Color.WHITE), darkBrown);
        board[1][2] = new Tile(new Position("c",2),new Pawn(Color.WHITE), lightBrown);
        board[1][3] = new Tile(new Position("d",2),new Pawn(Color.WHITE), darkBrown);
        board[1][4] = new Tile(new Position("e",2),new Pawn(Color.WHITE), lightBrown);
        board[1][5] = new Tile(new Position("f",2),new Pawn(Color.WHITE), darkBrown);
        board[1][6] = new Tile(new Position("g",2),new Pawn(Color.WHITE), lightBrown);
        board[1][7] = new Tile(new Position("h",2),new Pawn(Color.WHITE), darkBrown);
        //Row 3
        board[2][0] = new Tile(new Position("a",3),null, darkBrown);
        board[2][1] = new Tile(new Position("b",3),null, lightBrown);
        board[2][2] = new Tile(new Position("c",3),null, darkBrown);
        board[2][3] = new Tile(new Position("d",3),null, lightBrown);
        board[2][4] = new Tile(new Position("e",3),null, darkBrown);
        board[2][5] = new Tile(new Position("f",3),null, lightBrown);
        board[2][6] = new Tile(new Position("g",3),null, darkBrown);
        board[2][7] = new Tile(new Position("h",3),null, lightBrown);
        //Row 4
        board[3][0] = new Tile(new Position("a",4),null, lightBrown);
        board[3][1] = new Tile(new Position("b",4),null, darkBrown);
        board[3][2] = new Tile(new Position("c",4),null, lightBrown);
        board[3][3] = new Tile(new Position("d",4),null , darkBrown);
        board[3][4] = new Tile(new Position("e",4),null, lightBrown);
        board[3][5] = new Tile(new Position("f",4),null, darkBrown);
        board[3][6] = new Tile(new Position("g",4),null, lightBrown);
        board[3][7] = new Tile(new Position("h",4),null, darkBrown);
        //Row 5
        board[4][0] = new Tile(new Position("a",5),null, darkBrown);
        board[4][1] = new Tile(new Position("b",5),null, lightBrown);
        board[4][2] = new Tile(new Position("c",5),null, darkBrown);
        board[4][3] = new Tile(new Position("d",5),null, lightBrown);
        board[4][4] = new Tile(new Position("e",5),null, darkBrown);
        board[4][5] = new Tile(new Position("f",5),null, lightBrown);
        board[4][6] = new Tile(new Position("g",5),null, darkBrown);
        board[4][7] = new Tile(new Position("h",5),null, lightBrown);
        //Row 6
        board[5][0] = new Tile(new Position("a",6),null, lightBrown);
        board[5][1] = new Tile(new Position("b",6),null, darkBrown);
        board[5][2] = new Tile(new Position("c",6),null, lightBrown);
        board[5][3] = new Tile(new Position("d",6),null, darkBrown);
        board[5][4] = new Tile(new Position("e",6),null, lightBrown);
        board[5][5] = new Tile(new Position("f",6),null, darkBrown);
        board[5][6] = new Tile(new Position("g",6),null, lightBrown);
        board[5][7] = new Tile(new Position("h",6),null, darkBrown);
        //Row 7
        board[6][0] = new Tile(new Position("a",7),new Pawn(Color.BLACK), darkBrown);
        board[6][1] = new Tile(new Position("b",7),new Pawn(Color.BLACK), lightBrown);
        board[6][2] = new Tile(new Position("c",7),new Pawn(Color.BLACK), darkBrown);
        board[6][3] = new Tile(new Position("d",7),new Pawn(Color.BLACK), lightBrown);
        board[6][4] = new Tile(new Position("e",7),new Pawn(Color.BLACK), darkBrown);
        board[6][5] = new Tile(new Position("f",7),new Pawn(Color.BLACK), lightBrown);
        board[6][6] = new Tile(new Position("g",7),new Pawn(Color.BLACK), darkBrown);
        board[6][7] = new Tile(new Position("h",7),new Pawn(Color.BLACK), lightBrown);
        //Row 8
        board[7][0] = new Tile(new Position("a",8),new Rook(Color.BLACK),   lightBrown);
        board[7][1] = new Tile(new Position("b",8),new Knight(Color.BLACK), darkBrown);
        board[7][2] = new Tile(new Position("c",8),new Bishop(Color.BLACK), lightBrown);
        board[7][3] = new Tile(new Position("d",8),new Queen(Color.BLACK),  darkBrown);
        board[7][4] = new Tile(new Position("e",8),new King(Color.BLACK),   lightBrown);
        board[7][5] = new Tile(new Position("f",8),new Bishop(Color.BLACK), darkBrown);
        board[7][6] = new Tile(new Position("g",8),new Knight(Color.BLACK), lightBrown);
        board[7][7] = new Tile(new Position("h",8),new Rook(Color.BLACK),   darkBrown);

        return new Board(board);
    }

}
