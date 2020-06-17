package com.michalkrzyska;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

    }

    public static int isInteresting(int number, int[] awesomePhrases) {
        if (number < 98){
            return 0;
        }
        int numberPlusOne = number + 1;
        int numberPlusTwo = number + 2;
        int returnFromExactNumber = conditionCheckerForExactNumber(number, awesomePhrases);
        if (returnFromExactNumber == 0) {
            int returnFromCloseNumber = conditionCheckerForCloseNumbers(numberPlusOne, awesomePhrases);
            if (returnFromCloseNumber == 0) {
                return conditionCheckerForCloseNumbers(numberPlusTwo, awesomePhrases);
            } else {
                return returnFromCloseNumber;
            }
        } else {
            return returnFromExactNumber;
        }
    }


    private static boolean checkAwesomePhrases(int number, int[] awesomePhrases) {
        return IntStream.of(awesomePhrases).anyMatch(i -> i == number);

    }

    private static boolean checkPalindrome(int number) { // and same number check
        String temp = String.valueOf(number);
        return IntStream.range(0, temp.length() / 2).allMatch(i -> temp.charAt(i) == temp.charAt(temp.length() - i - 1));

    }

    private static boolean checkZeros(int number) {
        char[] temp = String.valueOf(number).toCharArray();
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] != '0') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkIncrementing(int number) {
        char[] temp = String.valueOf(number).toCharArray();
        if (temp[temp.length - 2] == '9' && temp[temp.length - 1] == '0') {
            temp = Arrays.copyOf(temp, temp.length - 1);
        }
        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i] + 1 != temp[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkDecrementing(int number) {
        char[] temp = String.valueOf(number).toCharArray();
        if (temp[temp.length - 2] == '1' && temp[temp.length - 1] == '0') {
            temp = Arrays.copyOf(temp, temp.length - 1);
        }
        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i] - 1 != temp[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static int conditionCheckerForCloseNumbers(int number, int[] awesomePhrases) {
        if (number < 98) {
            return 0;
        } else if (number == 98 || number == 99) {
            return 1;
        } else if (checkAwesomePhrases(number, awesomePhrases)) {
            return 1;
        } else if (checkPalindrome(number)) {
            return 1;
        } else if (checkZeros(number)) {
            return 1;
        } else if (checkDecrementing(number)) {
            return 1;
        } else if (checkIncrementing(number)) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int conditionCheckerForExactNumber(int number, int[] awesomePhrases) {
        if (number <= 98) {
            return 0;
        } else if (number == 99) {
            return 1;
        } else if (checkAwesomePhrases(number, awesomePhrases)) {
            return 2;
        } else if (checkPalindrome(number)) {
            return 2;
        } else if (checkZeros(number)) {
            return 2;
        } else if (checkDecrementing(number)) {
            return 2;
        } else if (checkIncrementing(number)) {
            return 2;
        } else {
            return 0;
        }
    }
}


