package oopAssignment;

import oopAssignment.Media;

public class Series extends Media {

    private int numSeasons;
    private int numEpisodes;
    private int avgEpisodeDuration;

    public Series(String title, String genre, int releaseYear, int numSeasons, int numEpisodes, int avgEpisodeDuration){
        super(title, genre, releaseYear);
        
        this.numSeasons = numSeasons;
        this.numEpisodes = numEpisodes;
        this.avgEpisodeDuration = avgEpisodeDuration;

    }

    public int getSeasons(){
        return numSeasons;
    }

    public int setSeasons(int numSeasons){
        this.numSeasons = numSeasons;
        return numSeasons;
    }

    public int getEpisodes(){
        return numEpisodes;
    }

    public int setEpisodes(int numEpisodes){
        this.numEpisodes = numEpisodes;
        return numEpisodes;
    }

    public int getEpDuration(){
        return avgEpisodeDuration;
    }

    public int setEpLength(int newDuration){
        this.avgEpisodeDuration = newDuration;
        return avgEpisodeDuration;
    }

    //Calculates estimated watch time for the series based on # of episodes and avg duration
    public int estWatchTime(){
       
        int time = avgEpisodeDuration * numSeasons;

        return time;
    }
    
    //Displays TV Series Information
    public void displayInformation(){

        System.out.println("Series Title: " + super.getTitle());
        System.out.println("Genre: " + super.getGenre());
        System.out.println("Year Released: " + super.getReleaseYear());
        System.out.println("Seasons: " + numSeasons);
        System.out.println("Estimated Watch Time: " + estWatchTime());

    }
}
