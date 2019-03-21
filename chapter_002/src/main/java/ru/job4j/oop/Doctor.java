package ru.job4j.oop;

public class Doctor extends Profession {
    public Doctor(String name, String profession) {
        super(name, profession);
    }
    public Diagnose heal() {
        Diagnose diagnose = new Diagnose();
        return diagnose;
    }
}
