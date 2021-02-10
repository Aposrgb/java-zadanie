
package ru.kamalov.freespace.games;

public class AgileElf extends Player implements Units{
    private int damage=35;
    private int health=80;
    private Units unit;

    public AgileElf(Units unit) {
        this.unit = unit;
    }
    
    @Override
    public Units makeUnit() {
        return new AgileElf(unit);
    }
    
    @Override
    public Spell makeSpell(Units unit) {
        return null;
    }

    @Override
    public int attack() {
        return damage;
    }

    @Override
    public boolean defend(int damage) {
        health-=damage;
        return true;
    }
    
}
