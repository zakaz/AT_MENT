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

        int[] array = Utils.ArrayTools.intArrayGenerator();
        Utils.ArrayTools.printArray(array);

        ArrayHandler arrayHandler = new ArrayHandler();
        arrayHandler.option1(array);




    }

    /**
     * Вариант 1:
     * В массиве целых чисел поменять местами максимальный отрицательный элемент  и минимальный положительный.
     * (ВОПРОС: их же может быть несколько?) Заменить надо первый из встретившихся элементов.
     */
    public void option1(int[] array){ //TODO: айяяй забыл что их надо менть местами.
        int maxNegotive = -11;
        int indexMaxNeg = 0;
        int minPozitive = 11;
        int indexMinPos = 0;

        for (int i = 0; i<(array.length-1); i++) { //похоже из foeach не удастся забрать номер, надо делать через for.
            if (array[i] < 0) { //если отрицательное
                if (array[i] > maxNegotive) { //и больше чем прошлый максимум. Разнес для удобства(ну как мне показалось) на разные ифы.
                    maxNegotive = array[i];
                    indexMaxNeg = i;
                }
            } else { // если ноль или положительное, можно было и без else
                if (array[i] < minPozitive) {
                    minPozitive = array[i];
                    indexMinPos = i;
                }
            }
        }
            array = Utils.ArrayTools.swapArrayElements(array, indexMaxNeg, indexMinPos);

            System.out.println("\nМаксимальное отрицательное: " + maxNegotive + "\n" + "Минимальное положительное: " + minPozitive + "\n");
            Utils.ArrayTools.printArray(array);
        }


    /**
     * Вариант 2:
     * В массиве целых чисел определить сумму элементов, состоящих на чётных позициях.
     * @param array
     */
    public void option2(int[] array){

    }

    /**
     *
     * @param array
     */
    public void option3(int[] array){

    }

}
