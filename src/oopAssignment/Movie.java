package oopAssignment;

public class Movie extends Media {

    private int duration;
    private String director;

    public Movie(String title, String genre, int releaseYear, String director, int duration){
        super(title, genre, releaseYear);

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
    
}
