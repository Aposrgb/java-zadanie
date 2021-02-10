package ru.kamalov.otdel;

public class Worker {
    String name;
    Otdel otdel;

    Worker(String name, Otdel otdel){
        this.name = name;
        this.otdel = otdel;
    }

    public void setOtdel(Otdel otdel){
        if(otdel==null){
            return;
        }
        if (this == this.otdel.boss){
            this.otdel.boss = null;
        }
        this.otdel.sotrudniki.remove(this);
        this.otdel = otdel;
        this.otdel.addWorker(this);
    }

    public String toString(){
        if (this == otdel.boss){
            return name + " начальник отдела " + otdel.getOtdelName();
        }
        else{
            if (otdel.boss == null){
                return name + " работает в отделе " + otdel.getOtdelName();
            }
            else{
                return name + " работает в отделе " + otdel.getOtdelName()+ ", начальник которого " + otdel.boss.name;
            }
        }
    }
}
