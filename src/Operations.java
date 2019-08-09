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
        if (y != 0) {
            return x / y;
        }
        System.out.println("Cannot divide by zero!");
        return 0;
    }

    int mod(int x, int y) {
        return x % y;
    }
}
