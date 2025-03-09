package com.zipcodewilmington;

import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
        //return null;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
        //return null;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean hasString = false;
        for (String word : array) {
            if (word.equals(value)) {
                return true;
            }
        }
        return hasString;
        //return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] newArray = new String[array.length];
        int j = 0;
        int i = 1;
        while (i <= array.length) {
            String word = array[array.length - i];
            newArray[j] = word;
            i++;
            j++;
        }
        return newArray;
        //return null;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversedArray = reverse(array);
        int numOfMatches = 0;
        for (int i = 0; i < array.length; i++) {
            if (reversedArray[i].equals(array[i])) {
                numOfMatches++;
            }
        }
        return numOfMatches == array.length;
        //return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String fullPhrase = "";
        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (String phrase : array) {
            String phraseLower = phrase.toLowerCase();
            fullPhrase = stringBuilder.append(phraseLower).toString();
        }
        for (int i = 1; i <= alphabet.length(); i++) {
            if (fullPhrase.contains(alphabet.substring(i - 1, i))) {
                counter++;
            }
        }
        return counter == 26;
        //return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int numOfMatches = 0;
        for (String word : array) {
            if (word.equals(value)) {
                numOfMatches++;
            }
        }
        return numOfMatches;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> removedValue = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                removedValue.add(array[i]);
            }
        }
        String[] valueRemoved = removedValue.toArray(new String[0]);
        return valueRemoved;
        //return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> noDuplicates = new ArrayList<>();
        noDuplicates.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                noDuplicates.add(array[i]);
            }
        }
        String[] duplicatesRemoved = noDuplicates.toArray(new String[0]);
        return duplicatesRemoved;
        //return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        return null;
    }


}
