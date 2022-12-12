package pt.uma.arq.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

import java.awt.*;

public class PlayerShip extends Ship {
    Laser laser;
    private int score;
    private int playerHealth;
    private Fleet ships;
    public Rectangle boundingBox;
    Explosion explosion;


    public PlayerShip(SpriteBatch batch){
        this.animator = new Animator(batch, "ship.png",  5,2);
        this.x = Gdx.graphics.getWidth() / 2;
        this.y = 2;
        this.playerHealth = 50;
        this.score = 0;
        this.batch = batch;
        this.animator.create();
        this.boundingBox = new Rectangle(x , y, animator.getWidth(), animator.getHeight());

    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void setPlayerHealth(int health) {
        this.playerHealth = playerHealth;
    }
    public int getPlayerHealth() {
        return playerHealth;
    }
    public void create(){
        this.animator.create();
    }

    public void KeyInputs() {
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            x -= 5;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            x += 5;
        }
        this.boundingBox.setLocation(x,y);
    }

    public void render(){
        this.animator.render(x, y);
        if (laser != null){
            laser.render();
        }
        this.boundingBox.setLocation(x,y);

    }

    @Override
    public void shoot() {
        if (Gdx.input.isKeyPressed(Input.Keys.SPACE)){
            laser = new Laser(this.x, this.y+3, batch, true);
        }
        this.boundingBox.setLocation(x,y);
    }

    @Override
    public void exploding() {
        explosion = new Explosion(this.x,this.y,batch);
    }

}