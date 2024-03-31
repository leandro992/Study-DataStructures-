package datastructure.learn.exercicios;



public class FirstNotRepeatingCharacter {


    public static void main(String[] args) {
        System.out.println(solution("abacabad"));
    }

    static char solution(String s) {
        int count [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            count[s.charAt(i)-97] ++;
        for(int i = 0; i < s.length(); i ++)
            if(count [s.charAt(i)-97] == 1)
                return s.charAt(i);
        return '_';
    }


}
