package uz.lesson9;

import uz.lesson9.child.Student;
import uz.lesson9.model.*;

public class MainPolly {
    public static void main(String[] args) {

        Product product = new Product();
        product.made = "Uzbekistan";
        product.price = 234.2;
        System.out.println(product.toString());

        Electronics electronics = new Electronics();
        electronics.mark = 23;
        electronics.volt = 12;
        System.out.println(electronics.toString());

        Technical technical = new Technical();
        technical.turnOn();
        technical.remont();

        Worker worker = new Worker();
        worker.working();
        worker.salary();
        worker.eating();
        worker.sayr();
        worker.sleep();

        Animal animal = new Animal();
        animal.eating();
        animal.sayr();
        animal.sleep();

        People people = new People();
        people.name();
        people.familya();
        people.millat();

        animal.eye();
        animal.voice();

        Student student = new Student();
        student.university();
        student.stipendiya();

    }
}
