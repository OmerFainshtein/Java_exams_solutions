
public class a2015Moed83
{
    //question number 1 
    //if there is no increasing series full path - we return the number of row * number of col 
    public static int shortestPath(int [][] mat)
    {
        return shortestPath(mat,0,0,0,0);//start
    }
    private static int shortestPath(int [][] mat, int i, int j,int prev, int curr)
    {
        if(j<0||i<0||j>=mat[0].length||i>=mat.length)//if we out of bounds
            return mat.length*mat[0].length;
        if(mat[i][j]-prev<=0)//if the cell is not increasing series
            return mat.length*mat[0].length;
        if(i==mat.length-1 && j==mat[0].length-1)//if we reach the end of mat
            return curr+1;
        
        prev=mat[i][j];//save the current cell value
        mat[i][j]=Integer.MAX_VALUE;//mark the cell - cant be increasing series from this value
        int down=shortestPath(mat,i+1,j,prev,curr+1);
        int up=shortestPath(mat,i-1,j,prev,curr+1);
        int left=shortestPath(mat,i,j-1,prev,curr+1);
        int right=shortestPath(mat,i,j+1,prev,curr+1);
        mat[i][j]=prev;//set the cell value back to his original value
        
        return Math.min(Math.min(down,up),Math.min(left,right));
    }
    
    
    
    
    
    //a2015Moed83
    //qustion 2 part a
    // O(n)
    public static boolean sum2(int []arr, int num)
    {
        int low=0;
        int high=arr.length-1;
    
        while(low<high)
        {
            if(arr[low]+arr[high]==num)
                return true;
            if(arr[low]+arr[high]>num)
                high--;
            else low++;
        }
        return false;
    }
    //question 2 part b
    
    public static boolean sum3(int [] arr, int num)
    {
        int left=0;
        int right=arr.length-1;
        int mid=(left+right)/2;
        int i=0;
        while(i<arr.length)
        {
            if(sum2(arr,num-arr[i]))
                return true;
            i++;
        }
        return false;
    }
}

