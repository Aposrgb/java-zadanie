package ru.kamalov.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Door {

    public static final Door One = new Door(){ 
        public String openDoor() {
            return One.prize.name;
        }
    };
    public static final Door Two = new Door(){
        public String openDoor() {
            return Two.prize.name;
        }
    };
    public static final Door Three = new Door(){
        public String openDoor() {
            Three.prize.rand();
            return Three.prize.name;
        }
    };

    static {
        One.prize.name = "Авто";
        Two.prize.name = null;
    }
    private Prize prize = new Prize();
    public Door() {
    }
    abstract public String openDoor();

    public void addPrize(String str) {
        prize.list_prize.add(new Prize(str));
    }

    public String getListPrize() {
        String str = "";
        for (int i = 0, j = 1; i < prize.list_prize.size(); i++, j++) {
            str += j + ")" + prize.list_prize.get(i).name + "\n";
        }
        return str;
    }

    private class Prize {

        List<Prize> list_prize = new ArrayList<>();
        String name;

        public void rand() {
            name = list_prize.get(new Random().nextInt(list_prize.size())).name;
        }

        private Prize(String name) {
            this.name = name;
        }

        private Prize() {
            list_prize.add(new Prize("деньги"));
            list_prize.add(new Prize("ручка"));
            list_prize.add(new Prize("сертификат"));
            list_prize.add(new Prize("клавиатура"));
            list_prize.add(new Prize("билеты в тур"));
        }

    }
}
