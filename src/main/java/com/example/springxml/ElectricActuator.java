package com.example.springxml;

public class ElectricActuator implements Actuator {
    private final int voltage;

    public ElectricActuator(int voltage) {
        this.voltage = voltage;
    }

    @Override
    public String actuate() {
        return "Electric actuator with voltage " + voltage + "V";
    }

    public int getVoltage() {
        return voltage;
    }
}
