class Solution {
    public void swapA(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                int temp = arr1[i][j];
                arr1[i][j] = arr2[i][j];
                arr2[i][j] = temp;
            }
        }
    }
    public List<List<Integer>> shiftGrid(int[][] g, int k) {
        List<List<Integer>> ll=new ArrayList<>();
        int n=g.length;
        int m=g[0].length;
        int arr[][]=new int[n][m];
        for(int x=0;x<k;x++){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(i==n-1&&j==m-1){
                        arr[0][0]=g[n-1][m-1];
                    }
                    else if(j==m-1){
                        arr[i+1][0]=g[i][m-1];
                    }
                    else{
                        arr[i][j+1]=g[i][j];
                    }
                }
            }
            swapA(arr,g);
        }
        for(int i=0;i<n;i++){
            List<Integer> l= new ArrayList<>();
            for(int j=0;j<m;j++){
                l.add(g[i][j]);
            }
            ll.add(l);
        }
        return ll;
    }
}