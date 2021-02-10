
package ru.kamalov.Human;

public class Name{
        String str="";
        private String famil,name,otch;
        Name(String famil,String name,String otch) {
            this.famil=famil;
            this.name=name;
            this.otch=otch;
            str+=famil+" "+name+" "+otch;
        }
        Name(String famil,String name) {
            this.famil=famil;
            this.name=name;
            str+=famil+" "+name;
        }
        Name(String famil) {
            this.famil=famil;
            str+=famil;
        }
        String getX(){
            return str;
        }
}