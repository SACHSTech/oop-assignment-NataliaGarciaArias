package oopAssignment;

public class Media {
    
    private String title;
    private String genre;
    private int releaseYear;
    private int rating = 0;
    private boolean isFave = false;

    public Media(String title, String genre, int releaseYear){
       
        this.setTitle(title);
        this.setGenre(genre);
        this.setReleaseYear(releaseYear);

    }

    //Getter and Setter Methods for the variables
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Method that checks if the media is a favourite based on the rating

    public boolean isFavourite(){

        if (rating >= 7){
            isFave = true;
        } else {
            isFave = false;
        }

        return isFave;
    }



}
