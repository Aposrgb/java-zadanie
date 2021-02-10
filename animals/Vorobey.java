package ru.kamalov.animals;

public class Vorobey implements Birds {
    public String sing() {
        return "чырык";
    }
    public String toString() {
        return sing();
    }
}
