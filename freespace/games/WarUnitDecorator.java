
package ru.kamalov.freespace.games;

public abstract class WarUnitDecorator implements Units{
    protected Units unit;

    public WarUnitDecorator(Units unit) {
        this.unit = unit;
    }
    
}
