package mutableimmutable;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

public final class Period {

    //Defensive copy
    private final Date start;
    private final Date end;

    private final String message;

  /*  public Period(Date start, Date end, String message) {
        this.message = message;
        if(start.compareTo(end) > 0)
            throw new IllegalArgumentException();
        this.start = start;
        this.end = end;
    }


    public Date start(){
        return start;
    }

    public Date end(){
        return end;
    }*/

    @Override
    public String toString() {
        return "Period{" +
                "start=" + start +
                ", end=" + end +
                ", message='" + message + '\'' +
                '}';
    }

    public Period(Date start, Date end, String message){
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        this.message = message;

        if(this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException();
    }

    //Repaired accessors - make defensive copies of internal fields
    public Date start(){
        return new Date(start.getTime());
    }

    public Date end(){
        return new Date(end.getTime());
    }

    //Remainder omitted
}
