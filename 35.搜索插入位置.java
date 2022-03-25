/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 *
 * https://leetcode-cn.com/problems/search-insert-position/description/
 *
 * algorithms
 * Easy (45.47%)
 * Likes:    1436
 * Dislikes: 0
 * Total Accepted:    721.7K
 * Total Submissions: 1.6M
 * Testcase Example:  '[1,3,5,6]\n5'
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 
 * 请必须使用时间复杂度为 O(log n) 的算法。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 
 * 输入: nums = [1,3,5,6], target = 5
 * 输出: 2
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入: nums = [1,3,5,6], target = 2
 * 输出: 1
 * 
 * 
 * 示例 3:
 * 
 * 
 * 输入: nums = [1,3,5,6], target = 7
 * 输出: 4
 * 
 * 
 * 
 * 
 * 提示:
 * 
 * 
 * 1 <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums 为 无重复元素 的 升序 排列数组
 * -10^4 <= target <= 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int goin = 0;    // 这个是用来判断插入的位置的
        while (low <= high){
            mid = (high - low)/2+low;
            if (nums[mid]>target){
                high = mid -1;
                goin = 0;   // 因为返回的是mid，如果返回前mid的数大于target，就插入mid的位置。
            }
            else if(nums[mid]< target){
                low = low + 1;
                goin = 1;   //  如果返回前mid的数小于target，要插入mid+1的位置
            }
            else{
                return mid;
            }
        }
        return mid + goin;
    }
}
// @lc code=end

