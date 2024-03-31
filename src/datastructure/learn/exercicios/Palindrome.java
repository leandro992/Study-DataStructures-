package datastructure.learn.exercicios;

public class Palindrome {

    public static void main(String[] args) {
        boolean response = solution("aaabaaaa");

        System.out.println(response);
    }

    static boolean solution(final String inputString) {
        String temp = inputString.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(temp);
        StringBuilder reverse = plain.reverse();
        return reverse.toString().equals(temp);
    }


}
