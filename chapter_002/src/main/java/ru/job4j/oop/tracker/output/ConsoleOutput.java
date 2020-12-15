package ru.job4j.oop.tracker.output;

public class ConsoleOutput implements Output {
    public String successMassage;
    public String errorMassage;

    public ConsoleOutput(String successMassage, String errorMassage) {
        this.successMassage = successMassage;
        this.errorMassage = errorMassage;
    }

    @Override
    public String outputSuccess () {
        System.out.println(successMassage);
        return successMassage;
    }
    @Override
    public String outputError () {
        System.out.println(errorMassage);
        return errorMassage;
    }
}
