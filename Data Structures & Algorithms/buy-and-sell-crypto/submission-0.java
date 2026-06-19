class Solution {
    public int maxProfit(int[] prices) {
        int low=0;
        int high =1;
        int val =0;
        while(low<(prices.length) && high<(prices.length))
        {
            if(prices[low]>prices[high])
            {
                low=high;
                high++;
            }
            else if(prices[low]<=prices[high])
            {
                if(val<(prices[high]-prices[low]))
                {
                    val=prices[high]-prices[low];
                }
                high++;
            }
        }
    return val;}
}
