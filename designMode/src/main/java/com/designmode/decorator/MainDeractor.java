package com.designmode.decorator;

public class MainDeractor {
    public static void main(String[] args) {
        Shreddedcake sg=new Shreddedcake();
        System.out.println(sg.descripestion()+" "+sg.money());

        EggshrededCake ec=new EggshrededCake(sg);
        System.out.println(ec.descripestion()+" "+ec.money());

        Beffshredded bf=new Beffshredded(sg);
        System.out.println(bf.descripestion()+" "+bf.money());
    }
}
