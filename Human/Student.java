package ru.kamalov.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Student<T> {

    private String name;
    private List<T> mark = new ArrayList<>();
    private Predicate<T> border;
    Student(String name,Predicate<T> border, T... mark) {
        this.name = name;
        this.border=border;
        if (mark != null) {
            for (int i = 0; i < mark.length; i++) {
                addMark(mark[i]);
            }
        }

    }
    public void addMark(T t){
        if(border.test(t)) mark.add(t);
    }
    public String toString() {
        return name +" " +mark.toString();
    }
}
