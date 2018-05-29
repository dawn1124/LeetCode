package May28;

import org.junit.Test;
/**
 * 
 * @author Cdawn
 *     2018.5.28
 */
public class Test1 {

//	@Test
	public void test() {

		LeetCode leetCode=new LeetCode();
		int[] nums={0,0,1,1,1,2,2,3,3,4,1};
		int len=leetCode.removeDuplicates(nums);
		for (int i = 0; i < len; i++) {
			System.out.print(nums[i]);
		}
	
	}
	
	@Test
	public void test2() {

		Solution solu=new Solution();
		int[] prices={7,6,4,3,1};
		int MaxProfit=solu.maxProfit(prices);
		System.out.println(MaxProfit);
	
	}

}
