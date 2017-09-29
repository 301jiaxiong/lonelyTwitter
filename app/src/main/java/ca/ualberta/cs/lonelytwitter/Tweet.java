/*
 * Tweet
 *
 * Version 1.0
 *
 * September 26 2017
 *
 *
 *
 * Copyright 2017 Team 6, CMPUT301, University of Alberta-All Rights Reserved.
 * You may use distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * you may find a copy of the license in the project. Otherwise please contact jiaxiong@ualberta.ca
 */


package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Tweet.
 *
 * @author jiaxiong Yang
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 *
 */

public abstract class Tweet {
    private String message;
    private Date date;
    public Tweet(String message){
        this.message = message;
        this.date = new Date();               /*will just use the current date.*/

    }

    /**
     * Constructs a tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /*methods use to change or get the private message in the class*/
    public abstract Boolean isImportant();

    /**
     * Sets tweet message
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        }else{
            this.message = message;
        }
    }

    /**
     * Get Tweet message
     * @return message
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * Get Tweet date
     * @return date
     */

    public Date getDate() {
        return date;
    }

    /**
     * Set Tweet date
     * @param date
     */

    public void setDate(Date date) {
        this.date = date;
    }
    @Override
    public String toString(){
        return date.toString()+"|"+ message;
    }
}
