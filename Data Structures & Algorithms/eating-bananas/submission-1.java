class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = 0;
        int low=1;
        int ans = high;
        for(int x : piles)
        {
            high=Math.max(high,x);
        }
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            long hours=0;
            for(int y : piles)
            {
                hours += (y+mid-1)/mid;
            }
            if(hours<=h)
            {
                ans= mid;
                high=mid-1;
            }
            else
            {
                low = mid+1;
            }

        }
        return ans;
    }
}
