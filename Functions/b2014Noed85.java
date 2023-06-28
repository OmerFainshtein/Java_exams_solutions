
/**
 * Write a description of class b2014Noed85 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class b2014Noed85
{
    //question number1
    
    public static int longestWorm(int [][]mat)
    {
        return longestWorm(mat,0,0,0);
    }
    public static int longestWorm(int [][]mat, int i, int j, int longest)
    {
        if(j==mat[0].length)//if we finish scan from this row we jump to next row col 0
            return longestWorm(mat,i+1,0,longest);
        if(i==mat.length)//if we finish scan all rows we end the program
            return longest+1;//+1 if for the last cell (didnt reach the +1 in the recursion calls in count method)
        int up = count(mat,i-1,j,mat[i][j],0); 
        int down = count(mat,i+1,j,mat[i][j],0);
        int left = count(mat,i,j-1,mat[i][j],0);
        int right = count(mat,i,j+1,mat[i][j],0);
        int curr = Math.max(Math.max(up,down),Math.max(left,right));//save the longest from this cell
        if(curr>longest)//update the longest value
            longest=curr;
        return longestWorm(mat,i,j+1,longest);//start scan from the next col
    }
    private static int count(int [][]mat, int i, int j, int prev, int curr)
    {
        if(j<0||i<0||j>=mat[0].length||i>=mat.length)//if we out of bounds
            return curr;
        if(mat[i][j]-prev!=1)//if the cell not continue the incresing seris (increas by 1 - defination)
            return curr;
        prev = mat[i][j];//save the current cell value
        mat[i][j]=Integer.MAX_VALUE;//set the cell to maxInteger - make sure we didnt return to cell that already add to the worm
        int up=count(mat,i-1,j,prev,curr+1);
        int down=count(mat,i+1,j,prev,curr+1);
        int right=count(mat,i,j+1,prev,curr+1);
        int left=count(mat,i,j-1,prev,curr+1);
        mat[i][j]=prev;//set the original cell value back
        return Math.max(Math.max(up,down),Math.max(right,left));//return the max we count
    }
    
    
    //question number 2 is code tracking.
    
}
