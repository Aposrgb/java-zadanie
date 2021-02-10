
package ru.kamalov.animals;

import java.util.Random;

public class Parrow implements Birds {
    private String song;
    public Parrow(String song) {
        this.song = song;
    }
    public String sing(){
        Random rand = new Random();
        int j,i;
        j=rand.nextInt(song.length());
        i=rand.nextInt(song.length());
        song=song.replace(song.charAt(i),song.charAt(j));
        return song;
    }
    public String toString() {
        return sing();
    }
    
}
