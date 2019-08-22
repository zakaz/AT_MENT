package com.epam.mikhail_gorbachenko.java.lesson1.task1;

import com.epam.mikhail_gorbachenko.java.utils.Utils;

/**
 * Написать программу, осуществляющую обработку массива.
 * Исходные условия: массив содержит только целые числа от -10 до 10,
 * программа должна выводить в консоль исходный массив и полученный результат,
 * количество элементов в массиве 20.
 */

public class ArrayHandler {

    //генерировать и печатать массивы буду в майне
    public static void main(String[] args) {

        ArrayHandler handler =

    }

    /**
     * Вариант 1:
     * В массиве целых чисел поменять местами максимальный отрицательный элемент  и минимальный положительный.
     */
    public void option1(int[] array){ //TODO: айяяй забыл что их надо менть местами.
        int maxNegotive = -11;
        int minPozitive = 11;

        for (int i: array) {
            if(i<0){ //если отрицательное
                if(i>maxNegotive){ //и больше чем прошлый максимум. Разнес для удобства(ну как мне показалось) на разные ифы.
                    maxNegotive = i;
                }
            } else { // если ноль или положительное, можно было и без else
                if (i<minPozitive){
                    minPozitive = i;
                }
            }

            System.out.println("Максимальное отрицательное: " + maxNegotive + "\n" + "Минимальное положительное: " + minPozitive);


        }

    }

}
