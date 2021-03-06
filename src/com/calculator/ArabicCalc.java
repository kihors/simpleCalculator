package com.calculator;

import java.util.Scanner;

class ArabicCalc {
    private Operations operations = new Operations();
    private Scanner scanner = new Scanner(System.in);

    void calculator() {
        while (true) {
            System.out.println("Arabic Calculator");
            System.out.println("Enter the following format: 1 + 1");
            System.out.println("To go to the previous menu, print: q");
            System.out.println("Enter calculate: ");
            String expression = scanner.nextLine();
            if (!expression.equals("q")) {
                String[] data = expression.split(" ");
                int x = Integer.parseInt(data[0]);
                String sing = data[1];
                int y = Integer.parseInt(data[2]);

                switch (sing) {
                    case "+":
                        int resultAdd = operations.add(x, y);
                        System.out.println(resultAdd);
                        break;
                    case "-":
                        int resultSub = operations.sub(x, y);
                        System.out.println(resultSub);
                        break;
                    case "*":
                        int resultMlt = operations.mlt(x, y);
                        System.out.println(resultMlt);
                        break;
                    case "/":
                        int resultDiv = operations.div(x, y);
                        System.out.println(resultDiv);
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                System.out.println();
            } else {
                System.out.println("Exit to the previous menu \n");
                break;
            }
        }
    }
}
