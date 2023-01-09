package Mechanics;

import Mechanics.Interfaces.PieceInterface;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public abstract class Piece implements PieceInterface {
    private Tile[] movableTiles;

    private BufferedImage pieceImages;
    private BufferedImage pieceImage;

    private Color color;
    private int pieceMoved = 0;

    public abstract void setMovable(Board board, Tile tile);
    public int getPieceMoved(){return pieceMoved;}
    public Piece(Color color){this.color = color;}
    protected BufferedImage importIMG() {
        InputStream is = getClass().getResourceAsStream("/Pieces.png");

        try {
            pieceImages = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pieceImages;

    }
    public void increasePieceMoved(){pieceMoved++;}
    public BufferedImage getPieceImage(){return pieceImage;}
    public void setPieceImage(BufferedImage image){this.pieceImage = image;}

    public boolean isMovable(Tile tileToMove){
        for(Tile tile: movableTiles) {
            if (tile.equals(tileToMove)) {
                return true;
            }
        }return false;
    }
    public Color getColor(){return color;}

    public void paintMovableTiles(){
        for(Tile tile: movableTiles){
            tile.changeSelected();
        }
    }
    public Tile[] getMovableTiles(){
        return movableTiles;
    }
    public abstract String getName();
    public void setMovableTiles(Tile[] movableTiles){
        this.movableTiles = movableTiles;
    }


}
