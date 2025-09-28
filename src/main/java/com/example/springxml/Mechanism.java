package com.example.springxml;

public class Mechanism {
    private final String name;
    private final Actuator actuator;
    private double calibration;

    public Mechanism(String name, Actuator actuator) {
        this.name = name;
        this.actuator = actuator;
    }

    public void setCalibration(double calibration) {
        this.calibration = calibration;
    }

    public void perform() {
        String info = actuator.actuate();
        System.out.println("Mechanism '" + name + "' performing with calibration " + calibration);
        System.out.println(" -> " + info);
    }
}
