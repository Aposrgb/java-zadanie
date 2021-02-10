
package ru.kamalov.time;

import ru.kamalov.time.Time;

public class Points{
    int x,y,z;
    String color;
    Points(int x) {
        this.x = x;
        y=0;
        z=0;
    }
    Points(int x, int y) {
        this.x = x;
        this.y = y;
        z=0;
    }
    Points(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    Points(int x, int y, int z, String color) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
    }
    Points(int x, int y,String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    Points(int x, String color) {
        this.x = x;
        this.color = color;
    }
}
