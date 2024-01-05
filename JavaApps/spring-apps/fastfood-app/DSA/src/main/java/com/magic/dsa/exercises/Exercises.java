package com.magic.dsa.exercises;

import java.util.*;

public class Exercises {

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) if (n % i == 0) return false;
        return true;
    }


    public String findMostLongerWord(String word) {
        if (word.trim().isEmpty()) return "";
        String[] words = word.split(" ");
        String currentWord;
        int currentLength;
        int maxLength = -1;
        String longestWord = "";
        if (words.length == 1) {
            return words[0];
        }

        for (String s : words) {
            currentWord = s.trim();
            currentLength = currentWord.length();
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestWord = currentWord;
            }
        }
        return longestWord;
    }

    public String invertString(String word) {

        if (word.trim().isEmpty()) return "";
        String[] words = word.split("");
        String inverseWord = "";
        for (int i = words.length - 1; i >= 0; i--) {
            inverseWord += words[i];
        }
        return inverseWord;

    }

    public boolean isPalindromeString(String word) {
        if (word.trim().isEmpty()) return false;
        word = word.toLowerCase().trim().replaceAll("\\s", "");
        String inverseWord = invertString(word);
        if (inverseWord.equals(word)) return true;
        return false;
    }

    public int findBiggestNumber(int[] numbers) {
        int currentNumber = -1;
        int currentBiggestNumber = -1;
        for (int i = 0; i < numbers.length; i++) {
            currentNumber = numbers[i];
            if (currentNumber > currentBiggestNumber) {
                currentBiggestNumber = currentNumber;
            }
        }
        return currentBiggestNumber;
    }

    public void fibonachi(int num) {
        int first = 0;
        int second = 1;
        int[] fbNums = new int[10];

        for (int i = 0; i < num; i++) {
            int newNumber = first + second;
            first = second;
            second = newNumber;

        }
    }

    public int refactor(int num) {
        if (num < 0) return -1;
        if (num == 0 || num == 1) return 1;
        int fact = 0;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public int recursiveRefactor(int num) {
        if (num < 0) return -1;
        if (num == 0 || num == 1) return 1;
        System.out.println("paso");
        return num * recursiveRefactor(num - 1);
    }
    /*
     * Crea una función que encuentre todas las combinaciones de los números
     * de una lista que suman el valor objetivo.
     * - La función recibirá una lista de números enteros positivos
     *   y un valor objetivo.
     * - Para obtener las combinaciones sólo se puede usar
     *   una vez cada elemento de la lista (pero pueden existir
     *   elementos repetidos en ella).
     * - Ejemplo: Lista = [1, 5, 3, 2],  Objetivo = 6
     *   Soluciones: [1, 5] y [1, 3, 2] (ambas combinaciones suman 6)
     *   (Si no existen combinaciones, retornar una lista vacía)
     */

    //backtracking
    public void findMatchSumsOfTarget(
            int target,
            int index,
            List<Integer> inputList,
            List<Integer> currentMatches,
            List<List<Integer>> results) {
        //base case correct
        if (target == 0) {
            currentMatches.forEach(System.out::println);
            results.add(new ArrayList<>(currentMatches));
            return;
        }

        if (target < 0 || index == inputList.size()) return;
        //init recursive or backtrace
        for (int i = index; i < inputList.toArray().length; i++) {
            int currentNum = inputList.get(i);

            if (i > index && currentNum == inputList.get(i - 1)) continue; //skip duplicates
            currentMatches.add(currentNum);
            findMatchSumsOfTarget(target - currentNum, i + 1, inputList, currentMatches, results);
            currentMatches.removeLast();

        }

    }
    //greedy
    // You are given an integer `num`. You can swap two digits at most once to get the maximum valued number.
    // Return _the maximum valued number you can get_.
    //**Example 1:**
    // **Input:** num = 2736
    // **Output:** 7236
    // **Explanation:** Swap the number 2 and the number 7.
    // **Example 2:**
    // **Input:** num = 9973
    // **Output:** 9973
    // **Explanation:** No swap.
    // 9917 -> 9971

    public int getMaximumValuedNumber(int num) {
        return 0;
    }



    public boolean isPalindrome(int num) {
        if (num < 0) return false;
        //invert the number
        int invertedNumber = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            invertedNumber = invertedNumber * 10 + lastDigit;
            num /= 10;
        }

        return invertedNumber == num;
    }

    /* You are given two strings word1 and word2.
     Merge the strings by adding letters in alternating order, starting with word1.
     If a string is longer than the other, append the additional letters onto the end of the merged string.
     */
//    public String alternedString(String w1,String w2){
//        StringBuilder  mergedString = new StringBuilder();
//        int i = 0; int j = 0;
//
//        while (i< w1.length() || j< w2.length()){
//            if (i<w1.length()){
//                mergedString.append(w1.charAt(i));
//                i++;
//            }
//            if (j<w2.length()){
//                mergedString.append(w2.charAt(j));
//                j++;
//            }
//        }
//
//        return  mergedString.toString();
//    }
    public String alternedString(String w1,String w2){
        StringBuilder  mergedString = new StringBuilder();
        int minLength = Math.min(w1.length(),w2.length());
        for (int i = 0; i< minLength; i++){
            mergedString.append(w1.charAt(i)).append(w2.charAt(i));
        }
        if(w1.length() > w2.length()) mergedString.append(w1.substring(minLength));
        else mergedString.append(w2.substring(minLength));
        return  mergedString.toString();
    }


    public void validateAdditiveNumberFunction(String input){

    }

    public void acceptDuplicatesArray(){
        int[] array = {1,1,3,6,5,3,8,7,5};


//        Set<Integer> uniqueElements = new HashSet<>();
//        Set<Integer> duplicateElements = new HashSet<>();
//
//        for (int num : array) {
//            if (!uniqueElements.add(num)) {
//                duplicateElements.add(num);
//            }
//        }
//        System.out.println(duplicateElements);
        //Bubble sort
        int temp = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[i]<array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }

//        for (int i = 0; i <array.length - 1 ; i++) {
//            if (array[i] == array[i+1]){
//                System.out.println(array[i]);
//            }
//        }



        for (int num: array) System.out.println(num);

    }

    public String basicCompressionString(String string){
        StringBuilder compressedString = new StringBuilder();
        int count = 1;
        int ln = string.length();
        for (int i = 0; i < ln ; i++){
            if (i+1 < ln && string.charAt(i) == string.charAt(i+1)){
                count++;
            }else{
                compressedString.append(string.charAt(i)).append(count);
                count = 1;
            }
        }
        System.out.println(compressedString);
        return compressedString.length() > ln ?string : compressedString.toString();

    }



    public String gcdOfStrings(String str1, String str2) {
        //Input: str1 = "ABABAB", str2 = "ABAB"
        //Output: "AB"
        String maxCommonSubstring = "";

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                int k = 0;
                while (i + k < str1.length() && j + k < str2.length() &&
                        str1.charAt(i + k) == str2.charAt(j + k)) {
                    k++;
                }

                String currentSubstring = str1.substring(i, i + k);

                if (currentSubstring.length() > maxCommonSubstring.length()) {
                    maxCommonSubstring = currentSubstring;
                }
            }
        }

        return maxCommonSubstring;
    }

    public static void main(String... args) {
        // if instance the same class i can call the method non static
        Exercises exercises = new Exercises();
      int refactor =  exercises.recursiveRefactor(4);
        System.out.println(refactor);
//        System.out.println(exercises.findMostLongerWord("Hola amigos, bienvenidos al mundo de la programación"));
//          System.out.println(exercises.isPrime(1));
//        System.out.println(exercises.invertString("Hola "));
//        System.out.println(exercises.isPalindromeString("Anita lava la tina"));
//         System.out.println(exercises.findBiggestNumber(new int[]{1,2,3,4,5,6,7,8,9,10}));
//        exercises.fibonachi(10);
//
//            exercises.acceptDuplicatesArray();
//         int myFact = exercises.refac(4);
//        System.out.println(myFact);
//        List<Integer> inputList = Arrays.asList(1,1,1,2,2,1);
//        Collections.sort(inputList);
//        List<List<Integer>> results = new ArrayList<>();
//        exercises.findMatchSumsOfTarget(100, 0, inputList, new ArrayList<>(), results);
//        results.forEach(System.out::println);
//        System.out.println(exercises.isPalindrome(221));
//
//        System.out.println(exercises.alternedString("abc","pqr"));
//
//;
//        System.out.println( exercises.basicCompressionString("aabbcca"));

    }

}
