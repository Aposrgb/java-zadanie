
package ru.kamalov.Weapons;

public class Pistol extends Weapon{
    private int m_ammo;
    public Pistol(int ammo,int max) {
        if(ammo<0)throw new IllegalArgumentException("ammo must be >0");
        if(ammo>max)throw new IllegalArgumentException("ammo must be < max ammo");
        setammo(ammo);
        m_ammo=max;
    }

    public Pistol() {
    }
    public  int getX(){
        return m_ammo;
    }
    public int reload(int am){
        if(am<0)throw new IllegalArgumentException("ammo must be >0");
        if(am>m_ammo)
        {
            am=am-(am-m_ammo);
            am=am-m_ammo;
            return am;
        }
        return am;
    }
    
    public String unreload(){
        String str= getammo()+ " патроны возвращены";
        setammo(0);
        return str;
    }

    @Override
    public void shoot() {
        String str;
        if(getammo()<=0){str="Клац!";}
        else{
            int i = getammo();
            i-=1;
            setammo(i);
            str="Бах!";
        }
        System.out.println(str);
    }
    
}
