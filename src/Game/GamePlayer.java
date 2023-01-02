package Game;

import java.util.Scanner;
import java.util.StringTokenizer;

public class GamePlayer {
    public void startTheGame(){
        Board board = PiecePlacer.place();

        board.placeTheMovables(board);

        Scanner myObj = new Scanner(System.in);
        String input = "";
        while(true) {
            System.out.println(board);
            System.out.println("Enter the tiles:");
            input = myObj.nextLine();
            if (input.equals("q")){break;}
            //System.out.println("Input is: " + input);

            try {
                StringTokenizer st = new StringTokenizer(input, " ");
                board.movePiece(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

        }
    }
}
