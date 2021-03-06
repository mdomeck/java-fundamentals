/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String returnString = theLinter("src/main/resources/gates.js");
        System.out.println(returnString);
    }
        public static String theLinter(String filePath){

        Scanner gates;
        try {
            gates = new Scanner(new File(filePath));

        } catch (FileNotFoundException e) {
            System.out.println("We couldn't find that file.");
            return "Did not find file";
        }


        int lineNumber = 0;
        String errorString = "";

        while(gates.hasNextLine()){

            lineNumber++;
            String temp = gates.nextLine();
            if(!temp.isBlank()) {

                char endChar = temp.charAt(temp.length() -1);
                if (!(endChar == ';' || endChar == '{' || endChar == '}' || temp.contains("if") || temp.contains("else"))) {


                    if(errorString.isBlank()){

                        errorString = "Line " + lineNumber + ": Missing semicolon";
                    } else {
                        errorString = errorString + "\nLine " + lineNumber + ": Missing semicolon";
                    }
                }
              }
        }

        return errorString;
    }
}