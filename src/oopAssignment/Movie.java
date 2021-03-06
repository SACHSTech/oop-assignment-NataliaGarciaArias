package oopAssignment;
import java.io.*;
import oopAssignment.Media;
import oopAssignment.Series;
import oopAssignment.List;


public class Movie extends Media {

    //Instance variables
    private int duration;
    private String director;

    //Constructor
    public Movie(String title, String genre, int releaseYear, int rating, String director, int duration){
        super(title, genre, releaseYear,rating);

        this.director = director;
        this.duration = duration;
    }

    //Getter and Setter Methods
    public int getDuration(){
        return duration;
    }

    public void setDuration(int newDuration){
        this.duration = newDuration;
    }

    public String getDirector(){
        return director;
    }

    public void setDirector(String newDirector){
        this.director = newDirector;
    }

    //Method that formats the duration from minutes to hours and minutes
    public String formatDuration(){

        int time = getDuration();
        
        int hours = time / 60 ;
        int minutes = time % 60;

        return + hours + " hrs " + minutes + " mins ";

    }

    //Method that displays Movie information
    public void displayInformation(){

        System.out.println("Movie: " + super.getTitle());
        System.out.println("Genre: " + super.getGenre());
        System.out.println("Year Released: " + super.getReleaseYear());
        System.out.println("Director: " + getDirector());
        System.out.println("Duration: " + formatDuration());
        
        if (hasWatched()){
            System.out.println("Rating: " + super.getRating());
            }
    }

    //Default to string method
    public String toString(){
        return "Movie: " + super.getTitle();
    }
    
}
