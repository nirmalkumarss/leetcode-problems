class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int high = m*n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int midV = matrix[mid/n][mid%n];
            if(midV==target){
                return true;
            }else if(midV<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;

    }
}