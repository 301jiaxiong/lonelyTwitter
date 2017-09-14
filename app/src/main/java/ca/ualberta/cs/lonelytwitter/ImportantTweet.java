package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by damon on 9/12/2017.
 */

public class ImportantTweet extends Tweet implements Tweetable {
    public ImportantTweet(String message){
        super(message);     //call the parent
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
