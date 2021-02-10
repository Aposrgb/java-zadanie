package ru.kamalov.main;
import static java.lang.Integer.parseInt;
import java.math.BigInteger;
import static ru.kamalov.main.Block11.summ;
import ru.kamalov.numbers.Drob;
import static java.lang.Math.pow;
import ru.kamalov.geometry.Point;
public class Block12 {

    public static void main(String[] args) {
        System.out.println(summ(7, new Drob(11, 3), 3.21, new BigInteger("12345678912345678912")));
        System.out.println(pow(parseInt(args[0]), parseInt(args[1])));
        
        java.awt.Point p = new java.awt.Point(1,23);
        Point p1 =new Point(1,23);
        System.out.println(p +"\n"+ p1 );
    }
    
}
