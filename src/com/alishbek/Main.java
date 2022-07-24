package com.alishbek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter something");
            String string = scanner.nextLine();
            a.add(string);
        }
        System.out.println(a);

        ArrayList<String> b = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter something");
            String string = scanner.nextLine();
            b.add(string);
        }
        System.out.println(b);
        System.out.println();

        ArrayList<String> c = new ArrayList<>();
        Collections.reverse(b);
        for (int i = 0; i < 5; i++) {
            c.add(a.get(i));
            c.add(b.get(i));
        }
        System.out.println(c);
        System.out.println();

        c.sort(Comparator.comparing(String::length));
        System.out.println(c);


    }
}
