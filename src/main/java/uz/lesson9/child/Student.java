package uz.lesson9.child;

import uz.lesson9.interfacee.Talaba;
import uz.lesson9.model.People;

public class Student extends People implements Talaba {
    @Override
    public void university() {
        System.out.println("INHA");
    }

    @Override
    public void stipendiya() {
        System.out.println("100$");
    }
}
