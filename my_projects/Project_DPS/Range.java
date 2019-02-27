package ru.job4j.Project_DPS;

public class Range {
    private int atkDamage;
    private double atkSpeed;
    private double crtChance;
    private int crtDamage;
    private double missChance;

    public Range (int atkDamage, double atkSpeed, double crtChance, int crtDamage, double missChance ){
        this.atkDamage = atkDamage;
        this.atkSpeed = atkSpeed;
        this.crtChance = crtChance;
        this.crtDamage = crtDamage;
        this.missChance = missChance;
    }
}
