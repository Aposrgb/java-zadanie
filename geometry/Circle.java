
package ru.kamalov.geometry;

public class Circle extends Figures{
    private int x,y, rad, S;
    public  Circle(int x, int y, int rad) {
        this.x = x;
        this.y = y;
        this.rad = rad;
        S=(int)Math.PI*rad*rad;
    }
    public int getS(){
        return S;
    }

    @Override
    public String toString() {
        return "центр окружности в точках - "+x+","+y+" и радиус  "+rad+", площадь = "+Math.PI*rad*rad;
    }
    
    
}
