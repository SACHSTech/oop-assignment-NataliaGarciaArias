package oopAssignment;

public class Media {
    
    private String title;
    private String genre;
    private int releaseYear;
    private int rating;
    private boolean isFave = false;
    private boolean isWatched = false;

    public Media(String title, String genre, int releaseYear, int rating){
       
        this.setTitle(title);
        this.setGenre(genre);
        this.setReleaseYear(releaseYear);
        this.setRating(rating);

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

    public boolean hasWatched(){
      
        if (rating == 0){

            isWatched = false;
           
            return isWatched;
            
        } else {
            isWatched = true;
           
            return isWatched;
        }
    }

    //Default void method for displaying information
    public void displayInformation(){

    }



}
