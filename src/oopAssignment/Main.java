package oopAssignment;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("start ----- ");
        List myList = new List("My List");
        Movie testMovie = new Movie("Finding Nemo", "Children's Animation", 2003, 8,"Andrew Stanton", 100);
        Series testSeries = new Series("The Office", "Comedy", 2005, 7, 9, 201, 22);
    
        myList.addMovie(testMovie);
        myList.addSeries(testSeries);

        

       

       

    }

    //Method that displays menu options
    private void displayMenu(){
       
        String menuTitle = "Menu Title";
        ArrayList<String> menuOptions = new ArrayList<String>();
        menuOptions.add("View My List");
        menuOptions.add("Edit My List");
        menuOptions.add("View My Recommendations");


        System.out.println("   "+ menuTitle +"    ");
        System.out.println("--------------------");

         for (int i = 0; i < menuOptions.size(); i++){
             
            System.out.println("  " + (i + 1) + " - " + menuOptions.get(i));
         }

    }

    private static void recommendMedia(List inputList){

        ArrayList<String> genres = new ArrayList<String> (inputList.getFaveGenres());
        String current;
        Media currentM;

        List myRecommendations = recommendations();

        System.out.println("Since your favourite genres are..." + inputList.getFaveGenres());
        System.out.println("Here are your recommendations: ");

        for (int i = 0; i < genres.size(); i++){
            current = genres.get(i);

            switch(current)
            {
                case "Crime":

                for (int j = 0; j <= 2; j++){
                currentM = myRecommendations.getMedia(j);

                    if (!currentM.hasWatched()){
                        currentM.displayInformation();
                    }
                }
                    break;

                case "Comedy":

                for (int j = 3; j <= 5; j++){
                currentM = myRecommendations.getMedia(j);

                    if (!currentM.hasWatched()){
                        currentM.displayInformation();
                    }
                }

                    break;

                case "Action":

                for (int j = 6; j <= 8; j++){
                currentM = myRecommendations.getMedia(j);

                    if (!currentM.hasWatched()){
                        currentM.displayInformation();
                    }
                }

                    break;

                case "Romance":

                for (int j = 9; j <= 11; j++){
                currentM = myRecommendations.getMedia(j);

                    if (!currentM.hasWatched()){
                        currentM.displayInformation();
                    }
                }

                    break;

                case "Animation":

                for (int j = 12; j <= 14; j++){
                currentM = myRecommendations.getMedia(j);

                    if (!currentM.hasWatched()){
                        currentM.displayInformation();
                    }
                }

                    break;

                default:

                System.out.println("error");

            }
        }


    }

    //Method Initializes Recommendations List
    public static List recommendations(){

        List recommendList = new List("My Recommendations");


        //Crime = 0 - 2
        Movie knivesOut = new Movie("Knives Out", "Crime", 2019, 0, "Rian Johnson", 130);
        Movie irishMan = new Movie("The Irishman", "Crime", 2019, 0, "Martin Scorsese", 210);
        Series criminalMinds = new Series("Criminal Minds", "Crime", 2005, 0, 15, 324, 42);
        
        recommendList.addMovie(knivesOut);
        recommendList.addMovie(irishMan);
        recommendList.addSeries(criminalMinds);

        //Comedy - 3 - 5
        Movie superBad = new Movie("Superbad", "Comedy", 2007, 0, "Greg Mottola", 113);
        Movie jumpStreet = new Movie("21 Jumpstreet", "Comedy", 2012, 0, "Phil Lord", 110);
        Series brook99 = new Series("Brooklyn Nine Nine", "Comedy", 2013, 0, 7, 173, 24);

        recommendList.addMovie(superBad);
        recommendList.addMovie(jumpStreet);
        recommendList.addSeries(brook99);


        //Action 6 - 8
        Movie avengers = new Movie("The Avengers", "Action", 2012, 0, "Joss Whedon", 144);
        Movie nerve = new Movie("Baby Driver", "Action", 2017, 0, "Edgar Wright", 113 );
        Series umbrellaAcademy = new Series("The Umbrella Academy", "Action", 2019, 0 , 2, 20, 52);

        recommendList.addMovie(avengers);
        recommendList.addMovie(nerve);
        recommendList.addSeries(umbrellaAcademy);
        

        //Romance - 9 - 11
        Movie loveSimon = new Movie("Love, Simon", "Romance", 2018, 0, "Greg Berlanti", 110);
        Movie starIsBorn = new Movie ("A Star is Born", "Romance", 2018, 0, "Bradley Cooper", 134 );
        Series janeTheVirgin = new Series("Jane The Virgin", "Romance", 2014, 0, 5, 100, 40);

        recommendList.addMovie(loveSimon);
        recommendList.addMovie(starIsBorn);
        recommendList.addSeries(janeTheVirgin);

        //Animation 12 - 14

        Movie raya = new Movie("Raya and The Last Dragon", "Animation", 2021, 0, "Carlos Lopez Estrada & Don Hall", 117);
        Movie monstersUni = new Movie("Monsters University", "Animation", 2013, 0, "Dan Scanlon", 103);
        Series gravityFalls = new Series("Gravity Falls", "Animation", 2012, 0, 2, 40, 23);

        recommendList.addMovie(raya);
        recommendList.addMovie(monstersUni);
        recommendList.addSeries(gravityFalls);

        return recommendList;
    }
}