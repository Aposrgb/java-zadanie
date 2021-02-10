package ru.kamalov.numbers;

public final class Drob<N extends Number> extends Number implements Comparable<Drob<? extends Number>> {

    private Number ch, zn;

    public Drob(N ch, N zn) {
        this.ch = ch;
        this.zn = zn;
        if (this.zn.intValue() < 0) {
            this.zn = this.zn.doubleValue() * -1;
            this.ch = this.ch.doubleValue() * -1;
        }
    }

    Drob<Number> sum(Drob d2) {
        if (zn == d2.zn) {
            return new Drob<>(ch.doubleValue() + d2.ch.doubleValue(), zn);
        } else {
            return new Drob<>(ch.doubleValue() * d2.zn.doubleValue() + d2.ch.doubleValue() * zn.doubleValue(), zn.doubleValue() * d2.zn.doubleValue());
        }

    }

    Drob<Number> div(Drob d2) {
        return new Drob<>(ch.doubleValue() * d2.zn.doubleValue(), zn.doubleValue() * d2.ch.doubleValue());
    }

    Drob<Number> proizv(Drob d2) {
        return new Drob<>(ch.doubleValue() * d2.ch.doubleValue(), zn.doubleValue() * d2.zn.doubleValue());
    }

    Drob<Number> minus(int d) {
        Drob d2 = new Drob(d, 1);
        if (zn == d2.zn) {
            return new Drob<>(ch.doubleValue() - d2.ch.doubleValue(), zn.doubleValue());
        } else {
            return new Drob<>(ch.doubleValue() * d2.zn.doubleValue() - d2.ch.doubleValue() * zn.doubleValue(), zn.doubleValue() * d2.zn.doubleValue());
        }

    }

    Drob<Number> minusdr(Drob d2) {
        if (zn == d2.zn) {
            return new Drob<>(ch.doubleValue() - d2.ch.doubleValue(), zn.doubleValue());
        } else {
            return new Drob<>(ch.doubleValue() * d2.zn.doubleValue() - d2.ch.doubleValue() * zn.doubleValue(), zn.doubleValue() * d2.zn.doubleValue());
        }

    }

    public String toString() {
        return ch + "/" + zn;
    }

    @Override
    public int intValue() {
        if (zn.intValue() == 0) {
            throw new FractionException("dannaya drobs ne mojet predstavlena v celochislenoy forme");
        }
        return (int) ch.intValue() / zn.intValue();
    }

    @Override
    public long longValue() {
        return intValue();
    }

    @Override
    public float floatValue() {
        return (float) ch.floatValue() / zn.floatValue();
    }

    @Override
    public double doubleValue() {
        return (double) ch.doubleValue() / zn.doubleValue();
    }

    @Override

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Drob<N> l = (Drob<N>) obj;
        return l.ch == this.ch && l.zn == this.zn;
    }

    @Override
    public int hashCode() {
        return ch.intValue() + zn.intValue() * (ch.intValue() * zn.intValue());
    }

    @Override
    public int compareTo(Drob<? extends Number> d1) {
        double tmp = this.ch.doubleValue() / this.zn.doubleValue();
        double temp = d1.ch.doubleValue() / d1.zn.doubleValue();
        if (tmp == temp) {
            return 0;
        } else if (tmp > temp) {
            return 1;
        } else {
            return -1;
        }
    }

    private static class FractionException extends RuntimeException {

        public FractionException(String string) {
            super(string);
        }

        public FractionException(String string, Throwable cause) {
            super(string, cause);
        }

        public FractionException(Throwable cause) {
            super(cause);
        }

        public FractionException() {
        }

    }

}
