/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution 45
 *  Copyright 2021 Michael Andrich
 */




package baseline;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// create a class that will read the file

class readFile {
    // create the array to store input
    ArrayList<String> list;

    public readFile() throws FileNotFoundException {
        // read in the path of the input file
    }

    public void readFile() {
        // use try to read in the file
        try {
            // use a loop to read in the file
            // store into list
        } finally {
            // close the file
            sc.close();
        }
    }

}

// create a class to write into the file

class writeFile {
    // create instance variable
    ArrayList<String> list;

    public writeFile(String name, ArrayList<String> list) throws IOException{
        // write to file and destination
    }
    public void writeFile() throws IOException {
        // create a loop to go through the input
        for(int i = 0; i<list.size(); i++){
            ...

            // replace the word utilize with the word use
            replaceAll();

            // write the changes to the file
        }
    }
}


public class solution45 {
    public void main(String[] args) throws IOException{
        // scan in the output file name from user
        Scanner sc = new Scanner(System.in);

        // prompt user
        System.out.printf("Enter the output file name: ");

        // call readFile to read the file

        // call writeFile

    }
}
