package com.epam.mikhail_gorbachenko.java.lesson2.task1.air_company.fleet.parts;

import java.util.ArrayList;
import java.util.Date;

public abstract class Part {

    enum status{
        ON_BOARD, //Установленна
        AVAILABLE, //Доступна
        NOT_AVAILABLE, //Не доступна
        ON_REPAIR, //На ремонте
        RETIRED, //Списана
        UNKNOWN //Неизвестно
    }

    int id; //id детали
    int board_id; //борт к которому приписан деталь
    Date dateOfAcquisition; //Дата приобретения
    Date dateOfRetirement; //Дата списания со службы
    ArrayList<Date> datesOfRepair = new ArrayList<>(); //список дат ремонта
    double initialPrice; //цена покупки
    double actualPrice; //текущая цена

}
