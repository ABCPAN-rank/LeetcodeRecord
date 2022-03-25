/*
 * @lc app=leetcode.cn id=191 lang=java
 *
 * [191] 位1的个数
 */

// @lc code=start
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for(int k = 0 ; k<32; k++){     // 因为最多为32位的二进制串，所以设k<32
            if((n & (1<<k)) != 0){      //  对n的每一位和其对应的1做AND运算，如果结果为1就代表有一个1，count+1
                count++;
            }
        }
        return count;
    }
}
// @lc code=end

