package uz.lesson9.model;

import uz.lesson9.interfacee.Jonzot;
import uz.lesson9.interfacee.Odam;

public class People implements Odam, Jonzot {
    @Override
    public void name() {
        System.out.println("Ronaldo");
    }

    @Override
    public void familya() {
        System.out.println("Cristiano");
    }

    @Override
    public void millat() {
        System.out.println("Portugal");
    }

    @Override
    public void eating() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void sayr() {

    }
}
