package com.epam.mikhail_gorbachenko.java.lesson1.task2;

import com.epam.mikhail_gorbachenko.java.utils.Utils;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Написать программу, осуществляющую обработку строк
 * Вариант 5:
 * Ввести n слов с консоли. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.
 */
public class Option5 {

    public static void main(String[] args) throws IOException {

        ArrayList<String> inputText = Utils.StringTools.consoleInput(true);

        Option5 app = new Option5();
        app.wordFromAllUniqueChars(inputText);

    }

    void wordFromAllUniqueChars (ArrayList<String> list){
        boolean isFind = false; //хотя она по умолчанию инициализируется false

        for (String word: list) {
            if (word.length() == Utils.StringTools.uniqueCharsInWord(word)){
                System.out.println("Word from all unique characters is \"" + word +"\"");
                isFind = true;
                break; //мы же ищем первое
            }
        }

        if(!isFind){
            System.out.println("Seems like word from all unique character not exist");
        }
    }

}
