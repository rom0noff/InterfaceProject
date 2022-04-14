package uz.lesson9.model;

import uz.lesson9.interfacee.Switchable;

public class Technical implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("On");
    }

    @Override
    public void turnOff() {
        System.out.println("Off");
    }

    @Override
    public void remont() {
        System.out.println("Meni remont qil...");
    }

}
