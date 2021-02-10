
package ru.kamalov.geometry;

import java.util.Arrays;

public class CloseLine extends Lines{
    private Point[] line;
    private int[] dist;
    private Point start, end;
    private int s=0;
    private String str="";
    public  CloseLine(Point...line){
        this.line=line;
        dist=new int[line.length-1];
        start=line[0];
        end=start;
        for(int i=0;i<line.length-1;i++){
            if(i+1>=line.length){
                break;
            }
            dist[i]=(line[i+1].x[0]-line[i].x[0])*(line[i+1].x[0]-line[i].x[0])+(line[i+1].x[1]-line[i].x[1])*(line[i+1].x[1]-line[i].x[1]);
            dist[i]=(int)Math.sqrt(dist[i]);
            s+=dist[i];
        }
        str+="длина от одной точки до другой точки =  ";
        str+=Arrays.toString(dist);
        s+=((int)Math.sqrt((line[line.length-1].x[0]-line[0].x[0])*(line[line.length-1].x[0]-line[0].x[0])+(line[line.length-1].x[1]-line[0].x[1])*(line[line.length-1].x[1]-line[0].x[1])));
        str+=", общая длина (с учетом что это замкнутая линия)=  "+s;
    }
    public CloseLine(CloseLine...line){
        for(int i=0; i<line.length;i++){
            this.line=line[i].getPoints();
            out();
        }
        str+= "общая длина замкнутой  = "+s;
        getCloseLine();
    }
    private void out() {
        dist=new int[line.length-1];
        for(int i=0;i<line.length-1;i++){
            if(i+1>=line.length){
                break;
            }
            dist[i]=(line[i+1].x[0]-line[i].x[0])*(line[i+1].x[0]-line[i].x[0])+(line[i+1].x[1]-line[i].x[1])*(line[i+1].x[1]-line[i].x[1]);
            dist[i]=(int)Math.sqrt(dist[i]);
            s+=dist[i];
        }
        s+=((int)Math.sqrt((line[line.length-1].x[0]-line[0].x[0])*(line[line.length-1].x[0]-line[0].x[0])+(line[line.length-1].x[1]-line[0].x[1])*(line[line.length-1].x[1]-line[0].x[1])));
        str+=Arrays.toString(dist)+",  ";
    }
    public String getCloseLine(){
        return str;
    }
    public Point[] getPoints(){
        return line; 
    }
    public int getS(){
        return s;
    }
    public String toString() {
        
        return str ;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)return false;
        if(obj==this)return true;
        if(obj.getClass()!=this.getClass())return false;
        CloseLine l = (CloseLine)obj;
        int i =0;
        for(Point s: l.getPoints()){
            if(s.x[0]==line[i].x[0] && s.x[1]==line[i].x[1]){
                i++;
            }
            else{
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return start.x[0]+end.x[0]*(start.x[1]*end.x[1]);
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
