package pt.uma.arq.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

import java.awt.*;

public class LargeShip extends Ship{
    Laser laser;
    private Animator animator;

    private int x, y;
    private Explosion explosion;


    public LargeShip(SpriteBatch batch, int x, int y){
        this.animator = new Animator(batch, "enemy-big.png", 2, 1);
        this.x = x;
        this.y = y;
        this.batch = batch;
        animator.create();
        boundingBox = new Rectangle(x , y, animator.getWidth(), animator.getHeight());
    }

    public void create(){
        this.animator.create();
    }

    @Override
    public void shoot() {
        laser = new Laser(this.x-=19, this.y+15, batch, false);
        this.boundingBox.setLocation(x,y);

    }

    @Override
    public void exploding() {
        explosion = new Explosion(this.x,this.y,batch);
    }

    public void render(){
        this.animator.render(this.x, this.y);
        if (laser != null){
            laser.render();
        }
        this.boundingBox.setLocation(x,y);

    }
}
