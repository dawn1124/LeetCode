package May28;


/**
 * 
 * @author Cdawn
 *     2018.5.28
 */


public class LeetCode {
	/**
	 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/21/
	 * ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
	 * ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
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
		/* Ч�ʵ�һ�Ĵ𰸣�ʵ������ȡ���� �����������һ��ʼ��Ԫ�أ���Ȼ���ظ�
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
