package May28;
/**
 * 
 * @author Cdawn
 *     2018.5.28
 */
public class Solution {
	
	/*给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

	设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。

	注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。

	示例 1:

	输入: [7,1,5,3,6,4]
	输出: 7
	解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
	     随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。*/
public int maxProfit(int[] prices) {
	if(prices.length==0||null==prices||prices.length==1)
	return 0;
	if(prices.length==2){
		if(prices[1]>prices[0]){
		return prices[1]-prices[0];	
		}else{
			return 0;
		}
	}
		
		
	int profit=0;
	if(prices.length==3){
		if(prices[1]>prices[0]&&prices[2]<prices[1]){
			profit+=prices[1]-prices[0];
			return profit;
		}
	}
	for(int i=1;i<prices.length;i++){
			for(int j=i+1;j<prices.length;j++){
				
			if(prices[j]>=prices[i]&&prices[i]<=prices[i-1]){
				if(j+1<prices.length){
				if(prices[j+1]>=prices[j]){
					
					continue;
				}else{
					profit+=prices[j]-prices[i];
					i=j;
					break;
					}
				}else{
					if(prices[j]>=prices[i]){
						profit+=prices[j]-prices[i];
						i=j;
						break;
					}
				}
			}else if(prices[j]<prices[i]){
				if(i-1==0&&prices[i]>prices[i-1]){
					profit+=prices[i]-prices[i-1];
					break;
				}
					
					break;
			}else if(prices[i-1]<prices[i]){
				if(j+1>=prices.length){
					profit+=prices[j]-prices[i-1];
					return profit;
				}else{
					if(prices[j+1]>=prices[j]){
						continue;
					}else{
						profit+=prices[j]-prices[i-1];
						i=j;
						break;
					}
				}
			}
			}
			
		}
	
	
	
	return profit;
	/*效率第一的写法 没有发现如果是连续增长的话 如下写法可以解决未出现的买入 以后不要完全跟着题目走
	 * int maxProfit = 0;
    for (int i = 0; i < prices.length ; i ++ ){
        if (i+1<prices.length && prices[i+1] - prices[i] > 0 )
            maxProfit += prices[i+1] - prices[i] ;
    }
    return maxProfit;*/

    }
}
