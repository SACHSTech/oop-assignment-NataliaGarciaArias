package oopAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

import oopAssignment.Media;
import oopAssignment.Movie;
import oopAssignment.Series;

public class List {
    
    private ArrayList<Media> mediaList;
    private String name;

    public List(String name){
        mediaList = new ArrayList<Media>();

        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public ArrayList<Media> getWholeList(){
        return mediaList;
    }

    public void displayAllTitles(){

        Iterator<Media> it = mediaList.iterator();

        for (int i = 0; i < mediaList.size(); i++){

            Media media = it.next();
            System.out.println( (i + 1) + " - " + media.getTitle());
            System.out.println("");
        }
    }

    public Media getMedia(int index){

       Media media = mediaList.get(index);

       return media;
    }


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

    public HashSet<String> getFaveGenres(){

        Iterator<Media> it = mediaList.iterator();
        HashSet<String> genres = new HashSet<String>();

        for (int i = 0; i < mediaList.size(); i++){

            Media media = it.next();

            if (media.isFavourite()){
                genres.add(media.getGenre());

            }
        }
        
        // System.out.println("Favourite genres are: " + (genres));
        return genres;
       

    }

    public void addMovie(Movie newMovie){

        mediaList.add(newMovie);
    }

    public void deleteMovie(Movie toDelete){
        mediaList.remove(toDelete);
    }

    public void addSeries(Series newSeries){
        mediaList.add(newSeries);
    }

    public void deleteSeries(Series toDelete){
        mediaList.remove(toDelete);
    }


}
