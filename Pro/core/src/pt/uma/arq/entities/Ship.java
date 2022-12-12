package pt.uma.arq.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;
import java.awt.*;

public  abstract class  Ship {
   protected  Laser laser;
   protected Animator animator;
   protected int x,y;
   protected Rectangle boundingBox;
   protected SpriteBatch batch;

   public void setLocation(int x, int y){
      this.x = x;
      this.y = y;
      this.boundingBox.setLocation(x, y);
   }
     public void create(){
      animator.create();

   }
   public void render() {
      this.animator.render(this.x, this.y);
      this.boundingBox.setLocation(x,y);
   }

   public abstract void shoot();

   public abstract void exploding();


}
