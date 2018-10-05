public class MyIntegerTest {
    public static void main(String[] args) {
        int testNumber = 27;
        MyInteger number = new MyInteger(testNumber);
        System.out.println(number.getValue() + " is even? " + number.isEven());
        System.out.println(number.getValue() + " is odd? " + number.isOdd());
        System.out.println(number.getValue()  + " is prime? "+ number.isPrime());
        System.out.println(testNumber + " is even? " + MyInteger.isEven(31));
        System.out.println(testNumber + " is odd?" + MyInteger.isOdd(31));
        System.out.println(testNumber + " is prime? " + MyInteger.isPrime(31));
        System.out.println(number.getValue() + " is even? " + MyInteger.isEven(number));
        System.out.println(number.getValue() + " is odd? " + MyInteger.isOdd(number));
        System.out.println(number.getValue()  + " is prime? "+ MyInteger.isPrime(number));
    }
}
