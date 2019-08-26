package com.epam.mikhail_gorbachenko.java.lesson1.task2;

import com.epam.mikhail_gorbachenko.java.utils.Utils;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Написать программу, осуществляющую обработку строк
 * Вариант 2:
 * Ввести n строк с консоли. Вывести на консоль те строки, длина которых больше средней, а также длину.
 */

public class Option2 {

    public static void main(String[] args) throws IOException {

        ArrayList<String> inputText = Utils.StringTools.consoleInput();

        Option2 app = new Option2();
        app.stringsThatLargerAverage(inputText);


    }

    void stringsThatLargerAverage(ArrayList<String> list){
        int averageLength = Utils.StringTools.averageLengthOfStringsInList(list);

        System.out.println("Average length is " + averageLength +
                           "\nstrings with length larger then average:");
        for (String line: list) {
            if(line.length()>averageLength){
                System.out.println(" \"" + line +"\"  | length: " + line.length() );
            }
        }

    }

}
