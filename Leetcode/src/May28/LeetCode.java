package May28;


/**
 * 
 * @author Cdawn
 *     2018.5.28
 */


public class LeetCode {
	/**
	 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/21/
	 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
	 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
	 */
	
	 public int removeDuplicates(int[] nums) {
		 if(nums.length==0||nums==null){
			 return 0;
		 }
		 int len=1;
		 for(int i=0;i<nums.length;i++){
			 labe: for(int j=i+1;j<nums.length;j++){
				for(int x=0;x<len;x++){
					if(nums[j]==nums[x]){
						break labe;
					}
				}
				if(nums[j]!=nums[i]){
					nums[len]=nums[j];
					len++;
					break;
				}
				
			 }
			 
		 }
		 
		return len;
		/* 效率第一的答案，实际上是取巧了 如果后续出现一开始的元素，依然会重复
		 * int index = 0;
	        if (nums.length > 0) {
	            int lastNum = nums[0];
	            for(int i = 1; i < nums.length; i++) {
	                if (nums[i] != lastNum) {
	                    nums[++index] = nums[i];
	                    lastNum = nums[i];
	                }
	            }
	        }
	        
	        return ++index;*/
		
	    }
	}
