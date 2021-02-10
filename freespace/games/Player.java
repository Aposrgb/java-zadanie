
package ru.kamalov.freespace.games;


public abstract class Player {
    public abstract Units makeUnit();
    public abstract Spell makeSpell(Units unit);
}
