class Solution {
    public int trap(int[] height) {
     int low=0;
     int high = height.length - 1;
     int leftMax = 0;
     int rightMax = 0;
     int vol=0;
     while(low < high)
     {
        if(height[low] < height[high])
        {
            if (height[low] >= leftMax) {
                leftMax = height[low];
            } else {
                vol += leftMax - height[low];
            }
            low++;
        }
        else
        {
            if (height[high] >= rightMax) {
                rightMax = height[high];
            } else {
                vol += rightMax - height[high];
            }
            high--;
        }
     
     }
     return vol;   
    }
}