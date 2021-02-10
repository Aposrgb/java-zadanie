package ru.kamalov.freespace;

import java.util.ArrayList;
import java.util.List;
import ru.kamalov.freespace.observer;

public class Student {

    private String name;
    private List<Integer> mark = new ArrayList<>();
    private List<observer> subs=new ArrayList<>();

    Student(String name, List<Integer> marks) {
        this.name = name;
        mark = marks;
    }

    public void addMark(int mark) {
        if(mark>=2 && mark<=5)this.mark.add(mark);
        subs.forEach(x->x.notify(mark));
    }

    public String getName() {
        return name;
    }
    
    public List<Integer> getMark() {
        return mark;
    }
    
    public String toString() {
        return name + " " + mark.toString();
    }
    public void remove_subs(observer person){
        subs.remove(person);
    }
    public void add_subs(observer person){
        subs.add(person);
    }
    class Parent implements observer {

        private String name;
        @Override
        public void notify(int mark) {
            if (mark <= 3) {
                System.out.println("у тебя плохие оценки!!!");
            } else if (mark >= 4) {
                System.out.println("у тебя нормальные оценки!!!");
            } else {
                System.out.println("Ошибка");
            }
        }
    }

}
