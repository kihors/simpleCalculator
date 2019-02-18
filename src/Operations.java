class Operations {

    int add(int x, int y) {
        return x + y;
    }

    int sub(int x, int y) {
        return x - y;
    }

    int mlt(int x, int y) {
        return x * y;
    }

    int div(int x, int y) {
        if (y == 0)
            System.out.println("Cannot divide by zero!");
        return x / y;
    }
}
