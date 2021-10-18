/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution 43
 *  Copyright 2021 Michael Andrich
 */


package baseline;


import java.net.URI;
import java.nio.file.Paths;
import java.util.Scanner;

public class solution43 {
    public static void main(String[] args){
        // scan in the input of user
        Scanner sc = new Scanner(System.in);

        String siteName;
        String author;
        String inJS;
        String inCSS;

        // read input of the site name
        System.out.printf("Site name: ");
        siteName = sc.nextLine();

        // "" author
        System.out.printf("Author: ");
        author = sc.nextLine();

        // read input of y or n for JS folder
        System.out.printf("Do you want a folder for JavaScript? ");
        inJS = sc.nextLine();

        // "" for CSS folder
        System.out.printf("Do you want a folder for CSS? ");
        inCSS = sc.nextLine();
        // store all inputs as strings

        // call websiteGenerator

        websiteGenerator newWebsite = new websiteGenerator();

        // set the author, website name
        newWebsite.siteName = siteName;
        newWebsite.author = author;

        // create path for output
        newWebsite.path = Paths.get(URI.create("file:///ThisPC/Desktop/JavaObject/Andrich-a04/exercise43/src/main/docs"));

        // create the website along with the HTML file
        System.out.printf("Created " + newWebsite.createWebsite());
        System.out.printf("Created " + newWebsite.createHTML());

        // output the created JS or CSS files if inputted y
        if(inJS.equals("y"))
            System.out.printf("Created " + newWebsite.createJSFolder());

        if(inCSS.equals("y"))
            System.out.printf("Created " + newWebsite.createCSSFolder());

    }
}
