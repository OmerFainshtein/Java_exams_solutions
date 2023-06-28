// ****************************quest 1************************
//every call to the recorsive we check if there is match between num and the sum with the current power of 3 or without
//every call we increas power by one.
//base case is sum or power bigger then num
public class a2019Moed84
{
    public static boolean sumPower3(int num)
    {
        return sumPower3(num, 0, 0);
    }
    private static boolean sumPower3(double num,double power, double result)
    {
        if(result==num)
            return true;
        if(result>num || Math.pow(3,power)>num)
            return false;
        return sumPower3(num,power+1, result+(Math.pow(3,power))) || sumPower3(num, power+1, result);
    }
    //********************************quest2**********************
    //סיבוכיות של n בזמן ריצה וסיבוכיות של 1 בזכרון
    //one loop to sum all the array, then we add to the left sum the current cell and set right sum to be the rest value
    //each itration we calculate again and when the currDiff is bigger then maxDiff we update the maxDiff and the maxDiffIndex
    public static int avarage(int[] arr)
    {
        int i=0;
        int totalSum=0;
        int leftSum=0;
        int rightSum=0;
        int leftAvarge=0;
        int rightAvarge=0;
        int maxDiff=0;
        int currDiff=0;
        int maxDiffIndex=0;
        while(i!=arr.length)
        {
            totalSum+=arr[i];
            i++;
        }
        i=0;
        while(i!=arr.length-1)
        {
            leftSum+=arr[i];
            rightSum=totalSum-leftSum;
            leftAvarge=leftSum/(i+1);
            rightAvarge=rightSum/(arr.length-1-i);
            currDiff= Math.abs(leftAvarge - rightAvarge);
            if(currDiff>maxDiff)
            {
                maxDiffIndex=i;
                maxDiff=currDiff;
            }
            i++;
        }
        return maxDiffIndex;
    }
    
}
