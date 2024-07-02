package org.example;

public class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        int left = 0;
        int right = 0;
        int start = 0;
        int end = 0;
        int min = 999999;
        int[] alphaS = new int[58];
        int[] alphaT = new int[58];
        for (int i = 0; i < t.length(); i++) {
            alphaT[t.charAt(i) - 'A']++;
        }
        boolean flag = false;
        while (right < s.length()) {
            alphaS[s.charAt(right) - 'A']++;
            while (under(alphaS, alphaT)) {
                flag = true;
                if (min > right - left + 1) {
                    min = right - left + 1;
                    start = left;
                    end = right;
                }
                alphaS[s.charAt(left) - 'A']--;
                left++;
            }
            right++;
        }
        return flag ? s.substring(start, end + 1) : "";
    }

    public boolean under(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] - nums2[i] < 0) {
                return false;
            }
        }
        return true;
    }
}
