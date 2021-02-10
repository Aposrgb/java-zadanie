
package ru.kamalov.freespace.games;

public class WeaponDecorator extends WarUnitDecorator{
    public WeaponDecorator(Units unit) {
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
