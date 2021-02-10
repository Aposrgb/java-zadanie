
package ru.kamalov.time;

public class Time{
        int time,min,hour;
        int r=0;
        public String toString(){
            if(r==1){
                return hour + ":"+min+ ":"+time;
            }
            if(time<60){
                return ""+time;
            }
            if(time<3600){
                min=(time)/60;
                time=time%60;
                return min+":"+time;
            }
                hour=time/3600;
                min=time/60 - hour*60;
                time=time%60;
                return hour +" ";
        }
        Time(){
        }
        Time(int time){
            if(time>=86400)throw new IllegalArgumentException("Hours must be <24 ");
            this.time=time;
            
        }
        Time(int hour,int min, int time){
            if(hour>23) throw new IllegalArgumentException("Hours must be <24 ");
            this.hour=hour;
            r=1;
            this.min=min;
            this.time=time ;
        }
       
}