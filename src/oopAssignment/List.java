package oopAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

import oopAssignment.Media;
import oopAssignment.Movie;
import oopAssignment.Series;

public class List {
    
    //Instance variables
    private ArrayList<Media> mediaList;
    private String name;

    //Constructor
    public List(String name){
        mediaList = new ArrayList<Media>();
        this.name = name;
    }

    //Getter and Setter Methods
    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    //Add and Delete Methods
    public void addMedia(Movie newMovie){

        mediaList.add(newMovie);
    }

    public void addMedia(Media newMedia){

        mediaList.add(newMedia);
    }

    public void deleteMedia(Movie toDelete){
        mediaList.remove(toDelete);
    }

    public void addMedia(Series newSeries){
        mediaList.add(newSeries);
    }

    public void deleteMedia(Series toDelete){
        mediaList.remove(toDelete);
    }

    public Media getMedia(int index){

        Media media = mediaList.get(index);
 
        return media;
     }
    
    public ArrayList<Media> getWholeList(){
        return mediaList;
    }

    //Method that gets all the fave genres from the list
    public HashSet<String> getFaveGenres(){

        Iterator<Media> it = mediaList.iterator();
        HashSet<String> genres = new HashSet<String>();

        for (int i = 0; i < mediaList.size(); i++){

            Media media = it.next();

            if (media.isFavourite()){
                genres.add(media.getGenre());

            }
        }
        
        return genres;
    
    }

    //Method that displays favourite media
    public void displayFavourites(){
       
        Iterator<Media> it = mediaList.iterator();

        for (int i = 0; i < mediaList.size(); i++){

            Media media = it.next();
           
            if (media.isFavourite()){
                
                System.out.println("\n════════════════════════════ \n");
                media.displayInformation();
                System.out.println("\n════════════════════════════ \n");
            }
        }
    }

    //Method that displays all titles in the list
    public void displayAllTitles(){

        Iterator<Media> it = mediaList.iterator();

        for (int i = 0; i < mediaList.size(); i++){

            Media media = it.next();
            System.out.println( (i + 1) + " - " + media.getTitle());
            System.out.println("");
        }
    }

    //Method that displays all media information in the list
    public void displayAllInfo(){

        Iterator<Media> it = mediaList.iterator();

        for (int i = 0; i < mediaList.size(); i++){

            Media media = it.next();
          
            System.out.println("════════════════════════════ \n");
            System.out.println(i + 1 );
            System.out.println("");
            media.displayInformation();
            System.out.println("\n════════════════════════════ \n");
        }
    }
}
