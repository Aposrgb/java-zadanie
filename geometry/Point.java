package ru.kamalov.geometry;

public class Point{
    int[] x;
    public String toString(){
        return "x="+x[0] + ",y="+x[1];
    }
    public Point(int...x){
        this.x=x;
    }
    public boolean equals(Object point){
        if(point==null){
            return false;
        }
        if(point.getClass()!=this.getClass()){
            return false;
        }
        if(this==point){
            return true;
        }
        Point p= (Point)point;
        return p.x[0]==x[0] && p.x[1]==x[1];
    }
    @Override
    public int hashCode() {
        return x[0] + x[1]*(x[0]*x[0]);
    }

    @Override
    protected Point clone() throws CloneNotSupportedException {
        return new Point(x[0],x[1]);
    }
    
}