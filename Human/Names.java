/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kamalov.Human;

public class Names {
    private static String fir_name,sec_name,thir_name;

    private Names(String fname, String sname, String tname) {
        this.fir_name = fname;
        this.sec_name = sname;
        this.thir_name = tname;
    }
    
    public static NameBuildable createName(){
        return new NameBuild();
    }
    private static class NameBuild implements NameBuildable{
        public NameBuildable setfname(String str){
            fir_name=str;
            return new NameBuild();
        }
        public NameBuildable setsecname(String str){
            sec_name=str;
            return new NameBuild();
        }
        public NameBuildable setthirname(String str){
            thir_name=str;
            return new NameBuild();
        }
        public Names getName(){
            return new Names(fir_name,sec_name,thir_name);
        }
    }

    @Override
    public String toString() {
        return "Имя "+fir_name+", Фамилия "+sec_name+", Отчество "+thir_name;
    }
    
}
interface NameBuildable{
    public NameBuildable setfname(String str);
    public NameBuildable setsecname(String str);
    public NameBuildable setthirname(String str);
    public Names getName();
}