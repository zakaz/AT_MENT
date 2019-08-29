package com.epam.mikhail_gorbachenko.java.lesson2.task1.air_company.fleet.velichles;

import java.util.ArrayList;
import java.util.Date;

public abstract class Velichle {
    enum status{
        IN_SERVICE, //на службе
        NOT_AVAILABLE, //не доступен по каким-то причинам
        ON_REPAIR, //на ремонте
        ON_MAINTENANCE, //техобслуживание
        RETIRED, //списан
        UNKNOWN //неизвестен
    }

    int id; //id борта
    double fuel; //количесвто топлива
    double weight; //Вес
    int max_crew; // количество экипажа
    int max_passengers; // количество пассажиров
    double max_cargo;// количество груза;
    boolean inService; // true, списан false
    boolean onRepair; // true
    Date dateOfAcquisition; //Дата приобретения
    Date dateOfRetirement; //Дата списания со службы
    ArrayList<Date> datesOfRepair = new ArrayList<>(); //список дат ремонта
    ArrayList<Date> datesOfMaintenance = new ArrayList<>(); //список дат техобслуживание
    double initialPrice; //цена покупки
    double actualPrice; //текущая цена

}
