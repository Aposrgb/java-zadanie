package ru.kamalov.freespace;
import java.util.ArrayList;
import java.util.List;

public class Report {

    private Student student;
    public Report(Student students) {
        this.student = students;
    }

    public void addMark(int mark) {
        student.addMark(mark);
    }

    public void removeMark(int mark) {
        student.getMark().remove(mark);
    }

    public void editMark(int iter, int mark) {
        student.getMark().set(iter, mark);
    }
    public void save(){
        
    }
    public void restore(){
        
    }
    public void print() {
        System.out.println(student.getName() + " " + student.getMark().toString());

    }
}
