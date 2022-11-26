package com.devfep.codewars.arrays;

public class MeanOfArray {
        public static int getAverage(int[] marks){
            int sum = 0;
            for (int mark : marks){
                sum += mark;
            }
            int answer = sum/marks.length;
            return answer;
        }
}
