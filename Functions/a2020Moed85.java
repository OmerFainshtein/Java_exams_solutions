public class a2020Moed85
{
    //**************quest1**************
    
    public static int findMaximum(int[][] mat)
    {
        return findMaximum(mat,0,0,0,0);
    }
    public static int findMaximum(int[][] mat, int i, int j, int counter, int max)
    {
        if(mat[0][0]==-1)//terminate condition
            return -1;
        if(i==mat.length||j==mat[0].length||j<0||mat[i][j]==-1)//out of array bounds or -1 value cannot be reach
            return max;
        if(mat[i][j]==1)
        {
            counter++;//sum to total points
            if(counter>max)//update max
                max=counter;
        }
        if(i%2==0)//allowd to move right and down in even row
            return Math.max(findMaximum(mat,i+1,j,counter,max), findMaximum(mat,i,j+1,counter,max));
        if(i%2!=0)//left and down in odd row
            return Math.max(findMaximum(mat,i+1,j,counter,max), findMaximum(mat,i,j-1,counter,max));
        return max;
    }
    
    
    //**************quest2**************
    public static int strictlyIncreasing(int [] a)
    {
        int currStrict=0;
        int counter=0;
        int i=1;
        while(i<a.length)
        {
            if(a[i]>a[i-1])
            {
                currStrict++;
                counter+=currStrict;
            }
            else currStrict=0;
            i++;
        }
        return counter;
    }
}