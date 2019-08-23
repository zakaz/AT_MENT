package com.epam.mikhail_gorbachenko.java.utils;

import com.sun.prism.shader.Texture_ImagePattern_AlphaTest_Loader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;

/**
 * Класс для проверки кусочков
 */
public class TestBench {

    public static void main(String[] args) throws IOException {

        //     int[] array = Utils.ArrayTools.intArrayGenerator();
        //     Utils.ArrayTools.printArray(array);

/*        //BufferedReader

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String test = reader.readLine();
        System.out.println("test");


        //Scanner

        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        System.out.println(text); */

        Map<String, Integer> test = Utils.StringTools.consoleInput();
        Utils.StringTools.printMapContent(test);


    }


}
