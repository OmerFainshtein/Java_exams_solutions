public class b2019Moed86
{
    //****************quest1*******************
    public static int howManyPaths(int [][] mat)
    {
        return howManyPaths(mat,0,0);
    }
    private static int howManyPaths(int [][] mat, int i, int j)
    {
        if(i>=mat.length||j>=mat[0].length||j<0||i<0)// out of bounds
            return 0;
        if(i==mat.length-1 && j==mat[0].length-1)//good path
            return 1;
        int k = mat[i][j];// save the value
        mat[i][j]=Integer.MIN_VALUE;//make sure recursion dont stuck
        int counter = howManyPaths(mat, i+k, j) + howManyPaths(mat, i-k, j) + howManyPaths(mat, i, j+k) + howManyPaths(mat, i, j-k);//sum the times we get 1
        mat[i][j]=k;//return to origin value
            
        return counter;//return the sum
    }
    
    //******************quest2********************
    public static int meetingPoint(int [] a, int [] b)
    {
        int high = Math.min(a.length-1,b.length-1);
        int low = 0;
        int mid = (high+low)/2;
        int minIndex = -1;
        while(low<=high)
        {
            if(a[mid]==b[mid])
            {
                minIndex = mid;
                mid--;    
            }
            else{
                if(a[mid]>b[mid])
                {
                    low=mid+1;
                    mid=(low+high)/2;
                }
                else{
                    high=mid;
                    mid=(low+high)/2;
                }
            }
            if(minIndex!=-1 && a[mid]!=b[mid])// ending condition - once we find match and then we loss the match - we never get another match because the sort.
                return minIndex;
        }
        return minIndex;
    }
}      