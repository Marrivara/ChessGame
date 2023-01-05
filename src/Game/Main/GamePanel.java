package Game.Main;

import Game.Inputs.KeyboardInputs;
import Game.Inputs.MouseInputs;
import Mechanics.Board;
import Mechanics.Piece;
import Mechanics.PiecePlacer;
import Mechanics.Tile;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class GamePanel extends JPanel{
    private MouseInputs mouseInputs;
    private BufferedImage img;
    private BufferedImage[][] bufferedImages;
    private Color tileColor;
    private Board board;
    private Tile fromTile;
    private Tile toTile;
    private int[] selected;
    private int selectedCount = 0;

    public GamePanel(){
        selected = new int[4];
        board = PiecePlacer.place();
        board.placeTheMovables(board);
        mouseInputs = new MouseInputs(this);
        importIMG();
        
        setPanelSize();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }
    private void importIMG() {
        InputStream is = getClass().getResourceAsStream("/Pieces.png");

        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
//    public void mouseClick(int x, int y){
//        Tile tileClicked = board.getTile((int) Math.ceil(x / 92.0), (int) Math.ceil(y / 92.0));
//        if(fromTile == null && board.) {
//            fromTile = tileClicked;
//        } else if (toTile == null || ) {
//            toTile = tileClicked;
//        }
//    }
    public void mouseClick(int x, int y){
        Tile tileClicked = board.getTile((int) Math.ceil(x / 92.0), (int) Math.ceil(y / 92.0));
        System.out.println("Ekledi" + tileClicked.getPosition().getPosition());
        System.out.println(selectedCount);
        selected[selectedCount] = ((int) Math.ceil(x / 92.0));
        selectedCount++;
        selected[selectedCount] = ((int) Math.ceil(y / 92.0));
        selectedCount++;
        if(selectedCount == 4){
            System.out.println("Girdi");
            try{
                board.movePiece(selected[1],selected[0],selected[3],selected[2]);

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            selected = new int[4];
            selectedCount = 0;
        }

        repaint();
    }

    private void setPanelSize(){
        Dimension size = new Dimension(736,736);
        setPreferredSize(size);

    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);


        for(int i = 0 ; i<6;i++){
            for(int j =  0; j<2; j++){
                g.drawImage(img.getSubimage(i*132,j*132,132,132), i*92, j*92,92,92,null);
            }
        }
        drawboard(g);

    }

    private void drawboard(Graphics g) {
        drawTiles(g);
        drawPieces(g);

    }

    private void drawPieces(Graphics g) {
        for(int i = 0 ; i<8;i++){
            for(int j =  0; j<8; j++){
                Piece piece =board.getTile(i + 1,j + 1).getPiece();
                if(piece != null) {
                    g.drawImage(piece.getPieceImage(), j * 92, i * 92, 92, 92, null);
                }
            }
        }
    }

    private void drawTiles(Graphics g) {
        for(int i = 0 ; i<8;i++){
            for(int j =  0; j<8; j++){
                g.setColor(board.getTileByInt(i,j).getColor());
                g.fillRect(j*92,i*92,92, 92);
            }
        }
    }

}
