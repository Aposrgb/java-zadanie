
package ru.kamalov.Weapons;

public class Sniper {
    String name;
    Weapon weapon;
    public Sniper(String name, Weapon weapon) {
            this.name = name;
            this.weapon = weapon;
    }
    public Sniper(String name) {
            this.name = name;
    }
    public  void shoot(){
        if(weapon!=null){
            weapon.shoot();
        }
        else{
            System.out.println("не могу участвовать в перестрелке");
        }
    }
}
