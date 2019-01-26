package AutonomousRobotProject;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.security.Key;

public class WorldPhysics {
    static int worldheight;
    static int worldwidth;
    public double speedx = 5.0;
    public double speedy = 5.0;
    public double currentspeed;
    public KeyCode keyx = KeyCode.X;
    public KeyCode keyshift = KeyCode.SHIFT;
    public KeyCode keyy = KeyCode.Y;

    public double quickspeedx = 5.0 + speedx;
    public double quickspeedy = 5.0 + speedy;
    public double gravity = 9.8;

    public void setWorldheight(int h) {
        worldheight = h;
    }

    public void setWorldwidth(int w) {
        worldwidth = w;
    }

    public void setCurrentspeed(double s) {
        currentspeed = s;
    }

    public double getCurrentspeed() {
        return currentspeed;
    }

    public void worldspeed(KeyCode key1, KeyCode key2, KeyEvent event) {
        KeyCode test = event.getCode();
        keyx = key1;
        keyy = key2;
        if(test==key1) {
            currentspeed += speedx * gravity/2;
        }
        if(test==key2) {
            currentspeed += speedy * gravity/2;
        }
        if(test==keyshift && test==key1) {
            currentspeed += speedx * quickspeedx * gravity/2;
            if(test == null) {
                currentspeed += 0.0;
            }
        }
    }
}
