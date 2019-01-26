package AutonomousRobotProject;
import javafx.util.*;
import javafx.scene.*;
import javafx.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;

public abstract class Sprite {

    public Box player;
    static double playerwidth = 60.0;
    static double playerheight = 10.0;
    public double dxspeed;
    public double dyspeed;
    public int speedlossx;
    public float gravity;
    public int speedlossy;

    public Sprite(int speedlossx, int speedlossy, double dxspeed, double dyspeed, Box player, float gravity) {
        this.speedlossx = speedlossx;
        this.speedlossy = speedlossy;
        this.dxspeed = dxspeed;
        this.dyspeed = dyspeed;
        this.player = player;
        this.gravity = gravity;
    }

    public void setSpeedlossx(int slossx) {
        this.speedlossx = slossx;
    }

    public void setSpeedlossy(int slossy) {
        this.speedlossy = slossy;
    }
}

