package May28;
/**
 * 
 * @author Cdawn
 *     2018.5.28
 */
public class Solution {
	
	/*����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�

	���һ���㷨�����������ܻ�ȡ�������������Ծ����ܵ���ɸ���Ľ��ף��������һ֧��Ʊ����

	ע�⣺�㲻��ͬʱ�����ʽ��ף���������ٴι���ǰ���۵�֮ǰ�Ĺ�Ʊ����

	ʾ�� 1:

	����: [7,1,5,3,6,4]
	���: 7
	����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 3 �죨��Ʊ�۸� = 5����ʱ������, ��ʽ������ܻ������ = 5-1 = 4 ��
	     ����ڵ� 4 �죨��Ʊ�۸� = 3����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ������, ��ʽ������ܻ������ = 6-3 = 3 ��*/
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
	/*Ч�ʵ�һ��д�� û�з�����������������Ļ� ����д�����Խ��δ���ֵ����� �Ժ�Ҫ��ȫ������Ŀ��
	 * int maxProfit = 0;
    for (int i = 0; i < prices.length ; i ++ ){
        if (i+1<prices.length && prices[i+1] - prices[i] > 0 )
            maxProfit += prices[i+1] - prices[i] ;
    }
    return maxProfit;*/

    }
}
