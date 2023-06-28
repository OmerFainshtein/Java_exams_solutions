//question number 1 
//algoritem:
//1.using assistance method
//2.add the current cell value into sum and update the min sum every step
//3.if we can move both diraction - we save the path with the larger sum
//4.return the value of min which is the negative number closet to zero
//5. if all the values are positive - we set number to be 1 to enable get into the first cell.

public class a2016Moed83
{
    private static int minPoints(int [][] mat, int i, int j, int min, int sum)
    {
        sum+=mat[i][j];//sum the cell value
        if(sum<min)//update the min sum we got
            min = sum;
        if(i==mat.length-1 && j==mat[0].length-1)//if we reach end of the array
            return min;
        if((i+1) <= mat.length-1 && (j+1) <= mat[0].length-1)//if we can move both diractions
            {
                int way1 = minPoints(mat,i+1, j, min, sum);
                int way2 = minPoints(mat, i, j+1, min, sum);
                if(way1>way2)//find the bigger from two option (we want the negative number that closer to 0)
                    return way1;
                else return way2;
            }
        if((i+1) <= mat.length-1)// if we can move only down
            return minPoints(mat,i+1,j,min,sum);
        else return minPoints(mat,i,j+1,min,sum);//if we can move only right
    }
    public static int minPoints(int [][]mat)
    {
        int min = minPoints(mat,0,0,0,0);
        return Math.abs(min) +1;// if min not 0 so he must be negative - we turn him into abs value and add 1 so our sum with the numbers will be bigger then 0 always
    }
    
    //question number 2
        public static boolean findX(int [] arr, int x)
    {
        if(arr.length-1 == 0)//one cell in arr
            return false;
        int right = arr.length-1;
        int left = 0;
        int mid = (right+left)/2;
        while(left<right)//no need to alowd equal because we alredy sum with neighbors
        {
            if(arr[mid]+arr[mid+1] == x || arr[mid]+arr[mid-1] == x)// condition to return true
                return true;
            if(arr[mid]+arr[mid-1] > x)//looking for smaller sum
            {
                right = mid;
                mid = (right+left)/2;
            }
            else {//looking for bigger sum
                left = mid+1;
                mid = (left+right)/2;
                     }
        }//end of while
        return false; // didnt find match.
    }//end of program
}