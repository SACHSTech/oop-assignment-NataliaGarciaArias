package oopAssignment;

import java.io.*;
import oopAssignment.Media;
import oopAssignment.Movie;

public class Series extends Media {

    //instance variables
    private int numSeasons;
    private int numEpisodes;
    private int avgEpisodeDuration;

    //Constructor
    public Series(String title, String genre, int releaseYear, int rating, int numSeasons, int numEpisodes, int avgEpisodeDuration){
        super(title, genre, releaseYear, rating);
        
        this.numSeasons = numSeasons;
        this.numEpisodes = numEpisodes;
        this.avgEpisodeDuration = avgEpisodeDuration;

    }

    //Getter and Setter Methods
    public int getSeasons(){
        return numSeasons;
    }

    public void setSeasons(int numSeasons){
        this.numSeasons = numSeasons;
    }

    public int getEpisodes(){
        return numEpisodes;
    }

    public void setEpisodes(int numEpisodes){
        this.numEpisodes = numEpisodes;
    }

    public int getEpDuration(){
        return avgEpisodeDuration;
    }

    public void setEpLength(int newDuration){
        this.avgEpisodeDuration = newDuration;
    }

    //Calculates estimated watch time for the series based on # of episodes and avg duration
    public String estWatchTime(){
       
        int time = avgEpisodeDuration * numEpisodes;

        int hours = time / 60 ;
        int minutes = time % 60;

        return + hours + " hrs " + minutes + " mins ";
    }
    
    //Displays TV Series Information
    public void displayInformation(){

        System.out.println("Series: " + super.getTitle());
        System.out.println("Genre: " + super.getGenre());
        System.out.println("Year Released: " + super.getReleaseYear());
        System.out.println("Seasons: " + numSeasons);
        System.out.println("Estimated Duration: " + estWatchTime());

        if (hasWatched()){
        System.out.println("Rating: " + super.getRating());
        }

    }

    //Default to string method
    public String toString(){
        return "Series: " + super.getTitle();
    }
}
