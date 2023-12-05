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

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
      // Split the string into words \s+ will match one or more whitespace characters.
        String[] words = s.split("\\s+");

        // Check if there are any words
        if (words.length == 0) {
            return 0;
        }

        // Return the length of the last word
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        String inputString = "Hello World";//provide your input here
        int result = lengthOfLastWord(inputString);
        System.out.println(result);
    }
}
