
public class a2022Moed87
{
    public static boolean isIdentity(int [][] mat, int x, int size)
    {
    return isIdentity(mat,x,size,x,x);
    }

    private static boolean isIdentity(int [][] mat, int x, int size, int i, int j)
    {
    if(j==x+size)
        return isIdentity(mat,x,size,i+1,x);
    if(i==x+size)// if we need sub - mat which must to be center - we will add condition to make sure that sub mat is center
        return true;
    if(i==j)
    {
        if(mat[i][j]==1)
            return isIdentity(mat,x,size,i,j+1);
        else return false;
    }
    else{
        if(mat[i][j]==0)
            return isIdentity(mat,x,size,i,j+1);
        else return false;
    }
    }

    //part b://using part a - start with the biggest option and decreasing the mat size to make sure this sub mat is centered.
    public static int maxMatrix(int [][] mat)
    {
    return maxMatrix(mat,0,mat.length);
    }
    private static int maxMatrix(int [][] mat, int curr, int size)
    {
    if(curr>=mat.length/2)
        return -1;//is there is no sub-identity matrix
    if(isIdentity(mat,curr,size))
        return curr;
    return maxMatrix(mat,curr+1,size-2);
    }



    //question number 2:
    public static int findMissingIndex(int [] a)
    {
    int right=a.length-1;
    int left=0;
    int mid = (left+right)/2;
    int check1 = a[mid]-a[mid-1];
    int check2 = Math.abs(a[mid]-a[mid+1]);
    int d = Math.min(check1,check2);
    while(left<right)
    { 
        if(a[mid]-a[mid-1] != d)
            return mid;
        if(a[mid]-a[left] == (mid-left)*d)
        {
            left=mid+1;
            mid=(left+right)/2;
            continue;
        }
        else{
            right=mid;
            mid=(left+right)/2;
            continue;
        }
    }//end while
    return a.length;
    }
}
