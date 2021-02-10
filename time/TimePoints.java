
package ru.kamalov.time;

public class TimePoints{
    Time t1;
    int t;
    String color;
    Points p;
    TimePoints(int t,Points p){
        this.p=p;
        this.t=t;
        t1 =new Time(t);
    }
    TimePoints(int t, String color, Points p) {
        this.t = t;
        t1 =new Time(t);
        this.color = color;
        this.p = p;
    }
}