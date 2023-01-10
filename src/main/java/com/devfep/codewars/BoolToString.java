package com.devfep.codewars;

//https://www.codewars.com/kata/551b4501ac0447318f0009cd/train/java

/*
Implement a function which convert the given boolean value into its string representation.

Note: Only valid inputs will be given.
*/

public class BoolToString {

    public static void main(String[] args) {
    }

    public static String convert(boolean b){
      return String.format("%b", b);
  }
}
