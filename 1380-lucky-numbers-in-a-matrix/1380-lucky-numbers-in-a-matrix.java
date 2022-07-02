class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++)
        {
            int minIndex=0;
            int min=9999999;
            for(int j=0;j<matrix[i].length;j++)
            {
                if(min>matrix[i][j])
                {
                    min=matrix[i][j];
                    minIndex=j;
                }
            }
        
            boolean isTrue=true;
            for(int j=0;j<matrix.length;j++)
            {
                if(matrix[i][minIndex]<matrix[j][minIndex])
                {
                    isTrue=false;
                    break;
                }
            }
            if(isTrue==true)
            {
                a.add(matrix[i][minIndex]);
            }
        }
        return a;
    }
}