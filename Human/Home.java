
package ru.kamalov.Human;

public class Home{
    int etaj;
    Home(int etaj){
        if(etaj<1){
            throw new IllegalArgumentException("floors must be is >0");
        }
        else{this.etaj=etaj;}
        
    }
    public String toString(){
        if(etaj<2){
            return "дом с "+ etaj+ " этажом";
        }
        return "дом с "+ etaj+ " этажами";
    }
}