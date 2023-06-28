// לאאאאאא עובדדדדדדדד מחזיר -1 אבל קיבל ניקוד מלא
//ניסויון***** - עובד על הדוגמא במבחן אבל לדעתי יש באג
public class b2018Moed83
{
    //question number 1
    public static int prince(int [][] drm, int i , int j)
    {
        int path=prince(drm,i,j,drm[i][j],0);
        if(path>drm.length*drm[0].length)
            return -1;
        return path;
    }
    private static int prince( int [][] drm, int i, int j, int prev, int counter)
    {
        if(i<0||i>=drm.length||j<0||j>=drm[0].length)
        return drm.length*drm[0].length;
        if(drm[i][j]==-1) 
            return counter+1;
        if(prev-drm[i][j]>2||prev-drm[i][j]<-1|| drm[i][j]==-100)
            return drm.length*drm[0].length;
        int temp = drm[i][j];
        drm[i][j]=-100;
        
        int up = prince(drm,i-1,j,temp,counter+1);
        int down = prince(drm,i+1,j,temp,counter+1);
        int left = prince(drm,i,j-1,temp,counter+1);
        int right = prince(drm,i,j+1,temp,counter+1);
        
        drm[i][j]=temp;
        return Math.min(Math.min(up,down),Math.min(left,right));
    }
    
    //question 2
    //O(logn), O(1)
    public static int findSingle(int [] arr)
    {
        int left=0;
        int right=arr.length-1;
        int mid=(left+right)/2;
        //2 conditions to make sure we dont get run time error in while loop
        if(arr.length-1==0 || arr[0]!=arr[1])
            return arr[0];
        if(arr[arr.length-1] != arr[arr.length-2])
            return arr[arr.length-1];
        while(left<=right)
        {
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1])
                return arr[mid];
            if(mid%2==0) 
            {
                if(arr[mid]==arr[mid+1])
                {
                    left=mid+1;
                    mid=(left+right)/2;
                }
                else{
                    right=mid;
                    mid=(left+right)/2;
                }
            }
            else{
                if(arr[mid]==arr[mid-1])
                {
                    left=mid+1;
                    mid=(left+right)/2;
                }
                else{
                    right=mid;
                    mid=(left+right)/2;
                }
            }
        }
        return arr[mid];
    }
}