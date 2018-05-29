package May29;
/**
 * 
 * @author Cdawn
 *     2018.5.29
 */
public class Solution {
/*	给定一个整数数组，判断是否存在重复元素。

	如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。

	示例 1:

	输入: [1,2,3,1]
	输出: true*/
public boolean containsDuplicate(int[] nums) {
	for(int i=0;i<nums.length;i++){
		for(int j=i+1;j<nums.length;j++){
			if(nums[i]==nums[j]){
				return true;
			}
		}
	}
	return false;
        
    }
/*
 * 
 * 效率第一的 是通过反向循环  
if (nums.length < 2) {
    return false;
} 

for (int i = 1; i < nums.length; i++) {
    for (int j = i - 1; j >= 0; j--) {
        if (nums[i] > nums[j] && j+1 != i) {

            break;
        }
        if(nums[i] == nums[j]) {
            return true;
        }
    }
}
return false;
}*/
}
