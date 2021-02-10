package ru.kamalov.publictaion;

public class NewMain {

    public static void main(String[] args) {
        Comment c1 = new Comment("вот это прикол", 2);
        Public p = new Public("вот эти именааа", "на самом деле это текст", "1 тег");
        c1.addComment("за рено логан 20 века?",24, 1);
        c1.addComment("да",2, 2);
        c1.addComment("омг",56, 2);
        p.addComment(c1);
        System.out.println(p);
    }

}
