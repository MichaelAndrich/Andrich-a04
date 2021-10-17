/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution 42
 *  Copyright 2021 Michael Andrich
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class solution42 {

    public void formatFile(String filename){
        try {
            // scan in file
            File file = new File(filename);
            Scanner sc = new Scanner(file);

            // create loop to read and parse with ,
            while(sc.hasNext()) {
                String s = sc.nextLine();
                String[] temp = s.split(",");
                // format output
                System.out.printf("%-10s%-10s%-10s%n", temp[0], temp[1], temp[2]);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: File not found");
        }

    }
public static void main(String[] args){
        solution42 Employee = new solution42();
        System.out.printf("%-10s%-10s%-10s%n", "Last", "First", "Salary");
        System.out.printf("---------------------------");
        Employee.formatFile("exercise42_input.txt");
    }
}