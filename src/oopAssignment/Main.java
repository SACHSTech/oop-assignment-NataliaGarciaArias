package oopAssignment;

import java.io.*;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" start ----- ");
        List myList = new List("My List");
        Movie testMovie = new Movie("Finding Nemo", "Children's Animation", 2003, "Andrew Stanton", 100);
        Series testSeries = new Series("The Office", "Comedy", 2005, 9, 201, 22);

        myList.addMovie(testMovie);
        myList.addSeries(testSeries);

        myList.displayAllInfo();
    }

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
}