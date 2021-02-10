package ru.kamalov.city;

public class NewMain {

    public static void main(String[] args) {
        Road r1 = new Road("C", 1);
        Road r2 = new Road("E", 1);
        Road r3 = new Road("D", 1);
        Road r4 = new Road("B", 1);
        Road r5 = new Road("A", 1);
        Road r6 = new Road("C", 1);
        City_Roads A = new City_Roads("A");
        City_Roads B = new City_Roads("B");
        City_Roads C = new City_Roads("C");
        City_Roads D = new City_Roads("D");
        City_Roads E = new City_Roads("E");
        A.addRoad(r6);
        A.addRoad(r4);
        B.addRoad(r5);
        B.addRoad(r1);
        B.addRoad(r3);
        C.addRoad(r5);
        D.addRoad(r4);
        D.addRoad(r2);
        E.addRoad(r3);
        E.addRoad(r1);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
    }
}
