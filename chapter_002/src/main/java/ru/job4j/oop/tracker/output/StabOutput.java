package ru.job4j.oop.tracker.output;

public class StabOutput implements Output{

    @Override
    public String outputSuccess () {
        return "Success";
    }
    @Override
    public String outputError () {
        return "Fail";
    }
}
