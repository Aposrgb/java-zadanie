package ru.kamalov.main;

import ru.kamalov.Weapons.*;
import ru.kamalov.animals.*;
import ru.kamalov.geometry.*;
import ru.kamalov.numbers.Drob;

public class Block11 {

    public static void main(String[] args) {
//        Square s = new Square(7, 5, 4);
//        Triangle t = new Triangle(1, 4, 6, 8, 1, 3);
//        Rectangle r = new Rectangle(1, 5, 5, 3);
//        CloseLine cl = getPolygonalChain(s, t, r);
//        System.out.println(cl.getCloseLine());

//        Sniper s0 = new Sniper("sds", new Pistol(2, 5));
//        Sniper s1 = new Sniper("s1", new Gun(34));
//        Sniper s2 = new Sniper("s2", new Gun(3, 34));
//        Sniper s3 = new Sniper("s3");
//        s0.shoot();
//        s0.shoot();
//        s0.shoot();
//        s1.shoot();
//        s2.shoot();
//        s3.shoot();
        Lines l1 = new Line(new Point(2, 5), new Point(7, 2), new Point(8, 1));
        Lines l2 = new Line(new Point(7, 5), new Point(2, 2), new Point(1, 1));
        StringN str1 = new StringN("sdaasd");
        Figures f = new Square(4, 6, 4);
        Lines(l1, l2, str1);
        S(f, str1);
        Cat c1=new Cat("cat");
        Cats c2= new Meowable(c1);
        
    }
    //11.4

    static void meows(Cats... cats) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].meow();
        }
    }

    //11.1
    public static String summ(Number... num) {
        double res = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i].doubleValue());
            res += num[i].doubleValue();
        }
        return "result " + res;
    }

    //11.2
    static void birdsing(Birds... bird) {
        for (int i = 0; i < bird.length; i++) {
            System.out.println(bird[i].sing());
        }
    }

    // 11.3
    public static int S(Figures... f) {
        int res = 0;
        for (Figures s : f) {
            res += s.getS();
        }
        return res;
    }

    //11.5
    public static int Lines(Lenghtable... l) {
        int res = 0;
        for (Lenghtable s : l) {
            res += s.Length();
        }
        return res;
    }

    //11.7
    static CloseLine getPolygonalChain(Figures... c) {
        CloseLine[] cl = new CloseLine[c.length];
        for (int i = 0; i < c.length; i++) {
            if (c[i].getCloseLine() != null) {
                cl[i] = c[i].getCloseLine();
            }
        }
        return new CloseLine(cl);
    }
}
class Meowable implements Cats{
    private Cats c;
    private int count=0;
    public Meowable(Cats c) {
        this.c = c;
    }
    @Override
    public String meow() {
        count++;
        return c.meow();
    }
    public int getCount(){
        return count;
    }
}