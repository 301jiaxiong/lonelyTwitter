package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represent a ImportantTweet extends Tweet
 * @author jiaxiong yang
 * @see Tweet
 * @version 1.0
 */
public class ImportantTweet extends Tweet implements Tweetable {
    public ImportantTweet(String message){
        super(message);     //call the parent
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    /**
     * Tweet is Important
     * @return TRUE
     *
     */
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
