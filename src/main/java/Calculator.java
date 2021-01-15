public class Calculator {
    public static void main(String[] args) {
        System.out.println(addTwoNumbers(123, 27));
        System.out.println(subtractTwoNumbers(123, 27));
        System.out.println(multiplyTwoNumbers(123, 27));
        System.out.println(divideTwoNumbers(123, 27));

    }

    public static long addTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static long subtractTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static long multiplyTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static long divideTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}
