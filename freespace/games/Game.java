
package ru.kamalov.freespace.games;

import java.util.ArrayList;
import java.util.List;

public class Game implements Spell{
    private List<Units> units_list=new ArrayList();
    private Player pl_1,pl_2;
    public void battleUnit(){
        pl_1.makeUnit();
        pl_2.makeUnit();
    }

    public Game(Player player1,Player player2) {
        this.pl_1=player1;
        this.pl_2=player2;
    }

    @Override
    public void addEffect(Units unit) {
        
    }
    
}
