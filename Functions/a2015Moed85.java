
public class a2015Moed85
{
    //question number 1 
    public static int countRopes(int [][] mat)
    {
        return countRopes(mat,0,0,0);
    }
    private static int countRopes(int [][] mat, int i, int j, int ropes)
    {
        if(j==mat[0].length)//if we end the scan the first row - return what we sum so far
            return ropes; 
        
        ropes += count(mat,i+1,j,mat[i][j])+count(mat,i+1,j+1,mat[i][j])+count(mat,i+1,j-1,mat[i][j]);//call count for down, left and right
        
        return countRopes(mat,0,j+1,ropes);//we finish search for current col so we move to start again with next col
    }
    private static int count(int [][]mat, int i, int j, int prev) 
    {
        if(j<0||j>=mat[0].length) //out of bounds
            return 0;
        
        if(mat[i][j]-prev >=0) //decreasing series
            return 0;
        
        if(i==mat.length-1)//reach the last row *after* we make sure this cell continue the decreasing series
            return 1;
        prev = mat[i][j];//update current cell value before we check for next row options
        return count(mat,i+1,j-1, prev)+count(mat,i+1,j, prev)+count(mat,i+1,j+1, prev);//return the sum of reach last row with decreasing series.
    }
    
    //question number 2
    //*increasing array - 0 not included
    public static boolean splitTo3(int [] arr)
    {
        int i=0;
        int limit1=0;
        int limit2=arr.length-1;
        if(arr[0]>0||arr[arr.length-1]<0)
            return false;
        while(limit2-limit1>=2)
        {
            if(limit1==0 && sum(arr,limit1,limit2)==0)
                return true;
            if(sum(arr,limit1+1,limit2)==0)
                return true;
            if(sum(arr,limit1+1,limit2)<0)
                limit1++;
            if(sum(arr,limit1+1,limit2)>0)
                limit2--;
        }
        return false;
    }
    private static int sum(int[] arr, int start, int end)
    {
        int sum=0;
        while(start<=end)//sum array
        {
            sum+=arr[start];
            start++;
        }
        return sum;
    }
}