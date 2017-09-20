package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by damon on 9/12/2017.
 */
/**class is captial in Java, different between int and Integer class (have option when type number2.)save time**/

public abstract class Tweet {
    private String message;
    private Date date;
    public Tweet(String message){
        this.message = message;
        this.date = new Date();   //will just use the current date

    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    //methods use to change or get the private message in the class
    public abstract Boolean isImportant();



    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        }else{
            this.message = message;
        }
    }
    public String getMessage(){
        return this.message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    @Override
    public String toString(){
        return date.toString()+"|"+ message;
    }
}
