package com.devfep;

/*
* Solve each problem using Java built-in syntax and primarily for-loops. Try to do as quickly as possible. If you’re not sure how to solve the problem, consult with a classmate on the pseudocode before you try to implement the solution. These exercises are intended to help you increase your speed of using Java syntax and also help you feel confident with key interview data structures like arrays, arraylists, hashmaps, hashsets, and 2-d arrays.

Have fun!

Write a function that takes in an array of numbers and returns an array of the unique numbers in that array. For example, input array [1, 1, 1, 3, 4, 3, 5, 6, 4, 10] should return [1, 3, 4, 5, 6, 10]
Do this using ONLY Arrays or ArrayLists
Do this using HashSets
*
*
Write a function that takes in a string and returns a HashMap of each letter in the string and the frequency of the letter in the string. Example input: “racecar”. Output: {“r”: 2, “a”: 2, “e”: 1, “c”: 2}
Write a function that takes in an array of numbers and returns an array with repeats of numbers according to their value. For example, input is [4, 5, 6] and output would be [4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6].
Do this using loops and arrays only. Don’t do anything fancy!
Write a function that takes in a string and returns the unique letters in that string.
Do this using a HashSet
Write a function that takes in an array of numbers and returns a HashMap of numbers along with the frequency of the number in the original array. For example, input array [4, 4, 6, 8, 8, 8] should return {4: 2, 6: 1, 8: 3}.
Write a function that takes in a HashMap of keys and values and returns a HashMap of the  original values as keys and the original keys as values. If you have any values that are the same, you should store the value (originally the key) that is LARGEST. For example: {4: 7, 8: 1, 9: 7} should return {7:9, 8:1}.
Write a function that returns True or False depending on if there are any repeats in the array.
Do this using a nested loop (check every number against the other)
Do this using a HashSet (compare the length of the original array and a hashset of the original array)
Write a function that takes in an array of integers and returns all possible pair combinations of each of the numbers. For example, input array is [1, 2, 3], output array is (1, 2), (1, 3), (2, 3). The output should not contain repeats– each pair should only be present once, so it shouldn’t contain the pair (1, 3) and (3, 1)-- that pair should only be present once in the return value. The output should also not contain pairs like (1, 1) or (2, 2) since those are not valid pairs.
Return data structure as a 2-d array
Return data structure as a Hashset of pairs
Write a function that takes in two arrays of integers. It should return an array of the numbers that the arrays have in common. For example- input arrays [5, 6, 7, 8] and [6, 7, 10, 11] should return [6, 7]
Do this using ONLY Arrays or ArrayLists
Do this using HashSets
Write a function that loops over a HashMap with lists as values and returns the key that has the longest value array. For example, {5: [1, 2, 3], 6: [4], 7: [3, 4]} should return the key of 5.

*
* */

import java.util.*;

public class HB {
    public static void main(String[] args) {
        System.out.println(uniqueNumbers(new int[]{1, 1, 1, 3, 4, 3, 5, 6, 4, 10}));
        System.out.println(uniqueNumbersAlt(new int[]{1, 1, 1, 3, 4, 3, 5, 6, 4, 10}));
        System.out.println(charCount("racecar"));
    }

    public static List<Integer> uniqueNumbers(int[] numArray){
        List<Integer> returnList = new ArrayList<>();

        for (int i = 0; i < numArray.length; i++) {
            if (returnList.contains(numArray[i])){
                continue;
            }
            returnList.add(numArray[i]);
        }
        return returnList;
    }

    public static Set<Integer> uniqueNumbersAlt(int[] numArray){
        Set<Integer> returnSet = new HashSet<>();
        for (int num:numArray){
            returnSet.add(num);
        }
        return returnSet;
    }

    public static Map<Character, Integer> charCount(String word){
        Map<Character, Integer> hashM = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            hashM.put(word.charAt(i), hashM.getOrDefault(word.charAt(i), 0) + 1);
        }
        return hashM;
    }

}
