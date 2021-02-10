
package ru.kamalov.freespace.games;

public class ArmorDecorator extends WarUnitDecorator{
    public ArmorDecorator(Units unit) {
        super(unit);
    }

    @Override
    public int attack() {
        return unit.attack();
    }

    @Override
    public boolean defend(int damage) {
        return unit.attack()==damage;
    }
    
    
}
