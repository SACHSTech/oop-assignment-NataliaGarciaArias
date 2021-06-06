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

    public void displayInformation(){

        System.out.println("Movie Title: " + super.getTitle());
        System.out.println("Genre: " + super.getGenre());
        System.out.println("Year Released: " + super.getReleaseYear());
        System.out.println("Director: " + getDirector());
        System.out.println("Duration: " + getDuration());
    }
    
}
