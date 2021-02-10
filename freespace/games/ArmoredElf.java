
package ru.kamalov.freespace.games;

public class ArmoredElf extends Player implements Units{
    private int damage=15;
    private int health=150;
    private Units unit;

    public ArmoredElf(Units unit) {
        this.unit = unit;
    }
    
    @Override
    public Units makeUnit() {
        return new ArmoredElf(unit);
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
