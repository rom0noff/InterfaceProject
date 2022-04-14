package uz.lesson9.model;

public class Electronics extends Product{
    public double volt;
    public double mark;

    @Override
    public String toString() {
        return "Electronics{" +
                "volt=" + volt +
                ", mark=" + mark +
                '}';
    }
}
