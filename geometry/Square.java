
package ru.kamalov.geometry;

public class Square extends Figures{
    private int x,y, dlina,S;
    public Square(int x, int y, int dlina) {
        this.x = x;
        this.y = y;
        this.dlina = dlina;
        S=dlina*dlina;
    }
    public CloseLine getCloseLine(){
        return new CloseLine(new Point(x,y),new Point(x+dlina,y),new Point(x+dlina,y-dlina),new Point(x,y-dlina));
    }
    @Override
    public int getS(){
        return S;
    }

    @Override
    public String toString() {
        return "левый верхний угол - "+x+","+y+" и сторона  "+dlina+", площадь = "+ dlina*dlina;
    }

    public int getY() {
        return y;
    }

    public int getDlina() {
        return dlina;
    }
    
    public int getX() {
        return x;
    }
    
}