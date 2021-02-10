package ru.kamalov.animals;

import java.util.Random;

public class Kuku implements Birds {
    public String sing() {
        String str="";
        Random rand = new Random();
        int j;
        j = rand.nextInt(10);
        j += 1;
        for (int i = 0; i < j; i++) {
            str += "ку-ку ";
        }
        return str;
    }

    public String toString() {
        return sing();
    }
}
