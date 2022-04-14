package uz.lesson9.model;

import uz.lesson9.interfacee.Jonzot;
import uz.lesson9.interfacee.Work;

public class Worker implements Work, Jonzot {
    @Override
    public void working() {
        System.out.println("I'm working");
    }

    @Override
    public void salary() {
        System.out.println("123$");
    }

    @Override
    public void eating() {
        System.out.println("I'm food eating");
    }

    @Override
    public void sleep() {
        System.out.println("Ular uxlayapdi.");
    }

    @Override
    public void sayr() {
        System.out.println("Biz sayr qilyapmiz..");
    }
}
