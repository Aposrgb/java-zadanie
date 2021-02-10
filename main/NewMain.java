package ru.kamalov.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class NewMain {

    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<30;i++){
            l.add(i);
        }
        Function s = x->x;
        Lists(l,s);
    }

    public static <T> List<T> Lists(List<T> list,Function<T,List> f) {
        List s= new ArrayList();
        for(int i=0;i<list.size();i++){
            s.add(f.apply(list.get(i)));
            
        }
        return s;
    }
}