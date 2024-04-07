/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.

Example 2:
Input: num = 0
Output: 0

 
Constraints:
0 <= num <= 2^31 - 1
*/

class Solution {
    public int addDigits(int num) {
        String n = Integer.toString(num);
        int sum = 0;

        if(n.length() == 1) { return Integer.parseInt(n); } 

        for(char c : n.toCharArray()) { sum += Character.getNumericValue(c); }

        return addDigits(sum);
    }
}