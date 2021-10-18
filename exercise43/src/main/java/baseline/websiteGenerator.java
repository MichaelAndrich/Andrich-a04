

package baseline;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;

public class websiteGenerator {
    // creates the characteristics of the website
    // author, name of website, and path
    String siteName;
    String author;
    Path path;

    // make a function that creates a website folder
    public String createWebsite(){

        // set the directory of the created folder
        String directory = path + siteName;
        File newFolder = new File(directory);

        // return the directory
        newFolder.mkdir();
        return directory;
    }

    // make a function that creates a JS folder
    public String createJSFolder() {
        // same as before, set the directory of the created folder
        String directory = path + siteName + "/js";
        File newFolder = new File(directory);

        // return the directory
        newFolder.mkdir();
        return directory;
    }

    // make a function that creates a CSS folder
    public String createCSSFolder() {
        // same as before, set the directory path of the created folder
        String directory = path + siteName + "/css";
        File newFolder = new File(directory);

        // return the directory
        newFolder.mkdir();
        return directory;
    }

    // make a function that creates an HTML file
    public String createHTML() {
        // set the path
        String directory = path + siteName + "/index.html";

        String htmlChar = "<title> " + siteName + "</title>\n<meta> " + author + " </meta>";

        // create the file
        File file = new File(directory);
        try {
            // write to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(htmlChar);
            writer.close();
            return directory;

        } catch (Exception ex) {
            return "Failure";
        }

    }

}

