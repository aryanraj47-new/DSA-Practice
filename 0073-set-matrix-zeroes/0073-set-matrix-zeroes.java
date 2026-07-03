class Solution {
    public void setZeroes(int[][] matrix) {
        int[][] arr=new int[matrix.length][matrix[0].length];
        int m=matrix.length;
        int n=matrix[0].length;
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                arr[row][col]=matrix[row][col];
            }
        } 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    for(int k=0;k<m;k++){
                        matrix[k][j]=0;
                    }
                    for(int k=0;k<n;k++){
                        matrix[i][k]=0;
                    }
                }
            }
        }
    }
}