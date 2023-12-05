/**************************************************************************
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 
Example 1:
Input: nums = [3,2,3]
Output: [3]
Example 2:
Input: nums = [1]
Output: [1]
******************************************************************************/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class MajorityElement {
    private static List<Integer> findMajority(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> majorityElements = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
   // If the element is already in the HashMap
                int count = map.get(arr[i]) + 1;
                if (count > arr.length / 3) {
 // If the count of the element is greater than n/3 of the array length, it's a majority element
                    majorityElements.add(arr[i]);
                } else {
// If not, update the count in the HashMap
                    map.put(arr[i], count);
                }
            } else {
// If the element is not in the HashMap, add it with a count of 1
                map.put(arr[i], 1);
            }
        }

        return majorityElements;
    }

    public static void main(String[] args) {
        int a[] = new int[]{3,2,3};

        List<Integer> result = findMajority(a);
            if (!result.isEmpty()) {
            System.out.println(result);
        } else {
            // Print the original array as a list
            List<Integer> originalArray = new ArrayList<>();
            for (int num : a) {
                originalArray.add(num);
            }
            System.out.println(originalArray);
        }
        
    }
}
