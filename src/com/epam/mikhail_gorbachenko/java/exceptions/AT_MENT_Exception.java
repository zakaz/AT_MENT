package com.epam.mikhail_gorbachenko.java.exceptions;

/**
 * Общее исключение проекта AT_MENT
 */
public class AT_MENT_Exception extends RuntimeException{

    private static final long serialVersionUID = 172979834623897770L;

    /**
     * Стандартный конструктор со статичным сообщением. НЕ рекомендуется использовать его.
     */
    public AT_MENT_Exception(){
        super("Что-то пошло не так...");
    }

    /**
     * Конструктор с кастомным сообщением.
     * @param message - сообщение
     */
    public AT_MENT_Exception(String message){
        super(message);
    }

}
