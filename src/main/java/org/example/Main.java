package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "teteshka";
        StringBuilder reversedName = new StringBuilder();
        for (int i = name.length()-1; i >= 0; i--) {
            reversedName.append(name.charAt(i));
        }
        System.out.println(reversedName);




    }
}