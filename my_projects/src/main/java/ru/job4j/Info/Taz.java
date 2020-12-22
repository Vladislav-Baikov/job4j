package ru.job4j.Info;

public class Taz implements Acceleration{
    @Override
    public void start() {
        System.out.println("не стартовала");
    }

    public static void main(String[] args) {
        Sport_car sport_car = new Sport_car();
        Taz taz = new Taz();
        sport_car.start();
        taz.start();
    }
}
