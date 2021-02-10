
package ru.kamalov.Weapons;

public abstract class Weapon{
    protected int ammo;
    
    Weapon(int ammo){
        if(ammo<0)throw new IllegalArgumentException("ammo must be >0");
        this.ammo=ammo;
    }
    Weapon(){
    }
    abstract void shoot();
    
    public int getammo(){return ammo;}
    public void setammo(int ammo){this.ammo=ammo;}
    public boolean getAmmo(){
        if(ammo==0) return false;
        ammo--;
        return true;
    }
    public void load(int ammo){
        if(ammo<0)throw new IllegalArgumentException("ammo must be >0");
        this.ammo+=ammo;
    }
}
