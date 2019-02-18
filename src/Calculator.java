import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        ArabicCalc arabicCalc = new ArabicCalc();
        RomanCalc romanCalc = new RomanCalc();
        Scanner scanner = new Scanner(System.in);

        System.out.println("My simple Calculator");
        System.out.println("For calculation enter x, \n then enter required operation +, -, *, /, \n then enter y \n");

        while (true) {

            System.out.println("Please, select calculator:");
            System.out.println("Enter 1 -> Arabic Numeral Calculator");
            System.out.println("Enter 2 -> Roman Numeral Calculator");
            System.out.println("Enter 0 -> exit");

            int choiceCalc = scanner.nextInt();

            switch (choiceCalc) {
                case 1:
                    arabicCalc.calculator();
                    break;
                case 2:
                    romanCalc.calculator();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
            }

            if (choiceCalc == 0)
                break;
        }
    }
}
