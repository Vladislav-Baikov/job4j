package ru.job4j.Project_DPS;

public class Party {

    public double dps(Melee m1) {
        double result = 0;
        result = (m1.getAtkDamage() / m1.getAtkSpeed()) + (m1.getCrtChance() * m1.getAtkDamage() * (m1.getCrtDamage() / 100) / (m1.getAtkSpeed() * m1.getCrtChance())) / m1.getAtkSpeed(); //- (m1.getMissChance() * m1.getAtkDamage() / m1.getAtkSpeed());
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        // Melee (int atkDamage, int atkSpeed, int crtChance, int crtDamage, int missChance )
        Melee partyMember1 = new Melee(1000, 2, 18, 200, 5);
        Melee partyMember2 = new Melee(1500, 1.9, 22, 220, 4.7);
        Range partyMember3 = new Range(1200, 2.5, 25, 200, 5.5);
        Range partyMember4 = new Range(1600, 2.4, 30, 230, 4.8);
        Range partyMember5 = new Range(1300, 2.4, 27, 210, 4.9);
        Party p1 = new Party();
        p1.dps(partyMember1);
    }
}

