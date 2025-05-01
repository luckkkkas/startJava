package com.example;

public class Copier <T>{
    public void copy(T x[], T y[], int count){
        for (int i = 0; i < count; i++) {
            x[i] = y[i];
        }
    }
}
