package com.mbzshajib.problem.interview;

import java.util.*;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/30/2022 at 7:32 PM.
 */
public class PayPay_Solution {
/*
    Task 2 of 2
            1:28:40
    Codewriting

    Given an array of integers a, your task is to calculate the digits that occur the most number of times in the array. Return the array of these digits in ascending order.

            Example

    For a = [25, 2, 3, 57, 38, 41], the output should be solution(a) = [2, 3, 5].

    Here are the number of times each digit appears in the array:

            0 -> 0
            1 -> 1
            2 -> 2
            3 -> 2
            4 -> 1
            5 -> 2
            6 -> 0
            7 -> 1
            8 -> 1
    The most number of times any number occurs in the array is 2, and the digits which appear 2 times are 2, 3 and 5. So the answer is [2, 3, 5].

    Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

    An array of positive integers.

    Guaranteed constraints:
            1 ≤ a.length ≤ 103,
            1 ≤ a[i] < 100.

            [output] array.integer

    The array of most frequently occurring digits, sorted in ascending order.

            [Java] Syntax Tips

    // Prints help message to the console
// Returns a string
//
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
    String helloWorld(String name) {
        System.out.println("This prints to the console when you Run Tests");
        return "Hello, " + name;
    }

1234
    int[] solution(int[] a) {

    }

    TESTS
    CUSTOM TESTS
    MORE
*/


    public int[] solution1(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            int number = a[i];
            while (number != 0) {
                int digit = number % 10;
                Integer integer = map.get(digit);
                if (integer == null) integer = 1;
                else integer = integer + 1;
                map.put(digit, integer);
                number = number / 10;
                max = Math.max(max, integer);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        List<Integer> resultList = new ArrayList<>();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> next = iterator.next();
            if (next.getValue() == max) resultList.add(next.getKey());
        }
        return resultList.stream().parallel().sorted().mapToInt(data -> data).toArray();
    }

    /*
        Given two words, beginWord and endWord, and a wordList of approved words, find the length of the shortest transformation sequence from beginWord to endWord such that:

        Only one letter can be changed at a time
        Each transformed word must exist in the wordList.
        The length of the sequence is defined as the number of words in it, e.g. the length of "cot" -> "hot" -> "hit" is 3, and the length of "dog" -> "cog" is 2.

        Return the length of the shortest transformation sequence, or 0 if no such transformation sequence exists.

                Note: beginWord does not count as a transformed word. You can assume that beginWord and endWord are not empty and are not the same.

                Example

        For beginWord = "hit", endWord = "cog", and wordList = ["hot", "dot", "dog", "lot", "log", "cog"], the output should be
        solution(beginWord, endWord, wordList) = 5.

        The shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog" with a length of 5.

        For beginWord = "a", endWord = "c", and wordList = ["a", "b", "c"], the output should be
        solution(beginWord, endWord, wordList) = 2.

        It is possible to obtain endWord = "c" from beginWord = "a" without using any additional words in the middle: "a" -> "c".

        Input/Output

    [execution time limit] 3 seconds (java)

    [input] string beginWord

        Guaranteed constraints:
                1 ≤ beginWord.length ≤ 5.

                [input] string endWord

        Guaranteed constraints:
        endWord.length = beginWord.length.

    [input] array.string wordList

        An array containing all of the approved words. All words in the array are the same length and contain only lowercase English letters. You can assume that there are no duplicates in wordList.

        Guaranteed constraints:
                2 ≤ wordList.length ≤ 600,
        wordList[i].length = beginWord.length.

    [output] integer

        An integer representing the length of the shortest transformation sequence from beginWord to endWord using only words from wordList as described above.
    */
    private static int MIN_DEPTH = Integer.MAX_VALUE;
    private static boolean found = false;

    public int solution2(String beginWord, String endWord, String[] wordList) {
        Set<String> set = new HashSet<>(Arrays.asList(wordList));
        if (!set.contains(endWord)) return 0;
        search(beginWord, endWord, set, 1);
        if (MIN_DEPTH == Integer.MAX_VALUE) return 0;
        else return found ? MIN_DEPTH : 0;
    }

    private void search(String beginWord, String endWord, Set<String> wordList, int depth) {
        for (String word : wordList) {
            if (difference(beginWord, word) == 1) {
                depth = depth + 1;
                if (word.equals(endWord)) {
                    MIN_DEPTH = Math.min(MIN_DEPTH, depth);
                    found = true;
                } else {
                    Set<String> tmp = new HashSet<>(wordList);
                    tmp.remove(word);
                    search(word, endWord, tmp, depth);
                }
            }

        }
    }

    private int difference(String wordOne, String wordTwo) {
        int diff = 0;
        for (int i = 0; i < wordOne.length(); i++) {
            if (wordOne.charAt(i) != wordTwo.charAt(i)) diff++;
        }
        return diff;
    }

}
