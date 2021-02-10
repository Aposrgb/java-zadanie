
package ru.kamalov.animals;

public class Cat implements Cats{
    private String name;
    private int n=0;
    public Cat(String name, int n) {
        this.name = name;
        this.n = n;
    }
    public Cat(String name){
        this.name=name;
    }
    public Cat(){
        name=null;
    }
    public String meow(){
        if(n>=0){
            String str=name + ": ";
            for(int i=0;i<n;i++){
                str+="Мяу";
            }
            return str;
        }
        if(name!=null){
            return name + ": Мяу";
        }
        return "Мяу";
    }
    @Override
    public String toString() {
        return meow();
    }
    
}
