package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] a = {12, 34, 12, 45, 67, 89};
        for (int b : a) {
            if (set.add(b) == false) {
                System.out.println(b);
            }
        }
    }
}
