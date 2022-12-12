package pt.uma.arq.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.entities.PlayerShip;

public class BackgroundManagement {

    private Texture background;
    private Sprite sprite;
    //private PlayerShip player;
    SpriteBatch spriteBatch;

    public BackgroundManagement(SpriteBatch batch) {
        this.spriteBatch = batch;
        background = new Texture("space.png");
        sprite = new Sprite(background);
        sprite.setPosition(0, 0);

    }

    public void render() {
        sprite.draw(spriteBatch);
    }

}
