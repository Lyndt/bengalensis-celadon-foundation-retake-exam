package com.worstsong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WorstSong {
    public static void main(String[] args) throws FileNotFoundException {
        //TODO: get path to filename from main
        System.out.println(worstYearInMusic("src/com/worstsong/100worst.csv"));
    }
        //TODO: I found nice solution with scanner(https://stackoverflow.com/questions/13185727/reading-a-txt-file-using-scanner-class-in-java/13185765)
    public static String worstYearInMusic(String filename) throws FileNotFoundException {
        Map<String, Integer> yearSongCounterMap = new HashMap<>();
        try {
            File file = new File(filename);
            Scanner dataReader = new Scanner(file);
            while (dataReader.hasNextLine()) {
                String data = dataReader.nextLine();

                String[] splitDataBy = data.split(";");
                String year = splitDataBy[3];

                Integer counter = yearSongCounterMap.get(year);
                if (counter == null) {
                    yearSongCounterMap.put(year, 1);
                } else {
                    yearSongCounterMap.put(year, ++counter);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        int maxInt = 0;
        String maxYearValue = "";


        return null;

    }

}
