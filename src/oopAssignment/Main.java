package oopAssignment;


import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import oopAssignment.Media;
import oopAssignment.Movie;
import oopAssignment.Series;
import oopAssignment.List;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        
        List myList = new List("My List");
        List myRecommendations = recommendations();

        Movie findingNemo = new Movie("Finding Nemo", "Animation", 2003, 6,"Andrew Stanton", 100);
        Movie inception = new Movie("Inception", "Action", 2010, 10,"Christopher Nolan", 162);
        Movie avengers = new Movie("The Avengers", "Action", 2012, 0, "Joss Whedon", 144);
        Series theOffice = new Series("The Office", "Comedy", 2005, 7, 9, 201, 22);
    
        myList.addMedia(findingNemo);
        myList.addMedia(inception);
        myList.addMedia(avengers);
        myList.addMedia(theOffice);
        

        //Initiate variables

        String username;
        int userchoice = 0;
        int userchoice2 = 0;
        boolean exitNatflix = false;

        //Welcome Page

        System.out.println("");
        System.out.println("███╗   ██╗ █████╗ ████████╗███████╗██╗     ██╗██╗  ██╗");
        System.out.println("████╗  ██║██╔══██╗╚══██╔══╝██╔════╝██║     ██║╚██╗██╔╝");
        System.out.println("██╔██╗ ██║███████║   ██║   █████╗  ██║     ██║ ╚███╔╝ ");
        System.out.println("██║╚██╗██║██╔══██║   ██║   ██╔══╝  ██║     ██║ ██╔██╗ ");
        System.out.println("██║ ╚████║██║  ██║   ██║   ██║     ███████╗██║██╔╝ ██╗");
        System.out.println("╚═╝  ╚═══╝╚═╝  ╚═╝   ╚═╝   ╚═╝     ╚══════╝╚═╝╚═╝  ╚═╝");
        System.out.println("");
        System.out.println("Your favourite media library!");
        System.out.println("");
        System.out.print("Who's watching today? Please enter your first name: ");
        username = key.readLine();

        wait(2);
        System.out.println("");
            System.out.println("Here is your list of watched TV Series and Movies: ");
            wait(1);
            myList.displayAllInfo();

        while (!exitNatflix){

            displayMenu(username);
            userchoice = Integer.parseInt(key.readLine());

            switch (userchoice){

                //Displays favourite movies and shows (rating is equal or above 7)
                case 1: System.out.println("Here are your favourite TV Series and Movies: ");
                        myList.displayFavourites();
                        break;
                
                //Displays my list
                case 2: myList.displayAllInfo();
                        break;

                //Displays recommendations based off user's favourite genres 
                case 3: recommendMedia(myList, myRecommendations);
                        System.out.println("We hope you like these recommendations!");
                        System.out.println("If you watched any of these, please enter the index. If not, enter 0 ");
                        userchoice2 = Integer.parseInt(key.readLine());

                        //Asks the user for the media rating given the index and adds media to watched list
                        if (userchoice2 != 0){
                            System.out.print("Rate "+ myRecommendations.getMedia(userchoice2 - 1).getTitle()+ " : ");
                          
                            int rating = Integer.parseInt(key.readLine());
                            myRecommendations.getMedia(userchoice2 - 1).setRating(rating);
                            myList.addMedia(myRecommendations.getMedia(userchoice2 - 1));
                            
                        }
                        break;

                //Displays all recommendations
                case 4: myRecommendations.displayAllInfo();
                        System.out.println("If you watched any of these, please enter the index. If not, enter 0 ");
                        userchoice2 = Integer.parseInt(key.readLine());

                        if (userchoice2 != 0){
                            System.out.print("Rate "+ myRecommendations.getMedia(userchoice2 - 1).getTitle()+ " : ");
                        
                            int rating = Integer.parseInt(key.readLine());
                            myRecommendations.getMedia(userchoice2 - 1).setRating(rating);
                            myList.addMedia(myRecommendations.getMedia(userchoice2 - 1));
                            
                        }
                        break;
                
                //Exits program if user inputs 5
                case 5: exitNatflix = true;
                        System.out.println("Leaving Natflix...Goodbye!");
                        break;
            }
        }
    }

    //Method that adds a delay in the program operations
    private static void wait(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

    //Method that displays menu options
    private static void displayMenu(String username){
       
        ArrayList<String> menuOptions = new ArrayList<String>();
        menuOptions.add("View My Favourites");
        menuOptions.add("View My List");
        menuOptions.add("Show me recommendations based off my favourite genres");
        menuOptions.add("I want to expand my taste, show me all recommendations!");
        menuOptions.add("Exit Natflix");

        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("Choose what you would like to do:");

         for (int i = 0; i < menuOptions.size(); i++){
             
            System.out.println("  " + (i + 1) + " - " + menuOptions.get(i));
         }

    }

    //Method that takes in watched list and recommendations list and returns
    //Recommendations based off user's favourite genres
    private static void recommendMedia(List inputList, List myRecommendations){

        ArrayList<String> genres = new ArrayList<String> (inputList.getFaveGenres());
        String current;
        Media currentM;


        System.out.println("Since your favourite genres are..." + inputList.getFaveGenres());
        System.out.println("Here are your recommendations: ");

        //Scan through list of favourite genres and returns recommendations
        for (int i = 0; i < genres.size(); i++){
            current = genres.get(i);

            switch(current)
            {
                case "Crime":

                for (int j = 0; j <= 2; j++){
                currentM = myRecommendations.getMedia(j);

                    if (!currentM.hasWatched()){
                        
                        System.out.println("\n════════════════════════════ \n");
                        System.out.println(j + 1 );
                        currentM.displayInformation();
                        System.out.println("\n════════════════════════════ \n");
                    }
                }
                    break;

                case "Comedy":

                for (int j = 3; j <= 5; j++){
                currentM = myRecommendations.getMedia(j);

                    if (!currentM.hasWatched()){
                        System.out.println("\n════════════════════════════ \n");
                        System.out.println(j + 1 );
                        currentM.displayInformation();
                        System.out.println("\n════════════════════════════ \n");
                    }
                }

                    break;

                case "Action":

                for (int j = 6; j <= 8; j++){
                currentM = myRecommendations.getMedia(j);

                    if (!currentM.hasWatched()){
                        System.out.println("\n════════════════════════════ \n");
                        System.out.println(j + 1 );
                        currentM.displayInformation();
                        System.out.println("\n════════════════════════════ \n");
                    }
                }

                    break;

                case "Romance":

                for (int j = 9; j <= 11; j++){
                currentM = myRecommendations.getMedia(j);

                    if (!currentM.hasWatched()){
                        System.out.println("\n════════════════════════════ \n");
                        System.out.println(j + 1 );
                        currentM.displayInformation();
                        System.out.println("\n════════════════════════════ \n");
                    }
                }

                    break;

                case "Animation":

                for (int j = 12; j <= 14; j++){
                currentM = myRecommendations.getMedia(j);

                    if (!currentM.hasWatched()){
                        System.out.println("\n════════════════════════════ \n");
                        System.out.println(j + 1 );
                        currentM.displayInformation();
                        System.out.println("\n════════════════════════════ \n");
                    }
                }

                    break;   
            }
        }
    }

    //Method Initializes Recommendations List
    private static List recommendations(){

        List recommendList = new List("My Recommendations");


        //Crime = 0 - 2
        Movie knivesOut = new Movie("Knives Out", "Crime", 2019, 0, "Rian Johnson", 130);
        Movie irishMan = new Movie("The Irishman", "Crime", 2019, 0, "Martin Scorsese", 210);
        Series criminalMinds = new Series("Criminal Minds", "Crime", 2005, 0, 15, 324, 42);
        
        recommendList.addMedia(knivesOut);
        recommendList.addMedia(irishMan);
        recommendList.addMedia(criminalMinds);

        //Comedy - 3 - 5
        Movie superBad = new Movie("Superbad", "Comedy", 2007, 0, "Greg Mottola", 113);
        Movie jumpStreet = new Movie("21 Jumpstreet", "Comedy", 2012, 0, "Phil Lord", 110);
        Series brook99 = new Series("Brooklyn Nine Nine", "Comedy", 2013, 0, 7, 173, 24);

        recommendList.addMedia(superBad);
        recommendList.addMedia(jumpStreet);
        recommendList.addMedia(brook99);


        //Action 6 - 8
        Movie avengersEndgame = new Movie("Avengers: Endgame", "Action", 2019, 0, "Joe & Anthony Russo", 182);
        Movie nerve = new Movie("Baby Driver", "Action", 2017, 0, "Edgar Wright", 113 );
        Series umbrellaAcademy = new Series("The Umbrella Academy", "Action", 2019, 0 , 2, 20, 52);

        recommendList.addMedia(avengersEndgame);
        recommendList.addMedia(nerve);
        recommendList.addMedia(umbrellaAcademy);
        

        //Romance - 9 - 11
        Movie loveSimon = new Movie("Love, Simon", "Romance", 2018, 0, "Greg Berlanti", 110);
        Movie starIsBorn = new Movie ("A Star is Born", "Romance", 2018, 0, "Bradley Cooper", 134 );
        Series janeTheVirgin = new Series("Jane The Virgin", "Romance", 2014, 0, 5, 100, 40);

        recommendList.addMedia(loveSimon);
        recommendList.addMedia(starIsBorn);
        recommendList.addMedia(janeTheVirgin);

        //Animation 12 - 14

        Movie raya = new Movie("Raya and The Last Dragon", "Animation", 2021, 0, "Carlos Lopez Estrada & Don Hall", 117);
        Movie monstersUni = new Movie("Monsters University", "Animation", 2013, 0, "Dan Scanlon", 103);
        Series gravityFalls = new Series("Gravity Falls", "Animation", 2012, 0, 2, 40, 23);

        recommendList.addMedia(raya);
        recommendList.addMedia(monstersUni);
        recommendList.addMedia(gravityFalls);

        return recommendList;
    }
}