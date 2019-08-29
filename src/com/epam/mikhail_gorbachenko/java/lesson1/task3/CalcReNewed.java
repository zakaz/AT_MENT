package com.epam.mikhail_gorbachenko.java.lesson1.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class CalcReNewed {

    enum States{ //состояния автомата
        INPUT,
        FIRST_DIGIT, //считываются числа как только попадается команда (+, - , /, *) переводится в состояние OPERATION или INPUT в случае неожиданного символа
        OPERATION,   //Ожидается одиночный символ (+, - , /, *) переводит в состояние SECOND_DIGIT
        SECOND_DIGIT, //Ожидается цифра переводит состояние в CALCULATE, если не цифра то переводит состояние в INPUT
        CALCULATE, //Идет расчет, вывод результата, завершение программы
        EXIT // не уверен надо ли но пусть пока будет в него можно попасть написав EXIT вместо выражения.
    }

    private final Character[] cmd = {'+','-','*', '/'};

    //TODO: надо ли добавить events? let's find it!

    public static void main(String[] args) {

    }

    private String readLine(){
        System.out.println("Please enter command in format a [+,-,*,/] b:");
        Scanner in = new Scanner(System.in);
        return in.nextLine().replace(" ", ""); //пробелы я все-таки удалю от греха подпльше
    }

    private void calculate(){
        Stack<String> stack = new Stack<>(); //стек для высичлений (в будущем для сложных операций)
        String input = ""; //текущий ввод
        StringBuffer element = new StringBuffer(""); //Чтобы не плодить строки пусть будет StringBuffer
        States state = States.INPUT; //переводим состояние в ожидание ввода

        switch (state){
            case INPUT:
                input = readLine();
                state = States.FIRST_DIGIT;
            case EXIT:
                System.out.println("Terminate");

                for (int i = 0; i<input.length(); i++) {
                    switch (state) {
                        case FIRST_DIGIT://TODO: нененене остановись и вернись как настроени думать будет, балда!
                            if (Character.isDigit(input.charAt(i))){
                                element.append(input.charAt(i));
                            } //if() //если входит в команды
                    }

                }


        }



    }

}
