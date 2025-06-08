class Solution {
    public boolean checkXMatrix(int[][] grid) {
        boolean isX= true;
        for(int i=0;i<grid.length;i++){
            if(grid[i][i]==0){
                isX=false;
            }
        }
        int k= grid.length-1;

        for(int i=0;i<grid.length;i++){
                if(grid[i][k--]==0){
                    isX=false;
                }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(i!=j && i+j!=grid.length-1){
                    if(grid[i][j]!=0){
                        isX=false;
                    }
                }
            }
        }

        return isX;

        
        
    }
}