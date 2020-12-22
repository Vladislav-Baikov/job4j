package ru.job4j.Info;

public class Nasledovanie extends Three_principals_OOP {
    private String type;

    Nasledovanie(String marka, String color, int production_date, String type) {
        super(marka, color, production_date);
        this.type = type;
    }
}
