public class b2022Moed91
{
    //question number 1
    public static int cheapRt(int [] stations, int step1, int step2, int limit)
    {
        return cheapRt(stations,step1,step2,limit,0,0," ");
    }
    private static int cheapRt(int [] stations, int step1, int step2, int limit, int i, int sum, String stops)
    {//i for index, sum for total price, string stops for print the stations index.
        if(i==stations.length-1 && limit>=0)//if we reach last station with ligel path 
        {
            sum+=stations[i];//sum the last station price
            stops+=stations[i]+ " " ;//add the last station stop index
            System.out.println(stops + " = " + sum);//print the stops
            return sum;//return the total price
        }
        if(i>=stations.length||limit<0)//illegal path
            return Integer.MAX_VALUE;//by defination
        int curr=stations[i];//update current cell's value
        int option1=cheapRt(stations,step1,step2,limit-1,i+step2,sum+curr,stops+curr+" ");//step2 type
        int option2=cheapRt(stations,step1,step2,limit,i+step1,sum+curr,stops+curr+" ");//step1 type
        return Math.min(option1,option2);//return the minimum (return only the min but print all the options!
    }
    
    
    //question number 2 
    //O(n^2)
    public static int findTriplet(int [] arr)
    {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max1)
            {
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2)
            {
                max3=max2;
                max2=arr[i];
            }
            else if(arr[i]>max1)
            {
                max3=arr[i];
            }
            if(arr[i]<min1)
            {
                min2=min1;
                min1=arr[i];
            }
            else if(arr[i]<min2)
            {
                min2=arr[i];
            }
        }
        if(min1*min2*max1>max1*max2*max3)
            {
                System.out.println(min1 + "  " + min2 + "  " + max1);
                return min1*min2*max1;
            }
            else {
                System.out.println(max1 + "  " + max2 + "  " + max3);
                return max1*max2*max3;
            }
    }
}