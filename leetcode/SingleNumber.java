/*
 * Given an array of integers, every element appears twice except for one. Find that single one.
*/

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result ^=i;
        }
        return result;
    }
}

/* explaination:
    XOR is bitwise exclusive or, return 0 OR any other number
    given array of 1,1,2,2,5
    start loop

    result = 0 ^ 1
    result = 0 ^ 1 ^ 1
    result = 0 ^ 1 ^ 1 ^ 2 
    result = 0 ^ 1 ^ 1 ^ 2 ^ 2
    result = 0 ^ 1 ^ 1 ^ 2 ^ 2 ^ 5

    end loop
    result = 0 ^ 0 ^ 0 ^ 5  => 5

*/
