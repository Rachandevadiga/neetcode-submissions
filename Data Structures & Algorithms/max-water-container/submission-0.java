class Solution {
    public int maxArea(int[] heights) {
        int low =0;
        int high = heights.length -1;
        int vol=0;
        while(low<high)
        {
            if(Math.min(heights[low],heights[high])*(high - low)>=vol)
            {
                vol=Math.min(heights[low],heights[high])*(high - low);
            }
            if(heights[low]>=heights[high])
            {
                high--;
                continue;
            }
            if(heights[low]<heights[high])
            {
                low ++;
                continue;
            }
        }
    return vol;
    }
}
