package com.stackroute.lambdaexpression;

import java.util.List;

public class AlphabetChecker {
    // write logic to find whether given string contains only alphabets or not
    public String checkAlphabets(List<String> inputList) {
        // check if list is empty
        if (inputList.isEmpty()) {
            return "Give proper input not empty list";
        }

        // Check if all strings are alphabetic
        boolean allAlphabetic = inputList.stream().allMatch(
                str -> str.chars().allMatch(Character::isLetter)
                );

        return allAlphabetic ? "Given list contains only alphabet strings" : "Given list contains non alphabet strings";
    }
}
