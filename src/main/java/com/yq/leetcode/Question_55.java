package com.yq.leetcode;

import org.junit.Test;

/**
 * @ClassName Question_55
 * @Description 请描述类的业务用途
 * @Author yangqi
 * @Date 2021/6/26 7:41 下午
 * @Version 1.0
 **/
public class Question_55 {


    @Test
    public void test(){
        System.out.println(canJump(new int[]{2,5,0,0}));
    }

    /**
     * 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
     *
     * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
     *
     * 判断你是否能够到达最后一个下标。
     *
     * 思路：
     *      不求最小步数，比较简单，每次走一步，如果下一步的最大步数为0，则到不了终点。
     *      -- 存在本步为0，上一步可以跳过的情况。
     *
     *      改进：判断本步可以到达的下标，尝试每次情况（遍历）
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {

        /*if (nums[0] == 0){
            return false;
        }
        for (int idx = 1;idx<=nums[0];idx++){
            if (tempJump(nums,idx)){
                return true;
            }
        }*/

        int maxIdx = 0;
        for(int i = 0;i<nums.length;i++){
            if (i <= maxIdx){
                maxIdx = Math.max(maxIdx,i+nums[i]);
            }
        }

        if (maxIdx >= nums.length-1){
            return true;
        }

        return false;
    }

    /**
     *
     * 2,5,0,0
     *
     * (2,1)  (2,2)
     *
     * @param nums
     * @param idx
     * @return
     */
    public boolean tempJump(int[] nums,int idx){
        if (idx == nums.length - 1){
            return true;
        }
        //如果值为0，则本次情况到不了终点
        if (nums[idx] == 0){
            return false;
        }

        //下标为idx时，可以走的情况有nums[idx]种
        for(int i = 1;i<=nums[idx];i++){
            if (nums[idx] >= nums.length-idx){
                return true;
            }
            if (tempJump(nums,idx+i)){
                return true;
            }
        }
        return false;
    }
}
