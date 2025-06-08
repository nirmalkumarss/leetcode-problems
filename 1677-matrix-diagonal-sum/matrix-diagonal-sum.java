class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;

        int mid = n / 2;
        int summation = 0;
        
        for( int i = 0 ; i < n ; i++ ){
            summation += mat[i][i];
            summation += mat[n-1-i][i];
        }
        
        
        if( n % 2 == 1 ){
            summation -= mat[mid][mid];
        }
        
        return summation;
    }
}