package pt.uma.arq.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

import java.awt.*;
//import java.util.ArrayList;

public class Explosion {

    public Rectangle boundingBox;
    private int x, y;
    private Animator animator;
    private SpriteBatch batch;
    private Ship ships;

    //private ArrayList<Explosion> explosionsList;
    public Explosion (int x, int y, SpriteBatch batch){
        this.animator = new Animator(batch, "explosion.png", 2, 1);
        this.batch = batch;
        animator.create();
        boundingBox = new Rectangle(this.x, this.y, animator.getWidth(), animator.getHeight());
    }

    public void create(){
        this.animator.create();
        /*
        for (int i = 0; i < 3; i++) {
            Explosion explosion1 = new Explosion(batch,ships.x,ships.y);
            explosion1.create();
            explosionsList.add(explosion1);
        }

         */
    }

    public void render() {
        this.animator.render(x, y);
        this.boundingBox.setLocation(x,y);

    }

    public Rectangle getBoundingBox() {
        return boundingBox;
    }
}