/*
 * @lc app=leetcode.cn id=1281 lang=java
 *
 * [1281] 整数的各位积和之差
 */

// @lc code=start
class Solution {
    public int subtractProductAndSum(int n) {
        int count = 0;
        int mul = 1;
        while(n/10 != 0){
            count += n%10;
            mul *= n%10;
            n/=10;
        }
        count +=n;
        mul *=n;
        return mul-count;
    }
}
// @lc code=end

