package com.epam.mikhail_gorbachenko.java.utils;

import com.epam.mikhail_gorbachenko.java.exceptions.AT_MENT_Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Утилиты типа генерации массива и строк и т.д.
 */

public class Utils {

    public static class ArrayTools {

        /**
         * Генерирация массива для домашнего задания.
         * Т.к. параметры четко заданы условиям он генерирует массив int велечиной 20
         * Элементы заполняются случайными числами от -10 до 10
         *
         * @return - массив int[20]
         */
        public static int[] intArrayGenerator() {
            int[] array = new int[20];
            int min = -11; // так стремно задается диапазон
            int max = 10;
            for (int i = 0; i < 19; i++) {
                array[i] = (int) (Math.random() * (max - min) + 1) + min; //не очень красиво
            }
            return array;
        }

        /**
         * Печатает массив в консоль. Покормите его массивом.
         *
         * @param array - массив который надо распечатать.
         */
        public static void printArray(int[] array) {
            for (int i : array) {
                System.out.print(i + " ");
            }
        }

        /**
         * Меняет местами два элемента массива. По условию задачи массив всегда int[20].
         * Принимает исходный массив, а возвращает измененный.
         *
         * @param array   - массив int[20] в котором надо поменять местами элементы
         * @param index_a - индекс первого элемента
         * @param index_b - индекс второго элемента
         * @return - возвращает измененный массив int[20]
         */
        public static int[] swapArrayElements(int[] array, int index_a, int index_b) {
            indexCheker(index_a, array.length); //наверное не очень хорошее решение... Эксепшн и так будет кинут.
            indexCheker(index_b, array.length); //к тому же наверное можно было передать множественные значения для точного определения А или Б выходит за рамки
            int buffer; //буферная переменная

            buffer = array[index_a];
            array[index_a] = array[index_b];
            array[index_b] = buffer;

            return array;
        }

        /**
         * Проверяет пожхожит ли индекс под условия и бросает ексепшн если нет
         *
         * @param index       - индекс элеиента
         * @param arrayLength - длинна массива
         */
        private static void indexCheker(int index, int arrayLength) {
            if ((index < 0) || (index > arrayLength - 1)) {
                throw new AT_MENT_Exception("Элемента с индексом " + index + " не может быть в массиве на 20 элементов!");
            }
        }

        /**
         * Проверяет четное число или нет.
         * Используется для определения четных индексов, т.к. в задании встречается больее одного раза.
         *
         * @param digit
         * @return
         */
        public static boolean digitIsEven(int digit) { //TODO: перенести из аррей тулс
            if (digit % 2 == 0) {
                return true; //четное
            } else {
                return false; //не четное
            }
        }
    }

    /**
     * Класс для работы со строками
     */
    public static class StringTools {

        /**
         * Консольный ввод строк. (Для слов будет обработка с удалением пробелов и всем что следует за ними)
         * @return возврашает List<String> (строка) - но похоже скоро перестанет.
         * @throws IOException
         */
        public static ArrayList<String> consoleInput() throws IOException {

            ArrayList<String> strings= new ArrayList<String>();


            System.out.print("Follow the instructions, please. \nEnter string: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            boolean exit = false; //флаг выхода из цикла по команле "no"
            while (!exit) {
                String text = reader.readLine();

                strings.add(text); //добавляем строку в список

                for (; ; ) {
                    System.out.print("Do you wish enter another string? [y/n]");
                    String cmd = reader.readLine();
                    if (cmd.equalsIgnoreCase("no") || cmd.equalsIgnoreCase("n")) { //TODO:можно же довавить set или enum комманд!
                        exit = true;
                        break;
                    } else if (cmd.equalsIgnoreCase("yes") || cmd.equalsIgnoreCase("y")) {
                        System.out.print("Enter string: ");
                        break;
                    } else {
                        System.out.println("Please follow instruction...");
                    }
                }
            }
            return strings;
        }

        /**
         * Расчет средней длинны строки в списке
         * @param list (String)
         * @return int
         */
        public static int averageLengthOfStringsInList(ArrayList<String> list){
            int average = 0; //пусть будет с округлением

            for (String item: list) {
                average = average+item.length();
            }

            average = average / list.size();

            return average;
        }


        //По условию везде строки, а по идее, наверное, надо делать универсальными

        /**
         * Печатет List<String>
         * @param strings
         */
        public static void printListContent(ArrayList<String> strings){
            for (String line : strings) {
                System.out.println(line);
            }
        }

        /**
         * Печатет содержимое Set<String>
         * @param set
         */
        public static void printSetContent(HashSet<String> set){
            for (String item: set) {
                System.out.println(item);
            }
        }

    }
}
