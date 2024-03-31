package datastructure.learn.exercicios;

import java.util.HashSet;

public class FirstDuplicate {
    public static void main(String[] args) {
       int[] a = {2, 1, 3, 5, 3, 2};

        System.out.println(solution(a));
    }

    static int solution(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                return a[i];
            }
            set.add(a[i]);
        }
        return -1;
    }

}
