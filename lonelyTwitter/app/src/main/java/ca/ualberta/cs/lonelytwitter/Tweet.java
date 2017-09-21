package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by rmeng1 on 9/13/17.
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;


    public Tweet (String message){
        this.date= new Date();
        this.message = message;


    }

    public Tweet(String message, Date date) {
        this. date = date;
        this . message = message;
    }

    public String getMessage(){
        return message;

    }

    public Date getDate(){
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return date.toString() + "|" + message;
    }


    public void setMessage(String message) throws TweetTooLongException {

        if (message.length()<140){
            this.message = message;

        }

        else {
            throw new TweetTooLongException();
        }
    }




    public abstract  Boolean isImportant();

}


