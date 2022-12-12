package pt.uma.arq.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;


import java.awt.*;

public class Laser {

    public Rectangle boundingBox;
    private int x, y;
    private boolean direction;
    private Animator animator;

    public Laser (int x, int y, SpriteBatch batch, boolean direction ){
        this.direction = direction;
        this.x = x;
        this.y = y;
        this.animator = new Animator(batch, "laser-bolts.png", 2, 1);
        animator.create();
        boundingBox = new Rectangle(x , y, animator.getWidth(), animator.getHeight());
    }

    public void create(){
        this.animator.create();
    }

    public void render() {
        if (direction) {
            y += 15;
        }
        else {
            y -= 5;

        }
        this.animator.render(x, y);
        this.boundingBox.setLocation(x,y);


    }

}