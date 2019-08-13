package com.calculator;

import java.util.Scanner;
import java.util.TreeMap;

class RomanCalc {
    private Operations operations = new Operations();
    private Scanner scanner = new Scanner(System.in);
    private final static TreeMap<Integer, String> map = new TreeMap<>();

    void calculator() {
        while (true) {
            System.out.println("Roman Calculator");
            System.out.println("Enter the following format: I + I");
            System.out.println("To go to the previous menu, print: q");
            System.out.println("Enter calculate: ");
            String expression = scanner.nextLine();
            if (expression.equals("q")) {
                System.out.println("Exit to the previous menu \n");
                break;
            }
            String[] data = expression.split(" ");
            String x = data[0];
            String sing = data[1];
            String y = data[2];

            switch (sing) {
                case "+":
                    int resultAdd = operations.add(convertingToArabic(x), convertingToArabic(y));
                    System.out.println(convertingToRoman(resultAdd));
                    break;
                case "-":
                    int resultSub = operations.sub(convertingToArabic(x), convertingToArabic(y));
                    System.out.println(convertingToRoman(resultSub));
                    break;
                case "*":
                    int resultMlt = operations.mlt(convertingToArabic(x), convertingToArabic(y));
                    System.out.println(convertingToRoman(resultMlt));
                    break;
                case "/":
                    int resultDiv = operations.div(convertingToArabic(x), convertingToArabic(y));
                    System.out.println(convertingToRoman(resultDiv));
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            System.out.println();
        }
    }

    private static int convertingToArabic(String number) {
        if (number.isEmpty()) return 0;
        if (number.startsWith("M")) return 1000 + convertingToArabic(number.substring(1));
        else if (number.startsWith("CM")) return 900 + convertingToArabic(number.substring(2));
        else if (number.startsWith("D")) return 500 + convertingToArabic(number.substring(1));
        else if (number.startsWith("CD")) return 400 + convertingToArabic(number.substring(2));
        else if (number.startsWith("C")) return 100 + convertingToArabic(number.substring(1));
        else if (number.startsWith("XC")) return 90 + convertingToArabic(number.substring(2));
        else if (number.startsWith("L")) return 50 + convertingToArabic(number.substring(1));
        else if (number.startsWith("XL")) return 40 + convertingToArabic(number.substring(2));
        else if (number.startsWith("X")) return 10 + convertingToArabic(number.substring(1));
        else if (number.startsWith("IX")) return 9 + convertingToArabic(number.substring(2));
        else if (number.startsWith("V")) return 5 + convertingToArabic(number.substring(1));
        else if (number.startsWith("IV")) return 4 + convertingToArabic(number.substring(2));
        else if (number.startsWith("I")) return 1 + convertingToArabic(number.substring(1));
        throw new IllegalArgumentException("Unexpected roman numerals");
    }

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    private static String convertingToRoman(int number) {
        int l = map.floorKey(number);
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + convertingToRoman(number - l);
    }
}
