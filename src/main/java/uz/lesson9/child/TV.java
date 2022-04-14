package uz.lesson9.child;

import uz.lesson9.interfacee.Pult;
import uz.lesson9.model.Product;
import uz.lesson9.model.Technical;

public class TV extends Product implements Pult {
    public boolean pult; //true or false

    @Override
    public void canalChange() {

    }

    @Override
    public void volumeChange() {

    }

    @Override
    public void settingChange() {

    }
}
