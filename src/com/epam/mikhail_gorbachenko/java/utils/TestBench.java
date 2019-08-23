package com.epam.mikhail_gorbachenko.java.utils;

/**
 * Класс для проверки кусочков
 */
public class TestBench {

    public static void main(String[] args) {

        int[] array = Utils.ArrayTools.intArrayGenerator();
        Utils.ArrayTools.printArray(array);
        array = Utils.ArrayTools.swapArrayElements(array,0,19);
        System.out.println("\n Абракадабра");
        Utils.ArrayTools.printArray(array);

        if(Utils.ArrayTools.digitIsEven(3)){
            System.out.println("\nyeah");
        } else {
            System.out.println("nope");
        }

    }

}
