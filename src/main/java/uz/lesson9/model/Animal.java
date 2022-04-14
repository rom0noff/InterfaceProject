package uz.lesson9.model;

import uz.lesson9.interfacee.Hayvon;
import uz.lesson9.interfacee.Jonzot;

public class Animal implements Jonzot, Hayvon {
    @Override
    public void eating() {
        System.out.println("ovqatlanyapdi");
    }

    @Override
    public void sleep() {
        System.out.println("uxlayapdi");
    }

    @Override
    public void sayr() {
        System.out.println("sayr qilyapdi");
    }

    @Override
    public void eye() {
        System.out.println("2 ta ko'zi bor.");
    }

    @Override
    public void voice() {
        System.out.println("vov vov vov");
    }

}
