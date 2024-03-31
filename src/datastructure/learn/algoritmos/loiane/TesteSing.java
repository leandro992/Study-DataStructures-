package datastructure.learn.algoritmos.loiane;

public class TesteSing {
    public static void main(String[] args) {
        System.out.printf("TEST" + solution(29));
    }

    static int solution(int n) {
        char[] numbers = String.valueOf(n).toCharArray();
        int number1 = Character.getNumericValue(numbers[0]);
        int number2 = Character.getNumericValue(numbers[1]);
        return number1 + number2;
    }
}
