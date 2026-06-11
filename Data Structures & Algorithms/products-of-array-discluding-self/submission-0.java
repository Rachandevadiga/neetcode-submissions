class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int size=nums.length;

        int[] result= new int[size];
        result[0]=nums[0];
        for(int i=1; i<size-1;i++)
        {
           
            result[i]=nums[i]*result[i-1];
        }
        result[size-1]=result[size-2];
        int post = nums[size-1];
        for(int i=size-2;i>0;i--)
        {   
            result[i]=result[i-1]*post;
            post=post*nums[i];   
        }
        result[0]=post;
    return result;
    }

}  
