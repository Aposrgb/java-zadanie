
package ru.kamalov.geometry;

public class Triangle extends Figures{
    private int x1,x2,x3,y1,y2,y3,S;
    public Triangle(int x1, int x2, int x3, int y1, int y2, int y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        S=(int)Math.sqrt((((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1))/2)*((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1))/2);
    }
    public CloseLine getCloseLine(){
        return new CloseLine(new Point(x1,y1),new Point(x2,y2),new Point(x3,y3));
    }
    @Override
    public int getS(){
        return S;
        
    }

    @Override
    public String toString() {
        return "первая точка -"+x1+","+y1+", вторая точка"+x2+" ,"+y2+" и третья точка "+x3+" ,"+y3+", площадь = "+ Math.sqrt((((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1))/2)*((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1))/2);
    }
    
}