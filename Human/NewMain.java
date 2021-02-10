
package ru.kamalov.Human;

import java.util.function.Predicate;

public class NewMain {
    public static void main(String[] args) {
        Predicate<Integer> n= x -> x>=2 && x<=5;
        Predicate<String> s=x-> x=="Зачет" || x=="Незачет";
        Student s1 = new Student("Пашкич",n,3,5,2,1,23,2,32,31);
        System.out.println(s1);
        Student s2 = new Student("Паd",s,"тук тук ","Зачет","Незачет");
        System.out.println(s2);
    }
    
}
