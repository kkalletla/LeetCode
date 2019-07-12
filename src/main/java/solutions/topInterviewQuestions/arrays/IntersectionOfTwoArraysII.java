package solutions.topInterviewQuestions.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> mapOfNumbers = new HashMap<Integer, Integer>();

        for (int i: nums1) {
            mapOfNumbers.put(i, mapOfNumbers.get(i) != null ? mapOfNumbers.get(i) + 1 : 1);
        }

        int lengthofIntersection = 0;
        for (int j: nums2) {
            if (mapOfNumbers.containsKey(j)) {
                int count = mapOfNumbers.get(j);
                if (count > 0) {
                    nums1[lengthofIntersection++] = j;
                    mapOfNumbers.put(j, count -1);
                } else
                    mapOfNumbers.remove(j);
            }
        }

        int[] returnArray = new int[lengthofIntersection];
        for (int i = 0; i < lengthofIntersection; i++)
            returnArray[i] = nums1[i];
        return returnArray;
    }
}
