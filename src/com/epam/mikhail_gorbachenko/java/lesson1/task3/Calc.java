package com.epam.mikhail_gorbachenko.java.lesson1.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Написать калькулятор – программа, которая на входе получает два целых числа (число А и число В),
 * выполняет арифметическую операцию («+» - сложение, «-» - вычитание, «*» - умножение, «/» - деление) и выводит результат в консоль.
 * Для каждой операции использовать отдельный метод (нельзя использовать методы библиотечного класса Math).
 * Предусмотреть пользовательское меню для выбора необходимой операции. Ввод входных данных осуществлять с клавиатуры.
 */
public class Calc {

    public static void main(String[] args) {

        Calc app = new Calc();
        app.calculate(app.readLine());
//давай лучше добавим еще что-то типа обнуления и вопроса типа "что-нибудь еще надо посчитать?(д/н)", если да, то пусть предлагает заново ввести числа и знаки, если нет, то завершаем программу
    }

    private String readLine(){
        System.out.println("Please enter command in format a [+,-,*,/] b:");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }


    private void calculate(String line){
        String a = "",b = "",cmd = "";

        //Первичная обработка и ценз строки
        line = line.replace(" ", ""); //убираем все пробелы
        Pattern pattern = Pattern.compile("[0-9]+[+-/*][0-9]+");
        Matcher matcher = pattern.matcher(line);
        if(!matcher.matches()) {
            System.out.println("Operation can not resolved");
            System.exit(1);
        }else{
            for(int i=0; i<line.length(); i++){
                if (Character.isDigit(line.charAt(i)) && cmd.equals("")){
                    a = a + line.charAt(i);
                } else if (!Character.isDigit(line.charAt(i))){
                    cmd = cmd + line.charAt(i);
                }

                if (Character.isDigit(line.charAt(i)) && !cmd.equals("")){
                    b = b + line.charAt(i);
                }
            }

            //Вместо Integer, давай лучше использовать Long, чтобы корректно перемножал большие числа.
            //собственно, калькулятор
            if(cmd.equals("+")){
                System.out.println(add(Integer.parseInt(a),Integer.parseInt(b)));
            }

            if(cmd.equals("-")){
                System.out.println(negate(Integer.parseInt(a),Integer.parseInt(b)));
            }

            if(cmd.equals("*")){
                System.out.println(multiply(Integer.parseInt(a),Integer.parseInt(b)));
            }

            if(cmd.equals("/")){
                System.out.println(divide(Integer.parseInt(a),Integer.parseInt(b)));
            }

        }
    }

    private int add (int a, int b){
        return a+b;
    }

    private int negate (int a, int b){
        return a-b;
    }

    private int multiply (int a, int b){
        return a*b;
    }

    // добавить обработку ексепшена деления на нуль.
    // 5 деленное на 2 выдаёт 2.0, а должно выдавать 2.5 . Нужно исправить этот момент
    // то же самое с 1 деленное на 3, пусть выдает как реальный калькулятор 0.3333333333 (до 10 знаков после запятой).
    private double divide (int a, int b){
        return a/b;
    }

}
