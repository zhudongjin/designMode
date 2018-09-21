package com.designmode.command;

public  class ConcreteCommand1  extends Command{

    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver_){
        this.receiver = receiver_;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}
