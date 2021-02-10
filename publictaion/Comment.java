package ru.kamalov.publictaion;

public class Comment {

    private String text, str = "";
    private int rate;
    private Subcom[] s;

    public String toString() {
        if (s == null) {
            str += "(" + rate + ") " + text + "\n";
            return str;
        }
        str += "(" + rate + ") " + text + "\n";
        for (Subcom d : s) {
            str += d + "\n";
        }
        return str;
    }

    public void addComment(String text, int rate, int otvet) {
        if (otvet <= 0) {
            otvet = 1;
        }
        Subcom n = new Subcom(text, rate, otvet);
        if (s == null) {
            s = new Subcom[1];
            s[0] = n;
        } else {
            Subcom[] tmp = new Subcom[s.length];
            int i = 0;
            for (Subcom d : s) {
                tmp[i] = d;
                i++;
            }
            s = new Subcom[tmp.length + 1];
            i = 0;
            for (Subcom d : tmp) {
                s[i] = d;
                i++;
            }
            s[tmp.length] = n;
        }
    }

    public Subcom[] getComments() {
        if (s == null) {
            return null;
        }
        for (Subcom d : s) {
            System.out.println(d);
        }
        return s;
    }

    void setComment(String str) {
        if (s == null) {
            this.text = text;
        } else {
            throw new IllegalArgumentException("нельзя изменить текст так как есть комментарии");
        }
    }

    Comment(String text, int rate) {
        this.rate = rate;
        this.text = text;
    }

    public int getRate() {
        return rate;
    }

    public String getText() {
        return text;
    }

    public void setRate() {
        rate = rate + 1;

    }

    class Subcom {

        private String b;
        private int rate, otv;

        public String toString() {
            String str = "";
            for (int i = 0; i < otv; i++) {
                str += "---";
            }
            return str + "(" + rate + ") " + b;
        }

        Subcom(String b, int rate, int otv) {
            this.b = b;
            this.otv = otv;
            this.rate = rate;

        }

        public int getRate() {
            return rate;
        }

        public int getOtv() {
            return otv;
        }

        public String getText() {
            return b;
        }
    }
}
