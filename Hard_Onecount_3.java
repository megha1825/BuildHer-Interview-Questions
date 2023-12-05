/**************************************************************
Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
Example 1:
Input: n = 13
Output: 6
Example 2:
Input: n = 0
Output: 0
***************************************************************/
public class CountDigitOne {
 public static int countDigitOne(int n)
  {
        int count = 0;
       for (int i = 1; i <= n; i++)
         {
            // Count the occurrences of digit 1 in the current number
            count += countOnesInNumber(i);
        }

        // it bascially returns the total number of 1 in the digit
        return count;
    }

    
    private static int countOnesInNumber(int num) 
  {
        int count = 0;
        // Iterate through each digit of the number
        while (num > 0) {
            // Check if the last digit is 1 and increment the count value
            if (num % 10 == 1) {
                count++;
            }
            // Remove the last digit by dividing the number by 10
            num /= 10;
        }

        // Return the count of digit 1 in the given number
        return count;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int n = 13;
        int result = countDigitOne(n);
        System.out.println(result);
    }
}

