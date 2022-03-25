/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start

import java.util.*;
class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> old = null;
        for(int i = 1 ; i<= numRows ; i++){
            List<Integer> update = new ArrayList();
            // 添加杨慧三角的两边
            if(i == 1 ){
                update.add(0,1);
            }
            else{
                update.add(0,1);
                update.add(update.size()-1,1);
            }
            //   更新中间的东西
            for(int j = 1 ; j< i-1 ; j++){
                update.add(j,old.get(j-1)+old.get(j));
            }
            old = update;
            result.add(update);
        }
        return result;
    }


}
// @lc code=end

