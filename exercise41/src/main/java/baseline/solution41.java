/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution 41
 *  Copyright 2021 Michael Andrich
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class fileNames{
    // create a class to sort through txt file names
    // put input.txt names into an array list
    public void fileNames(Scanner input, List<String> names){
        while(input.hasNextLine()){
            names.add(input.nextLine());
        }
    }
    // make sure the list is alphabetical and "Last, First"
    // also count how many names are inputted and print out the amount
}

class printOutput {
    // create an output file named exercise41_output.txt
    public void printOutput(List<String> names) throws IOException {
        FileWriter output = new FileWriter("exercise41_output.txt");
        // format the output file
        output.write("-----------\n");

        for(String i: names){
            output.write(i+ "\n");
        }
        output.close();
    }
}



public class solution41 {
    public void main(String[] args) throws FileNotFoundException{
        // read in input.txt
        Scanner inputFile = new Scanner(new File("exercise41_input.txt"));
        // declare the array list
        List<String> names = new List<String>();
    }

    // call nameSort into input.txt
    // write all data to output.txt once sorted
}
