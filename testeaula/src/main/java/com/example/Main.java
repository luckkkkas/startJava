package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Double f1[] = new Double[50];
        Double f2[] = new Double[50];

        String f3[] = new String[20];
        String f4[] = new String[40];

       Copier<Double> cpDouble = new Copier<>();
       Copier<String> cpString = new Copier<>();

       cpDouble.copy(f1, f2, 10);
        cpString.copy(f3, f4, 20);

        List<String> lista = new ArrayList<>();

        lista.add("Lucas");
        lista.add("Henrique");
        lista.add("Bonamigo");
        lista.forEach(element -> System.out.println(element));
        
    }
}