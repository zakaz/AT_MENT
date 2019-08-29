package com.epam.mikhail_gorbachenko.java.lesson4;

import com.epam.mikhail_gorbachenko.java.exceptions.AT_MENT_Exception;

public class DynamicArray<T>{
    private static final int INITIAL_SIZE = 10;
    private static final int SIZE_MULTIPLYER = 2;
    private Object[] array = new Object[INITIAL_SIZE];
    private int size = 0;

    public DynamicArray() {
    }

    public <T> void add(T item){
        if(array.length <= size) {
            Object[] tmp = array;
            array = new Object[size * SIZE_MULTIPLYER];
            for (int i = 0; i < tmp.length; i++) {
                array[i] = tmp[i];
            }
        }

        this.array[size] = item;
        size++;
    }

    public T get(int index){
        if(index < size & size != 0){
            return (T) array[index];
        }
        throw new AT_MENT_Exception("Out Of James Bounds");
    }

    public void remove(int index){
        if(index < size & size != 0){
            for(int i = index; i<size+1; i++){
                array[i]=array[i+1]; //но он не вычищает значения
            }
            size--;
        } else {
            throw new AT_MENT_Exception("Out Of James Bounds");
        }
    }




    public int size(){
        return size;
    }

    public static void main(String[] args) {
        DynamicArray vector = new DynamicArray();

        vector.add("first");
        vector.add("Second");
        vector.add("Thrid");
        System.out.println(vector.get(0));
        System.out.println(vector.get(1));
        System.out.println(vector.get(2));
        vector.remove(1);
        System.out.println("------");
        System.out.println(vector.get(0));
        System.out.println(vector.get(1));
       // System.out.println(vector.get(2));
        System.out.println(vector.size());
    }

}
