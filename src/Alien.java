import java.util.ArrayList;

public class Alien extends Sprite implements Commons{
    public int health = 1;
    public int speed = 5;
    public int direction = 0; // 0 means going left
    public int [][]Buffer = new int[6][2];
    private boolean head = false;

    Alien(int x, int y){
        super(x,y);
        initAlien();
    }

    private void initAlien(){
        loadImage("src/images/centipede.png");
        getImageDimensions();
    }

}
