package com.epam.mikhail_gorbachenko.java.lesson1.task1;

import com.epam.mikhail_gorbachenko.java.utils.Utils;

import java.util.HashMap;
import java.util.Map;

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
        arrayHandler.option6(array); //задать задание тут

    }

    /**
     * Вариант 1:
     * В массиве целых чисел поменять местами максимальный отрицательный элемент  и минимальный положительный.
     * (ВОПРОС: их же может быть несколько?) Заменить надо первый из встретившихся элементов.
     */
    public void option1(int[] array){
        int maxNegotive = -11; //максимальное негативное число
        int indexMaxNeg = 0; //позиция максимального негативного числа
        int minPozitive = 11; //минимальное позитивное число
        int indexMinPos = 0; //позиция минимального позитвного числа

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

            System.out.println("\nMax negotive: " + maxNegotive + "\n" + "Min positive: " + minPozitive + "\n");
            Utils.ArrayTools.printArray(array);
        }


    /**
     * Вариант 2:
     * В массиве целых чисел определить сумму элементов, состоящих на чётных позициях.
     * @param array
     */
    public void option2(int[] array){
        int summIndex = 0; //сумма по индексам (от нуля)
        int summPos = 0; //сумма по позициям (от единицы)

        for(int i=0; i<(array.length-1); i++){
            if(Utils.ArrayTools.digitIsEven(i)){
                summIndex = summIndex + array[i];
            }

            if(Utils.ArrayTools.digitIsEven(i+1)){
                summPos = summPos + array[i];
            }
        }

        System.out.println("\n Summ of numbers on even indexes is: " + summIndex +
                            "\n Summ of numbers on even position is: " + summPos);

    }

    /**
     * В массиве целых чисел заменить нулями отрицательные элементы.
     * @param array
     */
    public void option3(int[] array){

        for(int i = 0; i<(array.length-1); i++){
            if (array[i] < 0){
                array[i] = 0;
            }
        }

        System.out.println("\n Convert negative to zero...");
        Utils.ArrayTools.printArray(array);

    }


    /**
     * Вариант 4
     * В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным.
     * @param array
     */
    public void option4(int[] array){

        for (int i = 0; i < (array.length-2); i++){ //array.length-2 Потому что последнее число нас не интересует и делать лишнюю проверку(чтобы не выскочить за пределы) в цикле не имеет смысла, думаю
            if(array[i+1]<0){
                array[i]=(array[i]*3);
            }
        }
        System.out.println("\n new array is");
        Utils.ArrayTools.printArray(array);

    }

    /**
     * Вариант 5
     * В массиве целых чисел найти разницу между средним арифметическим и значением минимального элемента.
     * @param array
     */
    public void option5(int[] array){
        int min = 11; //минимальное число
        int average = 0; //среднее арефметическое // сначала используется как сумма, а после цикала делится на количесво элементов. Лучше использовать разные переменный для этого?
        int result = 0; //результируящая переменная.

        for(int i =0; i<(array.length-1); i++){
            average = average + array[i];
            if(array[i]< min){
                min = array[i];
            }
        }

        average = average/(array.length); //можно было бы и просто на 20, но так универсальнее

        result = Math.abs(average-min);

        System.out.println("\nAverage is: "+ average +
                           "\nMin is: " + min +
                           "\nDifference is: " + result);

    }

    /**
     * Вариант 6
     * В массиве целых чисел вывести все элементы, которые встречаются больше одного раза и индексы которых нечётные.
     * @param array
     */
    public void option6(int[] array){
        //В карте хранится (число: количество вхождений)
        Map<Integer,Integer> encounteredDigits = new HashMap<Integer,Integer>(); //порядок неважен поэому просто HashMap

        for(int i=0; i<(array.length-1); i++){
            //TODO: Стоит ли продолжать использовать array[i] или лучше завести переменную с простым именем?
            //сказано про нечетные *индексы*
            if(!Utils.ArrayTools.digitIsEven(i)){ //нас интересуют только нечетные индексы
                if (encounteredDigits.containsKey(array[i])){ //если тако элемент есть в мапе
                    encounteredDigits.put(array[i], (encounteredDigits.get(array[i]) + 1) ); //прибавляем к значению еденичку
                } else {
                    encounteredDigits.put(array[i], 1); //если нет кладем число и ставим количество вхождений
                }
            }
        }

        for (Map.Entry<Integer,Integer> item: encounteredDigits.entrySet()) {
            if(item.getValue()>1){
                System.out.print("\nDigit " + item.getKey() + " was encountered " + item.getValue() +" times");
            }
        }

    }


}
