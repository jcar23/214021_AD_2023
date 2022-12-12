package pt.uma.arq.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

import java.awt.*;


public class SmallShip extends Ship{
    SpriteBatch batch;
    private Animator animator;
    private int x, y;
    Laser laser;
    private Explosion explosion;

    public SmallShip(SpriteBatch batch, int x, int y){

        this.animator = new Animator(batch, "enemy-small.png", 2, 1);
        this.x = x;
        this.y = y;
        this.batch = batch;
        animator.create();
        boundingBox = new Rectangle(x , y, animator.getWidth(), animator.getHeight());
    }

    @Override
    public void shoot() {
        laser = new Laser(this.x, this.y + 5, batch, false);
    }

    @Override
    public void exploding() {
        explosion = new Explosion(this.x,this.y,batch);
    }

    public void create(){
        this.animator.create();
    }

    public void render(){
        this.animator.render(this.x, this.y);
        if (laser != null) {
            laser.render();
        }
        this.boundingBox.setLocation(x,y);

    }
}