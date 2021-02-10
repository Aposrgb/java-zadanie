
package ru.kamalov.Weapons;

public class Gun extends Pistol{
    final int speed;
    public Gun(int speed,int max_ammo){
           super(0,max_ammo);
           if(speed<=0) throw new IllegalArgumentException("firespeed gun must be >0");
           this.speed=speed;
    }
    public Gun() {
       super(0,30);
       speed=30;
    }
    public Gun(int max) {
       super(0,max);
       if(max<=0) throw new IllegalArgumentException("max ammo gun must be >0");
       speed=max/2;
    }
    public void shoot(){
        for(int i=0;i<speed;i++){
            System.out.print("Бах!");
        }
        System.out.print("\n");
    }
    public void shootsec(int sec){
        for(int i=0;i<speed*sec;i++){
            System.out.print("Бах!");
        }
        System.out.print("\n");
    }
}