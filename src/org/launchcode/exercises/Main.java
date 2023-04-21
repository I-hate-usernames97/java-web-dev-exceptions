package org.launchcode.exercises;

import org.launchcode.Temperature.TemperatureException;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

//        Divide(2, 0);
        Divide(157,1);


        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram");

        for(Map.Entry<String, String> studentFile : studentFiles.entrySet()) {
            System.out.println(studentFile.getKey() + ": " + CheckFileExtension(studentFile.getValue()));
        }

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y) {
        // Write code here!
        if (y <= 0) {
            try{
                throw new ArithmeticException("you can't Divide by 0!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        System.out.println(x / y);
    }

    public static int CheckFileExtension(String fileName) {
        int points = 0;
        // Write code here!
        if (fileName.contains(".java")) {
            points += 1;
        } else if (fileName.equals("")|| fileName == null) {
            try {
                throw new Exception("No file name");
            } catch (Exception e) {
                e.printStackTrace();
            }
            points -= 1;
        }

        return points;


    }
}
