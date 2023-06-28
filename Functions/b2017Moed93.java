public class b2017Moed93

{
    //**********************************************solution for quest1**********************************************//
    //algoritem:
    //  1.we moving in mat by col - when we reach the end of row we jump to next row in col 0.
    //  2.when we hit cell with true value we call the markCells function and turn all the cells around our initial cell to 0
    //  3. when we have no neighber cells with true value we return the main function and continue our search.
    //  4. our base case is we reach the last cell in our mat - then we return the counter
    public static int cntTrueReg(int [][] mat)
    {
        return cntTrueReg(mat,0,0,0);
    }
    public static int cntTrueReg(int [][] mat, int i, int j, int counter)
    {
        if(i==mat.length-1 && j==mat.length-1)//if we reach last cell in mat - it mean we finished our search
            return counter;
        if(j>mat.length-1)//if we finished specific row we continue from next row and col 0
            return cntTrueReg(mat, i+1, 0, counter);
        if(mat[i][j] == 1)//find a true cell
            {
                counter++;
                markCells(mat, i, j);//call markCells function to "mark" every neighbor which contain true value
            }
        return cntTrueReg(mat,i,j+1,counter);//search again from next cell in the row
    }
    public static void markCells(int [][]mat, int i, int j)
    {
        if(i<0 || j<0 || i>mat.length-1 || j> mat.length-1)//outbounds mat
            return;
        if(mat[i][j] ==1)//if we find cell with true value we change him into false value and recursive cheack all his neghibors
            {
            mat[i][j] =0;
            markCells(mat, i+1, j);
            markCells(mat, i-1, j);
            markCells(mat, i, j+1);
            markCells(mat, i, j-1);
            }
        return;
    }
    
    //**********************************************solution for quest2**********************************************//
    //algoritem:
    //  1.first check - if num bigger then max center + his radius or smaller then min center - his radius  => num out of bounds! return -1
    //  2.binary search - shrink the options until num is in the range of mid cell - then return mid
    //  3. if right > left before we hit section 2 - return -1 because we search in all array and didnt find match
    public class Range// given class
    {
        private int _center, _radius;
        public Range (int c, int r)
        {
            _center = c;
            _radius = r;
        }
        public int getCenter()
        {
            return _center;
        }
        public int getRadius()
        {
            return _radius;
        }
        
    }
    public static int findNum(Range rangeA[], int num)
    {
        if(num > (rangeA[rangeA.length-1].getCenter() +rangeA[rangeA.length-1].getRadius()))
            return -1;
        if(num < (rangeA[0].getCenter() -rangeA[0].getRadius()))
            return -1;
        int left = 0;
        int right = rangeA.length-1;
        int mid = (left+right)/2;
        while(right<=left)//binary search
        {
            if(num > rangeA[mid].getCenter() +rangeA[mid].getRadius()) //if num bigger then the max value of mid range
            {
                left = mid+1;
                mid = (left+right)/2;
                continue;//another iteration
            }
            if(num < rangeA[mid].getCenter() -rangeA[mid].getRadius()) //if num smaller then min value of mid range
            {
                right = mid;
                mid = (left+right)/2;
                continue;//another iteration
            }
            return mid;
        }
        return -1;
    }
}
