package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by damon on 9/12/2017.
 */

public abstract class CurrentMood {
    private Date date;
    public CurrentMood(){
        this.date = new Date();
    }
    public CurrentMood(Date date){
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate(){
        return  date;
    }

}
