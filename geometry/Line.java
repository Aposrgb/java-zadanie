package ru.kamalov.geometry;
import java.util.Arrays;
import ru.kamalov.geometry.Point;


public class Line extends Lines implements Cloneable, Lenghtable{
    private Point[] line;
    private Point start, end;
    private int[] dist;
    private int s;
    private String str;
    public Line(Point...line){
        this.line=line;
        dist=new int[line.length-1];
        start=line[0];
        end=line[line.length-1];
        
        for(int i=0;i<line.length-1;i++){
            if(i+1>=line.length){
                break;
            }
            dist[i]=(line[i+1].x[0]-line[i].x[0])*(line[i+1].x[0]-line[i].x[0])+(line[i+1].x[1]-line[i].x[1])*(line[i+1].x[1]-line[i].x[1]);
            dist[i]=(int)Math.sqrt(dist[i]);
            s+=dist[i];
        }
        str=Arrays.toString(dist);
        str+=", общая длина =  "+s;
    }
    @Override
    public int getS() {
        return s;
    }
    public Point[] getPoints(){
        return line;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==null)return false;
        if(obj==this)return true;
        if(obj.getClass()!=this.getClass())return false;
        Line l = (Line)obj;
        return l.start==this.start && l.end == this.end;
    }

    @Override
    public int hashCode() {
        return start.x[0]+end.x[0]*(start.x[1]*end.x[1]);
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return new Line(start.clone(),end.clone());
    }

    @Override
    public String toString() {
        return str;
    }
    
    @Override
    public String startend() {
        return "start = " + start + ", end = "+ end;
    }

    @Override
    public int Length() {
        return s;
    }

}