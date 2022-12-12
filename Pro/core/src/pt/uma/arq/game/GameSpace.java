package pt.uma.arq.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import pt.uma.arq.entities.*;

public class GameSpace extends ApplicationAdapter {
    private SpriteBatch batch;
    //private Vector2 position;
    private BackgroundManagement backgroundManagement;
    private BitmapFont font;
    private PlayerShip player;
    private Fleet ships;





    @Override
    public void create() {
        Gdx.graphics.setWindowedMode(600, 800);
        batch = new SpriteBatch();
        ships = new Fleet(batch);
        font = new BitmapFont(Gdx.files.internal("gamefont.fnt"),
                Gdx.files.internal("gamefont.png"), false);
        backgroundManagement = new BackgroundManagement(batch);
        //position = new Vector2();
        player = new PlayerShip(batch);
        player.create();
        ships.create();
    }

    @Override
    public void render() {
        batch.begin();
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        backgroundManagement.render();
        //
        player.render();
        player.KeyInputs();
        ships.render();
        player.shoot();
        ships.collision(player);
        ships.ships_PlayerCollision(player);

        font.draw(batch,"Score: "+ player.getScore(),55,780);
        font.setColor(0, 0, 0, 1.5f);
        font.draw(batch,"Health:" + player.getPlayerHealth(),350,780);
        if (player.getScore() == 480){
            font.setColor(0,128,0,0.8f);
            font.draw(batch,"Congratulations, You Won",150,350);
        }
        else if(player.getPlayerHealth() <= 0){
            font.setColor(255,0,0,1.0f);
            font.draw(batch,"Game Over",150,350);
        }

        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}