package pt.uma.arq.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

import java.util.ArrayList;
import java.util.*;


import  com.badlogic.gdx.utils.Timer;

public class Fleet {
    SmallShip smallShip;
    private int x, y;
    private Animator animator;
    protected ArrayList<Ship> ships;
    private SpriteBatch batch;
    Timer timer;

    public Fleet(SpriteBatch batch) {
        this.batch = batch;
        this.ships = new ArrayList<Ship>();
        this.x = x;
        this.y = y;
        timer = new Timer();
    }

    public void create() {

        timer.scheduleTask(new Timer.Task() {
            @Override
            public void run() {
                shootRandomly();
                exploding();
            }
        }, 1, 1, -1);
        // 3 for;
        int small = 100;
        int medium = 50;
        int large = 50;

        for (int i = 0; i < 8; i++) {
            Ship smallShip = new SmallShip(batch, small, 400);
            smallShip.create();
            ships.add(smallShip);
            small = small + 40;
        }
        for (int i = 0; i < 8; i++) {
            Ship mediumShip = new MediumShip(batch, medium + 5, 550);
            mediumShip.create();
            ships.add(mediumShip);
            medium = medium + 60;
        }
        for (int i = 0; i < 8; i++) {
            Ship largeShip = new LargeShip(batch, large, 650);
            largeShip.create();
            ships.add(largeShip);
            large = large + 60;
        }
    }
    private void exploding() {
    }
    public void shootRandomly() {
        Random random = new Random();
        int index = random.nextInt(ships.size());
        ships.get(index).shoot();
    }

    public void render() {
        for (Ship smallShip : ships) {
            smallShip.render();
        }
        for (Ship mediumShip : ships) {
            mediumShip.render();
        }
        for (Ship largeShip : ships) {
            largeShip.render();
        }
    }
    public void collision(PlayerShip player) {
        Iterator<Ship> shipIterator = ships.iterator();
        while (shipIterator.hasNext()){
            Ship ship = shipIterator.next();
            if (player.laser != null) {
                if (player.laser.boundingBox.intersects(ship.boundingBox)) {
                    shipIterator.remove();
                    player.setScore(player.getScore()+20);
                }
            }

        }
    }
    public void ships_PlayerCollision(PlayerShip player){
        Iterator<Ship> shipIterator2 = ships.iterator();
        while (shipIterator2.hasNext()){
            Ship ship = shipIterator2.next();
            if (player.laser != null && ship.laser != null) {
                if (ship.laser.boundingBox.intersects(player.boundingBox)) {
                    player.setPlayerHealth(player.getPlayerHealth()-5);
                }
            }

        }
    }
}