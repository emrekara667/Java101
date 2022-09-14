package mutableimmutable;

import java.util.Date;

public class main {
    public static void main(String[] args) {

        Date start = new Date();
        Date end = new Date();
        String message = "newYear";

        Period p = new Period(start, end, message);

        end.setYear(78); //modifies internals of p
        message = "happyYear";
        System.out.println("1 ---> " + p);

        //Second attack on the internals of a p instance
        start = new Date();
        end = new Date();
        p = new Period(start, end, message);
        p.end().setYear(78); //Modifies internals of p!
        System.out.println("2 ---> " + p);



    }
}
