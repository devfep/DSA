package com.devfep.codewars.arrays;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
    }

    public static boolean isPangram(String sentence){
        String str = sentence.toLowerCase().replaceAll("[^a-z]", "");
        Set<Character> set = new HashSet<>();
        for (char character : str.toCharArray()) {
            set.add(character);
        }
        return set.size() == 26;
    }
}