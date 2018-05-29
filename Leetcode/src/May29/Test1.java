package May29;

import org.junit.Test;

import May28.LeetCode;
/**
 * 
 * @author Cdawn
 *     2018.5.29
 */
public class Test1 {

	//@Test
	public void test() {
		 Solution sol=new Solution();
		int[] nums={1,2,3,4,5};
		if(sol.containsDuplicate(nums)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
	}
	
	@Test
	public void test1() {
		 Solution2 sol2=new Solution2();
		int[] nums={2,7,11,5};
		int[] result=sol2.twoSum(nums, 9);
		System.out.print(result[0]);
		System.out.print(result[1]);
	}
	
}
