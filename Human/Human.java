
package ru.kamalov.Human;

public class Human{
        Name name;
        int height;
        Name dad=new Name("");
        Human(Name n1,int height, Name dad){
            if(height<0 && height>500)throw new IllegalArgumentException("height need changed");
            this.height=height;
            name=n1 ;
            this.dad=dad;
        }
        public String toString(){
            String str=name +" "+ height+", отец = "+ dad.getX();
            return str;
        }
}
