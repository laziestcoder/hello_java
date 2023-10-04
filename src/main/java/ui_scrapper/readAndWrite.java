package ui_scrapper;

import java.io.*;
import java.util.Scanner;

/**
 * @author Towfiqul Islam
 * @since 10/4/23 8:22 AM
 */

// "Hello World!!" in the text file, read from the text file and print the content in the console

public class readAndWrite {
    private static String FILE_NAME= "text.txt";
    private static String VALUE= "Hello World!!";

    public static void main(String[] args) {
        writeInAFile(VALUE,  FILE_NAME);
        readFromAFile(FILE_NAME);
    }

    private static void writeInAFile(String text, String fileName){
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(text);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromAFile(String filename){
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
