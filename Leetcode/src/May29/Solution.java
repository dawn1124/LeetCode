package May29;
/**
 * 
 * @author Cdawn
 *     2018.5.29
 */
public class Solution {
/*	����һ���������飬�ж��Ƿ�����ظ�Ԫ�ء�

	����κ�ֵ�������г����������Σ��������� true�����������ÿ��Ԫ�ض�����ͬ���򷵻� false��

	ʾ�� 1:

	����: [1,2,3,1]
	���: true*/
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
 * Ч�ʵ�һ�� ��ͨ������ѭ��  
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
