/**********************************************************************************
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal 
substring consisting of non-space characters only.
 
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
*************************************************************************************/

public class Length {
    public static int length(String s) {
      // Split the string into words \s+ will match one or more whitespace characters.
        String[] words = s.split("\\s+");

        // Check if there are any words
        if (words.length == 0) {
            return 0;
        }

        //words[words.length - 1]: This accesses the last element in the array, which is the last word in the original string.
        //words[words.length - 1].length(): This finally retrieves the length of the last word.
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        String input = "Hello World";//provide your input here
        int result = length(input);
        System.out.println(result);
    }
}
