package com.lab.arduino.dht;

public abstract class Callback {
    private boolean relayValue;
    public abstract void getValue(String fulldata);
    public void setRelayValue() {
        relayValue = !relayValue;
    }
    public boolean getRelayValue() {
        return relayValue;
    }
}
