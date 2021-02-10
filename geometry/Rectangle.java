
package ru.kamalov.geometry;

public class Rectangle extends Figures{
    private int x,y,dlina1,dlina2,S;
    public Rectangle(int x, int y, int dlina1, int dlina2) {
        this.x = x;
        this.y = y;
        this.dlina1 = dlina1;
        this.dlina2 = dlina2;
        S=dlina1*dlina2;
    }
    public CloseLine getCloseLine(){
        return new CloseLine(new Point(x,y),new Point(x+dlina1,y),new Point(x+dlina1,y-dlina2),new Point(x,y-dlina2));
    }
    @Override
    public int getS(){
        return S;
    }

    @Override
    public String toString() {
        return "левый верхний угол - "+x+","+y+" , сторона первая "+dlina1+" и вторая сторона "+dlina2+", площадь = "+ dlina1*dlina2;
    }
    
}