class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] res=new int[r][c];
        if(r*c!=mat.length*mat[0].length)
        {
            return mat;
        }
        for(int i=0;i<r*c;i++)
        {
            res[i/c][i%c]=mat[i/mat[0].length][i%mat[0].length];
        }
        return res;
        
}
}