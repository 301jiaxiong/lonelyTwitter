/*
 * Copyright 2017 Team 6, CMPUT301, University of Alberta-All Rights Reserved.
 * You may use distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * you may find a copy of the license in the project. Otherwise please contact jiaxiong@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by damon on 10/10/2017.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    //add tweet to a list of tweets
    public void addTweet(Tweet tweet){
        if(tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }
        else {
            tweets.add(tweet);
        }

    }
    //delete tweet from a list of tweets
    public void deleteTweet(Tweet tweet){

        tweets.remove(tweet);

    }
    //check if a list of tweets has specified tweet
    //if it does,return true,otherwise return false
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);

    }
    //get tweet at given index from list of tweets
    public Tweet  getTweet(int index){
        return tweets.get(index);
    }


    /*From https://stackoverflow.com/questions/5927109/sort-objects-in-arraylist-by-date
    /** 2017/10/12
     */
    public void getTweets(){
        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet o1, Tweet o2) {
                return (o1.getDate().compareTo(o2.getDate()));
            }
        });

    }
    public int getCount(){
        return tweets.size();
    }

}
