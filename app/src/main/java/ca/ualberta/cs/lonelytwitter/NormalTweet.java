package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Represent a NormalTweet extends Tweet
 * @author jiaxiong yang
 * @see Tweet
 * @version 1.0
 */
public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }
    @Override
    /**
     * Tweet is not Important
     * @return FALSE
     *
     */
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
