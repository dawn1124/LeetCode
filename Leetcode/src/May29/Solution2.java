package May29;
/**
 * 
 * @author Cdawn
 *     2018.5.29
 */
public class Solution2 {
/*	����һ�����������һ��Ŀ��ֵ���ҳ������к�ΪĿ��ֵ����������

����Լ���ÿ������ֻ��Ӧһ�ִ𰸣���ͬ����Ԫ�ز��ܱ��ظ����á�

ʾ��:

���� nums = [2, 7, 11, 15], target = 9

��Ϊ nums[0] + nums[1] = 2 + 7 = 9
���Է��� [0, 1]*/
	 /* public int[] twoSum(int[] nums, int target) {
		  int[] two ={0,0};
		 
		  for(int i=0;i<nums.length;i++){
			
			  
			  for(int j=i+1;j<nums.length;j++){
				  if(nums[j]+nums[i]==target){
					  two[0]=i;
					  two[1]=j;
					  return two;
				  }
			  
			  }
		  }  
		return two;
	        
	    }*/
/*
 * 
 * Ч�ʵ�һ*/
  public int[] twoSum(int[] nums, int target) {
  int[] res = new int[2];
        if (nums == null || nums.length < 2)
            return res;


        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i])
                max = nums[i];
            if (min > nums[i])
                min = nums[i];
        }

        int[] index = new int[max - min+1];
       // target = target ;
           int other =0;
        for (int i = 0; i < nums.length; i++) {
            // if (index[target - numbers[i] + min ] == 0) {
            // } 
                   other = target - nums[i];
                if(other < min || other > max) {
                    continue;
                }
            if(index[other- min] > 0) {
                res[0] = index[other -min ]-1;
                res[1] = i;
                    return res;
            }
                index[nums[i] - min] = i+1;
        }
        return res;
    }
}
