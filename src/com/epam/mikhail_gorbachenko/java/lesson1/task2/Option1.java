package com.epam.mikhail_gorbachenko.java.lesson1.task2;

import com.epam.mikhail_gorbachenko.java.utils.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Написать программу, осуществляющую обработку строк
 * Вариант 1:
 * Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
 */
public class Option1 {

    public static void main(String[] args) throws IOException {

        ArrayList<String> inputText = Utils.StringTools.consoleInput();

        Option1 app = new Option1();
        app.maxAndMinStringWithLength(inputText);


    }

    void maxAndMinStringWithLength(ArrayList<String> list){
        int minLength = Integer.MAX_VALUE; //TODO: завести константы?
        int maxLength = -1;
        //сеты для хранения строк максимальной длинны и минимальной. Сеты не содержат одинаковых значений, но по условию задачи и этого не нужно...
        HashSet<String> maxLengthSet = new HashSet<String>();
        HashSet<String> minLengthSet = new HashSet<String>();

        //Можно конечно отсортировать и взять первое и последнее и не гонять цикл два раза.

        for (String line: list) {
            if(line.length()<minLength){
                minLength = line.length();
            }
            if (line.length()>maxLength){
                maxLength = line.length();
            }
        }

        //если длины максимальной и минимальной строки одинаковы + как вариант без хранения найденных строк (Просто печатаются в консоль)
        if(maxLength == minLength){
            System.out.println("Seems like all strings about equal length...");
            for (String line: list) {
                if(line.length() == maxLength) { //или minLength вообще без разницы
                    System.out.println(line);
                }
            }
        } else {//если длины строк отличаются + как вариант с хранением строк
            //Заполнение сетов. Вообще прямо здесь и можно было выводить все в консоль
            for(String line: list){
                if(line.length() == minLength){
                    minLengthSet.add(line);
                }
                if (line.length() == maxLength){
                   maxLengthSet.add(line);
                }
            }
                System.out.println("Max length is " + maxLength);
                Utils.StringTools.printSetContent(maxLengthSet);
                System.out.println("Min length is " + minLength);
                Utils.StringTools.printSetContent(minLengthSet);

        }


    }

}
