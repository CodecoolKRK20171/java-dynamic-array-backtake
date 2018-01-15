package com.codecool.dynamicArrayDojo;

public class DynamicIntArray {
    
    int[] array;
    
    public DynamicIntArray(int size){
        if (size < 0) throw new IllegalArgumentException("Cannot accept negative size");
        this.array = new int[size];
    }
    
    public DynamicIntArray(){
        this.array = new int[10];
    }

    public void add(int i) {
    }

    public void remove(int i) {
    }

    public void insert(int i, int i1) {
    }
}
