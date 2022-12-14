package org.geekbrains;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

//    ДЗ1 https://leetcode.com/problems/contains-duplicate-ii/
//    использовать мапу, либо подумать как обойтись сетом
        int[] nums1 = new int[]{1, 2, 3, 1};
        int k1 = 3;
        Hw1 hw1 = new Hw1();

        System.out.println("Example 1: " + hw1.  containsNearbyDuplicate(nums1, k1));
        int[] nums2 = new int[]{1, 0, 1, 1};
        int k2 = 1;
        System.out.println("Example 2: " + hw1.containsNearbyDuplicate(nums2, k2));
        int[] nums3 = new int[]{1, 2, 3, 1, 2, 3};
        int k3 = 2;
        System.out.println("Example 3: " + hw1.containsNearbyDuplicate(nums3, k3));

// ДЗ2  https://leetcode.com/problems/count-common-words-with-one-occurrence/
//      используем ровно одну мапу, в мапе храним меньший из массивов
        String[] words1 = new String[]{"leetcode", "is", "amazing", "as", "is"};
        String[] words2 = new String[]{"amazing", "leetcode", "is"};
        Hw2 hw2 = new Hw2();

        System.out.println("Example 1: " + hw2.countWords(words1, words2));

        String[] words12 = new String[]{"b", "bb", "bbb"};
        String[] words22 = new String[]{"a", "aa", "aaa"};
        System.out.println("Example 2: " + hw2.countWords(words12, words22));

        String[] words13 = new String[]{"a", "ab"};
        String[] words23 = new String[]{"a", "a", "a", "ab"};
        System.out.println("Example 3: " + hw2.countWords(words13, words23));

//ДЗ3 https://leetcode.com/problems/intersection-of-two-arrays-ii/
//    используем ровно одну мапу, в мапе храним меньший из массивов
        int[] nums111 = new int[]{1, 2, 2, 1};
        int[] nums222 = new int[]{2, 2};
        Hw3 hw3 = new Hw3();

        System.out.println("Example 1: " + Arrays.toString(hw3.intersect(nums111, nums222)));

        int[] nums121 = new int[]{4, 9, 5};
        int[] nums221 = new int[]{9, 4, 9, 8, 4};
        System.out.println("Example 2: " + Arrays.toString(hw3.intersect(nums121, nums221)));


//ДЗ4 https://leetcode.com/problems/roman-to-integer/ сделать мапу <Символ -> Значение>.
//    Если текущий символ < правого соседа, тогда мы его вычитаем, иначе прибавляем.
        Hw4 hw4 = new Hw4();
        String s1 = "III";
        System.out.println("Example 1: " + hw4.romanToInt(s1));

        String s2 = "LVIII";
        System.out.println("Example 2: " + hw4.romanToInt(s2));

        String s3 = "MCMXCIV";
        System.out.println("Example 3: " + hw4.romanToInt(s3));

    }
}
