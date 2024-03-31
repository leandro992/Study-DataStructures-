package datastructure.learn.algoritmos;

import java.util.Arrays;
import java.util.List;

public class SimpleArraySum {


    public static void main(String[] args) {
        int i = simpleArraySum(Arrays.asList(1, 5, 6));
        System.out.printf(String.valueOf(i));
    }


    public static int simpleArraySum(List<Integer> ar) {
       return ar.stream().mapToInt(Integer::intValue).sum();
    }
}
