package com.epam.mikhail_gorbachenko.java.utils;

/**
 * Утилиты типа генерации массива и строк и т.д.
 */

public class Utils {

    public static class ArrayTools{

        public static int[] intArrayGenerator(){
          int[] array = new int[20];
          int min = -11;
          int max = 10;
            for (int i = 0; i < 19; i++) {
                array[i] = (int) (Math.random()*(max - min) +1) + min; //TODO: что-то с этим сделать
            }
            return array;
        }

        public static void printArray(int[] array){
            for (int i: array) {
                System.out.print(i + " ");
            }

        }

    }
}
