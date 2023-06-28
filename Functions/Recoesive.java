

public class Recoesive
{
    public static int longest(int[][]mat, int i, int j)
    {
        return longest(mat, i, j, 0);
    }
    private static int longest(int [][] mat, int i, int j, int counter)
    {
        if(i==mat.length || j==mat[0].length || j<0 || i<0 || mat[i][j]==0)
            return -1;
        if(i==mat.length-1 && j==mat[0].length-1)   
            return counter;
        if(mat[i][j]==1)
        {
            mat[i][j]=0;
        }
        return Math.max(longest(mat, i+1, j, counter+1), Math.max(longest(mat, i-1, j, counter+1), Math.max(longest(mat, i, j+1, counter+1), longest(mat, i, j-1, counter+1))));
    }
}
