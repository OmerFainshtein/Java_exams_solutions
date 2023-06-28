public class b2019Moed83
{
    //******************quest1****************
    public static int longestPath(int [][] mat, int x, int y)
    {
        return longestPath(mat,x,y,0);
    }
    private static int longestPath(int [][] mat, int x, int y, int counter)
    {
        if(x<0||y<0||x==mat.length||y==mat[0].length||mat[x][y]==0)
            return 0;
        if(x==0&&y==0)
            return ++counter;//add 1 to counter and return him
        counter++;//mat[x][y] must be 1 so we add 1
        mat[x][y]=0;//change temperory
        counter += Math.max(longestPath(mat, x-1,y,0),Math.max(longestPath(mat,x+1,y,0),
        Math.max(longestPath(mat,x,y+1,0),longestPath(mat,x,y-1,0))));//adding to counter the maximum points option
        mat[x][y]=1;//return the cell to original value
        return counter;//finish checks
    }
    
    //**************quest2**************
    //the array is sorted - it makes it easy, when we in negative cell we add to counter all the cells above + 1 cause index start from 0 and move left
    // if not - we move up for smaller values
    public static int howManyNegativeNumbers(int[][] arr)
    {
        int i = arr.length-1;
        int j = 0;
        int counter = 0;
        while(i>=0&&j<=arr[0].length-1)
        {
            if(arr[i][j] < 0)
            {
                counter += i+1;
                j++;
            }
            else{
                i--;
            }
        }
        return counter;
    }
}
