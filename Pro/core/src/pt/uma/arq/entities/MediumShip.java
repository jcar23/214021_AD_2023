package pt.uma.arq.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

import java.awt.*;

public class MediumShip extends Ship{
    private Animator animator;
    private int x, y;
    Laser laser;

    public MediumShip(SpriteBatch batch, int x, int y){
        this.animator = new Animator(batch, "enemy-medium.png", 2, 1);
        this.x = x;
        this.y = y;
        this.batch = batch;
        animator.create();
        boundingBox = new Rectangle(x , y, animator.getWidth(), animator.getHeight());
    }
    @Override
    public void shoot() {
        laser = new Laser(this.x, this.y + 5, batch, false);
        this.boundingBox.setLocation(x,y);
    }

    @Override
    public void exploding() {
        Explosion explosion = new Explosion(this.x, this.y, batch);
    }

    public void create(){
        this.animator.create();
    }



    public void render(){

        this.animator.render(this.x, this.y);
        if (laser != null){
            laser.render();
        }
        this.boundingBox.setLocation(x,y);

    }
}
