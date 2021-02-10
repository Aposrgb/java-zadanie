
package ru.kamalov.freespace.games;

import ru.kamalov.freespace.games.ArmorDecorator;
import java.util.function.Supplier;

public class ElfPlayer extends Player implements Units {
    private int damage=25;
    private int health=100;
    private Units unit;
    private State state;
    Supplier<Integer> strategy;
    

    public int getDamage() {
        return damage;
    }
    
    public void setStrategy(Supplier<Integer> strategy) {
        this.strategy = strategy;
    }
    
    public void setDamage(int dmg){
        damage=dmg;
    }
    public ElfPlayer(Units unit) {
        this.unit=unit;
    }

    public ElfPlayer() {
    }
    @Override
    public Units makeUnit() {
        return new ArmorDecorator(new ElfPlayer());
    }

    @Override
    public Spell makeSpell(Units unit) {
        
        return null;
    }

    @Override
    public int attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean defend(int damage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    enum State{
        PREPAIRING{ 
            public int attack(){
                return 0;
            }
            public boolean defend(int dmg){
                return true;
            }
        }
        ,NORMAL{ 
            public int attack(){
                return 0;
            }
            public boolean defend(int dmg){
                return true;
            }
        }
        ,ULTIMATE{ 
            public int attack(){
                return 0;
            }
            public boolean defend(int dmg){
                return true;
            }
        }
        ,DEAD{ 
            public int attack(){
                return 0;
            }
            public boolean defend(int dmg){
                return true;
            }
        };
    }
}

