package com.example.springxml;

public class HydraulicActuator implements Actuator {
    private final double pressure;

    public HydraulicActuator(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public String actuate() {
        return String.format("Hydraulic actuator with pressure %.2f bar", pressure);
    }

    public double getPressure() {
        return pressure;
    }
}
