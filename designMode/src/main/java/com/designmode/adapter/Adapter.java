package com.designmode.adapter;

public class Adapter implements Power,Computer {

    private Power power;

    private Computer computer;

    public Adapter(Power power){
        super();
        this.power = power;
    }

    public Adapter(Computer computer){
        super();
        this.computer = computer;
    }

    @Override
    public void battery() {
        power.electric();
    }

    @Override
    public void electric() {
        computer.battery();
    }
}
