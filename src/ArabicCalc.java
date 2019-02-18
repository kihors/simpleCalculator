import java.util.Scanner;

class ArabicCalc {

    private Operations operations = new Operations();
    private Scanner scanner = new Scanner(System.in);

    void calculator() {

        System.out.println("Arabic Calculator");
        System.out.println("Enter calculate: ");
        int x = scanner.nextInt();
        String sing= scanner.next();
        int y = scanner.nextInt();
        System.out.print("Equals: ");

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
    }
}
