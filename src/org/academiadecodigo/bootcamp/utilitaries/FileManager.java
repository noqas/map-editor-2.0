package org.academiadecodigo.bootcamp.utilitaries;

import java.io.*;


public class FileManager {

    //properties
    private static final String filePath = "/Users/codecadet/Desktop/Workspace/Projects/Week6/MapEditor2.0/resources/binaryGrid.txt";


    //methods
    public static void writeFile(String file) { // save

        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(file);
            bufferedWriter.close();
        }
        catch (IOException e) {
            System.out.println("IO Exception");
        }
    }


    public static String readFile() { // load

        String result = "";

        try {
            String line;
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                result += line + "\n"; // a break to not print in a single line
            }
            bufferedReader.close();
        }
        catch (IOException o) {
            System.out.println("IO Exception");
        }

        return result;
    }
}
