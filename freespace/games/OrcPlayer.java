
package ru.kamalov.freespace.games;

import ru.kamalov.freespace.games.ArmorDecorator;


public class OrcPlayer extends Player implements Units{
    private int damage=20;
    private int health=150;
    private Units unit;
    public int attack(){
        return damage;
    }
    public boolean defend(int damage){
        
        return true;
    }

    public OrcPlayer() {
    }
    
    public OrcPlayer(Units unit) {
        this.unit = unit;
    }
    public void setHealth(int health){
        this.health=health;
    }
    @Override
    public Units makeUnit() {
        return new ArmorDecorator(new OrcPlayer());
    }

    

    @Override
    public Spell makeSpell(Units unit) {
        return null;
    }
    
}
