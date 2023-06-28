public class a2018Moed85
{
    //****************quest1************
    public static int longestSlope (int [][] mat, int num)
    {
        return longestSlope(mat, 0, 0, num, 0);
    }
    private static int longestSlope (int [][] a, int i, int j, int num, int max)
    {
        if(j==a[0].length)//if we reach the end of the row we move to the next row in col 0
            return longestSlope(a,i+1,0,num,max);
        if(i == a.length)//if we scan all the rows (and cols) we return the max value
            return max;
        int slope = countSlope(a,i,j,num,a[i][j],1);//set slope to be the longestSlope from current cell in mat
        if(slope>max)//if slope is bigger then max we update max to be slope value
            max=slope;
        return longestSlope(a,i,j+1,num,max);//after we did all the checks on this cell we moving forward to the next one
    }
    private static int countSlope(int [][] a,int i,int j, int num,int n, int k)
    {// n is the cell value, k is starting in 1 and counting the slope steps
        if(i==a.length || j==a[0].length || i<0 || j<0)//if we overflow the mat - we return the length of the slope minus 1 
        //because in the call to recursion we send k+1 and we need undo it
            return k-1;
        if(n-((k-1)*num)!=a[i][j])//same as previous if but for non slope with n (not because over flow)
            return k-1;
        int temp = a[i][j];//save the cell value in temp
        a[i][j]=-1;//chenge the cell value
        //check all the moves options
        int right = countSlope (a,i,j+1,num,n,k+1);
        int left = countSlope (a,i,j-1,num,n,k+1);
        int down = countSlope (a,i+1,j,num,n,k+1);
        int up = countSlope (a,i-1,j,num,n,k+1);
        a[i][j] = temp;//return the original value into the cell
        return max(right, left, up, down);// return the max between all the movement options to slope
    }
    private static int max(int a, int b, int c, int d)//not necessary in the exem - i think...
    {
     return Math.max(a,Math.max(b,Math.max(c,d)));//this method can find max between int and save us from chacnge every variable to double
    }
    
    //***************quest2*************
    //question of code tracking... skip that
}
