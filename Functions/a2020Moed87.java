public class a2020Moed87
{
    //    יש כאן טעות - להסתכל בפלט         
    public static int totalWays(int [][] mat, int k)
    {
        int i = 0, j = 0;//initilize start point
        int M = mat.length-1, N = mat[0].length-1;//make it easier to writh the code..
        return totalWays(M, N, i + 1, j, k, true) +   //moving in the row
            totalWays(M, N, i, j + 1, k, false);      //moving in the col
    }
    public static int totalWays(int M, int N, int i, int j, int k, boolean isCol)//isCol is a boolean flag - true is for moving along the col, else - false.
    {
        if (k == -1 || !isValid(i, j, M, N)) // If the number of turns is exhausted or if the cell is invalid
        {
            return 0;
        }
        if (k == 0 && i == M - 1 && j == N - 1) // If the destination is reached with exactly `k` turns
        {
            return 1;
        }
        if (isCol)// If the current direction is along a column
        {
            // 1. Continue moving along the column
            // 2. Turn right and decrement the number of turns by 1
            return totalWays(M, N, i + 1, j, k, isCol) + totalWays(M, N, i, j + 1, k - 1, !isCol);
        }
        return totalWays(M, N, i, j + 1, k, isCol) + totalWays(M, N, i + 1, j, k - 1, !isCol);//recursive with and without turn
    }
    public static boolean isValid(int i, int j, int M, int N)//check if curr cell is vaild
    {
        return (i >= 0 && i < M && j >= 0 && j < N);//cell is in the bounds of array
    }
    
    public static void printTriplets(int [] a, int num)
    {
        int high=a.length-1;
        int low=0;
        int constant=0;
        while(constant<a.length)
        {
            while(low<high)
            {
                if(a[constant]*a[low]*a[high]==num)
                {
                    System.out.println(a[constant] + "  " + a[low] + "  " + a[high]);
                    low++;
                    continue;
                }
                else if(a[constant]*a[low]*a[high]>num)
                {
                    high--;
                }
                else low++;
            }
            constant++;
            low=constant;
            high=a.length-1;
        }
        
    }
}