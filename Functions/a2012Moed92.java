public class a2012Moed92
{
    /// מדפיס נכון אבל ממשיך לבדוק ועושה חריגה מהמערך בזמן ריצה...
    private static int[] swap(int [] b, int i)
    {
        
        int tmp = b[i];
        b[i]=b[b.length-1-i];
        b[b.length-1-i]=tmp;
        return b ;
    }
    private static void printArray(int[]arr, int i)
    {
        if(i==arr.length)
            {
                System.out.println(" ");
                return;
            }
        System.out.print(arr[i]);
        printArray(arr,i+1);
    }
    
    //another try
    public static void miror(int [] a)
    {
        printArray(a,0);
        miror(a,a,0);
    }
    private static void miror(int [] a, int [] b, int i)
    {
        if(i==a.length/2)
            return;
        
        b = swap(a,i);
        printArray(a,0);
        i++;
        miror(a,b,i);
        miror(a,b,i+1);
        
    }
}