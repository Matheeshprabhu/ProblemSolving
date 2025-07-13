package problems;

import java.util.Arrays;

public class firstOccurance {

//    Inefficient solution

//    public int strStr2(String haystack, String needle) {
//
//        char[] findArray = haystack.toCharArray();
//        char[] elementsArray = needle.toCharArray();
//
//        int left = 0;
//        int right = 0;
//
//        char[] resultArray = new char[needle.length()];
//        int resultArrayPointer = 0;
//
//        boolean startedSearching = false;
//        int startIndex = 0;
//
//        while(left < findArray.length){
//
//            if (findArray[left] == elementsArray[right]){
//
//                if (!startedSearching){
//                    startIndex = left;
//                }
//                resultArray[resultArrayPointer] = elementsArray[right];
//                resultArrayPointer++;
//                right++;
//                startedSearching = true;
//                if(Arrays.toString(elementsArray).equals(Arrays.toString(resultArray))){
//                    return startIndex;
//                }
//            } else {
//                if(startedSearching){
//                    startedSearching = false;
//                    left = startIndex;
//                }
//                resultArrayPointer = 0;
//                right = 0;
//            }
//
//            left++;
//
//        }
//
//
//        return -1;
//    }


    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        if (m == 0) return 0;
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        firstOccurance firstOccurance = new firstOccurance();
        String haystack = "mississippi";
        String needle = "pi";

        int result = firstOccurance.strStr(haystack, needle);
        System.out.println("First occurrence of '" + needle + "' in '" + haystack + "' is at index: " + result);
    }
}
