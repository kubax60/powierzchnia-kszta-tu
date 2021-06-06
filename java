package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Ksztalt> ksztalty = new ArrayList<>();

        ksztalty.add(new Trojkat(3,6,7));
        ksztalty.add(new Kwadrat(5));

        for(Ksztalt s : ksztalty){
            System.out.println("Powierzchnia kształtu to: "+s.obliczPowierzchnie());
        }

        for(Ksztalt s : ksztalty){
            System.out.println("Obwód kształtu to: "+s.obliczObwod());
        }
    }
}

interface Ksztalt {

    double obliczPowierzchnie();

    double obliczObwod();
}

class Kwadrat implements Ksztalt {

    double dlugoscBoku;

    public Kwadrat(double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }

    public double obliczPowierzchnie() {
        return dlugoscBoku * dlugoscBoku;
    }

    public double obliczObwod() {
        return dlugoscBoku*4;
    }
}

class Trojkat implements Ksztalt {
    

    double bok1,bok2,bok3;

    public Trojkat(double bok1, double bok2, double bok3) {
        this.bok1=bok1;
        this.bok2=bok2;
        this.bok3=bok3;
    }

    public double obliczPowierzchnie() {
        double p;
        p=obliczObwod();
        p/=2;
        return Math.sqrt(p*(p-bok1)*(p-bok2)*(p-bok3));
    }

    public double obliczObwod() {
        return bok1+bok2+bok3;
    }
}
