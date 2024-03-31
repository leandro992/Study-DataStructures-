package datastructure.learn.exercicios;

/**
 * Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
 * <p>
 * Examples input/output:
 * <p>
 * XO("ooxx") => true
 * XO("xooxx") => false
 * XO("ooxXm") => true
 * XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 * XO("zzoo") => false
 */

public class ExesAndOhs {


    public static void main(String[] args) {
        System.out.println(getXO("ooxxxoM"));
    }


    public static boolean getXO(String str) {
        int totalO = 0;
        int totalX = 0;
        char[] lyrics = str.toCharArray();
        for (char lyric : lyrics) {

            if (String.valueOf(lyric).equalsIgnoreCase("o")) {
                totalO++;
            }
            if (String.valueOf(lyric).equalsIgnoreCase("x")) {
                totalX++;
            }

        }
        return totalX == totalO;
    }
}
