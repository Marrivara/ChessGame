package Game.Main;
public class Game implements Runnable{

    GamePanel gamePanel;
    GameWindow gameWindow;
    Thread gameThread;
    private final int MAX_FPS = 120;

    public Game(){
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
        gamePanel.setFocusable(true);
        gamePanel.requestFocus();
        //startGameLoop();
    }

    private void startGameLoop(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    @Override
    public void run() {

        double timePerFrame = 1000000000.0 / MAX_FPS;
        double lastTime = System.nanoTime();
        long now ;

        int frames = 0;
        double lastCheck = System.currentTimeMillis();

        while(true){
            now = System.nanoTime();
            if(now - lastTime >= timePerFrame){
                lastTime = now;
                gamePanel.repaint();
                frames++;
            }

            if(System.currentTimeMillis() - lastCheck >= 1000){
                lastCheck = (System.currentTimeMillis());
                //System.out.println("FPS:" + frames);
                frames = 0;
            }
        }
    }
}
