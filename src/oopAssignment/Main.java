package oopAssignment;

import java.io.*;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("  ");
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