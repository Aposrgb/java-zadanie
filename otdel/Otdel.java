package ru.kamalov.otdel;
import java.util.ArrayList;
import java.util.List;

public class Otdel {
    String name;
    Worker boss;
    List<Worker> sotrudniki = new ArrayList<>();
    public Otdel(String name, Worker boss){
        this(name);
        setBoss(boss);
    }
    public Otdel(String name){ 
        this.name = name; 
    }
    public void setBoss(Worker boss){
        this.boss = boss;
        boss.otdel = this;
        addWorker(boss);
    }
    public void addWorker(Worker sotrudnik){
        if (!sotrudniki.contains(sotrudnik)){
            sotrudniki.add(sotrudnik);
        }
    }
    public String getOtdelName(){ 
        return name; 
    }
    public void setOtdelName(String name){
        this.name = name; 
    }
}
