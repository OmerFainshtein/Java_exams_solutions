

public class Tester17 extends a2015Moed83
{
    public static void main (String [] args)
    {
        System.out.println("question number 1:");
        int [][]mat={{3,13,15,28,30},{40,51,52,29,30},{28,10,53,54,53},{53,12,55,53,60},{70,62,56,20,80},{80,81,90,95,100}};
        System.out.println("should be 10 and was: " + shortestPath(mat));
        
        
        System.out.println("question number 2:");
        int [] arr= {-2,3,5,7,12};
        System.out.println("shoule be true and was: " + sum2(arr,17));
        System.out.println("shoule be false and was: " + sum2(arr,16));
        
        System.out.println("shoule be true and was: " + sum2(arr,17));
        System.out.println("shoule be false and was: " + sum2(arr,16));
    }
}
