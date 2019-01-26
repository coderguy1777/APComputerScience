package AutonomousRobotProject;
import sun.nio.ch.Net;

import java.util.*;

public class AIBot {
    static double neuralweights = (Math.random() * 10 - 20);
    public int layersize = 10;
    public int outputsize = 2;
    public int inputsize = 4;
    public int layer2size = 20;
    public int layer3size = 30;
    public ArrayList<Double>NetworkWeights = new ArrayList<>();
    public Map<String, Double>netmap = new HashMap<>();


    public AIBot(int layer2size, int layer3size, int layersize, int inputsize, int outputsize) {
        this.layersize = layersize;
        this.layer2size = layer2size;
        this.layer3size = layer3size;
        this.outputsize = outputsize;
        this.inputsize = inputsize;
    }

    public int sizecalclayers(int h1, int h2, int h3, int in1, int ou1) {
        return h1 + h2 + h3 / in1 + ou1;
    }


    public void weightRange(int wr) {
        for(double i = neuralweights; i < wr; i++) {
            NetworkWeights.add(i);
            if(i > wr) {
                wr = wr * 2;
            }
        }
    }

    public void setInputs(int in1) {
        this.inputsize = in1;
    }

    public void setLayersize(int h1) {
        this.layersize = h1;
    }

    public int volumecalculation(int h, int h1, int h2, int inputs, int outputs) {
        return h + h1 + h2 / inputs + outputs;
    }

}
