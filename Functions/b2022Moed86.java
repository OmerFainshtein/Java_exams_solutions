
/**
 * Write a description of class b2022Moed86 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class b2022Moed86
{
    //question number 1
    
    public static int maxPath(int [][] mat)
    {
        return maxPath(mat,0,0,0,Integer.MIN_VALUE);
    }
    public static int maxPath(int [][] mat, int i, int j, int counter, int biggest)
    {
        if(j<0||i<0||j>=mat[0].length||i>=mat.length)
            return Integer.MIN_VALUE;
        if(j==mat[0].length-1 && i==mat.length-1)
        {
            counter+=mat[i][j];
            if(counter>biggest)
                biggest=counter;
            return biggest;
        }
        int option1 = maxPath(mat,i+(mat[i][j]/10),j+(mat[i][j]%10),counter+mat[i][j],biggest);
        int option2 = maxPath(mat,i+(mat[i][j]%10),j+(mat[i][j]/10),counter+mat[i][j],biggest);
        return Math.max(option1,option2);
    }
    
    //question number 2
    //אלגוריתם: 3 משתנים, אחד בודק את הגודל של המודולו K בתא הנוכחי, אחד שומר את התא שקרוב לתחילת המערך שאותו נחליף אם נגלה שצריך
    // המשתנה result הוא התוצאה של המודולו עם K ובכך הוא מסדר את המערך לפי סדר עולה של המודולו, k קבוע אז מדובר בKN סיבוכיות, זתומרת n 
    // סיבוכיות מקום 1
    public static void sortmod(int [] a, int k)
    {
        int i=0;
        int j=0;
        int result=0;
        while(result<=k)
        {
            while(i<a.length)
            {
                if(a[i]%k==result)
                {
                    int temp = a[j];
                    a[j]=a[i];
                    a[i]=temp;
                    j++;
                }
                i++;
            }
            result++;
            i=j;
        }
        int n = 0;
        while(n<a.length)
        {
            System.out.print(a[n] + " ");
            n++;
        }
        
        
    }
}
