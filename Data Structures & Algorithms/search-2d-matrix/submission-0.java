class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col= matrix[0].length;
        int low=0;
        int high = (row* col)-1;
        int mid;
        while(low<=high)
        {
            mid = low + (high-low)/2;
            if(target == matrix[mid/col][mid%col])
            {
                return true;
            }
            else if(matrix[mid/col][mid%col]> target)
            {
                high= mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return false;
    }
}
