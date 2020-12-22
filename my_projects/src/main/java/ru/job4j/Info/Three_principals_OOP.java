package ru.job4j.Info;

import java.util.Date;

public class Three_principals_OOP {
    // поля, private могут быть public
    private String model;
    private String color;
    private int production_date;

    // конструктор
    Three_principals_OOP(String marka, String color, int production_date){
        model = marka;
        this.color = color;
        this.production_date = production_date;
    }

    // конструктор с 2я параметрами
    public Three_principals_OOP(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Getter & Setter, могут быть private и соответсвенно быть доступны только наследникам,
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProduction_date() {
        return production_date;
    }

    public void setProduction_date(int production_date) {
        this.production_date = production_date;
    }
}
