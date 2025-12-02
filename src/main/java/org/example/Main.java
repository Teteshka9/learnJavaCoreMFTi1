package org.example;



import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        String name = "teteshka";
        StringBuilder reversedName = new StringBuilder();
        for (int i = name.length()-1; i >= 0; i--) {
            reversedName.append(name.charAt(i));
        }
        System.out.println(reversedName);

//            public enum Size {
//                SMALL, MEDIUM, LARGE, EXTRA_LARGE
//            }
//            Size s = Size.MEDIUM;
//            for (Size s : Size.values());
//            switch (s) {
//                case SMALL:
//                    System.out.println("It is size S");
//                    break;
//                case MEDIUM:
//                    System.out.println("It is size M");
//                    break;
//            }

//        try (Scanner in = new Scanner (
//                new FileInputStream("/usr/share/dict/words"), "UTF-8");
//             PrintWriter out = new PrintWriter("out.txt")) {
//            while (in.hasNext()) {
//                out.println(in.next().toUpperCase());
//            }
//        }
        // ВОТ ТАК НАДО ГЕНЕРИРОВАТЬ СЛУЧАЙНЫЕ ЧИСЛА
//        int rnd = ThreadLocalRandom.current().nextDouble();



    }
}