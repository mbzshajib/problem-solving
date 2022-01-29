package com.mbzshajib.problem.leet;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 1/29/2022 at 12:54 PM.
 */
public class ConvertSortedArrayToBinarySearchTree_Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(0,nums.length,nums);
    }

    private TreeNode buildBST(int start, int end, int[] nums) {
        if(start >= end)
            return null;
        int mid = start + (end-start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBST(start,mid,nums);
        root.right = buildBST(mid+1,end,nums);
        return root;
    }
}
