package org.example;

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        NueralNetwork network = new NueralNetwork(2);
        double[] inputs = {0.5, 0.8};
        double output = network.feedForward(inputs);
        System.out.println("Output: " + output);
    }
}