/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
            if(x < 0 || (x%10 == 0 && x != 0)){
                return false;
            }
            String s = new String(String.valueOf(x));
            String re = new StringBuilder(s).reverse().toString();
            if (s.equals(re)){
                return true;
            }
            return false;
    }
}
// @lc code=end

