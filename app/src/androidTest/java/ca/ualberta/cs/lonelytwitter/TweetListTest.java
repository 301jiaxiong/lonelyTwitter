/*
 * Copyright 2017 Team 6, CMPUT301, University of Alberta-All Rights Reserved.
 * You may use distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * you may find a copy of the license in the project. Otherwise please contact jiaxiong@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by damon on 10/10/2017.
 * every test name should start with test
 */

public class TweetListTest extends ActivityInstrumentationTestCase2{
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }
    public void testAddTweet(){

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);

        assertTrue(tweets.hasTweet(myTweet));

    }
    public void testDeleteTweet(){
        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);

        tweets.deleteTweet(myTweet);

        assertFalse(tweets.hasTweet(myTweet));

    }
    public void testHasTweet(){
        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        assertFalse(tweets.hasTweet(myTweet));

        tweets.addTweet(myTweet);

        assertTrue(tweets.hasTweet(myTweet));
    }
    public void testGetTweet(){
        TweetList tweets = new TweetList();

        NormalTweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);

        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(),myTweet.getMessage());
        assertEquals(returnedTweet.getDate(),myTweet.getDate());
    }
}
