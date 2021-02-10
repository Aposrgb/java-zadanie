
package ru.kamalov.time;

public class Hourzone extends Time{
    private double timezone;
    public Hourzone(double timezone) {
        if(timezone<-12){
            this.timezone=-12;
        }
        else if(timezone>14){
            this.timezone=14;
        }
        else{
            this.timezone=timezone;
        }
    }

    public double getTimezone() {
        return timezone;
    }

    @Override
    public String toString() {
        String str = "(";
        if(timezone>=0){
            str+="+";
        }
        double min=((double)timezone-(int)timezone)*60;
        if(min==0){str+=(int)timezone+":"+(int)min + "0 UTC)";}
        else{str+=(int)timezone+":"+(int)min + " UTC)";}
        return str;
    }
     
}
