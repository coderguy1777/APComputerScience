package AutonomousRobotProject;

import javafx.application.Application;

public class RandomBot extends Main {
    public int robotcount;
    static int time = 0;
    public double robothealth = 200.0;
    public String robotname;

    public RandomBot(String rname, int rcount) {
        robotcount = rcount;
        robotname = rname;
    }

    public void setRobotcount(int rcount) {
        robotcount = rcount;
    }

    public void setRobothealth() {
        robothealth = 200.0;
    }

    public void setRobotname(String rname) {
        robotname = rname;
    }

    public void setTime() {
        time = 0;
    }

    public int getRobotcount(int robotcount) {
        return robotcount;
}
}
