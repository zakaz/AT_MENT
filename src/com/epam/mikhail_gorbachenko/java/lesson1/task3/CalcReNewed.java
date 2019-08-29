package com.epam.mikhail_gorbachenko.java.lesson1.task3;

import java.util.Scanner;

public class CalcReNewed {
    enum state{ //состояния автомата
        FIRST,
        CMD,
        SECOND_DIGIT
    };

    public static void main(String[] args) {

    }



    private String readLine(){
        System.out.println("Please enter command in format a [+,-,*,/] b:");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
