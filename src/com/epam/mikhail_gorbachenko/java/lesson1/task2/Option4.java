package com.epam.mikhail_gorbachenko.java.lesson1.task2;

import com.epam.mikhail_gorbachenko.java.utils.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Написать программу, осуществляющую обработку строк
 * Вариант 4:
 * Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.
 */

public class Option4 {

    public static void main(String[] args) throws IOException {

        ArrayList<String> inputText = Utils.StringTools.consoleInput(true);

        Option4 app = new Option4();
        app.findWordWithMinimalDiversity(inputText);

    }

    void findWordWithMinimalDiversity(ArrayList<String> list){
        int minDiversity = Integer.MAX_VALUE;
        String wordWithMinimalDiversity = "";
        HashSet<Character> setOfChars = new HashSet<Character>(); //по его размеру я буду определять количество разных символов

        for (String word: list) {
            int diversityOfTheWord = Utils.StringTools.uniqueCharsInWord(word);
                if(diversityOfTheWord<minDiversity){
                    minDiversity=diversityOfTheWord;
                    wordWithMinimalDiversity = word;
            }
        }

        System.out.println("Word with minimal diversity is \"" + wordWithMinimalDiversity + "\" and it diversity is " + minDiversity);

    }

}
