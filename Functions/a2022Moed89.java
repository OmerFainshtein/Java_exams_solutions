
/**
 * Write a description of class a2022MoedTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class a2022Moed89
{
    public static boolean isJump(String str1, String str2, int step)
    {
    if(str2.length()>str1.length()||str1.charAt(0)!=str2.charAt(0))
        return false;
    return isJump(str1,str2,step,0,0);
    }
    private static boolean isJump(String str1, String str2, int step, int index1, int index2)
    {
    if(index2==str2.length())
        return true;
    if(str1.charAt(index1) != str2.charAt(index2))
        return false;
    return isJump(str1, str2, step, index1+step, index2+1);
    }

    //question number 1
    //part b

    public static int strStep(String str1, String str2)
    {
    if(str2.length()>str1.length() || str1.charAt(0)!=str2.charAt(0))
        return -1;
    return strStep(str1,str2,1,1);
    }
    private static int strStep(String str1, String str2, int index1, int index2)
    {
    if(index1==str1.length())
        return -1;
    if(str1.charAt(index1)==str2.charAt(1))
    {
        int step = index1;
        if(isJump(str1,str2,step))
            return step;
        else return -1;
    }
    return strStep(str1,str2,index1+1,index2);
    }


    //question number 2
    public static int longestSubarray(int [] a)
    {
    int i =0;
    int curr=1;
    int currStart=0;
    int currEnd=0;
    int start=0;
    int end=0;
    int longest=0;
    int prev=a[0];
    while(i<a.length) 
    {
            if(prev>0)
            {
                if(a[i]<0)//switching sign
                {
                    curr++;
                    currEnd=i;
                }
                else{// same sign
                    currStart=i;
                    currEnd=i;
                    curr=1;
                }
            }
            else{
                if(a[i]>0)
                {
                    curr++;
                    currEnd=i;
                }
                else{
                    currStart=i;
                    currEnd=i;
                    curr=1;
                }
            }
            
            if(curr>longest)//update longest
            {
                longest=curr;
                start = currStart;
                end = currEnd;
            }
            prev = a[i];
            i++;
        }
        System.out.println("the longest is: " + longest + " starting index: " + start + " ending index: " + end);
        return longest;
    }
}