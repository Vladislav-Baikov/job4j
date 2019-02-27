package ru.job4j.Project_DPS;

public class Melee {
    private int atkDamage;
    private double atkSpeed;
    private double crtChance;
    private int crtDamage;
    private double missChance;

    public int getAtkDamage() {
        return atkDamage;
    }

    public double getAtkSpeed() {
        return atkSpeed;
    }

    public double getCrtChance() {
        return crtChance;
    }

    public int getCrtDamage() {
        return crtDamage;
    }

    public double getMissChance() {
        return missChance;
    }

    public Melee (int atkDamage, double atkSpeed, double crtChance, int crtDamage, double missChance ){
        this.atkDamage = atkDamage;
        this.atkSpeed = atkSpeed;
        this.crtChance = crtChance;
        this.crtDamage = crtDamage;
        this.missChance = missChance;
    }
}