public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isEven() {
        return (this.value > 0 && this.value % 2 == 0);
    }

    public static boolean isEven(int number) {
        return (number > 0 && number % 2 == 0);
    }

    public static boolean isEven(MyInteger number) {
        return (number.value > 0 && number.value % 2 == 0);
    }

    public boolean isOdd() {
        return (this.value > 0 && !this.isEven());
    }

    public static boolean isOdd(int number) {
        return (number > 0 && !MyInteger.isEven(number));
    }

    public static boolean isOdd(MyInteger number) {
        return (number.value > 0 && !number.isEven());
    }

    public boolean isPrime() {
        boolean check = true;
        for (int i = 2; i <= Math.sqrt(this.value); i++) {
            if (this.value % i == 0) {
                check = false;
            }
        }
        return (this.value > 1 && check == true);
    }

    public static boolean isPrime(int number) {
        MyInteger testNumber = new MyInteger(number);
        return testNumber.isPrime();
    }

    public static boolean isPrime(MyInteger number) {
        return number.isPrime();
    }

    public boolean equals(int number) {
        return (this.value == number);
    }

    public boolean equals(MyInteger number) {
        return (this.value == number.value);
    }

}
